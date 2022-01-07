package walker_bot;

import battlecode.common.*;

import static walker_bot.Debug.*;
import static walker_bot.Robot.*;

public class HardCode {

    final public static Direction[][] CLOSEST_DIRS = {
            {Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.WEST, Direction.EAST, Direction.SOUTHWEST, Direction.SOUTHEAST, Direction.SOUTH},
            {Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHWEST, Direction.SOUTHEAST, Direction.WEST, Direction.SOUTH, Direction.SOUTHWEST},
            {Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.NORTH, Direction.SOUTH, Direction.NORTHWEST, Direction.SOUTHWEST, Direction.WEST},
            {Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.NORTHEAST, Direction.SOUTHWEST, Direction.NORTH, Direction.WEST, Direction.NORTHWEST},
            {Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.EAST, Direction.WEST, Direction.NORTHEAST, Direction.NORTHWEST, Direction.NORTH},
            {Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHEAST, Direction.NORTHWEST, Direction.EAST, Direction.NORTH, Direction.NORTHEAST},
            {Direction.WEST, Direction.SOUTHWEST, Direction.NORTHWEST, Direction.SOUTH, Direction.NORTH, Direction.SOUTHEAST, Direction.NORTHEAST, Direction.EAST},
            {Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.SOUTHWEST, Direction.NORTHEAST, Direction.SOUTH, Direction.EAST, Direction.SOUTHEAST},
            // center
            {Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.SOUTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.NORTHWEST},
    };

    // make calls to init
    public static void initHardCode() {
        switch(myType) {
            case ARCHON:
                break;
            case LABORATORY:
                break;
            case WATCHTOWER:
                break;
            case MINER:
                init_ZONE_OFFSETS();
                break;
//                initBFS20();
            case BUILDER:
                break;
//                initBFS20();
            case SOLDIER:
                break;
//                initBFS20();
            case SAGE:
                break;
//                initBFS20();
        }
    }

    public static int[][] BFS9;
    public static int[][] BFS20;
    public static int[][] BFS25;
    public static int[][] BFS30;
    public static int[][] BFS40;

