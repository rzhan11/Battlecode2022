package comm_explore_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static comm_explore_bot.Comms.writeReportResource;
import static comm_explore_bot.Debug.*;
import static comm_explore_bot.Map.*;
import static comm_explore_bot.Robot.*;

/*
Responsible for tracking resources

 */
public class Zone {
    final public static int ZONE_SIZE = 4;
    final public static int ZONE_SIZE_HALF = ZONE_SIZE / 2;
    public static int ZONE_XNUM;
    public static int ZONE_YNUM;
    public static int ZONE_TOTAL_NUM;

    final public static int ZONE_UNKNOWN_FLAG = 0;
    final public static int ZONE_EMPTY_FLAG = 1;
    final public static int ZONE_MINE_FLAG = 2;

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

    /*
    Zone Resource Tracking
     */

    public static int READ_BROADCAST_RESOURCE_ROUNDS;

    public static int[][] zoneResourceStatus;
    public static int[][] zoneDangerLastRound;
    public static int[][] zoneVisitLastRound;

    /*
    Zone counting - archons only
     */
    public static int unknownCount;
    public static int unknownFrontierCount = 0;
    public static int mineCount = 0;
    public static boolean[][] isFrontierZone;

    public static void initZones() {
        ZONE_XNUM = (rc.getMapWidth() + ZONE_SIZE - 1) / ZONE_SIZE;
        ZONE_YNUM = (rc.getMapHeight() + ZONE_SIZE - 1) / ZONE_SIZE;
        ZONE_TOTAL_NUM = ZONE_XNUM * ZONE_YNUM;

        zoneResourceStatus = new int[ZONE_XNUM][ZONE_YNUM];
        zoneDangerLastRound = new int[ZONE_XNUM][ZONE_YNUM];
        zoneVisitLastRound = new int[ZONE_XNUM][ZONE_YNUM];

        if (myType == ARCHON) {
            unknownCount = ZONE_TOTAL_NUM;
            isFrontierZone = new boolean[ZONE_XNUM][ZONE_YNUM];
        }

        READ_BROADCAST_RESOURCE_ROUNDS = 4 + ZONE_TOTAL_NUM / Comms.BROADCAST_RESOURCE_MSG_PER_ROUND;
    }

    public static void displayZoneResourceStatus() {
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

    /*
    Updates resource zone status of given resource zone (assumes can see it)
     */
    public static void updateResourceZoneStatus(int zx, int zy) throws GameActionException {
        // check tiles for resources

        int oldStatus = zoneResourceStatus[zx][zy];

        zoneResourceStatus[zx][zy] = ZONE_EMPTY_FLAG; // set to empty mine
        ZoneUpdate.updateResourceZoneStatus(zx, zy);


//        int[] zoneBounds = getZoneLocBounds(zx, zy);
//        zoneResourceStatus[zx][zy] = ZONE_EMPTY_FLAG; // set to empty mine
//        for (int i = zoneBounds[0]; i <= zoneBounds[1]; i++) {
//            for (int j = zoneBounds[2]; j <= zoneBounds[3]; j++) {
//                MapLocation loc = new MapLocation(i, j);
//                if (rc.senseLead(loc) > 0) {
//                    zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
//                    break;
//                }
//            }
//        }

        if (oldStatus != zoneResourceStatus[zx][zy]) {
            // todo: delay reports when young
            writeReportResource(zx, zy, zoneResourceStatus[zx][zy]);

            if (myType == ARCHON) {
                Archon.updateResourceZoneCount(oldStatus, zoneResourceStatus[zx][zy], zx, zy);
            }
        }

    }
}
