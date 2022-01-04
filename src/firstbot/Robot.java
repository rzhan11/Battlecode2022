package firstbot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static firstbot.Comms.*;
import static firstbot.Debug.*;
import static firstbot.Map.*;
import static firstbot.Nav.*;
import static firstbot.Utils.*;

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

        // initial comms
        Comms.initBaseCoords(rc.getLocation());
        if (myType != ARCHON) {
            Comms.readAllArchonLocs();
        }

        // init hardcode
        HardCode.initHardCode();



        // printBuffer at end
        Debug.printBuffer();
    }

    /*
    Variables that (may) change each turn
     */

    public static MapLocation here;
    public static int roundNum;
    public static int age;

    // turn-dependent stats of my robot/game state

    public static MapLocation[] myArchonLocs;

    // public static double myPassability;
    // public static int myInfluence;
    // public static int myConviction;

    public static void updateTurnInfo() throws GameActionException {

        // comms things for every turn
//        CommManager.resetFlag();
//        Comms.resetPrevEcho();

        // independent
        updateBasicInfo();

        printBuffer();
    }

    /*
    These updates should be cheap and independent of other updates
     */
    public static void updateBasicInfo() throws GameActionException {
        here = rc.getLocation();
        roundNum = rc.getRoundNum();
        age = roundNum - spawnRound;

        // update simple variables here
        // myPassability = rc.sensePassability(here);


        // print basic info
        printMyInfo();
        printBuffer();
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
