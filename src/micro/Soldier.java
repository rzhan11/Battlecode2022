package firstbot;

import battlecode.common.*;

import static firstbot.Debug.*;
import static firstbot.Utils.*;

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

        // if in range of enemy and attack is on cooldown, move away from damaging enemies
        if (!rc.isActionReady()) {
            // find closest damaging enemy



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
        if (attackableEnemies.length > 0) {
            MapLocation loc = attackableEnemies[0].location;
            if (rc.canAttack(loc)) {
                Actions.doAttack(loc);
            }
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
    }
}
