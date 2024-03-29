package gold_bot;

import battlecode.common.*;

import static gold_bot.Debug.*;
import static gold_bot.Map.*;
import static gold_bot.Symmetry.*;
import static gold_bot.Robot.*;
import static gold_bot.Utils.*;
import static gold_bot.Zone.*;

public class Explore {
    public static MapLocation exploreLoc;
    public static int attemptsSinceProgress = 0;

    public static int EXPLORE_PATIENCE = 10; // number of attempts to go towards a location before giving up
    public static int EXPLORE_DISTANCE_REQ = 9; // how close we will try to get to exploreLoc

    public static double momentumX;
    public static double momentumY;

    public static void init() {
        chooseNewExploreLoc();
        momentumX = random();
        momentumY = random();
    }

    final public static int WALL_REPULSE_DIST = 2;
    final public static double WALL_FORCE_CONSTANT = 25.0;
    final public static double ALLY_FORCE_CONSTANT = 10.0;
    final public static double DANGER_FORCE_CONSTANT = 25.0;

    final public static double MAX_MOMENTUM = 10.0;

    public static int allyAttackCount;
    public static int enemyAttackCount;

    public static void updateMomentum() {
//        if (momentumLock > 0) {
//            momentumLock--;
//            return;
//        } else {
//            momentumLock = MOMENTUM_LOCK_ROUNDS;
//        }

        updateMomentumWall();
        updateMomentumAlly();
        updateMomentumEnemy();

        // enemy
        while (momentumX == 0 && momentumY == 0) {
            momentumX = random();
            momentumY = random();
        }

        // cap momentum
        double mag = momentumX * momentumX + momentumY * momentumY;
        if (mag > MAX_MOMENTUM) {
            momentumX *= MAX_MOMENTUM / mag;
            momentumY *= MAX_MOMENTUM / mag;
        }

        MapLocation newLoc = Map.getFarthestLoc(here, momentumX, momentumY);
        if (here.directionTo(newLoc) != here.directionTo(exploreLoc)) {
            exploreLoc = newLoc;
        }
    }

    public static void updateMomentumWall() {
        log("here " + here + " " + WALL_REPULSE_DIST);
        // edges
        if (here.x <= WALL_REPULSE_DIST) {
            int dist = here.x + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumX += force;
        } else if ((XMAX - here.x) <= WALL_REPULSE_DIST) {
            int dist = XMAX - here.x + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumX -= force;
        }
        if (here.y <= WALL_REPULSE_DIST) {
            int dist = here.y + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumY += force;
        } else if ((YMAX - here.y) <= WALL_REPULSE_DIST) {
            int dist = YMAX - here.y + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumY -= force;
        }
    }

    public static void updateMomentumAlly() {
        allyAttackCount = 0;
        int myX = here.x;
        int myY = here.y;

        // optimize in dense crowds
        int searchCount = Math.min(10, sensedAllies.length);
        // repel from ally archons/miners
        for (int i = searchCount; --i >= 0;) {
            RobotInfo ri = sensedAllies[i];

            if (ri.type == myType) {
                // formula:
                // dMx = 1 / mag^2 * (dx/mag)
                // dMy = 1 / mag^2 * (dy/mag)
                MapLocation loc = ri.location;
                int dist = here.distanceSquaredTo(loc);
                momentumX += (myX - loc.x) * (ALLY_FORCE_CONSTANT / Math.pow(dist, 1.5));
                momentumY += (myY - loc.y) * (ALLY_FORCE_CONSTANT / Math.pow(dist, 1.5));
                break;
            }

            switch (ri.type) {
                // attackers
                case SAGE:
                case WATCHTOWER:
                case SOLDIER:
                    allyAttackCount++;
                    break;
                default:
                    break;
            }
        }
    }

    public static void updateMomentumEnemy() {
        enemyAttackCount = 0;
        int myX = here.x;
        int myY = here.y;

        // allySupportFactor ranges from 1-5
        double allySupportFactor = Math.max(Math.min(allyAttackCount, 5), 1);
        double curDangerForceVal = DANGER_FORCE_CONSTANT / allySupportFactor;

        // optimize in dense crowds
        int searchCount = Math.min(10, sensedEnemies.length);
        // repel from ally archons/miners
        for (int i = searchCount; --i >= 0;) {
            RobotInfo ri = sensedEnemies[i];
            switch (ri.type) {
                case SAGE:
                case WATCHTOWER:
                case SOLDIER:
                    // formula:
                    // dMx = 1 / mag^2 * (dx/mag)
                    // dMy = 1 / mag^2 * (dy/mag)
                    MapLocation loc = ri.location;
                    int dist = here.distanceSquaredTo(loc);
                    momentumX += (myX - loc.x) * (curDangerForceVal / Math.pow(dist, 1.5));
                    momentumY += (myY - loc.y) * (curDangerForceVal / Math.pow(dist, 1.5));
                    enemyAttackCount++;
                    break;
                default:
                    break;
            }
        }
    }

