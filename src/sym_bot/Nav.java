package sym_bot;

import battlecode.common.*;


import static sym_bot.Constants.*;
import static sym_bot.Debug.*;
import static sym_bot.Map.*;
import static sym_bot.Robot.*;
import static sym_bot.Utils.*;

public class Nav {

    public static Direction fuzzyTo(MapLocation dangerLoc) throws GameActionException {
        log("Fuzzy to " + dangerLoc + " " + here);

        double curRootDist = Math.sqrt(here.distanceSquaredTo(dangerLoc));

        Direction bestDir = null;
        double bestSpeed = N_INF;
        for (int i = 8; --i >= 0;) { // 7->0
            Direction dir = DIRS[i];
            if (rc.canMove(dir)) {
                MapLocation adjLoc = rc.adjacentLocation(dir);
                double rootDist = Math.sqrt(dangerLoc.distanceSquaredTo(adjLoc));
                // should be positive
                double speed = (curRootDist - rootDist) / (10 + rc.senseRubble(adjLoc));
                if (speed > bestSpeed) {
                    bestDir = dir;
                    bestSpeed = speed;
                }
            }
        }

        if (bestSpeed > 0) {
            Actions.doMove(bestDir);
        } else {
            tlog("Can't move");
            return null;
        }
        return bestDir;
    }
}
