package firstbot;

import battlecode.common.*;

import static firstbot.Debug.*;
import static firstbot.Utils.*;

public class Archon extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();
        System.out.println("hi");
        rc.resign();

    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // second turn update
        if (roundNum == 2) {
            Comms.readAllArchonLocs();
            for (int i = myArchonLocs.length; --i >= 0;) {
                log(i + ": " + myArchonLocs[i].toString());
            }
        }


    }
}
