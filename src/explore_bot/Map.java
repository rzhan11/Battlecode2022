package explore_bot;

import battlecode.common.*;

import static explore_bot.Comms.*;
import static explore_bot.Debug.*;
import static explore_bot.Robot.*;
import static explore_bot.Utils.*;

public class Map {
    public static int XMIN = 0;
    public static int YMIN = 0;
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

    public static MapLocation addDir(MapLocation loc, Direction dir, int len) {
        return loc.translate(dir.dx * len, dir.dy * len);
    }

    public static MapLocation getFarthestLoc(MapLocation loc, double dx, double dy) {
        int distX;
        int endX;
        if (dx > 0) {
            // intersect right wall at what y
            distX = XMAX - loc.x;
            endX = XMAX;
        } else {
            distX = -loc.x;
            endX = 0;
        }
        double wallY = here.y + dy / dx * distX;

        int distY;
        int endY;
        if (dy > 0) {
            distY = YMAX - loc.y;
            endY = YMAX;
        } else {
            distY = -loc.y;
            endY = 0;
        }
        double wallX = here.x + dx / dy * distY;

        if (0 <= wallY && wallY <= YMAX) { // use x move
            return new MapLocation(endX, (int) wallY);
        } else { // use ymove
            return new MapLocation((int) wallX, endY);
        }
    }

    /*
    public static MapLocation getExploreNavLoc(MapLocation loc) {
        int radius;
        switch(myType) {
            case MINER:
            case BUILDER:
            case SOLDIER:
            case SAGE:
                radius = 4;
                break;
            default:
                radius = 0;
                break;
        }
        return getOffsetBounds(loc, radius);
    }

    public static MapLocation getOffsetBounds(MapLocation loc, int offset) {
        int x = loc.x;
        int y = loc.y;
        if (XMIN != -1 && x < XMIN + offset) {
            x = XMIN + offset;
        }
        if (XMAX != -1 && x > XMAX - offset) {
            x = XMAX - offset;
        }
        if (YMIN != -1 && y < YMIN + offset) {
            y = YMIN + offset;
        }
        if (YMAX != -1 && y > YMAX - offset) {
            y = YMAX - offset;
        }
        return new MapLocation(x, y);
    }


    public static MapLocation getFarthestLoc(MapLocation loc, Direction dir) {
        MapLocation temp = addDir(loc, dir, MAX_MAP_SIZE);
        int x = temp.x;
        int y = temp.y;
        if (x < XMIN) {
            y -= (XMIN - x) * dir.dy;
            x = XMIN;
        }
        if (x > XMAX) {
            y -= (x - XMAX) * dir.dy;
            x = XMAX;
        }
        if (y < YMIN) {
            x -= (YMIN - y) * dir.dx;
            y = YMIN;
        }
        if (y > YMAX) {
            x -= (y - YMAX) * dir.dx;
            y = YMAX;
        }
        return new MapLocation(x, y);
    }

    public static boolean inKnownBounds(MapLocation loc) {
        if (XMIN != -1 && loc.x < XMIN) {
            return false;
        }
        if (XMAX != -1 && loc.x > XMAX) {
            return false;
        }
        if (YMIN != -1 && loc.y < YMAX) {
            return false;
        }
        if (YMAX != -1 && loc.y > YMAX) {
            return false;
        }
        return true;
    }

    public static int getWallXDist(int x) {
        if (XMIN != -1) {
            if (XMAX != -1) return Math.min(x - XMIN, XMAX - x);
            else return x - XMIN;
        } else {
            if (XMAX != -1) return XMAX - x;
            else return P_INF;
        }
    }

    public static int getWallYDist(int y) {
        if (YMIN != -1) {
            if (YMAX != -1) return Math.min(y - YMIN, YMAX - y);
            else return y - YMIN;
        } else {
            if (YMAX != -1) return YMAX - y;
            else return P_INF;
        }
    }

    public static boolean isMapKnown() {
        return XMIN != -1 && XMAX != -1 && YMIN != -1 && YMAX != -1;
    }
    public static boolean isMapXKnown() {
        return XMIN != -1 && XMAX != -1;
    }
    public static boolean isMapYKnown() {
        return YMIN != -1 && YMAX != -1;
    }

    public static void updateMapBounds() throws GameActionException {
        int maxRadius = (int) Math.sqrt(myVisionRadius);
        MapLocation loc;

        if (XMIN == -1) {
            loc = here.translate(-maxRadius, 0);
            if (!rc.onTheMap(loc)) {
                for (int i = maxRadius - 1; i >= 1; i--) {
                    loc = here.translate(-i, 0);
                    if (rc.onTheMap(loc)) {
                        XMIN = loc.x;
//                        writeXBounds();
                        break;
                    }
                }
            }
        }
        if (YMIN == -1) {
            loc = here.translate(0, -maxRadius);
            if (!rc.onTheMap(loc)) {
                for (int i = maxRadius - 1; i >= 1; i--) {
                    loc = here.translate(0, -i);
                    if (rc.onTheMap(loc)) {
                        YMIN = loc.y;
//                        writeYBounds();
                        break;
                    }
                }
            }
        }
        if (XMAX == -1) {
            loc = here.translate(maxRadius, 0);
            if (!rc.onTheMap(loc)) {
                for (int i = maxRadius - 1; i >= 1; i--) {
                    loc = here.translate(i, 0);
                    if (rc.onTheMap(loc)) {
                        XMAX = loc.x;
//                        writeXBounds();
                        break;
                    }
                }
            }
        }
        if (YMAX == -1) {
            loc = here.translate(0, maxRadius);
            if (!rc.onTheMap(loc)) {
                for (int i = maxRadius - 1; i >= 1; i--) {
                    loc = here.translate(0, i);
                    if (rc.onTheMap(loc)) {
                        YMAX = loc.y;
//                        writeYBounds();
                        break;
                    }
                }
            }
        }
    }

    public static Direction getNewBoundsTaskDir() {
        if (isMapKnown()) {
            return null;
        }

        int dx = 0;
        if (XMIN == -1) {
            if (XMAX == -1) {
                dx = randBoolean() ? -1 : 1; // randomly pick left/right
            } else {
                dx = -1;
            }
        } else if (XMAX == -1) {
            dx = 1;
        }

        int dy = 0;
        if (YMIN == -1) {
            if (YMAX == -1) {
                dy = randBoolean() ? -1 : 1; // randomly pick left/right
            } else {
                dy = -1;
            }
        } else if (YMAX == -1) {
            dy = 1;
        }
        return getDir(dx, dy);
    }*/

