package gold_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;
import static gold_bot.Debug.*;
import static gold_bot.Utils.*;

public class Builder extends Robot {
    // constants

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // should build lab
        if (getUnitCount(LABORATORY) == 0) {
            buildLab();
            tryRepair();
            return;
        }

        tryRepair();
        Direction moveDir = moveLogic();
        if (moveDir != null) {
            tryRepair();
        }
    }

    public static void buildLab() throws GameActionException {
        if (!rc.isActionReady() || rc.getTeamLeadAmount(us) < LABORATORY.buildCostLead) {
            return;
        }

        // find good lab loc
        boolean isGoodLabLoc = checkGoodLabLoc();
        // go to good lab loc
        if (isGoodLabLoc) {
            Archon.tryBuildBestRubble(LABORATORY);
            return;
        }

        // wander away
        if (rc.isMovementReady()) {
            Direction moveDir = Nav.wander(spawnLoc, 25, 0, 1);
            return;
        }

        return;
    }

    public static boolean checkGoodLabLoc() {
        MapLocation archonLoc = getClosestAllyArchon(here, false);
        MapLocation enemyArchonLoc = getClosestEnemyArchonSymLoc(here);
        log("check " + archonLoc + " " + enemyArchonLoc + " " +here);
        if (Math.sqrt(here.distanceSquaredTo(archonLoc)) >= 5) {
            if (enemyArchonLoc != null && Math.sqrt(here.distanceSquaredTo(enemyArchonLoc)) >= 15) {
                return true;
            }
        }
        return false;
    }

    public static Direction moveLogic() throws GameActionException {
        if (!rc.isMovementReady()) {
            return null;
        }

        // avoid danger
        {
            Miner.updateDanger();
            Direction moveDir = Miner.avoidDanger();
            if (moveDir != null) {
                return moveDir;
            }
        }

        // move away from ally archons
//        for (int i = MAX_ARCHONS; --i >= 0;) {
//            if (!isAllyArchonLive[i]) {
//                continue;
//            }
//            MapLocation loc = allyArchonLocs[i];
//            if (here.isWithinDistanceSquared(loc, 5)) {
//                Direction moveDir = Nav.fuzzyAwaySimple(loc);
//                return moveDir;
//            }
//        }

        //
        MapLocation bestRepairLoc = null;
        int bestScore = N_INF;

        int searchCount = Math.min(15, sensedAllies.length);
        for (int i = searchCount; --i >= 0;) {
            RobotInfo ri = sensedAllies[i];
            RobotType rt = ri.type;
            MapLocation loc = ri.location;
            if (rt.isBuilding() && ri.health < rt.getMaxHealth(ri.level)) {
                int score = getRepairScore(ri);
                if (score > bestScore) {
                    bestRepairLoc = loc;
                    bestScore = score;
                }
            }
        }

        // go to repair loc
        if (bestRepairLoc != null) {
            Direction moveDir = BFS.move(bestRepairLoc);
            return moveDir;
        }

        return Nav.wander(spawnLoc, 8, 9, 0);
    }

    public static void tryRepair() throws GameActionException {
        if (!rc.isActionReady()) {
            return;
        }

        MapLocation bestRepairLoc = null;
        int bestScore = N_INF;

        RobotInfo[] closeAllies = rc.senseNearbyRobots(myActionRadius, us);
        for (int i = closeAllies.length; --i >= 0;) {
            RobotInfo ri = closeAllies[i];
            RobotType rt = ri.type;
            if (rt.isBuilding() && ri.health < rt.getMaxHealth(ri.level)) {
                int score = getRepairScore(ri);
                if (score > bestScore) {
                    bestRepairLoc = ri.location;
                    bestScore = score;
                }
            }
        }

        // repair if found a location
        if (bestRepairLoc != null) {
            Actions.doRepair(bestRepairLoc);
            return;
        }
    }

    /*
    Priority:
    1. Low health archons (<500)
    2. Watchtower
    3. Any health archons
    4. Laboratory
    ---
    Finished buildings get prio over prototypes
    Prio lower health
     */
    public static int getRepairScore(RobotInfo ri) {
        int score = 0;
        switch (ri.type) {
            case ARCHON:
                if (ri.health < 250) {
                    score += 4e6;
                } else {
                    score += 2e6;
                }
                break;
            case WATCHTOWER:
                score += 3e6;
                break;

            case LABORATORY:
                score += 1e6;
                break;

            default:
                logi("WARNING: 'getHealScore' unexpected unit " + ri.type);
        }
        // prioritize built buildings
        if (ri.mode != RobotMode.PROTOTYPE) {
            score += 1e3;
            score += 1000 - ri.health;
        } else { // for prototypes, prioritize higher health ones
            score += ri.health;
        }
        return score;
    }
}
