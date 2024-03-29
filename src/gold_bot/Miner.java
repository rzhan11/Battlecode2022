package gold_bot;

import battlecode.common.*;

import static gold_bot.Comms.*;
import static gold_bot.Debug.*;
import static gold_bot.Explore.*;
import static gold_bot.Utils.*;
import static gold_bot.Zone.*;


public class Miner extends Robot {
    public static boolean useSimpleExplore;
    final public static int ZONE_DANGER_WAIT = 10;

    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
//        willHelpMine = random() < 1; // most ppl will help
        useSimpleExplore = random() < 0.5;
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // check aggression
        updateAggression();

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
            if (rc.senseRubble(here) < rc.senseRubble(rc.adjacentLocation(moveDir))) {
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

    public static MapLocation mineHelpLoc;

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

        // go to visible gold locs
        MapLocation[] visibleGoldLocs = rc.senseNearbyLocationsWithGold(myVisionRadius);
        if (visibleGoldLocs.length > 0) {
            // go to gold loc
            startBytecode("mine - checkGold");
            log("num gold locs " + visibleGoldLocs.length);

            MapLocation bestLoc = null;
            int bestDist = P_INF;
            for (int i = visibleGoldLocs.length; --i >= 0; ) {
                MapLocation loc = visibleGoldLocs[i];
                int dist = here.distanceSquaredTo(loc);
                if (dist < bestDist) {
                    // only go to lead tiles in zone
                    // only mine lead in same zone/old zones
                    bestLoc = loc;
                    bestDist = dist;
                }
            }
            stopBytecode("mine - checkGold");

            if (bestLoc != null) {
                if (bestLoc.equals(here)) {
                    rc.setIndicatorString("chilling at gold " + bestLoc);
                    return null;
                }
                Direction moveDir = BFS.move(bestLoc);
                rc.setIndicatorString("going to gold@" + bestLoc);
                Debug.drawLine(here, bestLoc, RED);
                return moveDir;
            }
        }

        // go to visible lead locs
        int minLead = isAggressive ? 1 : 2;
        MapLocation[] visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius, minLead);
        if (visibleLeadLocs.length > 0) {
            startBytecode("mine - checkLead");
            log("num lead locs " + visibleLeadLocs.length);
            if (visibleLeadLocs.length > 16) { // 68 / 2
                visibleLeadLocs = rc.senseNearbyLocationsWithLead(8);
            }

            MapLocation bestLoc = null;
            int bestDist = P_INF;
            for (int i = visibleLeadLocs.length; --i >= 0; ) {
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
                if (bestLoc.equals(here)) {
                    rc.setIndicatorString("chilling at lead " + bestLoc);
                    return null;
                }
                Direction moveDir = BFS.move(bestLoc);
                rc.setIndicatorString("going to lead@" + bestLoc);
                Debug.drawLine(here, bestLoc, RED);
                return moveDir;
            }
        }

        // go to initExploreLoc
        if (initExploreLoc != null) {
            // check if clear
            if (here.isWithinDistanceSquared(initExploreLoc, myVisionRadius)) {
                initExploreLoc = null;
            }

            if (age > 100) {
                initExploreLoc = null;
            }

            if (initExploreLoc != null) {
                MapLocation targetLoc = Map.getOffsetBounds(initExploreLoc, 3);
                Direction moveDir = BFS.move(targetLoc);
                rc.setIndicatorString("going to initLoc " + initExploreLoc);
                drawLine(here, initExploreLoc, PURPLE);
                return moveDir;
            }
        }

        // go towards mineHelpLoc
        /*
        if (willHelpMine) {
            // reset if close enough
            if (mineHelpLoc != null) {
                checkResetMineHelpLoc();
            }

            // choose new one if needed
            while (mineHelpLoc == null && mineHelpCacheLen > 0) {
                int index = (mineHelpCacheIndex + randInt(mineHelpCacheLen)) % MINE_HELP_CACHE_SIZE;
                mineHelpLoc = mineHelpCacheLoc[index];
                // swap with front
                mineHelpCacheLoc[index] = mineHelpCacheLoc[mineHelpCacheIndex];
                // decrease queue size
                mineHelpCacheIndex = (mineHelpCacheIndex + 1) % MINE_HELP_CACHE_SIZE;
                mineHelpCacheLen--;

                checkResetMineHelpLoc();
            }

            if (mineHelpLoc != null) {
                // go to mineHelp
                Direction moveDir = BFS.move(mineHelpLoc);
                rc.setIndicatorString("going to mine help loc " + mineHelpLoc);
                drawLine(here, mineHelpLoc, GRAY);
                return moveDir;
            }
        }
        */


        // go towards unknown zones
        {
            // update target zones
            updateTargetZone();

            // go to target zone
            if (targetZoneLoc != null) {
                Direction moveDir = BFS.move(targetZoneLoc);
                rc.setIndicatorString("going to target zone " + targetZoneLoc);
                drawLine(here, targetZoneLoc, CYAN);
                return moveDir;
            }
        }


