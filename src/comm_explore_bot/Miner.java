package comm_explore_bot;

import battlecode.common.*;

import static comm_explore_bot.Debug.*;
import static comm_explore_bot.Utils.*;
import static comm_explore_bot.Zone.*;


public class Miner extends Robot {
//    public static boolean useSimpleExplore;
    final public static int ZONE_DANGER_WAIT = 10;

    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
//        useSimpleExplore = random() < 0;


//        if (roundNum > 50) {
//            endTurn();
//            updateTurnInfo();
//        }
    }

    // code run each turn
    public static void turn() throws GameActionException {
        log(here + " " + targetZoneLoc + " " + zoneResourceStatus[4][3]);
        if (myID == 15259) {
            // draw resource zone
            {
                MapLocation loc = new MapLocation(2 * ZONE_SIZE, 1 + 5 * ZONE_SIZE);
                int[] color = PINK;
                switch (zoneResourceStatus[2][5]) {
                    case ZONE_UNKNOWN_FLAG:
                        color = BLACK;
                        break;
                    case ZONE_EMPTY_FLAG:
                        color = RED;
                        break;
                    case ZONE_MINE_FLAG:
                        color = GREEN;
                        break;

                    default:
//                        logi("WARNING: 'displayZoneStatus' Unknown zone status! " + zoneResourceStatus[zx][zy]);
                }
                Debug.drawDot(loc, color);

            }
        }


        // put role-specific updates here
//        startBytecode("updateMomentum");
//        if (!useSimpleExplore)  {
//            Explore.updateMomentum();
//        }
//        stopBytecode("updateMomentum");

        startBytecode("updateDanger");
        updateDanger();
        stopBytecode("updateDanger");

        Actions.setMovePause(true); // pause
        Direction moveDir = moveLogic();
        Actions.setMovePause(false); // resume moves
        if (moveDir != null) {
            if (rc.senseRubble(here) < rc.senseRubble(here.add(moveDir))) {
                // cur location is better
                startBytecode("tryMine1");
                tryMine();
                stopBytecode("tryMine1");

                if (wouldMineLoc == null) {
                    Actions.doStoredMove();
                    startBytecode("tryMine1.5");
                    tryMine();
                    stopBytecode("tryMine1.5");
                }

            } else {
                // new location is better
                Actions.doStoredMove();

                startBytecode("tryMine2");
                tryMine();
                stopBytecode("tryMine2");
            }
        } else { // no movement, try mining in place
            startBytecode("tryMine3");
            tryMine();
            stopBytecode("tryMine3");
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
        MapLocation[] visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius, 2);
        if (visibleLeadLocs.length > 0){
            startBytecode("mine - checkLead");
            log("num lead " + visibleLeadLocs.length);
            if (visibleLeadLocs.length > 16) { // 68 / 2
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
            stopBytecode("mine - checkLead");

            if (bestLoc != null) {
                Direction moveDir = BFS.move(bestLoc);
                rc.setIndicatorString("going to lead@" + bestLoc);
                Debug.drawLine(here, bestLoc, RED);
                return moveDir;
            }
        }

        // go towards unknown zones
        {
            // update target zones
            updateResourceZoneTargets();

            // go to target zone
            if (targetZoneLoc != null) {
                Direction moveDir = BFS.move(targetZoneLoc);
                rc.setIndicatorString("going to target zone " + targetZoneLoc);
                drawLine(here, targetZoneLoc, BLUE);
                return moveDir;
            }
        }



        // explore
//        if (useSimpleExplore) { // pick random
        Direction moveDir = Explore.exploreSimple();
        return moveDir;
//        } else { // use momentum
//        Direction moveDir = Explore.exploreMomentum();
//        return moveDir;
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
        if (Explore.allyAttackCount >= Explore.enemyAttackCount) {
            return null; // ignore danger if in conflict zone
        }

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

    public static int targetZoneX;
    public static int targetZoneY;
    public static MapLocation targetZoneLoc = null;

    public static void updateResourceZoneTargets() {
        // reset if needed
        if (targetZoneLoc != null && zoneResourceStatus[targetZoneX][targetZoneY] != ZONE_UNKNOWN_FLAG) {
            targetZoneLoc = null;
        }

        // find best new target
        int[] unknownZone = null;
        MapLocation unknownZoneLoc = null;
        int[] mineZone = null;
        MapLocation mineZoneLoc = null;

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
                    unknownZone = new int[] {zx, zy};
                    unknownZoneLoc = zone2Loc(zx, zy);
                    break;
                case ZONE_EMPTY_FLAG:
                    mineZone = new int[] {zx, zy};
                    mineZoneLoc = zone2Loc(zx, zy);
                    break;
                case ZONE_MINE_FLAG:
                    break;
                default:
                    logi("WARNING: 'updateResourceZoneTargets' Unexpected zone flag! " + zoneResourceStatus[zx][zy]);
            }
        }

        // if no target was found, use comm'd target
        if (unknownZoneLoc == null && Comms.commonExploreLoc != null) {
            unknownZoneLoc = Comms.commonExploreLoc;
            unknownZone = new int[] {unknownZoneLoc.x / ZONE_SIZE, unknownZoneLoc.y / ZONE_SIZE};
            log("[USING] comm loc " + unknownZoneLoc + " " + unknownZone[0] + " " + unknownZone[1]);
        }

        if (unknownZoneLoc != null) {
            if (targetZoneLoc != null) { // skip sometimes if already have a target
                int curDist = here.distanceSquaredTo(targetZoneLoc);
                int newDist = here.distanceSquaredTo(unknownZoneLoc);
                if (!(newDist < curDist - 100)) { // must be better by sqrt(100) in r1 dist
                    return; // skip if not a lot better
                }
            }
            targetZoneX = unknownZone[0];
            targetZoneY = unknownZone[1];
            targetZoneLoc = unknownZoneLoc;
        }
    }



    public static MapLocation wouldMineLoc;

    public static void tryMine() throws GameActionException {
        wouldMineLoc = null;

        MapLocation[] adjGoldLocs = rc.senseNearbyLocationsWithGold(2);

        // mine lead if adjacent to it
        for (int i = adjGoldLocs.length; --i >= 0;) {
            MapLocation loc = adjGoldLocs[i];
            while (rc.senseGold(loc) > 0) {
                if (rc.isActionReady()) {
                    Actions.doMineGold(loc);
                } else {
                    wouldMineLoc = loc;
                    return;
                }
            }
        }

        MapLocation[] adjLeadLocs = rc.senseNearbyLocationsWithLead(2);
        for (int i = adjLeadLocs.length; --i >= 0;) {
            MapLocation loc = adjLeadLocs[i];
            while (rc.senseLead(loc) > 1) {
                if (rc.isActionReady()) {
                    Actions.doMineLead(loc);
                } else {
                    wouldMineLoc = loc;
                    return;
                }
            }
        }
    }

    public static int countMineActions() throws GameActionException {
        int numActions = 0;

        MapLocation[] adjGoldLocs = rc.senseNearbyLocationsWithGold(2);
        for (int i = adjGoldLocs.length; --i >= 0;) {
            MapLocation loc = adjGoldLocs[i];
            numActions += rc.senseGold(loc);
        }

        MapLocation[] adjLeadLocs = rc.senseNearbyLocationsWithLead(2, 2);
        for (int i = adjLeadLocs.length; --i >= 0;) {
            MapLocation loc = adjLeadLocs[i];
            numActions += rc.senseLead(loc) -1;
        }

        return numActions;
    }
}
