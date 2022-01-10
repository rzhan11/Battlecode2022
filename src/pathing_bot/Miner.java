package pathing_bot;

import battlecode.common.*;

import static pathing_bot.Debug.*;

public class Miner extends Robot {
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms

//        if (roundNum > 50) {
//            endTurn();
//            updateTurnInfo();
//        }
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        updateDanger();

        Actions.setMovePause(true); // pause
        Direction moveDir = moveLogic();
        Actions.setMovePause(false); // resume moves
        if (moveDir != null) {
            log("HERE " + here + " " + here.add(moveDir) + " " + moveDir);
            if (rc.senseRubble(here) < rc.senseRubble(here.add(moveDir))) {
                // cur location is better
                tryMine();
                Actions.doStoredMove();
            } else {
                // new location is better
                Actions.doStoredMove();
                tryMine();
            }
        } else { // no movement, try mining in place
            tryMine();
        }
    }

    public static Direction moveLogic() throws GameActionException {
        // look for better spot to move

        if (!rc.isMovementReady()) {
            return null;
        }

        // avoid danger
        {
            Direction moveDir = avoidDanger();
            if (moveDir != null) {
                return moveDir;
            }
        }

        // is next to mining tile, go to better tile position
        if (wouldMineLoc != null) {
            Direction moveDir = Nav.moveBetterTile(wouldMineLoc, myActionRadius);
            return moveDir;
        }

        // go to good lead locs
        {
            MapLocation[] visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius, 2);
            if (visibleLeadLocs.length > 34) { // 68 / 2
                visibleLeadLocs = rc.senseNearbyLocationsWithLead(8);
            }

            MapLocation bestLoc = null;
            int bestDist = P_INF;
            for (int i = visibleLeadLocs.length; --i >= 0;) {
                MapLocation loc = visibleLeadLocs[i];
                int dist = here.distanceSquaredTo(loc);
                if (dist < bestDist) {
                    // only go to lead tiles in zone
                    // only mine lead in same zone/old zones
                    bestLoc = loc;
                    bestDist = dist;
                }
            }

            if (bestLoc != null) {
                Direction moveDir = BFS.move(bestLoc);
                rc.setIndicatorString("going to lead@" + bestLoc);
                Debug.drawLine(here, bestLoc, RED);
                return moveDir;
            }
        }

        // explore
        Direction moveDir = Explore.exploreSimple();
        return moveDir;
    }

    public static MapLocation closestDangerLoc;
    public static int closestDangerDist;

    public static MapLocation lastSeenDangerLoc;
    public static int turnsSinceDanger;

    public static void updateDanger() throws GameActionException {
        closestDangerLoc = null;
        closestDangerDist = P_INF;
        for (int i = sensedEnemies.length; --i >= 0;) { // iterates from (len - 1) -> 0 inclusive
            RobotInfo ri = sensedEnemies[i];
            if (ri.type.canAttack()) {
                int dist = here.distanceSquaredTo(ri.location);
                if (dist < closestDangerDist) {
                    closestDangerLoc = ri.location;
                    closestDangerDist = dist;
                }
            }
        }

        if (closestDangerLoc == null) {
            turnsSinceDanger++;
        } else {
            turnsSinceDanger = 0;
            lastSeenDangerLoc = closestDangerLoc;

            // reset resource zone target if danger
//            if (targetZoneLoc != null) {
//                if (checkSimilarDir(here.directionTo(targetZoneLoc), here.directionTo(closestDangerLoc))) {
//                    resetTargetResourceZone();
//                }
//            }

            // reset explore loc if danger
//            if (exploreLoc != null) {
//                if (checkSimilarDir(here.directionTo(exploreLoc), here.directionTo(closestDangerLoc))) {
//                    chooseNewExploreLoc(0);
//                }
//            }
        }
    }

    public static Direction avoidDanger() throws GameActionException {
        if (closestDangerLoc == null) {
//            if (turnsSinceMucker <= FLEE_MEMORY) {
//                log("Memory flee " + lastSeenMucker);
//                return fuzzyAway(lastSeenMucker);
//            } else {
//                log("No recent muckers");
//                return null;
//            }
            log("No recent danger");
            return null;
        } else {
            return Nav.fuzzyAway(closestDangerLoc);
        }
    }

    public static MapLocation wouldMineLoc;

    public static void tryMine() throws GameActionException {
        wouldMineLoc = null;

        // mine lead if adjacent to it
        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            int curGold = rc.senseGold(loc);
            while (curGold > 0) {
                if (!rc.isActionReady()) {
                    wouldMineLoc = loc;
                    return;
                }
                Actions.doMineGold(loc);
                curGold--;
            }
        }

        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            int curLead = rc.senseLead(loc);
            while (curLead > 1) {
                if (!rc.isActionReady()) {
                    wouldMineLoc = loc;
                    return;
                }
                Actions.doMineLead(loc);
                curLead--;
            }
        }
    }
}
