package firstbot;

import battlecode.common.*;

import static firstbot.Robot.*;
import static firstbot.Debug.*;

public class Actions {
    public static void doMove(Direction dir) throws GameActionException {
        log("MOVING " + dir);
        drawLine(here, rc.adjacentLocation(dir), YELLOW);
        rc.move(dir);
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
        log("MUTATING " + here);
        drawLine(here, loc, PINK);
        rc.mutate(loc);
    }

    public static void doTransform() throws GameActionException {
        log("TRANSFORMING " + here);
        drawDot(here, CYAN);
        rc.transform();
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
}
