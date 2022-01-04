package firstbot;

import battlecode.common.*;

import static firstbot.Utils.*;

public class Builder extends Robot {
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