        // explore
//        if (useSimpleExplore) { // pick random
        Direction moveDir = Explore.exploreSimple();
        return moveDir;
//        } else {
//            Direction moveDir = Explore.explorePOI();
//            return moveDir;
//        }
    }

    final public static int AGGRESSIVE_TIME = 5;
    public static int lastAggressiveRound = -(AGGRESSIVE_TIME + 10);

    public static void updateAggression() {
        updateAggressionRound();
        isAggressive = (roundNum - lastAggressiveRound) < AGGRESSIVE_TIME; // stay aggressive for 10 rounds
    }

    public static void updateAggressionRound() {
        // don't be aggressive if we haven't seen an enemy in 5 rounds
        if (roundNum - lastSeenEnemyRound >= 5) {
            return;
        }

        if (sensedEnemies.length - sensedAllies.length >= 3) { // if there are at least 3 more enemies than allies
            lastAggressiveRound = roundNum;
            return;
        }

        MapLocation closestAllyLoc = getClosestAllyArchon(here, false);
        if (Math.sqrt(here.distanceSquaredTo(closestAllyLoc)) > Math.hypot(mapWidth, mapHeight) / 2) {
            lastAggressiveRound = roundNum;
            return;
        }

        int minEnemyDist = getMinEnemyArchonDist(here);
        log("[minEnemyDist] " + minEnemyDist);
        if (minEnemyDist >= 0) {
            double allyDist = Math.sqrt(here.distanceSquaredTo(closestAllyLoc));
            double enemyDist = Math.sqrt(minEnemyDist);
            if (enemyDist < allyDist - 10) {
                lastAggressiveRound = roundNum;
            }
        }
    }

    public static MapLocation closestDangerLoc;
    public static int closestDangerDist;

    public static MapLocation lastSeenDangerLoc;
    public static int turnsSinceDanger;

    public static void updateDanger() throws GameActionException {
        closestDangerLoc = null;
        closestDangerDist = P_INF;
        for (int i = sensedEnemySoldierCount; --i >= 0; ) { // iterates from (len - 1) -> 0 inclusive
            RobotInfo ri = sensedEnemySoldiers[i];
            int dist = here.distanceSquaredTo(ri.location);
            if (dist < closestDangerDist) {
                closestDangerLoc = ri.location;
                closestDangerDist = dist;
            }
        }

        log("curdanger " + closestDangerLoc);

        if (closestDangerLoc == null) {
            turnsSinceDanger++;
        } else {
            turnsSinceDanger = 0;
            lastSeenDangerLoc = closestDangerLoc;
        }
    }

    public static Direction avoidDanger() throws GameActionException {
        if (sensedEnemySoldierCount == 0) {
            return null; // ignore danger if in conflict zone
        }

        if (closestDangerLoc == null) {
            log("No recent danger");
            return null;
        } else {
            rc.setIndicatorString("avoid danger " + closestDangerLoc);
            return Nav.fuzzyAway(closestDangerLoc);
        }
    }


    public static void updateTargetZone() {
        // reset if needed
        if (targetZoneLoc != null) {
            if (zoneResourceStatus[targetZoneX][targetZoneY] != ZONE_UNKNOWN_FLAG) {
                targetZoneLoc = null;
            }
        }

        findNewUnknownZone();
    }

    public static boolean isAggressive;
    public static MapLocation wouldMineLoc;

    public static void tryMine() throws GameActionException {
        wouldMineLoc = null;

        MapLocation[] adjGoldLocs = rc.senseNearbyLocationsWithGold(2);

        // mine lead if adjacent to it
        for (int i = adjGoldLocs.length; --i >= 0; ) {
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
        for (int i = adjLeadLocs.length; --i >= 0; ) {
            MapLocation loc = adjLeadLocs[i];
            if (isAggressive) {
                while (rc.senseLead(loc) > 0) {
                    if (rc.isActionReady()) {
                        Actions.doMineLead(loc);
                    } else {
                        wouldMineLoc = loc;
                        return;
                    }
                }
            } else {
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
    }

    public static int countMineActions() throws GameActionException {
        int numActions = 0;

        MapLocation[] adjGoldLocs = rc.senseNearbyLocationsWithGold(2);
        for (int i = adjGoldLocs.length; --i >= 0; ) {
            MapLocation loc = adjGoldLocs[i];
            numActions += rc.senseGold(loc);
        }

        MapLocation[] adjLeadLocs = rc.senseNearbyLocationsWithLead(2, 2);
        for (int i = adjLeadLocs.length; --i >= 0; ) {
            MapLocation loc = adjLeadLocs[i];
            numActions += rc.senseLead(loc) - 1;
        }

        return numActions;
    }
}
