package sym_bot;

import battlecode.common.*;


import static battlecode.common.RobotType.*;

import static sym_bot.Comms.*;
import static sym_bot.Debug.*;
import static sym_bot.Map.*;
import static sym_bot.Utils.*;

public class Archon extends Robot {
    // constants


    // variables

    public static int myArchonIndex;

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // todo:
        /*
        Spawn miners if we can
         */
        for (int i = Robot.DIRS.length; --i >= 0; ) {
            if (rc.canBuildRobot(MINER,Robot.DIRS[i])) {
                Actions.doBuildRobot(MINER,Robot.DIRS[i]);
            }
        }
    }

    public static boolean isPrimaryArchon() {
        if (myType != ARCHON) {
            return false;
        }

        for (int i = MAX_ARCHONS; --i > myArchonIndex; ) {
            if (isAllyArchonLive[i]) {
                return false;
            }
        }
        return true;
    }
}
