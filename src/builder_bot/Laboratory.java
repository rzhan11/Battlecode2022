package builder_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

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
        int cost = rc.getTransmutationRate(rc.getLevel());
        rc.setIndicatorString("c:" + cost);

        if (!rc.isActionReady()) {
            return;
        }

        // if number of sages is less than number of soldiers
        if (getUnitCount(SAGE) < getUnitCount(SOLDIER)) {
            if (rc.getTeamLeadAmount(us) >= cost){
                Actions.doTransmute();
            }
        }
//        if (rc.getTeamLeadAmount(us) > 1500 && rc.getTeamGoldAmount(us) < 40) {
//            return;
//        }

    }
}
