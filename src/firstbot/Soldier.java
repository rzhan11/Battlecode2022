package firstbot;

import battlecode.common.*;

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

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here


        // skip turn, if cooldown is too high
        if (rc.getMovementCooldownTurns() > 0) {
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


        // if enemies are visible, but too far, chase
        // should automatically target the closest one
        RobotInfo[] seenEnemies = rc.senseNearbyRobots(myActionRadius, them);
        if (seenEnemies.length > 0) {
            MapLocation targetLoc = seenEnemies[0].location;
            Direction moveDir = Nav.fuzzyTo(targetLoc);
            Debug.drawLine(here, targetLoc, RED);
            return;
        }

        // move randomly
        Direction randDir = DIRS[randInt(DIRS.length)];
        for (int i = 8; --i >= 0;) {
            if (rc.canMove(randDir)) {
                Actions.doMove(randDir);
            }
            randDir = randDir.rotateLeft();
        }

    }
}
