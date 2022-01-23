package builder_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;
import static builder_bot.Comms.*;
import static builder_bot.Debug.log;

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

//        if (roundNum % 150 == 0) {
//            Actions.doDisintegrate();
//            return;
//        }

        if (!rc.isActionReady()) {
            return;
        }

        /*
        boolean transformed = checkTransform();
        if (transformed) {
            Actions.doTransform();
            ArchonPortable.init();
            return;
        }*/

        if (rc.getTeamLeadAmount(us) >= cost){
            if (shouldTransmute()) {
                Actions.doTransmute();
            }
        }

    }

    public static boolean shouldTransmute() {
        int numMiners = getUnitCount(MINER);
        int numLabs = getUnitCount(LABORATORY);
        if (numMiners < numLabs) { // should have 1 miners for every 1 lab
            return false;
        }
        return true;
    }

    /*
    public static boolean checkTransform() throws GameActionException {
        if (rc.getTransmutationRate(rc.getLevel()) > 10) {
            // move
        }

        return false;
    }
    */
}
