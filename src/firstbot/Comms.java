package firstbot;

import battlecode.common.*;

import static firstbot.Robot.*;
import static firstbot.Debug.*;
import static firstbot.Map.*;


public class Comms {

    // constants for coordinates
    final public static int COORD_BITS = 6;
    final public static int COORD_MASK = (1 << COORD_BITS) - 1;

    // used in determining MapLocations with 7 bits
    // these can be any valid coordinates on the map
    public static int BASE_X_COORD;
    public static int BASE_Y_COORD;
    public static int BASE_X_COORD_PART;
    public static int BASE_Y_COORD_PART;

    public static void initBaseCoords(MapLocation baseLoc) {
        BASE_X_COORD = baseLoc.x;
        BASE_Y_COORD = baseLoc.y;
        BASE_X_COORD_PART = BASE_X_COORD & (~COORD_MASK);
        BASE_Y_COORD_PART = BASE_Y_COORD & (~COORD_MASK);
    }

    final public static int COMM_ARRAY_SIZE = 64;
    public static int[] commArray = new int[COMM_ARRAY_SIZE];

    /*
    Converts a MapLocation to 14-bit representation
     */
    public static int loc2bits(MapLocation loc) {
        return ((loc.y & COORD_MASK) << COORD_BITS) + (loc.x & COORD_MASK);
    }


    /*
    Converts 14 bits to a MapLocation
    -----
    bits = msgInfo
     */
    public static MapLocation bits2loc(int bits) {
        int x = BASE_X_COORD_PART + (bits & COORD_MASK);
        int y = BASE_Y_COORD_PART + ((bits & (COORD_MASK << COORD_BITS)) >>> COORD_BITS);
        if (x+64<=BASE_X_COORD) x+=128;
        if (x-64>=BASE_X_COORD) x-=128;
        if (y+64<=BASE_Y_COORD) y+=128;
        if (y-64>=BASE_Y_COORD) y-=128;
        return new MapLocation(x, y);
    }

    public static void readCommGrid() throws GameActionException {
        for (int i = COMM_ARRAY_SIZE; --i >= 0;) {
            commArray[i] = rc.readSharedArray(i);
        }
    }

    final public static int LOC_BITS = 2 * COORD_BITS;
    final public static int LOC_MASK = (1 << 2 * LOC_BITS) - 1;

    public static void writeArchonLoc(MapLocation loc) throws GameActionException {
        int msg = loc2bits(loc);
        msg += 1 << 14;
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
