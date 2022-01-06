package micro_bot;

import battlecode.common.*;

import static micro_bot.Utils.*;

public class Watchtower extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();


    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here
        RobotInfo[] attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);
        if (attackableEnemies.length > 0) {
            MapLocation loc = attackableEnemies[0].location;
            if (rc.canAttack(loc)) {
                Actions.doAttack(loc);
            }
            return;
        }

    }
}
