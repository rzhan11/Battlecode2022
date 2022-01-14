package new_bot;

import battlecode.common.*;

import static new_bot.Debug.*;
import static new_bot.Explore.*;

public class Watchtower extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables


    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // decide if we want to change mode
        updateMode();

        switch (rc.getMode()) {
            case PORTABLE:
                portableTurn();
                break;
            case TURRET:
                turretTurn();
                break;
            case PROTOTYPE:
                prototypeTurn();
                break;
        }
    }

    public static int timeSinceAttack = 0;
    public static int timeSinceMove = 0;

    public static void updateMode() throws GameActionException {
        timeSinceAttack++;
        timeSinceMove++;

        if (!rc.canTransform()) {
            return;
        }

        // PORTABLE -> TURRET
        if (rc.getMode() == RobotMode.PORTABLE) {
            RobotInfo[] attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);
            if (attackableEnemies.length > 0) {
                Actions.doTransform();
                return;
            }
            return;
        }

        // TURRET -> PORTABLE
        if (rc.getMode() == RobotMode.TURRET) {
            RobotInfo[] attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);

            if (roundNum % 100 == 0) {
                if (attackableEnemies.length == 0) {
                    if ((here.x + here.y) % 2 == (roundNum / 100) % 2) {
                        Actions.doTransform();
                        return;
                    }
                }
            }

            if (timeSinceEnemy > 50) {
                Actions.doTransform();
                return;
            }
        }

        // do nothing if prototype
    }

    public static void turretTurn() throws GameActionException {


        if (!rc.isActionReady()) {
            return;
        }

//        if (mayDisintegrate && timeSinceEnemy > 50) {
//            rc.disintegrate();
//            return;
//        }

        // if enemies in range, attack
        RobotInfo[] attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);

        RobotInfo bestEnemy = null;
        int bestScore = N_INF;
        for (int i = attackableEnemies.length; --i >= 0;) {
            RobotInfo ri = attackableEnemies[i];
            int score = Soldier.getAttackEnemyScore(ri);
            if (score > bestScore) {
                bestEnemy = attackableEnemies[i];
                bestScore = score;
            }
        }
        if (bestEnemy != null) {
            Actions.doAttack(bestEnemy.location);
            timeSinceAttack = 0;
            return;
        }
    }

    public static MapLocation targetEnemyLoc = null;
    public static int targetEnemyLocRound = -1;

    public static void portableTurn() throws GameActionException {
        if (!rc.isMovementReady()) {
            return;
        }

        // if enemies are visible, but too far, chase
        // should automatically target the closest one
        if (sensedEnemies.length > 0) {
            MapLocation targetLoc = sensedEnemies[0].location;
            Direction moveDir = BFS.move(targetLoc);
            Debug.drawLine(here, targetLoc, RED);
            return;
        }

        // go to reported enemies
        {
            // reset targetEnemy after x rounds
            if (targetEnemyLoc != null) {
                checkResetTargetEnemyLoc();
            }

            // find new target if needed
            if (targetEnemyLoc == null) {
                findNewTargetEnemyLoc();
            }

            // go towards target, if we have one
            if (targetEnemyLoc != null) {
                BFS.move(targetEnemyLoc);
                drawLine(here, targetEnemyLoc, MAGENTA);
                rc.setIndicatorString("going to report " + exploreLoc);
                return;
            }
        }

        exploreSimple();
        rc.setIndicatorString("exploring " + exploreLoc);
    }

    public static void checkResetTargetEnemyLoc() {
        if (roundNum - targetEnemyLocRound > 100) {
            resetTargetEnemyLoc();
            return;
        }

        // if we are within sensing range, but reach this code, that means the enemy is gone
        if (rc.canSenseLocation(targetEnemyLoc)) {
            resetTargetEnemyLoc();
            return;
        }
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
        targetEnemyLocRound = roundNum;
    }

    public static void resetTargetEnemyLoc() {
        targetEnemyLoc = null;
        targetEnemyLocRound = -1;
    }

    public static void prototypeTurn() throws GameActionException {
        log("I am prototype.");
    }
}
