package smartspawn_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static smartspawn_bot.Debug.*;

public class Soldier extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();


    }

    public static MapLocation targetEnemyLoc = null;

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here
        Comms.readReportEnemySection();


        tryAttack();
        moveLogic();
        tryAttack();

    }

    public static Direction moveLogic() throws GameActionException {
        // skip turn, if cooldown is too high
        if (!rc.isMovementReady()) {
            return null;
        }

        // if in range of enemy and attack is on cooldown, move away from enemy soldiers
        if (!rc.isActionReady()) {// || !checkShouldFight()) {
            Direction moveDir = runAwayFromEnemy();
            rc.setIndicatorString("flee");
            return moveDir;
        }

//        log("g " + getUnitCount(SOLDIER) + " " + 10 * rc.getArchonCount());
//        if (getUnitCount(SOLDIER) < 10 * rc.getArchonCount()) {
//            tryDefense();
//            return;
//        }

        // if low health, run home
//        updateHomeLoc();
//        if (homeLoc != null) {
//            moveHome();
//            return;
//        }

        // if soldier close to archon but outside of 2 unit radius
        // randomly choose some to keep on guard
        // ideas: see if moving this chunk around before/after other ifs is better
        /*
        for (int i = allyArchonLocs.length; --i >= 0;) {
            if (isAllyArchonLive[i]
                    && here.isWithinDistanceSquared(allyArchonLocs[i],25)
                    && !here.isWithinDistanceSquared(allyArchonLocs[i], 4)
                    && random() > 0.1) {
                return;
            }
        }*/

        // if enemies are visible, but too far, chase
        // should automatically target the closest one
        if (sensedEnemies.length > 0) {
            Direction moveDir = chaseEnemy();
            return moveDir;
        }

        // go to reported enemies
        {
            // find new target if needed
            if (targetEnemyLoc == null) {
                findNewTargetEnemyLoc();
            } else {
                // if we are within sensing range, but reach this code, that means the enemy is gone
                if (rc.canSenseLocation(targetEnemyLoc)) {
                    findNewTargetEnemyLoc();
                }
            }

            // go towards target, if we have one
            if (targetEnemyLoc != null) {
                Direction moveDir = Nav.fuzzyTo(targetEnemyLoc);
                drawLine(here, targetEnemyLoc, MAGENTA);
                rc.setIndicatorString("going to report " + exploreLoc);
                return moveDir;
            }
        }

        // pack exploring
        {
            MapLocation targetLoc = Comms.commonExploreLoc;
            if (here.distanceSquaredTo(targetLoc) < 25) {
                drawLine(here, targetLoc, BLACK);
                Direction moveDir = Nav.wander(targetLoc, 8, 9, true);
                rc.setIndicatorString("circling pack");
                return moveDir;
            } else {
                drawLine(here, targetLoc, GRAY);
                Direction moveDir = Nav.fuzzyTo(Comms.commonExploreLoc);
                rc.setIndicatorString("goto pack");
                return moveDir;
            }
        }

//        explore();
//        rc.setIndicatorString("exploring " + exploreLoc);

    }

    public static void tryDefense() throws GameActionException {
        Nav.wander(spawnLoc, 8, 9, true);
        rc.setIndicatorString("defending");
    }

    final public static int STAY_HOME_LEAD_MAX = 300;
    public static MapLocation homeLoc;

    public static void updateHomeLoc() throws GameActionException {
        if (rc.getHealth() > 30 || rc.getTeamLeadAmount(us) > STAY_HOME_LEAD_MAX) {
            homeLoc = null;
        }

        if (homeLoc == null) {
            if (rc.getHealth() < 15 && rc.getTeamLeadAmount(us) < STAY_HOME_LEAD_MAX) {
                homeLoc = findClosestHome();
            }
        }
    }

    public static MapLocation findClosestHome() {
        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = allyArchonLocs.length; --i >= 0;) {
            MapLocation loc = allyArchonLocs[i];
            if (!isAllyArchonLive[i]) {
                continue;
            }
            int dist = here.distanceSquaredTo(loc);
            if (dist < bestDist) {
                bestLoc = loc;
                bestDist = dist;
            }
        }

        return bestLoc;
    }

    public static void moveHome() throws GameActionException {
        if (here.isWithinDistanceSquared(homeLoc, ARCHON.actionRadiusSquared)) {
            // wander around home
            tlog("Wandering " + homeLoc);
            Direction moveDir = Nav.wander(homeLoc, 8, 9, true);
            return;
        } else {
            tlog("Going home " + homeLoc);
            Direction moveDir = Nav.fuzzyTo(homeLoc);
            return;
        }
    }

    public static boolean checkShouldFight() {
        // if near live archon, stay and fight
        for (int i = allyArchonLocs.length; --i >= 0;) {
            MapLocation loc = allyArchonLocs[i];
            if (isAllyArchonLive[i] || loc == null) {
                continue;
            }
            if (here.isWithinDistanceSquared(loc, ARCHON.actionRadiusSquared)) {
                return true;
            }
        }

        // skip check if many nearby troops
        if (sensedAllies.length + sensedEnemies.length > 50) {
            return true;
        }

        // ally soldier vs enemy soldier count
        int allySoldierCount = 1;
        for (int i = sensedAllies.length; --i >= 0;) {
            RobotInfo ri = sensedAllies[i];
            if (ri.type == SOLDIER) {
                allySoldierCount++;
            }
        }
        int enemySoldierCount = 0;
        for (int i = sensedEnemies.length; --i >= 0;) {
            RobotInfo ri = sensedEnemies[i];
            if (ri.type == SOLDIER) {
                enemySoldierCount++;
            }
        }

        log("ck " + allySoldierCount + " " + enemySoldierCount);
        // fight if we outnumber them
        return allySoldierCount > enemySoldierCount;
    }

    public static Direction runAwayFromEnemy() throws GameActionException {
        // find closest danger soldiers
        RobotInfo[] closeEnemies = rc.senseNearbyRobots(SOLDIER.actionRadiusSquared, them);
        MapLocation closestEnemySoldier = null;
        int bestDist = P_INF;
        for (int i = closeEnemies.length; --i >= 0; ) {
            RobotInfo ri = closeEnemies[i];
            if (ri.type == SOLDIER) {
                int dist = here.distanceSquaredTo(ri.location);
                if (dist < bestDist) {
                    bestDist = dist;
                    closestEnemySoldier = ri.location;
                }
            }
        }

        if (closestEnemySoldier != null) {
            return Nav.fuzzyAwaySimple(closestEnemySoldier);
        }
        return null;
    }

    public static Direction chaseEnemy() throws GameActionException {
        //
        if (attackableEnemies.length > 0) {
            Direction moveDir = Nav.moveBetterTile(bestAttackLoc, myActionRadius);
            rc.setIndicatorString("adjusting in range");
            return moveDir;
        }



        MapLocation bestLoc = null;
        int bestDist = P_INF;
        if (sensedEnemies.length > 20) {
            bestLoc = sensedEnemies[0].location;
            bestDist = here.distanceSquaredTo(bestLoc);
        } else {
            for (int i = sensedEnemies.length; --i >= 0;) {
                MapLocation loc = sensedEnemies[i].location;
                int dist = here.distanceSquaredTo(loc);
                if (dist < bestDist) {
                    bestLoc = loc;
                    bestDist = dist;
                }
            }
        }

        if (bestLoc != null) {
            Direction moveDir = Nav.fuzzyToSimple(bestLoc);
            Debug.drawLine(here, bestLoc, RED);
            rc.setIndicatorString("chasing");
            return moveDir;
        }

        return null;
    }

    public static RobotInfo[] attackableEnemies;
    public static MapLocation bestAttackLoc;

    public static void updateAttackInfo() {

        bestAttackLoc = null;

        // if enemies in range, attack
        attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);

        RobotInfo bestEnemy = null;
        int bestScore = N_INF;
        for (int i = attackableEnemies.length; --i >= 0;) {
            int score = getAttackEnemyScore(attackableEnemies[i]);
            if (score > bestScore) {
                bestEnemy = attackableEnemies[i];
                bestScore = score;
            }
        }

        if (bestEnemy != null) {
            bestAttackLoc = bestEnemy.location;
        }
    }

    public static void tryAttack() throws GameActionException {
        updateAttackInfo();
        if (!rc.isActionReady()) {
            return;
        }

        if (bestAttackLoc != null) {
            Actions.doAttack(bestAttackLoc);
            return;
        }
    }

    public static int getAttackEnemyScore(RobotInfo ri) {
        int score = 0;
        // attack troops in this priority
        switch (ri.type) {
            case SOLDIER:
                score += 7e6;
                break;
            case WATCHTOWER:
                score += 6e6;
                break;
            case SAGE:
                score += 5e6;
                break;
            case MINER:
                score += 4e6;
                break;
            case BUILDER:
                score += 3e6;
                break;
            case ARCHON:
                score += 2e6;
                break;
            case LABORATORY:
                score += 1e6;
                break;
        }
        // todo: add kill bonus

        // prioritize lower health
        score += 1000 - ri.health;
        return score;
    }

    public static void findNewTargetEnemyLoc() {
        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = Comms.reportedEnemyCount; --i >= 0;) {
            MapLocation loc = Comms.reportedEnemyLocs[i];
            int dist = here.distanceSquaredTo(loc);
            if (dist < bestDist) {
                bestLoc = loc;
                bestDist = dist;
            }
        }

        if (Math.sqrt(bestDist) < 20) {
            targetEnemyLoc = bestLoc;
        } else {
            targetEnemyLoc = null;
        }
    }
}
