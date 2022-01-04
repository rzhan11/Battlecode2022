package firstbot;

import battlecode.common.*;


import static firstbot.Robot.*;
import static firstbot.Bug.*;
import static firstbot.Debug.*;
import static firstbot.Map.*;

public class Nav {

    public static MapLocation smartMoveTargetLoc = new MapLocation(0, 0);
    public static int failedFuzzyAttempts;
    public static int couldFuzzy;

    public static Direction smartMove(MapLocation loc) throws GameActionException {
        if (!smartMoveTargetLoc.equals(loc)) {
            smartMoveTargetLoc = loc;
            failedFuzzyAttempts = 0;
        }

        if (failedFuzzyAttempts >= 3) {
            // check front

            if (checkMoveApprox(here.directionTo(loc))) {
                couldFuzzy++;
            }
            if (couldFuzzy >= 5) {
                failedFuzzyAttempts = 0;
                couldFuzzy = 0;
                return fuzzyTo(loc);
            }

            return moveLog(loc);
        } else {
            Direction dir = fuzzyTo(loc);
            if (dir == null) {
                failedFuzzyAttempts++;
            } else {
                failedFuzzyAttempts = 0;
            }
            return dir;
        }
    }

    public static Direction moveLog(MapLocation loc) throws GameActionException {
        Direction move = path(loc);
        if (move == null) {
            tlog("But no move found");
        }
        return move;
    }

        // todo: check if worth reimplementing
//    public static void updateIsDirMoveable() throws GameActionException {
        // add information about if direction is moveable
//    }

        // todo: check if worth reimplementing
    /*
    Returns true if we can move in a direction to a tile
    Returns false otherwise
    */
    public static boolean checkDirMoveable(Direction dir) throws GameActionException {
		MapLocation loc = rc.adjacentLocation(dir);
        return rc.canMove(dir);
    }

//    public static void drawCheckDirMoveable() throws GameActionException {
//        for (Direction dir: DIRS) {
//            if (!isDirMoveable[dir2int(dir)]) {
//                drawDot(here.add(dir), RED);
//            } else if (rc.sensePassability(here.add(dir)) < minPassability) {
//                drawDot(here.add(dir), ORANGE);
//            } else {
//                drawDot(here.add(dir), GREEN);
//            }
//        }
//    }

    /*
    Tries to move in the target direction
    Returns the Direction that we moved in
    Returns null if did not move
    */
    public static Direction tryMove(Direction dir) throws GameActionException {
        if (checkDirMoveable(dir)) {
            Actions.doMove(dir);
            return dir;
        }
        return null;
    }

    /*
    Tries to move in the target direction, or rotateLeft/rotateRight of it
    Returns the Direction that we moved in
    Returns null if did not move
    */
    public static Direction tryMoveApprox (Direction dir) throws GameActionException {
        if (checkDirMoveable(dir)) {
            Actions.doMove(dir);
            return dir;
        }
        Direction leftDir = dir.rotateLeft();
        if (checkDirMoveable(leftDir)) {
            Actions.doMove(leftDir);
            return leftDir;
        }
        Direction rightDir = dir.rotateRight();
        if (checkDirMoveable(rightDir)) {
            Actions.doMove(rightDir);
            return rightDir;
        }
        return null;
    }

    public static boolean checkMoveApprox(Direction dir) throws GameActionException {
        return checkDirMoveable(dir)
                || checkDirMoveable(dir.rotateLeft())
                || checkDirMoveable(dir.rotateRight());
    }

    public static MapLocation avoidCorner(MapLocation loc, int minDist) {
        MapLocation cornerBL = new MapLocation(XMIN, YMIN);
        MapLocation cornerBR = new MapLocation(XMAX, YMIN);
        MapLocation cornerTL = new MapLocation(XMIN, YMAX);
        MapLocation cornerTR = new MapLocation(XMAX, YMAX);
        if (loc.isWithinDistanceSquared(cornerBL, minDist)) {
            return cornerBL;
        } else if (loc.isWithinDistanceSquared(cornerBR, minDist)) {
            return cornerBR;
        } else if (loc.isWithinDistanceSquared(cornerTL, minDist)) {
            return cornerTL;
        } else if (loc.isWithinDistanceSquared(cornerTR, minDist)) {
            return cornerTR;
        }
        return null;
    }


    public static Direction fuzzyTo(MapLocation dangerLoc) throws GameActionException {
        log("Fuzzy to " + dangerLoc);

        double curRootDist = Math.sqrt(here.distanceSquaredTo(dangerLoc));

        Direction bestDir = null;
        double bestSpeed = N_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (checkDirMoveable(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                double rootDist = Math.sqrt(dangerLoc.distanceSquaredTo(adjLoc));
                // should be positive
                double speed = (curRootDist - rootDist) / (1 + rc.senseRubble(adjLoc) / 10.0);
                if (speed > bestSpeed) {
                    bestDir = dir;
                    bestSpeed = speed;
                }
            }
        }

        if (bestSpeed > 0) {
            Actions.doMove(bestDir);
        } else {
            tlog("Can't move");
            return null;
        }
        return bestDir;
    }

    public static Direction fuzzyAway(MapLocation dangerLoc) throws GameActionException {
        log("Fuzzy away from " + dangerLoc);

        double curRootDist = Math.sqrt(here.distanceSquaredTo(dangerLoc));

        Direction bestDir = null;
        double bestSpeed = P_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (checkDirMoveable(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                double rootDist = Math.sqrt(dangerLoc.distanceSquaredTo(adjLoc));
                // should be negative, rootDist > curRootDist
                double speed = (curRootDist - rootDist) / (1 + rc.senseRubble(adjLoc) / 10.0);
                if (speed < bestSpeed) {
                    bestDir = dir;
                    bestSpeed = speed;
                }
            }
        }

        if (bestSpeed < 0) {
            Actions.doMove(bestDir);
        } else {
            tlog("Can't move");
            return null;
        }
        return bestDir;
    }

}
