package comm_explore_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static comm_explore_bot.Comms.*;
import static comm_explore_bot.Debug.*;
import static comm_explore_bot.Zone.*;
import static comm_explore_bot.Utils.*;

public abstract class Robot extends Constants {

    /*
    True constants
     */
    final public static Direction[] DIRS = {Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST}; // 8 directions
    final public static Direction[] ALL_DIRS = {Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.CENTER}; // includes center
    final public static Direction[] CARD_DIRS = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST}; // four cardinal directions
    final public static Direction[] DIAG_DIRS = {Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.NORTHWEST}; // four diagonals


    /*
    Variables that will never change (once set)
    */
    public static RobotController rc;

    // all of "myInfo" stuff
    public static int myID;
    public static RobotType myType;
    public static RobotInfo me;

    public static int spawnRound; // the first round this robot was called through RobotPlayer.java
    public static MapLocation spawnLoc;

    // relevant radius's for this type of unit
    public static int myVisionRadius;
    public static int myActionRadius;

    public static Team us;
    public static Team them;

    public static int mapWidth;
    public static int mapHeight;


    public static void init(RobotController theRC) throws GameActionException {
        rc = theRC;
        here = rc.getLocation();

        myID = rc.getID();
        myType = rc.getType();
        me = rc.senseRobot(myID);

        spawnRound = rc.getRoundNum();
        spawnLoc = rc.getLocation();

        // set radius
        myVisionRadius = myType.visionRadiusSquared;
        myActionRadius = myType.actionRadiusSquared;

        us = rc.getTeam();
        them = us.opponent();

        mapWidth = rc.getMapWidth();
        mapHeight = rc.getMapHeight();

        Utils.RANDOM_SEED = myID;

        Debug.clearBuffer();
        log("INIT ROBOT");

        // init map
        Map.initMap();
        Explore.init();

        // init hardcode
        HardCode.initHardCode();

        // init comms
//        Section.initSections();

        // init resource zone
        Zone.initZones();
        ZoneString.init();


        // printBuffer at end
        Debug.printBuffer();
    }

    /*
    Variables that (may) change each turn
     */

    public static MapLocation here;
    public static int myZoneX;
    public static int myZoneY;
    public static int roundNum;
    public static int age;

    public static RobotInfo[] sensedRobots;
    public static RobotInfo[] sensedAllies;
    public static RobotInfo[] sensedEnemies;

    public static int timeSinceEnemy = 0;

    // turn-dependent stats of my robot/game state

    public static MapLocation[] allyArchonLocs = new MapLocation[MAX_ARCHONS];
    public static boolean[] isAllyArchonLive = new boolean[MAX_ARCHONS];

    public static int[] allyUnitCounts = new int[ALLY_UNIT_COUNT_SECTION_SIZE];

    public static int myHealth;
    // public static int myInfluence;
    // public static int myConviction;

    public static void updateTurnInfo() throws GameActionException {

        // independent
        updateBasicInfo();

        // archon comm updates
        if (myType == ARCHON) {
            // archon location comms
            if (age == 0) { // init
                Archon.myArchonIndex = Comms.findEmptyCell(ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE);
                Archon.archonSpawnBit = new int[MAX_ARCHONS];
            }
            Comms.writeAllyArchon(here, Archon.myArchonIndex, true);
        }

        // read comms relevant to this troop
        readRelevantComms();

        // clear message board on odd rounds
        if (myType == ARCHON) {
            if (age > 0) {
                if (roundNum % 2 == 1 && Archon.isPrimaryArchon()) {
                    Comms.clearMessageBoard();
                }
            }
        }


        /* make relevant comm reports */
        reportSensedEnemies(); // report enemies

        // report resources
        reportResources();

        // report unit counts
        Comms.writeAllyUnitCount(myType);

        if (age >= 1) {
            if (enemyArchonSymLocs == null) {
                initEnemyArchonSymLocs();
            }
            updateEnemyArchonSymLocs();
        }


        // update last zone
        zoneVisitLastRound[myZoneX][myZoneY] = roundNum;

        printBuffer();
    }

    /*
    These updates should be cheap and independent of other updates
     */
    public static void updateBasicInfo() throws GameActionException {
        updatePositionInfo();
        roundNum = rc.getRoundNum();
        age = roundNum - spawnRound;

        // update simple variables here
        myHealth = rc.getHealth();

        sensedRobots = rc.senseNearbyRobots();
        sensedAllies = rc.senseNearbyRobots(-1, us);
        sensedEnemies = rc.senseNearbyRobots(-1, them);

        if (sensedEnemies.length > 0) {
            timeSinceEnemy = 0;
        } else {
            timeSinceEnemy++;
        }


        // print basic info
        printMyInfo();
        printBuffer();
    }

    public static void updatePositionInfo() throws GameActionException {
        here = rc.getLocation();
        myZoneX = here.x / ZONE_SIZE;
        myZoneY = here.y / ZONE_SIZE;
    }

    public static void readRelevantComms() throws GameActionException {
//        if (myType == MINER) {
//            return;
//        }

        Comms.readAllyArchonSection();

        if (myType == MINER) {
            Comms.readMineHelpSection();
        }

        // skip these comms for non-archons on their spawn round
        if (myType == ARCHON || age > 0) {
            if (roundNum % COMMON_EXPLORE_UPDATE_FREQ == 1 || age == 1) {
                Comms.readCommonExploreSection(); // no dependencies
            }
            if (roundNum % 2 == 0) { // read on even
                Comms.readAllyUnitCountSections();
            }
            // only need to read broadcasts for first few rounds
            if (age < READ_BROADCAST_RESOURCE_ROUNDS) {
                Comms.readBroadcastResourceSection();
            }
            Comms.readReportResourceSection();
        }

        boolean addToList = (myType == SOLDIER || myType == ARCHON || myType == WATCHTOWER);
        Comms.readReportEnemySection(addToList);
    }

    public static int getUnitCount(RobotType rt) {
        switch (rt) {
            case SOLDIER:
                return allyUnitCounts[0];
            case BUILDER:
                return allyUnitCounts[1];
            case MINER:
                return allyUnitCounts[2];
            case WATCHTOWER:
                return allyUnitCounts[3];
            case LABORATORY:
                return allyUnitCounts[4];
            default:
                logi("WARNING: 'getUnitCount' Unsupported unit " + rt);
        }
        return -1;
    }

    public static void reportSensedEnemies() throws GameActionException {

        // report one sensed enemy
        if (sensedEnemies.length > 0) {
            boolean hasDanger = false;
            for (int i = sensedEnemies.length; --i >= 0; ) {
                if (sensedEnemies[i].type.canAttack()) {
                    hasDanger = true;
                    break;
                }
            }

            RobotInfo ri = sensedEnemies[randInt(sensedEnemies.length)];
            Comms.writeReportEnemy(ri.location, hasDanger);
        }
    }

    /*
    Reporting resource zone information
     */
    public static void reportResources() throws GameActionException {
        if (myType == LABORATORY) {
            return;
        }
        if (myType.bytecodeLimit <= 7500 && rc.isMovementReady()) {
            // only update on turns where we can't move (right after we did move)
            return;
        }
        startBytecode("updateResourceZoneStatus");
//        ZoneUpdate.updateResourceZoneStatus(here.x, here.y); // report resource zone updates
        Zone.updateResourceZoneStatus(myZoneX, myZoneY); // report resource zone updates
        stopBytecode("updateResourceZoneStatus");
        updateResourceZoneStatusEdges(); // report resource zone updates for edge zones
        updateResourceZoneStatusSpeculative();
    }


    /*
    Tries to update resource zone status for adjacent zones (if they are unknown)
     */
    public static int[][] edgeZoneDeltas = new int[][]{{0, 1}, {1, 0}, {1, 1}};

    public static void updateResourceZoneStatusEdges() throws GameActionException {

        for (int i = edgeZoneDeltas.length; --i >= 0; ) {
            int[] delta = edgeZoneDeltas[i];
            int zx = myZoneX + delta[0];
            int zy = myZoneY + delta[1];
            if (canSeeZone(zx, zy) && zoneResourceStatus[zx][zy] == ZONE_UNKNOWN_FLAG) {
                updateResourceZoneStatus(zx, zy);
            }
        }

    }

    /*
    Tries to update resource zone status of all detected lead locations
     */
    public static void updateResourceZoneStatusSpeculative() throws GameActionException {
        if (myType.bytecodeLimit <= 7500 && age == 0) {
            return;
        }

        MapLocation[] visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius);

        // limit number of searched locs if low on bytecode
        int maxSearchCount = 100;