    /*

    public static void printSymmetry() {
        if (theSymmetry != null) {
            log("SYM " + theSymmetry);
        } else {
            log("SYM: " + (notHSymmetry?1:0) + (notVSymmetry?1:0) + (notRSymmetry?1:0));
        }
    }

    public static void updateSymmetryBroadcast() throws GameActionException {
        if (!notHSymmetry && !notVSymmetry && !notRSymmetry) {
            return;
        }

        if (symmetryBroadcast == null) {
            symmetryBroadcast = new Message(SYMMETRY_MSG, 0, true);
            queueMessage(symmetryBroadcast);
        }

        int info = 0;
        if (notHSymmetry) {
            info += 1;
        }
        if (notVSymmetry) {
            info += 2;
        }
        if (notRSymmetry) {
            info += 4;
        }
        symmetryBroadcast.info = info;
    }

    public static void updateTheSymmetry() {
        if (theSymmetry != null) {
            return;
        }
        if (notHSymmetry && notVSymmetry) {
            theSymmetry = Symmetry.R;
        }
        else if (notHSymmetry && notRSymmetry) {
            theSymmetry = Symmetry.V;
        }
        else if (notVSymmetry && notRSymmetry) {
            theSymmetry = Symmetry.H;
        }
    }

    public static void updateSymmetryByHQ() throws GameActionException {
        if (theSymmetry != null) {
            return;
        }

        boolean changed = false;

        // check H
        if (isMapXKnown() && !notHSymmetry) {
            for (int i = knownHQCount; --i >= 0;) {
                MapLocation symLoc = getSymmetricLocation(hqLocs[i], Symmetry.H);
                if (rc.canSenseLocation(symLoc) && !inArray(hqLocs, symLoc, knownHQCount)) {
                    // if we can sense it by location, then we should have added it to hqLocs
                    log("[NOT H]");
                    notHSymmetry = true;
                    changed = true;
                    break;
                }
            }
        }
        // check V
        if (isMapYKnown() && !notVSymmetry) {
            for (int i = knownHQCount; --i >= 0;) {
                MapLocation symLoc = getSymmetricLocation(hqLocs[i], Symmetry.V);
                if (rc.canSenseLocation(symLoc) && !inArray(hqLocs, symLoc, knownHQCount)) {
                    log("[NOT V]");
                    notVSymmetry = true;
                    changed = true;
                    break;
                }
            }
        }
        // check R
        if (isMapKnown() && !notRSymmetry) {
            for (int i = knownHQCount; --i >= 0;) {
                MapLocation symLoc = getSymmetricLocation(hqLocs[i], Symmetry.R);
                if (rc.canSenseLocation(symLoc) && !inArray(hqLocs, symLoc, knownHQCount)) {
                    log("[NOT R]");
                    notRSymmetry = true;
                    changed = true;
                    break;
                }
            }
        }

        if (changed) {
            writeSymmetry(false);
        }

        updateTheSymmetry();
    }

    public static void updateSymmetryByPassability() throws GameActionException {
        if (theSymmetry != null) {
            return;
        }

        int[][] relLocs;
        switch(myType) {
            case POLITICIAN:
                relLocs = HardCode.BOX_EDGES;
                break;
            case MUCKRAKER:
            case SLANDERER:
            case ENLIGHTENMENT_CENTER:
            default:
                logi("WARNING: Tried to updateSymmetryByPassability for unsupported type " + myType);
                return;
        }

        here = rc.getLocation();

        boolean willCheckH = isMapXKnown() && !notHSymmetry;
        boolean willCheckV = isMapYKnown() && !notVSymmetry;
        boolean willCheckR = isMapKnown() && !notRSymmetry;

        int symCount = (willCheckH?1:0) + (willCheckV?1:0) + (willCheckR?1:0);
        if (symCount == 0) {
            return;
        }

        boolean changed = false;

        if (willCheckH) {
            for (int i = relLocs.length; --i >= 0;) {
                MapLocation loc = here.translate(relLocs[i][0], relLocs[i][1]);
                if (checkSymmetryWrong(loc, getSymmetricLocation(loc, Symmetry.H))) {
                    notHSymmetry = true;
                    changed = true;
                    break;
                }
            }
        }

        if (willCheckV) {
            for (int i = relLocs.length; --i >= 0;) {
                MapLocation loc = here.translate(relLocs[i][0], relLocs[i][1]);
                if (checkSymmetryWrong(loc, getSymmetricLocation(loc, Symmetry.V))) {
                    notVSymmetry = true;
                    changed = true;
                    break;
                }
            }
        }

        if (willCheckR) {
            for (int i = relLocs.length; --i >= 0;) {
                MapLocation loc = here.translate(relLocs[i][0], relLocs[i][1]);
                if (checkSymmetryWrong(loc, getSymmetricLocation(loc, Symmetry.R))) {
                    notRSymmetry = true;
                    changed = true;
                    break;
                }
            }
        }

        if (changed) {
            writeSymmetry(false);
        }

        updateTheSymmetry();
    }

    // returns true if this DISPROVES symmetry
    // returns false if it confirms symmetry or if test cannot be performed
    public static boolean checkSymmetryWrong(MapLocation loc1, MapLocation loc2) throws GameActionException {
        if (!rc.canSenseLocation(loc1) || !rc.canSenseLocation(loc2)) {
            return false;
        }
        return rc.sensePassability(loc1) != rc.sensePassability(loc2);
    }

    public static MapLocation getSymmetricLocation(MapLocation loc, Symmetry sym) {
        switch(sym) {
            case H:
                return new MapLocation(XMIN + XMAX - loc.x, loc.y);
            case V:
                return new MapLocation(loc.x, YMIN + YMAX - loc.y);
            case R:
                return new MapLocation(XMIN + XMAX - loc.x, YMIN + YMAX - loc.y);
            default:
                return null;
        }
    }

    public static void updateSymHQLocs() throws GameActionException {
        symHQCount = 0;

        // early exit
        if (knownHQCount == MAX_HQ_COUNT) {
            return;
        }

        // if the symmetry is known, use it to find new locations
        if (theSymmetry != null) {
            switch(theSymmetry) {
                case H:
                    if (isMapXKnown()) {
                        findHQLocFromSymmetry();
                    }
                    break;
                case V:
                    if (isMapYKnown()) {
                        findHQLocFromSymmetry();
                    }
                    break;
                case R:
                    if (isMapKnown()) {
                        findHQLocFromSymmetry();
                    }
                    break;
            }
            return;
        }

        // if the symmetry is not know, try to determine potential hq locations

        if (!notHSymmetry && isMapXKnown()) {
            for (int i = knownHQCount; --i >= 0;) {
                MapLocation loc = hqLocs[i];
                MapLocation symLoc = getSymmetricLocation(loc, Symmetry.H);
                if (!inArray(hqLocs, symLoc, knownHQCount)) {
                    symHQLocs[symHQCount] = symLoc;
                    symHQType[symHQCount] = Symmetry.H;
                    symHQCount++;
                }
            }
        }
        if (!notVSymmetry && isMapYKnown()) {
            for (int i = knownHQCount; --i >= 0;) {
                MapLocation loc = hqLocs[i];
                MapLocation symLoc = getSymmetricLocation(loc, Symmetry.V);
                if (!inArray(hqLocs, symLoc, knownHQCount)) {
                    symHQLocs[symHQCount] = symLoc;
                    symHQType[symHQCount] = Symmetry.V;
                    symHQCount++;
                }
            }
        }
        if (!notRSymmetry && isMapKnown()) {
            for (int i = knownHQCount; --i >= 0;) {
                MapLocation loc = hqLocs[i];
                MapLocation symLoc = getSymmetricLocation(loc, Symmetry.R);
                if (!inArray(hqLocs, symLoc, knownHQCount)) {
                    symHQLocs[symHQCount] = symLoc;
                    symHQType[symHQCount] = Symmetry.R;
                    symHQCount++;
                }
            }
        }


    }

    public static void findHQLocFromSymmetry() throws GameActionException {
        for (int i = knownHQCount; --i >= 0;) {
            MapLocation loc = hqLocs[i];
            MapLocation symLoc = getSymmetricLocation(loc, theSymmetry);
            if (!inArray(hqLocs, symLoc, knownHQCount)) {
                saveHQLoc(symLoc);
            }
        }
    }

    */

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

