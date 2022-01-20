package sym_bot;

import battlecode.common.*;

import static sym_bot.Debug.*;
import static sym_bot.Utils.*;


public class Miner extends Robot {

    public static MapLocation target = null;

    public static void firstTurnSetup() throws GameActionException {
        MapLocation[] allSymHQs = Map.getAllSymHQs();

        if (random() < 0.3) {
            target = allSymHQs[0];
        }
        else if (random () < 0.5) {
            target = allSymHQs[1];
        }
        else {
            target = allSymHQs[2];
        }
    }

    // code run each turn
    public static void turn() throws GameActionException {
        BFS.move(target);

        Explore.explore();
    }
}