    public static void initBFS9() {
        if (BFS9 == null) {
            BFS9 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9}};
        }
    }
    public static void initBFS20() {
        if (BFS20 == null) {
            BFS20 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9},{-3,-1,10},{-3,1,10},{-1,-3,10},{-1,3,10},{1,-3,10},{1,3,10},{3,-1,10},{3,1,10},{-3,-2,13},{-3,2,13},{-2,-3,13},{-2,3,13},{2,-3,13},{2,3,13},{3,-2,13},{3,2,13},{-4,0,16},{0,-4,16},{0,4,16},{4,0,16},{-4,-1,17},{-4,1,17},{-1,-4,17},{-1,4,17},{1,-4,17},{1,4,17},{4,-1,17},{4,1,17},{-3,-3,18},{-3,3,18},{3,-3,18},{3,3,18},{-4,-2,20},{-4,2,20},{-2,-4,20},{-2,4,20},{2,-4,20},{2,4,20},{4,-2,20},{4,2,20}};
        }
    }
    public static void initBFS25() {
        if (BFS25 == null) {
            BFS25 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9},{-3,-1,10},{-3,1,10},{-1,-3,10},{-1,3,10},{1,-3,10},{1,3,10},{3,-1,10},{3,1,10},{-3,-2,13},{-3,2,13},{-2,-3,13},{-2,3,13},{2,-3,13},{2,3,13},{3,-2,13},{3,2,13},{-4,0,16},{0,-4,16},{0,4,16},{4,0,16},{-4,-1,17},{-4,1,17},{-1,-4,17},{-1,4,17},{1,-4,17},{1,4,17},{4,-1,17},{4,1,17},{-3,-3,18},{-3,3,18},{3,-3,18},{3,3,18},{-4,-2,20},{-4,2,20},{-2,-4,20},{-2,4,20},{2,-4,20},{2,4,20},{4,-2,20},{4,2,20},{-5,0,25},{-4,-3,25},{-4,3,25},{-3,-4,25},{-3,4,25},{0,-5,25},{0,5,25},{3,-4,25},{3,4,25},{4,-3,25},{4,3,25},{5,0,25}};
        }
    }
    public static void initBFS30() {
        if (BFS30 == null) {
            BFS30 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9},{-3,-1,10},{-3,1,10},{-1,-3,10},{-1,3,10},{1,-3,10},{1,3,10},{3,-1,10},{3,1,10},{-3,-2,13},{-3,2,13},{-2,-3,13},{-2,3,13},{2,-3,13},{2,3,13},{3,-2,13},{3,2,13},{-4,0,16},{0,-4,16},{0,4,16},{4,0,16},{-4,-1,17},{-4,1,17},{-1,-4,17},{-1,4,17},{1,-4,17},{1,4,17},{4,-1,17},{4,1,17},{-3,-3,18},{-3,3,18},{3,-3,18},{3,3,18},{-4,-2,20},{-4,2,20},{-2,-4,20},{-2,4,20},{2,-4,20},{2,4,20},{4,-2,20},{4,2,20},{-5,0,25},{-4,-3,25},{-4,3,25},{-3,-4,25},{-3,4,25},{0,-5,25},{0,5,25},{3,-4,25},{3,4,25},{4,-3,25},{4,3,25},{5,0,25},{-5,-1,26},{-5,1,26},{-1,-5,26},{-1,5,26},{1,-5,26},{1,5,26},{5,-1,26},{5,1,26},{-5,-2,29},{-5,2,29},{-2,-5,29},{-2,5,29},{2,-5,29},{2,5,29},{5,-2,29},{5,2,29}};
        }
    }
    public static void initBFS40() {
        if (BFS40 == null) {
            BFS40 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9},{-3,-1,10},{-3,1,10},{-1,-3,10},{-1,3,10},{1,-3,10},{1,3,10},{3,-1,10},{3,1,10},{-3,-2,13},{-3,2,13},{-2,-3,13},{-2,3,13},{2,-3,13},{2,3,13},{3,-2,13},{3,2,13},{-4,0,16},{0,-4,16},{0,4,16},{4,0,16},{-4,-1,17},{-4,1,17},{-1,-4,17},{-1,4,17},{1,-4,17},{1,4,17},{4,-1,17},{4,1,17},{-3,-3,18},{-3,3,18},{3,-3,18},{3,3,18},{-4,-2,20},{-4,2,20},{-2,-4,20},{-2,4,20},{2,-4,20},{2,4,20},{4,-2,20},{4,2,20},{-5,0,25},{-4,-3,25},{-4,3,25},{-3,-4,25},{-3,4,25},{0,-5,25},{0,5,25},{3,-4,25},{3,4,25},{4,-3,25},{4,3,25},{5,0,25},{-5,-1,26},{-5,1,26},{-1,-5,26},{-1,5,26},{1,-5,26},{1,5,26},{5,-1,26},{5,1,26},{-5,-2,29},{-5,2,29},{-2,-5,29},{-2,5,29},{2,-5,29},{2,5,29},{5,-2,29},{5,2,29},{-4,-4,32},{-4,4,32},{4,-4,32},{4,4,32},{-5,-3,34},{-5,3,34},{-3,-5,34},{-3,5,34},{3,-5,34},{3,5,34},{5,-3,34},{5,3,34},{-6,0,36},{0,-6,36},{0,6,36},{6,0,36},{-6,-1,37},{-6,1,37},{-1,-6,37},{-1,6,37},{1,-6,37},{1,6,37},{6,-1,37},{6,1,37},{-6,-2,40},{-6,2,40},{-2,-6,40},{-2,6,40},{2,-6,40},{2,6,40},{6,-2,40},{6,2,40}};
        }
    }

    public static int[][] BOX_EDGES;

    public static void initBOX_EDGES() {
        if (BOX_EDGES == null) {
            BOX_EDGES = new int[][] {{1,2},{-2,1},{-2,0},{-2,-2},{-1,-2},{-2,2},{-1,2},{2,-2},{2,-1},{2,1},{2,2},{2,0},{-2,-1},{0,-2},{1,-2},{0,2}};
        }
    }

    public static int[][] ZONE_OFFSETS;
    public static void init_ZONE_OFFSETS() {
        ZONE_OFFSETS = new int[][] {{1, 0},{1, 1},{0, 1},{-1, 1},{-1, 0},{-1, -1},{0, -1},{1, -1}};
    }

    // todo: make switch statement for lead conversion rates
//    public static int getPassiveInfluence(int influence) {
//        switch(influence) {
//            case 21: return 1;
//            case 41: return 2;
//            case 63: return 3;
//            case 85: return 4;
//            case 107: return 5;
//            case 130: return 6;
//            case 154: return 7;
//            case 178: return 8;
//            case 203: return 9;
//            case 228: return 10;
//            case 255: return 11;
//            case 282: return 12;
//            case 310: return 13;
//            case 339: return 14;
//            case 368: return 15;
//            case 399: return 16;
//            case 431: return 17;
//            case 463: return 18;
//            case 497: return 19;
//            case 532: return 20;
//            case 568: return 21;
//            case 605: return 22;
//            case 643: return 23;
//            case 683: return 24;
//            case 724: return 25;
//            case 766: return 26;
//            case 810: return 27;
//            case 855: return 28;
//            case 902: return 29;
//            case 949: return 30;
//            default:
//                logi("WARNING: 'HardCode.getPassiveInfluence' received query for unexpected amount " + influence);
//                return -1;
//        }
//    }
}
