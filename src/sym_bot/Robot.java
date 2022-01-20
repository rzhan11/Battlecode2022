package sym_bot;

import battlecode.common.*;
import sprint_bot.HardCode;

import static battlecode.common.RobotType.*;

import static sym_bot.Comms.*;
import static sym_bot.Debug.*;
import static sym_bot.Utils.*;

public abstract class Robot extends Constants {

    /*
    True constants
     */
    final public static Direction[] DIRS = {Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST}; // 8 directions
    final public static Direction[] ALL_DIRS = {Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.CENTER}; // includes center
    final public static Direction[] CARD_DIRS = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST}; // four cardinal directions
    final public static Direction[] DIAG_DIRS = {Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.NORTHWEST}; // four diagonals
    final public static Symmetry[] SYM_TYPES = {Symmetry.H, Symmetry.V, Symmetry.R}; // three types of symmetry

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

        // printBuffer at end
        Debug.printBuffer();

        HardCode.initHardCode();
    }

    /*
    Variables that (may) change each turn
     */

    public static MapLocation here;
    public static int roundNum;
    public static int age;

    public static RobotInfo[] sensedRobots;
    public static RobotInfo[] sensedAllies;
    public static RobotInfo[] sensedEnemies;

    public static int timeSinceEnemy = 0;

    // turn-dependent stats of my robot/game state

    public static MapLocation[] allyArchonLocs = new MapLocation[MAX_ARCHONS];
    public static boolean[] isAllyArchonLive = new boolean[MAX_ARCHONS];


    public static int myHealth;

    public static void updateTurnInfo() throws GameActionException {

        // independent
        updateBasicInfo();

        // archon comm updates
        if (myType == ARCHON) {
            // archon location comms
            if (age == 0) { // init
                Archon.myArchonIndex = Comms.findEmptyCell(ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE);
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

        Map.updateSymmetryByRubble();
        // todo: make any necessary comm updates


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
    }

    public static void readRelevantComms() throws GameActionException {
        /*
        Read any relevant comms here
        Note, this gets called before we write out comms
         */
        // todo: read any relevant comms here
    }

    // ref: might be useful
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
            log("SKIPPED TURN - BASIC UPDATE]");
            updateTurnInfo();
        }

        Clock.yield();
    }

    // things to print out each turn for each unit
    public static void printMyInfo() {
        if (NO_TURN_LOGS) return;
        logline();
        log(myType + " " + myID);
        log("Loc: " + here + ". R: " + roundNum);
        // tlog extra info at start/end of each turn
        // log("Cooldown: " + (int) (rc.getCooldownTurns() * cooldownRounding) / cooldownRoundingDouble);
        logline();
    }
}
