package firstbot;

import battlecode.common.*;

import static firstbot.Comms.*;
import static firstbot.Robot.*;

public class NewsComms {

    public static void writeArchonLoc(MapLocation loc) throws GameActionException {
        int msg = loc2bits(loc);
        msg += 1 << LOC_BITS;
        for (int i = 4; --i >= 0;) {
            if (commArray[i] == 0) {
                rc.writeSharedArray(i, msg);
                break;
            }
        }
    }

    public static void readAllArchonLocs() {
        int numStartArchons = 0;
        for (int i = 4; --i >= 0;) {
            if (commArray[i] > 0) {
                numStartArchons++;
            }
        }

        myArchonLocs = new MapLocation[numStartArchons];
        for (int i = 4; --i >= 0;) {
            if (commArray[i] > 0) {
                int locBits = commArray[i] & LOC_MASK;
                myArchonLocs[i] = bits2loc(locBits);
            }
        }

    }
}
