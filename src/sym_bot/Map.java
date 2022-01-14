package sym_bot;

import battlecode.common.*;

import static sym_bot.Debug.*;
import static sym_bot.Robot.*;

public class Map {
    public static int XMAX;
    public static int YMAX;

    public static boolean notHSymmetry = false;
    public static boolean notVSymmetry = false;
    public static boolean notRSymmetry = false;

    public static Symmetry theSymmetry = null;

    public static void initMap() {
        XMAX = rc.getMapWidth() - 1;
        YMAX = rc.getMapHeight() - 1;
    }

    // todo: try sensing symmetric locations to see if they have the same rubble
    public static void updateSymmetryByRubble() throws GameActionException {

    }

    // todo:
    /*
    Helper method
    Assumes that loc1/loc2 would be symmetric locations
    Checks if they contain the same rubble
    Returns true if it satisfies symmetry (same rubble)
    Returns false if it breaks symmetry (diff rubble)
    */
    public static boolean checkSymmetry(MapLocation loc1, MapLocation loc2) throws GameActionException {
        return false;
    }

    // todo: a useful helper method
    // returns the closest unexplored symmetry enemy hq that is unexplored
    public static MapLocation getClosestUnknownSymHQ() throws GameActionException {
        return null;
    }

    // ref: prob useful
    public static MapLocation getSymmetricLocation(MapLocation loc, Symmetry sym) {
        switch(sym) {
            case H:
                return new MapLocation(XMAX - loc.x, loc.y);
            case V:
                return new MapLocation(loc.x, YMAX - loc.y);
            case R:
                return new MapLocation(XMAX - loc.x, YMAX - loc.y);
            default:
                return null;
        }
    }

    public static int dir2int(Direction dir) {
        switch (dir) {
            case NORTH:
                return 0;
            case NORTHEAST:
                return 1;
            case EAST:
                return 2;
            case SOUTHEAST:
                return 3;
            case SOUTH:
                return 4;
            case SOUTHWEST:
                return 5;
            case WEST:
                return 6;
            case NORTHWEST:
                return 7;
            case CENTER:
                return 8;
            default:
                logi("ERROR: Sanity check failed in 'dir2int'");
                return -1;
        }
    }

    /*
    Does not support dir = CENTER
     */
    public static Direction[] getClosestDirs(Direction dir) {
        switch (dir) {
            case NORTH:
                return new Direction[] {Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.WEST, Direction.EAST, Direction.SOUTHWEST, Direction.SOUTHEAST, Direction.SOUTH};
            case NORTHEAST:
                return new Direction[] {Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHWEST, Direction.SOUTHEAST, Direction.WEST, Direction.SOUTH, Direction.SOUTHWEST};
            case EAST:
                return new Direction[] {Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.NORTH, Direction.SOUTH, Direction.NORTHWEST, Direction.SOUTHWEST, Direction.WEST};
            case SOUTHEAST:
                return new Direction[] {Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.NORTHEAST, Direction.SOUTHWEST, Direction.NORTH, Direction.WEST, Direction.NORTHWEST};
            case SOUTH:
                return new Direction[] {Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.EAST, Direction.WEST, Direction.NORTHEAST, Direction.NORTHWEST, Direction.NORTH};
            case SOUTHWEST:
                return new Direction[] {Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHEAST, Direction.NORTHWEST, Direction.EAST, Direction.NORTH, Direction.NORTHEAST};
            case WEST:
                return new Direction[] {Direction.WEST, Direction.SOUTHWEST, Direction.NORTHWEST, Direction.SOUTH, Direction.NORTH, Direction.SOUTHEAST, Direction.NORTHEAST, Direction.EAST};
            case NORTHWEST:
                return new Direction[] {Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.SOUTHWEST, Direction.NORTHEAST, Direction.SOUTH, Direction.EAST, Direction.SOUTHEAST};
            case CENTER:
                return new Direction[] {Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.SOUTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.NORTHWEST};
        }
        return null;
    }
}

enum Symmetry {
    H,
    V,
    R
}