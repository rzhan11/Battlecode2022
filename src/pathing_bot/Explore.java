package pathing_bot;

import battlecode.common.*;

import static pathing_bot.Debug.*;
import static pathing_bot.Robot.*;
import static pathing_bot.Utils.*;
import static pathing_bot.Zone.*;

public class Explore {



    public static boolean isExplorer;

    public static MapLocation exploreLoc;
    public static int attemptsSinceProgress = 0;

    public static int EXPLORE_PATIENCE = 10; // number of attempts to go towards a location before giving up
    public static int EXPLORE_DISTANCE_REQ = 9; // how close we will try to get to exploreLoc

    public static void init() {
        exploreLoc = getRandomLoc();
        isExplorer = random() < 0.5;
    }

    public static Direction exploreSimple() throws GameActionException {
        while (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            exploreLoc = getRandomLoc();
            attemptsSinceProgress = 0;
        }

        drawLine(here, exploreLoc, WHITE);

        Direction moveDir = BFS.move(exploreLoc);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return moveDir;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            exploreLoc = getRandomLoc();
            attemptsSinceProgress = 0;
            return exploreSimple();
        }

        return null;
    }

    public static void explore() throws GameActionException {
        if (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            chooseNewExploreLoc(0);
        }

        drawLine(here, exploreLoc, WHITE);

        Direction moveDir = Nav.fuzzyTo(exploreLoc);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            chooseNewExploreLoc(0);
            explore();
        }
    }

    public static void chooseNewExploreLoc(int retryCount) {
        if (retryCount >= 4) {
            return;
        }

        // choose new location
        exploreLoc = getRandomLoc();
        attemptsSinceProgress = 0;

        // make sure to choose a location that is somewhat far away
        while (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            exploreLoc = getRandomLoc();
        }

        // if already known zone, find a new one
        int[] zone = loc2Zone(exploreLoc);
        if (zoneResourceStatus[zone[0]][zone[1]] != ZONE_UNKNOWN_FLAG) {
            chooseNewExploreLoc(retryCount + 1);
        }
    }



}
