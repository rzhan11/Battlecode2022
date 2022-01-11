package explore_bot;

import battlecode.common.*;


import static explore_bot.Bug.*;
import static explore_bot.Constants.*;
import static explore_bot.Debug.*;
import static explore_bot.Map.*;
import static explore_bot.Robot.*;
import static explore_bot.Utils.*;

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

    /*
    Move to better tile (less rubble)
     */
    public static Direction moveBetterTile() throws GameActionException {
        Direction[] tryDirs = getClosestDirs(getRandomDir());

        Direction bestDir = null;
        int bestRubble = P_INF;
        for (int i = tryDirs.length; --i >= 0;) {
            Direction dir = tryDirs[i];
            if (checkDirMoveable(dir)) {
                int rubble = rc.senseRubble(here);
                if (rubble < bestRubble) {
                    bestDir = dir;
                    bestRubble = rubble;
                }
            }
        }

        if (bestRubble < rc.senseRubble(here)) {
            Actions.doMove(bestDir);
            return bestDir;
        } else {
            return null;
        }
    }

    /*
    Move to better tile (less rubble)
     */
    public static Direction moveBetterTile(MapLocation center, int radius) throws GameActionException {
        Direction[] tryDirs = getClosestDirs(getRandomDir());

        Direction bestDir = null;
        int bestRubble = P_INF;
        for (int i = tryDirs.length; --i >= 0;) {
            Direction dir = tryDirs[i];
            MapLocation loc = rc.adjacentLocation(dir);
            if (checkDirMoveable(dir)) {
                if (center.isWithinDistanceSquared(loc, radius)) {
                    int rubble = rc.senseRubble(loc);
                    if (rubble < bestRubble) {
                        bestDir = dir;
                        bestRubble = rubble;
                    }
                }
            }
        }

        if (bestRubble <= rc.senseRubble(here)) {
            Actions.doMove(bestDir);
            return bestDir;
        } else {
            return null;
        }
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


    public static Direction fuzzyToSimple(MapLocation dangerLoc) throws GameActionException {
        int curDist = here.distanceSquaredTo(dangerLoc);

        Direction bestDir = null;
        double bestRubble = P_INF;
        double bestDist = P_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (checkDirMoveable(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                int dist = adjLoc.distanceSquaredTo(dangerLoc);
                if (dist < curDist) {
                    double rubble = rc.senseRubble(adjLoc);
                    if (rubble < bestRubble) {
                        bestDir = dir;
                        bestRubble = rubble;
                        bestDist = dist;
                    } else if (rubble == bestRubble && dist < bestDist) {
                        bestDir = dir;
                        bestRubble = rubble;
                        bestDist = dist;
                    }
                }
            }
        }

        if (bestDir != null) {
            Actions.doMove(bestDir);
        } else {
            return null;
        }
        return bestDir;
    }

    public static Direction fuzzyAwaySimple(MapLocation dangerLoc) throws GameActionException {
        int curDist = here.distanceSquaredTo(dangerLoc);

        Direction bestDir = null;
        double bestRubble = P_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (checkDirMoveable(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                int dist = adjLoc.distanceSquaredTo(dangerLoc);
                if (dist > curDist) {
                    double rubble = rc.senseRubble(adjLoc);
                    if (rubble < bestRubble) {
                        bestDir = dir;
                        bestRubble = rubble;
                    }
                }
            }
        }

        if (bestDir != null) {
            Actions.doMove(bestDir);
        } else {
            return null;
        }
        return bestDir;
    }


    public static Direction fuzzyTo(MapLocation dangerLoc) throws GameActionException {
        log("Fuzzy to " + dangerLoc + " " + here);

        double curRootDist = Math.sqrt(here.distanceSquaredTo(dangerLoc));

        Direction bestDir = null;
        double bestSpeed = N_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (checkDirMoveable(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                double rootDist = Math.sqrt(dangerLoc.distanceSquaredTo(adjLoc));
                // should be positive
                double speed = (curRootDist - rootDist) / (10 + rc.senseRubble(adjLoc));
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
                double speed = (curRootDist - rootDist) / (10 + rc.senseRubble(adjLoc));
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




    // for when we are medium close to targetHQ
    public static boolean circleHQLeft;


    public static Direction tryCircleApproach(MapLocation centerLoc) throws GameActionException {
        log("Circle to " + centerLoc);

        double curRootDist = Math.sqrt(here.distanceSquaredTo(centerLoc));
        int curMaxXY = Math.max(Math.abs(here.x - centerLoc.x), Math.abs(here.y - centerLoc.y));

        Direction bestDir = null;
        double bestSpeed = N_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (checkDirMoveable(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                int maxXY = Math.max(Math.abs(adjLoc.x - centerLoc.x), Math.abs(adjLoc.y - centerLoc.y));
                if (maxXY < curMaxXY) {
                    double rootDist = Math.sqrt(centerLoc.distanceSquaredTo(adjLoc));
                    double speed = (curRootDist - rootDist) / (10 + rc.senseRubble(adjLoc));
                    if (speed > bestSpeed) {
                        bestDir = dir;
                        bestSpeed = speed;
                    }
                }
            }
        }

        if (bestSpeed > 0) {
            Actions.doMove(bestDir);
            return bestDir;
        } else {
            return tryCircleLoc(centerLoc);
        }
    }

    public static Direction tryCircleLoc(MapLocation centerLoc) throws GameActionException {
        // try circling hq
        Direction relativeLeft = getCircleDirLeft(here, centerLoc);
        Direction relativeRight = getCircleDirRight(here, centerLoc);
        if (circleHQLeft) {
            if (checkDirMoveable(relativeLeft)) {
                log("Circle left");
                Actions.doMove(relativeLeft);
                return relativeLeft;
            } else if (checkDirMoveable(relativeRight)) {
                log("Circle right, switched");
                circleHQLeft = false;
                Actions.doMove(relativeRight);
                return relativeRight;
            } else {
                log("Tried circle left, stuck");
                return null;
            }
        } else {
            if (checkDirMoveable(relativeRight)) {
                log("Circle right");
                Actions.doMove(relativeRight);
                return relativeRight;
            } else if (checkDirMoveable(relativeLeft)) {
                log("Circle left, switched");
                circleHQLeft = true;
                Actions.doMove(relativeLeft);
                return relativeLeft;
            } else {
                log("Tried circle right, stuck");
                return null;
            }
        }
    }


    public static boolean wanderLeft;

    public static MapLocation wanderCenter;

    public static boolean canWander(Direction dir, int centerRadius, int cornerRadius) throws GameActionException {
        MapLocation loc = rc.adjacentLocation(dir);
//        ttlog(checkDirMoveable(dir) + " " + !wanderCenter.isWithinDistanceSquared(loc, centerRadius));
        return checkDirMoveable(dir)
                && !wanderCenter.isWithinDistanceSquared(loc, centerRadius)
                && avoidCorner(loc, cornerRadius) == null;
    }

    public static Direction[] getInnerWanderDirs(Direction dir) {
        Direction[] dirs = new Direction[8];
        Direction opp = dir.opposite();
        // init direction
        dirs[0] = wanderLeft ? dir.rotateLeft() : dir.rotateRight(); // in
        dirs[1] = dir; // straight
        dirs[2] = wanderLeft ? dir.rotateRight() : dir.rotateLeft(); // out
        // perpendicular
        dirs[3] = wanderLeft ? dir.rotateLeft().rotateLeft() : dir.rotateRight().rotateRight(); // in
        dirs[4] = wanderLeft ? dir.rotateRight().rotateRight() : dir.rotateLeft().rotateLeft(); // out
        // turning around
        dirs[5] = wanderLeft ? opp.rotateRight() : opp.rotateLeft(); // in
        dirs[6] = opp; // straight
        dirs[7] = wanderLeft ? opp.rotateLeft() : opp.rotateRight(); // out
        return dirs;
    }

    public static Direction[] getNeutralWanderDirs(Direction dir) {
        Direction[] dirs = new Direction[8];
        Direction opp = dir.opposite();
        // init direction
        dirs[0] = dir; // straight
        dirs[1] = wanderLeft ? dir.rotateRight() : dir.rotateLeft(); // out
        dirs[2] = wanderLeft ? dir.rotateLeft() : dir.rotateRight(); // in
        // perpendicular
        dirs[3] = wanderLeft ? dir.rotateRight().rotateRight() : dir.rotateLeft().rotateLeft(); // out
        dirs[4] = wanderLeft ? dir.rotateLeft().rotateLeft() : dir.rotateRight().rotateRight(); // in
        // turning around
        dirs[5] = opp; // straight
        dirs[6] = wanderLeft ? opp.rotateLeft() : opp.rotateRight(); // out
        dirs[7] = wanderLeft ? opp.rotateRight() : opp.rotateLeft(); // in
        return dirs;
    }

    public static Direction[] getOuterWanderDirs(Direction dir) {
        Direction[] dirs = new Direction[8];
        Direction opp = dir.opposite();
        // init direction
        dirs[0] = wanderLeft ? dir.rotateRight() : dir.rotateLeft(); // out
        dirs[1] = dir; // straight
        dirs[2] = wanderLeft ? dir.rotateLeft() : dir.rotateRight(); // in
        // perpendicular
        dirs[3] = wanderLeft ? dir.rotateRight().rotateRight() : dir.rotateLeft().rotateLeft(); // out
        dirs[4] = wanderLeft ? dir.rotateLeft().rotateLeft() : dir.rotateRight().rotateRight(); // in
        // turning around
        dirs[5] = wanderLeft ? opp.rotateLeft() : opp.rotateRight(); // out
        dirs[6] = opp; // straight
        dirs[7] = wanderLeft ? opp.rotateRight() : opp.rotateLeft(); // in
        return dirs;
    }

    /*
    Circles around spawn point
     */
    public static Direction wander(MapLocation centerLoc, int centerRadius, int cornerRadius, int preferDir) throws GameActionException {
        log("Trying to wander");
        tlog(wanderLeft ? "Going left": "Going right");

        wanderCenter = centerLoc;

//        tlog("Info: " + wanderCenter + " " + radius);

        // check if too close to spawn
        if (here.isWithinDistanceSquared(wanderCenter, centerRadius)) {
//            tlog("Too close to wanderCenter");
            return fuzzyAway(wanderCenter);
        }

        // try to circle
        Direction dir2center = wanderCenter.directionTo(here);
        Direction wanderDir = wanderLeft ? dir2center.rotateLeft().rotateLeft() : dir2center.rotateRight().rotateRight();

        // if we would hit the wall
        if (!rc.onTheMap(rc.adjacentLocation(wanderDir))) {
            wanderLeft = !wanderLeft;
            wanderDir = wanderLeft ? dir2center.rotateLeft().rotateLeft() : dir2center.rotateRight().rotateRight();
        }

//        log("Init wanderDir " + wanderDir + " " + dir2center);

        Direction[] possDirs;
        if (preferDir < 0) {
            possDirs = getInnerWanderDirs(wanderDir);
        } else if (preferDir == 0) {
            possDirs = getNeutralWanderDirs(wanderDir);
        } else {
            possDirs = getOuterWanderDirs(wanderDir);
        }

        for (int i = 0; i < 8; i++) {
//            log("Considering " + i + " " + possDirs[i]);
            if (canWander(possDirs[i], centerRadius, cornerRadius)) {
                if (i >= 5) {
                    wanderLeft = !wanderLeft;
                }
                Actions.doMove(possDirs[i]);
                return possDirs[i];
            }
        }

        tlog("Cannot wander");
        return null;
    }

}
