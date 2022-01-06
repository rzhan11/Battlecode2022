package micro_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static micro_bot.Comms.*;
import static micro_bot.Debug.*;
import static micro_bot.Nav.*;
import static micro_bot.Utils.*;

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




        // printBuffer at end
        Debug.printBuffer();
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
    public static RobotInfo[] sensedNeutrals;

    public static int timeSinceEnemy = 0;

    // turn-dependent stats of my robot/game state

    public static MapLocation[] allyArchonLocs = new MapLocation[MAX_ARCHONS];
    public static boolean[] isAllyArchonLive = new boolean[MAX_ARCHONS];

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
            }
            Comms.writeAllyArchon(here, Archon.myArchonIndex, true);


            // clear message board on odd rounds
            if (roundNum != spawnRound) {
                if (roundNum % 2 == 1 && Archon.isPrimaryArchon()) {
                    Comms.clearMessageBoard();
                }
            }
        }

        Comms.readAllyArchonSection();

        // report enemies
        reportSensedEnemies();


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

    public static void reportSensedEnemies() throws GameActionException {
        // report one sensed enemy
        if (sensedEnemies.length > 0) {
            RobotInfo ri = sensedEnemies[0];
            Comms.writeReportEnemy(ri.location, ri.type);
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
