package sprint_bot;

import battlecode.common.*;

public class MapTracker {
    final public static int MAX_MAP_SIZE = 64; // for optimization
    final public static int LONG_BITS = 64;
    final public static int ARRAY_SIZE = 64;

    public static long[] visitedLocations = new long[ARRAY_SIZE];

    public static void reset() {
        visitedLocations = new long[ARRAY_SIZE];
    }

    public static void add(MapLocation loc) {
        int mapIndex = loc.x * MAX_MAP_SIZE + loc.y;
        int arrayIndex = mapIndex / LONG_BITS;
        int bitIndex = mapIndex % LONG_BITS;
        visitedLocations[arrayIndex] |= (1L << bitIndex);
    }

    public static boolean check(MapLocation loc) {
        int mapIndex = loc.x * MAX_MAP_SIZE + loc.y;
        int arrayIndex = mapIndex / LONG_BITS;
        int bitIndex = mapIndex % LONG_BITS;
        return ((visitedLocations[arrayIndex] & (1L << bitIndex)) > 0);
    }
}
