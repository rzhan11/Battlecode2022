package sym_bot;

import battlecode.common.*;

import static sym_bot.Debug.*;
import static sym_bot.Utils.*;


public class Miner extends Robot {

    public static void firstTurnSetup() throws GameActionException {
    }

    // code run each turn
    public static void turn() throws GameActionException {
        Explore.explore();
    }
}
