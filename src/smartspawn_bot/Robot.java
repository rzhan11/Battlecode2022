package smartspawn_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static smartspawn_bot.Comms.*;
import static smartspawn_bot.Debug.*;
import static smartspawn_bot.Nav.*;
import static smartspawn_bot.Zone.*;
import static smartspawn_bot.Utils.*;

public abstract class Robot extends Constants {

    /*
    True constants
     */
    final public static Direction[] DIRS = {Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST}; // 8 directions
    final public static Direction[] ALL_DIRS = {Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.CENTER}; // includes center
    final public static Direction[] CARD_DIRS = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST}; // four cardinal directions
    final public static Direction[] DIAG_DIRS = {Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.NORTHWEST}; // four diagonals

    final public static Team neutral = Team.NEUTRAL;


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

    public static void init(RobotController theRC) throws GameActionException {
        rc = theRC;

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

        Utils.RANDOM_SEED = myID;

        Debug.clearBuffer();
        log("INIT ROBOT");

        // init map
        Map.initMap();
        exploreLoc = getRandomLoc();

        // init hardcode
        HardCode.initHardCode();

        // init comms
//        Section.initSections();

        // init resource zone
        Zone.initResources();




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
    public static RobotInfo[] sensedNeutrals;

    public static int timeSinceEnemy = 0;

    // turn-dependent stats of my robot/game state

    public static MapLocation[] allyArchonLocs = new MapLocation[MAX_ARCHONS];
    public static boolean[] isAllyArchonLive = new boolean[MAX_ARCHONS];

    public static int[] allyUnitCounts = new int[ALLY_UNIT_COUNT_SECTION_SIZE];

    // public static double myPassability;
    // public static int myInfluence;
    // public static int myConviction;

    public static void updateTurnInfo() throws GameActionException {

        // independent
        updateBasicInfo();

        // load comms
        Comms.loadCommArray();

        // archon comm updates
        if (myType == ARCHON) {
            // archon location comms
            if (roundNum == spawnRound) { // init
                Archon.myArchonIndex = Comms.findEmptyCell(ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE);
                Archon.archonSpawnBit = new int[MAX_ARCHONS];
            }
            Comms.writeAllyArchon(here, Archon.myArchonIndex, true);
        }

        // read comms relevant to this troop
        readRelevantComms();

        // clear message board on odd rounds
        if (myType == ARCHON) {
            if (roundNum != spawnRound) {
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
        // myPassability = rc.sensePassability(here);

        sensedRobots = rc.senseNearbyRobots();
        sensedAllies = rc.senseNearbyRobots(-1, us);
        sensedEnemies = rc.senseNearbyRobots(-1, them);
        sensedNeutrals = rc.senseNearbyRobots(-1, neutral);

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

        Comms.readAllyArchonSection();

        // skip these comms for non-archons on their spawn round
        if (myType == ARCHON || roundNum != spawnRound) {
            if (roundNum % 10 == 1 || age == 1) {
                Comms.readCommonExploreSection(); // no dependencies
            }
            if (roundNum % 2 == 0) { // read on even
                Comms.readAllyUnitCountSections();
            }
            Comms.readBroadcastResourceSection();
            Comms.readReportResourceSection();
        }

        if (myType == SOLDIER || myType == ARCHON || myType == WATCHTOWER) {
            Comms.readReportEnemySection();
        }
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
                logi("WARNING: 'getUnitcount' Unsupported unit " + rt);
        }
        return -1;
    }

    public static void reportSensedEnemies() throws GameActionException {
        // report one sensed enemy
        if (sensedEnemies.length > 0) {
            RobotInfo ri = sensedEnemies[randInt(sensedEnemies.length)];
            Comms.writeReportEnemy(ri.location, ri.type);
        }
    }

    /*
    Reporting resource zone information
     */
    public static void reportResources() throws GameActionException {
        if (myType == LABORATORY) {
            return;
        }
        if (myType.bytecodeLimit <= 7500 && roundNum == spawnRound) {
            return;
        }
        updateResourceZoneStatus(myZoneX, myZoneY); // report resource zone updates
        updateResourceZoneStatusEdges(); // report resource zone updates for edge zones
        updateResourceZoneStatusSpeculative();
    }

    /*
    Updates resource zone status of given resource zone (assumes can see it)
     */
    public static void updateResourceZoneStatus(int zx, int zy) throws GameActionException {
        int[] zoneBounds = getZoneLocBounds(zx, zy);
        // check tiles for resources

        int oldStatus = zoneResourceStatus[zx][zy];

        zoneResourceStatus[zx][zy] = ZONE_EMPTY_FLAG; // set to empty mine
        for (int i = zoneBounds[0]; i <= zoneBounds[1]; i++) {
            for (int j = zoneBounds[2]; j <= zoneBounds[3]; j++) {
                MapLocation loc = new MapLocation(i, j);
                if (rc.senseLead(loc) > 0) {
                    zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
                    break;
                }
            }
        }

        if (oldStatus != zoneResourceStatus[zx][zy]) {
            // todo: delay reports when young
            writeReportResource(zx, zy, zoneResourceStatus[zx][zy]);
        }

    }


    /*
    Tries to update resource zone status for adjacent zones (if they are unknown)
     */
    public static int[][] edgeZoneDeltas = new int[][] {{0, 1}, {1, 0}, {1, 1}};
    public static void updateResourceZoneStatusEdges() throws GameActionException {

        for (int i = edgeZoneDeltas.length; --i >= 0;) {
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
        if (myType.bytecodeLimit <= 7500 && roundNum == spawnRound) {
            return;
        }
        MapLocation[] visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius);

        // limit number of searched locs if low on bytecode
        int maxSearchCount;
        switch(myType.bytecodeLimit) {
            case 5000:
                maxSearchCount = 0;
                break;
            case 7500:
                maxSearchCount = 16;
                break;
            case 10000:
                maxSearchCount = 32;
                break;
            case 20000:
                maxSearchCount = 64;
                break;
            default:
                maxSearchCount = 0;
                logi("WARNING: 'updateResourceZoneStatusSpeculative' Unexpected bytecode limit " + myType.bytecodeLimit);

        }

        int numSearched = Math.min(maxSearchCount, visibleLeadLocs.length);

        // search through lead locs
        for (int i = numSearched; --i >= 0;) {
            MapLocation loc = visibleLeadLocs[i];
            int zx = loc.x / ZONE_SIZE;
            int zy = loc.y / ZONE_SIZE;
            if (zoneResourceStatus[zx][zy] != ZONE_MINE_FLAG) {
                zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
                writeReportResource(zx, zy, ZONE_MINE_FLAG);
            }
        }

        // search last index as well (first/last indices are more likely to be unique zones)
        if (visibleLeadLocs.length > 0) {
            int i = visibleLeadLocs.length - 1;
            MapLocation loc = visibleLeadLocs[i];
            int zx = loc.x / ZONE_SIZE;
            int zy = loc.y / ZONE_SIZE;
            if (zoneResourceStatus[zx][zy] != ZONE_MINE_FLAG) {
                zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
                writeReportResource(zx, zy, ZONE_MINE_FLAG);
            }
        }
    }

    public static MapLocation exploreLoc = null;
    public static int attemptsSinceProgress = 0;

    public static int EXPLORE_PATIENCE = 10; // number of attempts to go towards a location before giving up
    public static int EXPLORE_DISTANCE_REQ = 9; // how close we will try to get to exploreLoc

    public static void explore() throws GameActionException {
        if (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            chooseNewExploreLoc();
        }

        drawLine(here, exploreLoc, WHITE);

        Direction exploreDir = here.directionTo(exploreLoc);
        Direction moveDir = tryMoveApprox(exploreDir);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            chooseNewExploreLoc();
            explore();
        }
    }

    public static void chooseNewExploreLoc() {
        // choose new location
        exploreLoc = getRandomLoc();
        attemptsSinceProgress = 0;
        // make sure to choose a location that is somewhat far away
        while (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            exploreLoc = getRandomLoc();
        }
    }



    /*
    Run at the end of each turn
    Checks if we exceeded the bytecode limit
     */
    public static void endTurn() throws GameActionException {




        // check if we went over the bytecode limit
        int endTurn = rc.getRoundNum();
        if (roundNum != endTurn) {
            // printMyInfo();
            logi("BYTECODE LIMIT EXCEEDED");
            int bytecodeOver = Clock.getBytecodeNum();
            int turns = endTurn - roundNum;
            tlogi("Overused bytecode: " + (bytecodeOver + (turns - 1) * myType.bytecodeLimit));
            tlogi("Skipped turns: " + turns);
        }

        printBuffer();
        // print endTurn information
        if (!NO_TURN_LOGS) {
            logline();
            log("END TURN");
            // tlog extra info at end of turn
            tlog("Bytecode left: " + Clock.getBytecodesLeft());
            logline();
            printBuffer();
        }
        Clock.yield();
    }

    // things to print out each turn for each unit
    public static void printMyInfo () {
        if (NO_TURN_LOGS) return;
        logline();
        log(myType + " " + myID);
        log("Loc: " + here + ". R: " + roundNum);
        // tlog extra info at start/end of each turn
        // log("Cooldown: " + (int) (rc.getCooldownTurns() * cooldownRounding) / cooldownRoundingDouble);
        logline();
    }
}
