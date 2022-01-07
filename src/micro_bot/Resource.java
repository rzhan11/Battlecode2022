package micro_bot;

import battlecode.common.*;

import static micro_bot.Debug.*;
import static micro_bot.Map.*;
import static micro_bot.Robot.*;

/*
Responsible for tracking resources

 */
public class Resource {
    final public static int ZONE_SIZE = 4;
    final public static int ZONE_SIZE_HALF = ZONE_SIZE / 2;
    public static int ZONE_XNUM;
    public static int ZONE_YNUM;

    final public static int ZONE_UNKNOWN_FLAG = 0;
    final public static int ZONE_EMPTY_FLAG = 1;
    final public static int ZONE_MINE_FLAG = 2;

    public static int[][] zoneResourceStatus;

    public static void initResources() {
        ZONE_XNUM = (rc.getMapWidth() + ZONE_SIZE - 1) / ZONE_SIZE;
        ZONE_YNUM = (rc.getMapHeight() + ZONE_SIZE - 1) / ZONE_SIZE;
        zoneResourceStatus = new int[ZONE_XNUM][ZONE_YNUM];
    }

    public static int[] loc2Zone(MapLocation loc) {
        return new int[] {loc.x / ZONE_SIZE, loc.y / ZONE_SIZE};
    }

    public static boolean checkValidZone(int zx, int zy) {
        return 0 <= zx && zx < ZONE_XNUM && 0 <= zy && zy < ZONE_YNUM;
    }

    /*
    Can see zone
     */
    public static boolean canSeeZone(int zx, int zy) {
        int[] bounds = getZoneLocBounds(zx, zy);
        // bottom left
        return rc.canSenseLocation(new MapLocation(bounds[0], bounds[2])) &&
               rc.canSenseLocation(new MapLocation(bounds[1], bounds[2])) &&
               rc.canSenseLocation(new MapLocation(bounds[0], bounds[3])) &&
               rc.canSenseLocation(new MapLocation(bounds[1], bounds[3]));
    }

    /*
    Returns 4-int array
    {xlo, xhi, ylo, yhi}
     */
    public static int[] getZoneLocBounds(int zx, int zy) {
        return new int[]{
                zx * ZONE_SIZE,
                Math.min((zx + 1) * ZONE_SIZE - 1, XMAX),
                zy * ZONE_SIZE,
                Math.min((zy + 1) * ZONE_SIZE - 1, YMAX),
        };
    }

    public static MapLocation zone2Loc(int zx, int zy) {
        return new MapLocation(zx * ZONE_SIZE + ZONE_SIZE_HALF, zy * ZONE_SIZE + ZONE_SIZE_HALF);
    }

    public static void displayZoneStatus() {
        log("dzs " + zoneResourceStatus[0][0] + " " + ZONE_UNKNOWN_FLAG + " " + ZONE_EMPTY_FLAG + " " + ZONE_MINE_FLAG);
        for (int i = 0; i < ZONE_XNUM; i++) {
            for (int j = 0; j < ZONE_YNUM; j++) {
                MapLocation loc = new MapLocation(i * ZONE_SIZE, j * ZONE_SIZE);
                int[] color = PINK;
                switch (zoneResourceStatus[i][j]) {
                    case ZONE_UNKNOWN_FLAG:
                        color = BLACK;
                        break;
                    case ZONE_EMPTY_FLAG:
                        color = RED;
                        break;
                    case ZONE_MINE_FLAG:
                        color = GREEN;
                        break;

                    default:
                        logi("WARNING: 'displayZoneStatus' Unknown zone status! " + zoneResourceStatus[i][j]);
                }
                Debug.drawDot(loc, color);
            }
        }
    }
}
