package firstbot;

import battlecode.common.*;

import static firstbot.Debug.*;
import static firstbot.Utils.*;


public class Miner extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables


    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();

        if (roundNum > 50) {
            endTurn();
            updateTurnInfo();
        }

    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here
        tryMine();
        moveLogic();
        tryMine();
    }

    public static void moveLogic() throws GameActionException {
        // look for better spot to move

        if (!rc.isMovementReady()) {
            return;
        }

        // search surrounding tiles for lead
        for (int[] diff: HardCode.BFS20) {
            MapLocation loc = here.translate(diff[0], diff[1]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            if (rc.senseLead(loc) > 1) {
                Direction moveDir = Nav.fuzzyTo(loc);
                rc.setIndicatorString("going to " + moveDir + " " + loc);
                Debug.drawLine(here, loc, RED);
                return;
            }
        }

        // exploring
        explore();
        rc.setIndicatorString("exploring " + exploreLoc);
    }

    public static void tryMine() throws GameActionException {
        // mine lead if adjacent to it
        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            int curGold = rc.senseGold(loc);
            while (curGold > 0) {
                if (!rc.isActionReady()) {
                    return;
                }
                Actions.doMineGold(loc);
                curGold--;
            }
        }

        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            int curLead = rc.senseLead(loc);
            while (curLead > 1) {
                if (!rc.isActionReady()) {
                    return;
                }
                Actions.doMineLead(loc);
                curLead--;
            }
        }
    }
}
