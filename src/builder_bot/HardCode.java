package builder_bot;

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static builder_bot.Robot.*;

public class HardCode {

    // make calls to init
    public static void initHardCode() {
        switch(myType) {
            case ARCHON:
                init_DIRS34();
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
                init_ZONE_OFFSETS();
                break;
//                initBFS20();
            case SAGE:
                break;
//                initBFS20();
        }
    }

    public static int[][] OFFSET9;
    public static int[][] OFFSET20;
    public static int[][] OFFSET30;

    public static void init_OFFSET9() {
        if (OFFSET9 == null) {
            OFFSET9 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9}};
        }
    }
    public static void init_OFFSET20() {
        if (OFFSET20 == null) {
            OFFSET20 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9},{-3,-1,10},{-3,1,10},{-1,-3,10},{-1,3,10},{1,-3,10},{1,3,10},{3,-1,10},{3,1,10},{-3,-2,13},{-3,2,13},{-2,-3,13},{-2,3,13},{2,-3,13},{2,3,13},{3,-2,13},{3,2,13},{-4,0,16},{0,-4,16},{0,4,16},{4,0,16},{-4,-1,17},{-4,1,17},{-1,-4,17},{-1,4,17},{1,-4,17},{1,4,17},{4,-1,17},{4,1,17},{-3,-3,18},{-3,3,18},{3,-3,18},{3,3,18},{-4,-2,20},{-4,2,20},{-2,-4,20},{-2,4,20},{2,-4,20},{2,4,20},{4,-2,20},{4,2,20}};
        }
    }
    public static void init_OFFSET30() {
        if (OFFSET30 == null) {
            OFFSET30 = new int[][] {{0,0,0},{-1,0,1},{0,-1,1},{0,1,1},{1,0,1},{-1,-1,2},{-1,1,2},{1,-1,2},{1,1,2},{-2,0,4},{0,-2,4},{0,2,4},{2,0,4},{-2,-1,5},{-2,1,5},{-1,-2,5},{-1,2,5},{1,-2,5},{1,2,5},{2,-1,5},{2,1,5},{-2,-2,8},{-2,2,8},{2,-2,8},{2,2,8},{-3,0,9},{0,-3,9},{0,3,9},{3,0,9},{-3,-1,10},{-3,1,10},{-1,-3,10},{-1,3,10},{1,-3,10},{1,3,10},{3,-1,10},{3,1,10},{-3,-2,13},{-3,2,13},{-2,-3,13},{-2,3,13},{2,-3,13},{2,3,13},{3,-2,13},{3,2,13},{-4,0,16},{0,-4,16},{0,4,16},{4,0,16},{-4,-1,17},{-4,1,17},{-1,-4,17},{-1,4,17},{1,-4,17},{1,4,17},{4,-1,17},{4,1,17},{-3,-3,18},{-3,3,18},{3,-3,18},{3,3,18},{-4,-2,20},{-4,2,20},{-2,-4,20},{-2,4,20},{2,-4,20},{2,4,20},{4,-2,20},{4,2,20},{-5,0,25},{-4,-3,25},{-4,3,25},{-3,-4,25},{-3,4,25},{0,-5,25},{0,5,25},{3,-4,25},{3,4,25},{4,-3,25},{4,3,25},{5,0,25},{-5,-1,26},{-5,1,26},{-1,-5,26},{-1,5,26},{1,-5,26},{1,5,26},{5,-1,26},{5,1,26},{-5,-2,29},{-5,2,29},{-2,-5,29},{-2,5,29},{2,-5,29},{2,5,29},{5,-2,29},{5,2,29}};
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

    // iterate backwards
    public static Direction[] DIRS34;
    public static void init_DIRS34() {
        DIRS34 = new Direction[] {NORTH,EAST,SOUTH,SOUTH,WEST,NORTHWEST,NORTH,SOUTHWEST,NORTH,NORTHEAST,EAST,EAST,SOUTHEAST,SOUTH,SOUTH,SOUTHWEST,WEST,WEST,NORTHWEST,WEST,NORTH,NORTH,NORTHEAST,NORTH,EAST,EAST,EAST,SOUTHEAST,EAST,SOUTH,SOUTH,SOUTH,SOUTHWEST,SOUTHWEST,WEST,WEST,WEST,NORTHWEST,WEST,NORTH,NORTH,NORTH,NORTHEAST,NORTH,SOUTHWEST,NORTH,NORTHEAST,EAST,EAST,EAST,EAST,SOUTHEAST,EAST,NORTHWEST,EAST,SOUTHEAST,SOUTH,SOUTH,SOUTH,SOUTH,SOUTHWEST,SOUTHWEST,EAST,NORTHEAST,SOUTH,SOUTHWEST,WEST,WEST,WEST,WEST,WEST,WEST,NORTHWEST,WEST,NORTH,NORTH,NORTH,NORTH,NORTH,NORTH,NORTHEAST,NORTHEAST,EAST,EAST,EAST,EAST,EAST,EAST,SOUTHEAST,SOUTHEAST,SOUTH,SOUTH,SOUTH,SOUTH,SOUTH,SOUTH,SOUTHWEST,SOUTHWEST,WEST,WEST,WEST,WEST,WEST,WEST,NORTHWEST,NORTHEAST,NORTHEAST,NORTHEAST,NORTHEAST};
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
