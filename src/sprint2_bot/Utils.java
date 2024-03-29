package sprint2_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static sprint2_bot.Debug.*;
import static sprint2_bot.Map.*;
import static sprint2_bot.Robot.*;

public class Utils {

    /*
    Bytecode statements
     */
    public static String lastBytecodeString = null;
    public static int lastBytecodeLeft;
    public static int lastBytecodeRound;
    public static void startBytecode(String str) {
        if (lastBytecodeString != null) {
            logi("WARNING: 'startBytecode' has not stopped old bytecode count " + lastBytecodeString + " " + str);
        } else {
            lastBytecodeString = str;
            lastBytecodeLeft = Clock.getBytecodesLeft();
            lastBytecodeRound = rc.getRoundNum();
            log("[CUR] " + lastBytecodeString + ": " + lastBytecodeLeft);
        }
    }

    public static void stopBytecode(String str) {
        int b = Clock.getBytecodesLeft();
        if (lastBytecodeString.equals(str)) {
            if (lastBytecodeLeft - b < 0) {
                b -= myType.bytecodeLimit;
            }
            log("[BYTE] '" + str + "' " + (lastBytecodeLeft - b) + " " + isDisplayLogs());
            lastBytecodeString = null;
        } else {
            logi("WARNING: 'stopBytecode' has different start/stop string " + lastBytecodeString + " " + str);
        }
    }

    public static void clearBytecode() {
        lastBytecodeString = null;
    }

    public static boolean inArray(Object[] arr, Object item, int length) {
        for(int i = length; --i >= 0;) {
            if(arr[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static boolean inArray(int[] arr, int item, int length) {
        for(int i = length; --i >= 0;) {
            if(arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void delete(int[] arr, int i, int len) {
        arr[i] = arr[len - 1];
    }

    public static void delete(Object[] arr, int i, int len) {
        arr[i] = arr[len - 1];
    }

    public static Direction getDir(int dx, int dy) {
        return new MapLocation(0, 0).directionTo(new MapLocation(dx, dy));
    }

    public static MapLocation getRandomLoc() {
        return new MapLocation(randInt(rc.getMapWidth()), randInt(rc.getMapHeight()));
    }

    public static Direction getRandomDir() {
        return DIRS[randInt(8)];
    }

    public static Direction getRandomDirCenter() {
        return ALL_DIRS[randInt(9)];
    }

    public static boolean checkSimilarDir(Direction dir1, Direction dir2) {
        return dir1 == dir2 || dir1 == dir2.rotateLeft() || dir1 == dir2.rotateRight();
    }

    public static int RANDOM_SEED;
    public static double random() {
        double x = Math.sin(RANDOM_SEED++) * 10000;
        return x - Math.floor(x);
    }

    public static int randInt(int upper) {
        double x = Math.sin(RANDOM_SEED++) * 10000;
        return (int) (upper * (x - Math.floor(x)));
    }

    public static boolean randBoolean() {
        double x = Math.sin(RANDOM_SEED++) * 10000;
        return x - Math.floor(x) < 0.5;
    }

    public static double randomFromSeed(int seed) {
        double x = Math.sin(seed) * 10000;
        return x - Math.floor(x);
    }

    public static int getDirSimilarity(Direction d1, Direction d2) {
        if (d1 == Direction.CENTER || d2 == Direction.CENTER) return 0;

        int a = dir2int(d1);
        int b = dir2int(d2);
        int diff = (a - b + 8) % 8;
        return Math.min(diff, 8 - diff);
    }

    /*
    Returns the robot in 'arr' that is closest to 'loc'
     */
    public static RobotInfo getClosest(MapLocation loc, RobotInfo[] arr, int len) {
        RobotInfo bestRobot = null;
        int bestDist = P_INF;
        for (int i = len; --i >= 0;) {
            RobotInfo ri = arr[i];
            int dist = loc.distanceSquaredTo(ri.location);
            if (dist < bestDist) {
                bestRobot = ri;
                bestDist = dist;
            }
        }
        return bestRobot;
    }

    public static MapLocation getClosest(MapLocation loc, MapLocation[] arr, int len) {
        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = len; --i >= 0;) {
            MapLocation ri = arr[i];
            int dist = loc.distanceSquaredTo(ri);
            if (dist < bestDist) {
                bestLoc = ri;
                bestDist = dist;
            }
        }
        return bestLoc;
    }

    public static int rt2int(RobotType rt) {
        switch (rt) {
            case ARCHON:
                return 0;
            case LABORATORY:
                return 1;
            case WATCHTOWER:
                return 2;
            case MINER:
                return 3;
            case BUILDER:
                return 4;
            case SOLDIER:
                return 5;
            case SAGE:
                return 6;
            default:
                logi("WARNING: 'rt2int' Unknown RobotType " + rt);
                return -1;
        }
    }

    public static RobotType int2rt(int i) {
        switch (i) {
            case 0:
                return ARCHON;
            case 1:
                return LABORATORY;
            case 2:
                return WATCHTOWER;
            case 3:
                return MINER;
            case 4:
                return BUILDER;
            case 5:
                return SOLDIER;
            case 6:
                return SAGE;
            default:
                logi("WARNING: 'int2rt' Unknown RobotType index " + i);
                return null;
        }

    }

    public static int getMaxVisibleLocs(RobotType rt) {
        switch (rt) {
            case ARCHON:
            case WATCHTOWER:
            case SAGE:
                return 108;
            case SOLDIER:
            case MINER:
            case BUILDER:
                return 68;
            case LABORATORY:
                return -1;
        }
        logi("WARNING: 'getMaxVisibleLocs' should not reach here " + rt);
        return -1;
    }

}