    public static int getNumOpenDirs() throws GameActionException {
        int count = 0;
        for (int i = DIRS.length; --i >= 0;) {
            MapLocation loc = rc.adjacentLocation(DIRS[i]);
            if (rc.onTheMap(loc) && !rc.isLocationOccupied(loc)) {
                count++;
            }
        }
        return count;
    }

    public static Direction getCircleDirLeft(MapLocation loc, MapLocation center) {
        int dx = loc.x - center.x;
        int dy = loc.y - center.y;

        if (Math.abs(dx) > Math.abs(dy)) {
            return (dx > 0) ? Direction.NORTH : Direction.SOUTH;
        } else if (Math.abs(dx) < Math.abs(dy)) {
            return (dy > 0) ? Direction.WEST : Direction.EAST;
        } else {
            if (dx > 0) {
                return (dy > 0) ? Direction.WEST : Direction.NORTH;
            } else {
                return (dy > 0) ? Direction.SOUTH : Direction.EAST;
            }
        }
    }

    public static Direction getCircleDirRight(MapLocation loc, MapLocation center) {
        int dx = loc.x - center.x;
        int dy = loc.y - center.y;

        if (Math.abs(dx) > Math.abs(dy)) {
            return (dx > 0) ? Direction.SOUTH : Direction.NORTH;
        } else if (Math.abs(dx) < Math.abs(dy)) {
            return (dy > 0) ? Direction.EAST : Direction.WEST;
        } else {
            if (dx > 0) {
                return (dy > 0) ? Direction.SOUTH : Direction.WEST;
            } else {
                return (dy > 0) ? Direction.EAST : Direction.NORTH;
            }
        }
    }
}

enum Symmetry {
    H,
    V,
    R
}