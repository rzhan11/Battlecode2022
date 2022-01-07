package micro_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static micro_bot.Debug.*;
import static micro_bot.Utils.*;

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

    public static void moveLogic() throws GameActionException {
        // skip turn, if cooldown is too high
        if (rc.getMovementCooldownTurns() > 0) {
            return;
        }

        // if in range of enemy and attack is on cooldown, move away from enemy soldiers
        if (!rc.isActionReady()) {
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
                Nav.fuzzyAway(closestEnemySoldier);
                return;
            }
        }

        // if soldier close to archon but outside of 2 unit radius
        // randomly choose some to keep on guard
        // ideas: see if moving this chunk around before/after other ifs is better
        for (int i = allyArchonLocs.length; --i >= 0;) {
            if (isAllyArchonLive[i]
                    && here.isWithinDistanceSquared(allyArchonLocs[i],25)
                    && !here.isWithinDistanceSquared(allyArchonLocs[i], 4)
                    && random() > 0.1) {
                return;
            }
        }

        // if enemies are visible, but too far, chase
        // should automatically target the closest one
        if (sensedEnemies.length > 0) {
            MapLocation targetLoc = sensedEnemies[0].location;
            Direction moveDir = Nav.fuzzyTo(targetLoc);
            Debug.drawLine(here, targetLoc, RED);
            return;
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
                Nav.fuzzyTo(targetEnemyLoc);
                drawLine(here, targetEnemyLoc, MAGENTA);
                rc.setIndicatorString("going to report " + exploreLoc);
                return;
            }
        }

        explore();
        rc.setIndicatorString("exploring " + exploreLoc);
    }

    public static void tryAttack() throws GameActionException {
        if (!rc.isActionReady()) {
            return;
        }

        // if enemies in range, attack
        RobotInfo[] attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);

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
            Actions.doAttack(bestEnemy.location);
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

        targetEnemyLoc = bestLoc;
    }
}
