package builder_bot;

import battlecode.common.*;

import static builder_bot.Robot.*;
import static builder_bot.Debug.*;

public class Actions {

    public static int myLastMoveRound = -100;
    public static Direction myLastMoveDir;

    public static boolean isMovePaused;
    public static Direction storedMove;
    public static void setMovePause(boolean b) {
        isMovePaused = b;
    }

    public static void doStoredMove() throws GameActionException {
        if (storedMove != null) {
            doMove(storedMove);
            storedMove = null;
        }
    }

    public static void doMove(Direction dir) throws GameActionException {
        if (isMovePaused) {
            log("[STORED] MOVING " + dir);
            storedMove = dir;
        } else {
            log("MOVING " + dir);
            drawLine(here, rc.adjacentLocation(dir), YELLOW);
            rc.move(dir);
            // updates
            updatePositionInfo();
            myLastMoveRound = roundNum;
            myLastMoveDir = dir;
        }
    }

    public static void doAttack(MapLocation loc) throws GameActionException {
        log("ATTACKING " + loc);
        drawLine(here, loc, ORANGE);
        rc.attack(loc);
    }

    public static void doMineLead(MapLocation loc) throws GameActionException {
        log("MINING_LEAD " + loc);
        drawLine(here, loc, BLACK);
        rc.mineLead(loc);
    }

    public static void doMineGold(MapLocation loc) throws GameActionException {
        log("MINING_GOLD " + loc);
        drawLine(here, loc, BLACK);
        rc.mineGold(loc);
    }

    public static void doRepair(MapLocation loc) throws GameActionException {
        log("REPAIRING " + loc);
        drawLine(here, loc, GREEN);
        rc.repair(loc);
    }

    public static void doMutate(MapLocation loc) throws GameActionException {
        log("MUTATING " + loc);
        drawLine(here, loc, PINK);
        rc.mutate(loc);
    }

    public static void doTransform() throws GameActionException {
        log("TRANSFORMING " + here);
        drawDot(here, CYAN);
        rc.transform();
    }

    public static void doDisintegrate() throws GameActionException {
        drawDot(here, BLACK);
        log("DISINTEGRATING " + here);
        printBuffer();
        rc.disintegrate();
    }

    public static void doTransmute() throws GameActionException {
        log("TRANSMUTING " + here);
        drawDot(here, YELLOW);
        rc.transmute();
    }

    public static void doEnvision(AnomalyType anomaly) throws GameActionException {
        log("ENVISIONING " + anomaly);
        drawDot(here, PURPLE);
        rc.envision(anomaly);
    }

    public static void doBuildRobot(RobotType type, Direction dir) throws GameActionException {
        drawLine(here, rc.adjacentLocation(dir), CYAN);
        log("BUILDING " + type + " " + dir);
        rc.buildRobot(type, dir);
    }

    public static void doResign() {
        printBuffer();
        rc.resign();
    }
}
