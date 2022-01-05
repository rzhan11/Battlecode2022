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


    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here


        if (rc.getMovementCooldownTurns() > 0) {
            return;
        }

        // mine lead if adjacent to it
        boolean isNextToResource = false;
        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            if (rc.senseLead(loc) > 0 || rc.senseGold(loc) > 0) {
                isNextToResource = true;
            }
            while (rc.canMineGold(loc)) {
                Actions.doMineGold(loc);
            }
            if (rc.canMineLead(loc)) {
                Actions.doMineLead(loc);
            }
        }
        if (isNextToResource) {
            rc.setIndicatorString("mining");
            return;
        }


        {
            MapLocation loc = new MapLocation(4, 2);
            if (rc.canSenseLocation(loc)) {
                rc.setIndicatorString("sensed " + rc.senseLead(loc) + "@" + loc);
                log("sensed " + rc.senseLead(loc) + "@" + loc);
                if (roundNum == 649) {
                    return;
                }
            }
        }

        // search surrounding tiles for lead
        for (int[] diff: HardCode.BFS20) {
            MapLocation loc = here.translate(diff[0], diff[1]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            if (rc.senseLead(loc) > 0) {
                Direction moveDir = Nav.fuzzyTo(loc);
                rc.setIndicatorString("going to " + moveDir + " " + loc);
                Debug.drawLine(here, loc, RED);
                return;
            }
        }

        // exploring
        explore();
        rc.setIndicatorString("exploring " + exploreLoc);

        // move randomly
//        Direction randDir = DIRS[randInt(DIRS.length)];
//        for (int i = 8; --i >= 0;) {
//            if (rc.canMove(randDir)) {
//                Actions.doMove(randDir);
//                rc.setIndicatorString("rand moving " + randDir);
//                return;
//            }
//            randDir = randDir.rotateLeft();
//        }

    }
}
