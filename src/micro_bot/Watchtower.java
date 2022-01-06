package micro_bot;

import battlecode.common.*;

import static micro_bot.Soldier.*;
import static micro_bot.Utils.*;

public class Watchtower extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables

    public static boolean mayDisintegrate;

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();

        mayDisintegrate = (randInt(10) == 0);
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here


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
            return;
        }

    }
}
