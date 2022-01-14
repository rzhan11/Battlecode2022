package new_bot;

import battlecode.common.*;

public class Laboratory extends Robot {
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

        if (!rc.isActionReady()) {
            return;
        }

        if (rc.getTeamLeadAmount(us) > 1000 && rc.getTeamGoldAmount(us) < 100) {
            Actions.doTransmute();
            return;
        }

    }
}