//        switch (myType.bytecodeLimit) {
//            case 5000:
//                maxSearchCount = 0;
//                break;
//            case 7500:
//                maxSearchCount = 5;
//                break;
//            case 10000:
//                maxSearchCount = 17;
//                break;
//            case 20000:
//                maxSearchCount = 33;
//                break;
//            default:
//                maxSearchCount = 0;
//                logi("WARNING: 'updateResourceZoneStatusSpeculative' Unexpected bytecode limit " + myType.bytecodeLimit);
//
//        }

        int numSearched = Math.min(maxSearchCount, visibleLeadLocs.length);

        // search through lead locs
        int totalLead = 0;
        for (int i = numSearched; --i >= 0; ) {
            MapLocation loc = visibleLeadLocs[i];
            totalLead += rc.senseLead(loc);
            int zx = loc.x / ZONE_SIZE;
            int zy = loc.y / ZONE_SIZE;
            if (zoneResourceStatus[zx][zy] != ZONE_MINE_FLAG) {
                if (myType == ARCHON) {
                    Zone.updateResourceZoneCount(zoneResourceStatus[zx][zy], ZONE_MINE_FLAG, zx, zy);
                }
                zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
                writeReportResource(zx, zy, ZONE_MINE_FLAG);
            }
        }

//        if (totalLead >= 100) {
//            writeMineHelp(visibleLeadLocs[0]);
//        } else if (totalLead - numSearched >= 20 && myType != MINER){
//            boolean shouldWrite = false;
//            for (int i = sensedAllies.length; --i >= 0;) {
//                switch (sensedAllies[i].type) {
//                    case MINER:
//                    case ARCHON:
//                        shouldWrite = true;
//                        break;
//                }
//                if (shouldWrite) {
//                    break;
//                }
//            }
//            if (!shouldWrite) {
//                writeMineHelp(visibleLeadLocs[0]);
//            }
//        }
    }

    public static MapLocation getClosestAllyArchon(MapLocation targetLoc) {
        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = MAX_ARCHONS; --i >= 0; ) {
            if (isAllyArchonLive[i]) {
                MapLocation loc = allyArchonLocs[i];
                int dist = targetLoc.distanceSquaredTo(loc);
                if (dist < bestDist) {
                    bestLoc = loc;
                    bestDist = dist;
                }
            }
        }
        return bestLoc;
    }

    public static MapLocation[] enemyArchonSymLocs;
    public static int[] enemyArchonSymStatus;

    public static void initEnemyArchonSymLocs() {
        enemyArchonSymLocs = new MapLocation[3 * MAX_ARCHONS];
        enemyArchonSymStatus = new int[3 * MAX_ARCHONS];

        for (int i = MAX_ARCHONS; --i >= 0;) {
            MapLocation loc = allyArchonLocs[i];
            if (loc != null) {
                // horizontal
                enemyArchonSymLocs[i * 3] = Map.getSymLoc(loc, Symmetry.H);
                enemyArchonSymLocs[i * 3 + 1] = Map.getSymLoc(loc, Symmetry.V);
                enemyArchonSymLocs[i * 3 + 2] = Map.getSymLoc(loc, Symmetry.R);
                log("SYM-LOC " + loc + ": " + enemyArchonSymLocs[i * 3] + " " + enemyArchonSymLocs[i * 3+1] + " " + enemyArchonSymLocs[i * 3+2]);
            }
        }
    }

    public static void updateEnemyArchonSymLocs() throws GameActionException {
        for (int i = enemyArchonSymLocs.length; --i >= 0;) {
            MapLocation loc = enemyArchonSymLocs[i];
            if (loc != null && rc.canSenseLocation(loc)) {
                RobotInfo ri = rc.senseRobotAtLocation(loc);
                if (ri != null && ri.type == ARCHON && ri.team == them) {
                    enemyArchonSymStatus[i] = 1;
                } else {
                    enemyArchonSymStatus[i] = -1;
                }
            }
        }
    }

    public static MapLocation getClosestEnemyArchonSymLoc(MapLocation targetLoc) {
        if (age < 1) {
            return null;
        }

        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = enemyArchonSymLocs.length; --i >= 0; ) {
            MapLocation loc = enemyArchonSymLocs[i];
            if (loc != null) {
                if (enemyArchonSymStatus[i] == 1) {
                    int dist = targetLoc.distanceSquaredTo(loc);
                    if (dist < bestDist) {
                        bestDist = dist;
                        bestLoc = loc;
                    }
                }
            }
        }
        return bestLoc;
    }


    /*
    Run at the end of each turn
    Checks if we exceeded the bytecode limit
     */
    public static void endTurn() throws GameActionException {
        printBuffer();

        // check if we went over the bytecode limit
        int endTurn = rc.getRoundNum();
        int turns = endTurn - roundNum;
        if (roundNum != endTurn) {
            logi("BYTECODE LIMIT EXCEEDED");
            int bytecodeOver = Clock.getBytecodeNum();
            tlogi("Overused bytecode: " + (bytecodeOver + (turns - 1) * myType.bytecodeLimit));
            tlogi("Skipped turns: " + turns);
            printBuffer();
        }

        // print endTurn information
        if (!NO_TURN_LOGS) {
            logline();
            log("END TURN");
            tlog("Bytecode left: " + (Clock.getBytecodesLeft() - turns * myType.bytecodeLimit));
            logline();
            printBuffer();
        }

        // if skipped turn, updateTurnInfo before skipping
        if (roundNum != endTurn) {
            log("[SKIPPED TURN - BASIC UPDATE]");
            updateTurnInfo();
        }

        Clock.yield();
    }

    // things to print out each turn for each unit
    public static void printMyInfo() {
        if (NO_TURN_LOGS) return;
        logline();
        log(myType + " " + myID);
        log("Loc: " + here + ". R: " + roundNum + ". A: " + age);
        // tlog extra info at start/end of each turn
        // log("Cooldown: " + (int) (rc.getCooldownTurns() * cooldownRounding) / cooldownRoundingDouble);
        logline();
    }
}