    public static int exploreCounter = 0;

    final public static int MOMENTUM_UPDATE_FREQ = 1;

    public static Direction exploreMomentum() throws GameActionException {
        rc.setIndicatorString("mom " + momentumX + " " + momentumY + " " + exploreLoc);
        drawLine(here, exploreLoc, BROWN);

        exploreCounter++;

        Direction moveDir = BFS.move(exploreLoc);
        return moveDir;
    }

    public static Direction exploreSimple() throws GameActionException {
        if (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            chooseNewExploreLoc();
        }

        drawLine(here, exploreLoc, WHITE);

        Direction moveDir = BFS.move(exploreLoc);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return moveDir;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            chooseNewExploreLoc();
            return exploreSimple();
        }

        return null;
    }

    public static void chooseNewExploreLoc() {
        do {
            MapLocation loc = getRandomLoc();
            while (loc.equals(here)) {
                loc = getRandomLoc();
            }
            exploreLoc = Map.getFarthestLoc(here, loc.x - here.x, loc.y - here.y);
            attemptsSinceProgress = 0;
        } while (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ));
    }

    /*
    Pick edge
     */
    /*public static Direction explorePOI() throws GameActionException {
        if (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            chooseNewExploreLoc();
        }

        drawLine(here, exploreLoc, WHITE);

        Direction moveDir = BFS.move(exploreLoc);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return moveDir;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            chooseNewExploreLoc();
            return exploreSimple();
        }

        return null;
    }*/


    public static int targetZoneX;
    public static int targetZoneY;
    public static MapLocation targetZoneLoc = null;

    public static void findNewMineZone() {
        int[] bestZone = null;
        MapLocation bestLoc = null;

        int numOffsets = HardCode.ZONE_OFFSETS.length;
        int randStartIndex = randInt(numOffsets);
        for (int i = numOffsets; --i >= 0;) {
            int[] diffs = HardCode.ZONE_OFFSETS[(i + randStartIndex) % numOffsets];
            int zx = myZoneX + diffs[0];
            int zy = myZoneY + diffs[1];
            if (!checkValidZone(zx, zy)) {
                continue;
            }
            switch (zoneResourceStatus[zx][zy]) {
                case ZONE_UNKNOWN_FLAG:
                    break;
                case ZONE_EMPTY_FLAG:
                    break;
                case ZONE_MINE_FLAG:
                    if (zoneVisitLastRound[zx][zy] > 0) {
                        if (roundNum - zoneVisitLastRound[zx][zy] <= 40) {
                            continue; // skip if too recent
                        }
                    }
                    bestZone = new int[] {zx, zy};
                    bestLoc = zone2Loc(zx, zy);
                    break;
                default:
                    logi("WARNING: 'updateResourceZoneTargets' Unexpected zone flag! " + zoneResourceStatus[zx][zy]);
            }
            // check if done
            if (bestLoc != null) {
                break;
            }
        }


        if (bestLoc != null) {
            if (targetZoneLoc != null) { // skip sometimes if already have a target
                if (zoneResourceStatus[targetZoneX][targetZoneY] == ZONE_MINE_FLAG) { //SPECIAL
                    double curDist = Math.sqrt(here.distanceSquaredTo(targetZoneLoc));
                    double newDist = Math.sqrt(here.distanceSquaredTo(bestLoc));
                    if (!(newDist < curDist - 10)) { // must be better by 10 in r1 dist
                        return;
                    }
                }
            }
            targetZoneX = bestZone[0];
            targetZoneY = bestZone[1];
            targetZoneLoc = bestLoc;
        }
    }

    public static void findNewUnknownZone() {
        int[] bestZone = null;
        MapLocation bestLoc = null;

        int numOffsets = HardCode.ZONE_OFFSETS.length;
        int randStartIndex = randInt(numOffsets);
        for (int i = numOffsets; --i >= 0;) {
            int[] diffs = HardCode.ZONE_OFFSETS[(i + randStartIndex) % numOffsets];
            int zx = myZoneX + diffs[0];
            int zy = myZoneY + diffs[1];
            if (!checkValidZone(zx, zy)) {
                continue;
            }
            switch (zoneResourceStatus[zx][zy]) {
                case ZONE_UNKNOWN_FLAG:
                    bestZone = new int[] {zx, zy};
                    bestLoc = zone2Loc(zx, zy);
                    break;
                case ZONE_EMPTY_FLAG:
                    break;
                case ZONE_MINE_FLAG:
                    break;
                default:
                    logi("WARNING: 'updateResourceZoneTargets' Unexpected zone flag! " + zoneResourceStatus[zx][zy]);
            }
            // check if done
            if (bestLoc != null) {
                break;
            }
        }


        if (bestLoc != null) {
            if (targetZoneLoc != null) { // skip sometimes if already have a target
                double curDist = Math.sqrt(here.distanceSquaredTo(targetZoneLoc));
                double newDist = Math.sqrt(here.distanceSquaredTo(bestLoc));
                if (!(newDist < curDist - 10)) { // must be better by 10 in r1 dist
                    return;
                }
            }
            targetZoneX = bestZone[0];
            targetZoneY = bestZone[1];
            targetZoneLoc = bestLoc;
        }
    }


    public static double dxSymR;
    public static double dySymR;

    public static Direction[] exploreOrderDirs = new Direction[]{Direction.NORTHEAST, Direction.SOUTHWEST, Direction.NORTHWEST, Direction.SOUTHEAST, Direction.SOUTH, Direction.NORTH, Direction.WEST, Direction.EAST};
    public static int exploreOrderDirIndex = 0;

    public static MapLocation initExploreLoc;

    public static MapLocation getInitialExploreLoc() {

        { // initial spawns for symmetry checking
            MapLocation symLoc = null;
            switch (Archon.mySpawnCount) {
                case 0: // rotational
                    if (symmetryState[2] == SYMMETRY_UNKNOWN_FLAG) {
                        symLoc = getSymLoc(here, Symmetry.R);
                    }
                    break;
//                case 1: // horizontal
//                    if (symmetryState[0] == SYMMETRY_UNKNOWN_FLAG) {
//                        symLoc = getSymLoc(here, Symmetry.H);
//                    }
//                    break;
//                case 2: // vertical
//                    if (symmetryState[1] == SYMMETRY_UNKNOWN_FLAG) {
//                        symLoc = getSymLoc(here, Symmetry.V);
//                    }
//                    break;
                // spawn counts
            }
            if (symLoc != null && !rc.canSenseLocation(symLoc)) { // if it is far enough
                dxSymR = symLoc.x - here.x;
                dySymR = symLoc.y - here.y;
                MapLocation targetLoc = getFarthestLoc(here, symLoc.x - here.x, symLoc.y - here.y);
                return targetLoc;
            }
        }


        Direction targetDir;
        do {
            targetDir = exploreOrderDirs[exploreOrderDirIndex];
            exploreOrderDirIndex = (exploreOrderDirIndex + 1) % exploreOrderDirs.length;
        } while(!checkGoodExploreDir(targetDir));

        log("explore " + targetDir);

        MapLocation loc = getFarthestLoc(here, targetDir.getDeltaX(), targetDir.getDeltaY());
        if (Archon.mySpawnCount == 1) {
            if (!(dxSymR == 0 && dySymR == 0)) {
                double ux = dxSymR;
                double uy = dySymR;
                int vx = targetDir.dx;
                int vy = targetDir.dy;
                double num = vx * ux + vy * uy;
                double den = Math.hypot(vx, vy) * Math.hypot(ux, uy);
                double cos = num / den;
                double ang = Math.acos(cos) * 180 / Math.PI;
                log("ang " + ang);
                if (ang <= 22.5 - 1) { // less than 1/2 a rotation
                    return getInitialExploreLoc();
                }
            }
        }

        return loc;
    }

    final public static int GOOD_EXPLORE_DIST = 4;

    public static boolean checkGoodExploreDir(Direction dir) {
        switch(dir.getDeltaX()) {
            case -1:
                // check left wall
                if (here.x <= GOOD_EXPLORE_DIST) {
                    return false;
                }
                break;
            case 1:
                if (XMAX - here.x <= GOOD_EXPLORE_DIST) {
                    return false;
                }
                break;
        }
        switch(dir.getDeltaY()) {
            case -1:
                // check left wall
                if (here.y <= GOOD_EXPLORE_DIST) {
                    return false;
                }
                break;
            case 1:
                if (YMAX - here.y <= GOOD_EXPLORE_DIST) {
                    return false;
                }
                break;
        }
        return true;
    }


}
