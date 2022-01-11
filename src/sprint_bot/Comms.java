package explore_bot_nolog_ref;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static explore_bot_nolog_ref.Debug.*;
import static explore_bot_nolog_ref.Zone.*;
import static explore_bot_nolog_ref.Robot.*;
import static explore_bot_nolog_ref.Utils.*;


public class Comms {

    /*
    How to make a new message
    1. Add a "read" and "write" method
    2. Add it to the switch statement in 'readMessage()'
     */

    /* COMMS HELPERS */

    // constants for coordinates
    final public static int COORD_BITS = 6;
    final public static int COORD_MASK = (1 << COORD_BITS) - 1;

    final public static int LOC_BITS = 2 * COORD_BITS;
    final public static int LOC_MASK = (1 << LOC_BITS) - 1;

    /*
    Converts a MapLocation to 12-bit representation
     */
    public static int loc2bits(MapLocation loc) {
        return (loc.y << COORD_BITS) + loc.x;
    }


    /*
    Converts 12 bits to a MapLocation
    -----
    bits = msgInfo
     */
    public static MapLocation bits2loc(int bits) {
        int x = bits & COORD_MASK;
        int y = ((bits - x) >>> COORD_BITS);
        return new MapLocation(x, y);
    }

    final public static int ZONE_COORD_BITS = 4;
    final public static int ZONE_COORD_MASK = (1 << ZONE_COORD_BITS) - 1;

    final public static int ZONE_POS_BITS = 2 * ZONE_COORD_BITS;
    final public static int ZONE_POS_MASK = (1 << ZONE_POS_BITS) - 1;
    /*
    Converts a Zone to 8-bit representation
     */
    public static int zone2bits(int zx, int zy) {
        return (zy << ZONE_COORD_BITS) + zx;
    }

    /*
    Converts 8 bits to a MapLocation
    -----
    bits = msgInfo
     */
    public static int[] bits2zone(int bits) {
        int x = bits & ZONE_COORD_MASK;
        int y = ((bits - x) >>> ZONE_COORD_BITS);
        return new int[]{x, y};
    }

    /*
    Comms OVERVIEW:
    -----
    Our COMMS array is divided into preset sections.

    1 cell = 16 bits (an array entry)
    1 message per cell (messages are 15 content bits + 1 header bit)
        - header bit indicates that the message is being used
        - content bits are bits 0-14
        - header bit is bit 15
    Sections are intervals of cells

    A cell containing 0 indicates that there is no message in it
        - Our messages should ever be 0
        - Messages should contain some "used" bit to show that a cell is nonempty


    -----
    */




    /*
    Comms DETAILS:
    -----
    Preset section:
        - Our archon locations/live status (4x16)
        - Enemy archon locations/info (4x16)
        - Flag section (1x16)
        - todo: unit counts

     */

    final public static int COMM_ARRAY_SIZE = 64;
    final public static int COMM_CELL_BITS = 16;
    final public static int MAX_COMM_BITS = COMM_ARRAY_SIZE * COMM_CELL_BITS;
    public static int[] commArray = new int[COMM_ARRAY_SIZE];

    public static void loadCommArray() throws GameActionException {
//        int bef = Clock.getBytecodesLeft();
        for (int i = COMM_ARRAY_SIZE; --i >= 0;) {
            commArray[i] = rc.readSharedArray(i);
        }
//        int aft = Clock.getBytecodesLeft();
    }

    final public static int MASK1 = 1;
    final public static int MASK2 = 3;
    final public static int MASK3 = 7;
    final public static int MASK4 = 15;
    final public static int MASK5 = 31;
    final public static int MASK6 = 63;
    final public static int MASK7 = 127;
    final public static int MASK8 = 255;
    final public static int MASK15 = 32767;

    final public static int BIT0 = 1;
    final public static int BIT1 = 2;
    final public static int BIT2 = 4;
    final public static int BIT3 = 8;
    final public static int BIT4 = 16;
    final public static int BIT5 = 32;
    final public static int BIT6 = 64;
    final public static int BIT7 = 128;
    final public static int BIT8 = 256;
    final public static int BIT9 = 512;
    final public static int BIT10 = 1024;
    final public static int BIT11 = 2048;
    final public static int BIT12 = 4096;
    final public static int BIT13 = 8192;
    final public static int BIT14 = 16384;
    final public static int BIT15 = 32768;

    public static int getBitMask(int left, int right) {
        return ((1 << (right - left)) - 1) << left;
    }

    public static int setBits(int origData, int newData, int left, int right) {
        int origMask = ~ getBitMask(left, right);
        int newMask = (1 << (right - left)) - 1;
        return ( origData & origMask )
                + (( newData & newMask ) << left);
    }

    public static int getBits(int origData, int left, int right) {
        return origData & getBitMask(left, right);
    }

    final public static int ALLY_ARCHON_SECTION_ID = 0;
    final public static int ALLY_ARCHON_SECTION_OFFSET = 0;
    final public static int ALLY_ARCHON_SECTION_SIZE = 4; // num cells

    final public static int ENEMY_ARCHON_SECTION_ID = 1;
    final public static int ENEMY_ARCHON_SECTION_OFFSET = ALLY_ARCHON_SECTION_OFFSET + ALLY_ARCHON_SECTION_SIZE;
    final public static int ENEMY_ARCHON_SECTION_SIZE = 4;

    final public static int FLAG_SECTION_ID = 2;
    final public static int FLAG_SECTION_OFFSET = ENEMY_ARCHON_SECTION_OFFSET + ENEMY_ARCHON_SECTION_SIZE;
    final public static int FLAG_SECTION_SIZE = 1;

    final public static int REPORT_RESOURCE_SECTION_ID = 3;
    final public static int REPORT_RESOURCE_SECTION_OFFSET = FLAG_SECTION_OFFSET + FLAG_SECTION_SIZE;
    final public static int REPORT_RESOURCE_SECTION_SIZE = 16;

    final public static int BROADCAST_RESOURCE_SECTION_ID = 4;
    final public static int BROADCAST_RESOURCE_SECTION_OFFSET = REPORT_RESOURCE_SECTION_OFFSET + REPORT_RESOURCE_SECTION_SIZE;
    final public static int BROADCAST_RESOURCE_SECTION_SIZE = 4;

    final public static int REPORT_ENEMY_SECTION_ID = 5;
    final public static int REPORT_ENEMY_SECTION_OFFSET = BROADCAST_RESOURCE_SECTION_ID + BROADCAST_RESOURCE_SECTION_OFFSET;
    final public static int REPORT_ENEMY_SECTION_SIZE = 16;

    final public static int COMMON_EXPLORE_SECTION_ID = 6;
    final public static int COMMON_EXPLORE_SECTION_OFFSET = REPORT_ENEMY_SECTION_OFFSET + REPORT_ENEMY_SECTION_SIZE;
    final public static int COMMON_EXPLORE_SECTION_SIZE = 4;

    final public static int ALLY_UNIT_COUNT_SECTION_ID = 7;
    final public static int ALLY_UNIT_COUNT_SECTION_OFFSET = COMMON_EXPLORE_SECTION_OFFSET + COMMON_EXPLORE_SECTION_SIZE;
    final public static int ALLY_UNIT_COUNT_SECTION_SIZE = 5;

    /*
    Write a message to an empty cell in a given section
    ---
    Returns index of cell written to
    Returns -1 if no empty cell found
     */
    public static int writeToEmptyCell(int data, int sectionOffset, int sectionSize) throws GameActionException {
        int cellIndex = findEmptyCellWithoutDups(data, sectionOffset, sectionSize);
        if (cellIndex != -1) {
            writeCell(data, cellIndex);
        } else {
//////             tlog("Write fail " + sectionOffset + " " +sectionSize);
        }

        return cellIndex;
    }

    public static int findEmptyCell(int sectionOffset, int sectionSize) throws GameActionException {
        int sectionEnd = sectionOffset + sectionSize;
        for (int i = sectionOffset; i < sectionEnd; i++) {
            if (commArray[i] == 0) { // write into empty location
                return i;
            }
        }
        return -1;
    }

    public static int findEmptyCellWithoutDups(int data, int sectionOffset, int sectionSize) throws GameActionException {
        int sectionEnd = sectionOffset + sectionSize;
        for (int i = sectionOffset; i < sectionEnd; i++) {
            if (commArray[i] == 0) { // write into empty location
                return i;
            }

            if (readCell(i) == data) {
//////                 tlog("Dup found at " + i);
                return -1;
            }
        }
        return -1;
    }

    /*
    Writes message to cell
     */
    public static void writeCell(int data, int cellIndex) throws GameActionException {
//////         tlog("Write success " + cellIndex + " " + data);
        data += BIT15; // used bit

        commArray[cellIndex] = data;
        rc.writeSharedArray(cellIndex, data);
    }

    /*
    Returns message from cell
     */
    public static int readCell(int cellIndex) throws GameActionException {
        return commArray[cellIndex] & MASK15;
    }

    public static void readMessageSection(int sectionID, int sectionOffset, int sectionSize) throws GameActionException {
        for (int i = sectionSize; --i >= 0;) {
            readMessage(sectionID, i, i + sectionOffset);
        }
    }

    public static void readMessage(int sectionID, int msgIndex, int cellIndex) throws GameActionException {
        int msgInfo = commArray[cellIndex]; // relative index within a section
        if (msgInfo == 0) { // empty message
            return;
        }
        // remove 'used' bit
        msgInfo -= BIT15;

        switch (sectionID) {
            case ALLY_ARCHON_SECTION_ID:
                readAllyArchon(msgInfo, msgIndex);
                break;
            case ENEMY_ARCHON_SECTION_ID:
                // todo
                break;
            case FLAG_SECTION_ID:
                // todo
                break;
            case REPORT_RESOURCE_SECTION_ID:
                readReportResource(msgInfo);
                break;
            case BROADCAST_RESOURCE_SECTION_ID:
                readBroadcastResource(msgInfo, msgIndex);
                break;
            case REPORT_ENEMY_SECTION_ID:
                readReportEnemy(msgInfo);
                break;
            case COMMON_EXPLORE_SECTION_ID:
                readCommonExplore(msgInfo);
                break;
            case ALLY_UNIT_COUNT_SECTION_ID:
                readAllyUnitCount(msgInfo, msgIndex);
                break;


            default:
                logi("ERROR: Unknown sectionID " + sectionID);
                break;
        }


    }

    /*
    All message section that need to be periodically cleared should be put here
     */
    public static void clearMessageBoard() throws GameActionException {
        int[][] sectionInfo = new int[][]{
                {REPORT_RESOURCE_SECTION_OFFSET, REPORT_RESOURCE_SECTION_SIZE},
                {REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE},
                {ALLY_UNIT_COUNT_SECTION_OFFSET, ALLY_UNIT_COUNT_SECTION_SIZE},
        };

//        int a = Clock.getBytecodesLeft();
        for (int i = sectionInfo.length; --i >= 0;) {
            clearMessageSection(sectionInfo[i][0], sectionInfo[i][1]);
        }
//        int b = Clock.getBytecodesLeft();
//        log("byte " + (a - b));
    }


    public static void clearMessageSection(int sectionOffset, int sectionSize) throws GameActionException {
        int sectionEnd = sectionOffset + sectionSize;
        for (int i = sectionOffset; i < sectionEnd; i++) {
            commArray[i] = 0;
            rc.writeSharedArray(i, 0);
        }
    }


    /*
    MESSAGE FORMAT:
    --------------
    [BIT RANGE] | [MEANING]
    --------------
    Range values are inclusive
    Can go from 0-14
    ---
    Bit index 15 is always the 'used' bit
     */

    /*
    0-11 | Location
    12 | Turn parity
    13 | Live
    14 | Spawn bit
     */
    public static void writeAllyArchon(MapLocation loc, int archonIndex, boolean live) throws GameActionException {
//////         log("Writing 'Ally Archon' " + loc + " " + archonIndex + " " + live);

        int msg = loc2bits(loc);
        if (roundNum % 2 == 1) {
            msg += BIT12; // initial turn parity (should be odd)
        }
        if (live) {
            msg += BIT13; // live
        }
        if (Archon.archonSpawnBit[archonIndex] == 1) {
            msg += BIT14;
        }

        writeCell(msg, ALLY_ARCHON_SECTION_OFFSET + archonIndex);
    }

    public static void readAllyArchon(int msgInfo, int archonIndex) throws GameActionException {
        // location
        allyArchonLocs[archonIndex] = bits2loc(msgInfo & LOC_MASK);

        // live
        int liveBit = (msgInfo >> 13) & 1;
        isAllyArchonLive[archonIndex] = (liveBit == 1);

        if (myType == ARCHON) {
            // spawn bit
            int spawnBit = (msgInfo >> 14) & 1;
            Archon.archonSpawnBit[archonIndex] = spawnBit;
        }

        // turn parity
        if (isAllyArchonLive[archonIndex] && myType == ARCHON) {
            if (archonIndex < Archon.myArchonIndex) { // only check archons who go before it
                int tpBit = (msgInfo >> 12) & 1;
                // if tp is off, then bot is dead
                if (tpBit % 2 != roundNum % 2) {
                    // signal dead
                    writeAllyArchon(allyArchonLocs[archonIndex], archonIndex, false);
                }
            }
        }
    }

    public static void readAllyArchonSection() throws GameActionException {
        readMessageSection(ALLY_ARCHON_SECTION_ID, ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE);
    }

    /*
    0-7 | Zone
    8-9 | Status
     */
    public static void writeReportResource(int zx, int zy, int status) throws GameActionException {
//////         log("Writing 'Report Resource' " + zx + " " + zy + " s:" + status);

        int msg = zone2bits(zx, zy);
        msg += status << 8;

        writeToEmptyCell(msg, REPORT_RESOURCE_SECTION_OFFSET, REPORT_RESOURCE_SECTION_SIZE);
    }

    public static void readReportResource(int msgInfo) throws GameActionException {
        int[] zone = bits2zone(msgInfo & ZONE_POS_MASK);
        int status = msgInfo >>> 8;
//        log("Reading 'Report Resource' " + zone[0] + " " + zone[1] + " s:" + status);

        if (myType == ARCHON) {
            Archon.updateResourceZoneCount(zoneResourceStatus[zone[0]][zone[1]], status, zone[0], zone[1]);
        }
        zoneResourceStatus[zone[0]][zone[1]] = status;
    }

    public static void readReportResourceSection() throws GameActionException {
        readMessageSection(REPORT_RESOURCE_SECTION_ID, REPORT_RESOURCE_SECTION_OFFSET, REPORT_RESOURCE_SECTION_SIZE);
    }

    // IMPORTANT: max cell density should be 7
    final public static int BROADCAST_RESOURCE_CELL_DENSITY = 7; // number of messages per cell
    final public static int BROADCAST_RESOURCE_SHIFT = 2; // number of messages per cell
    final public static int BROADCAST_RESOURCE_MASK = MASK2; // number of messages per cell
    final public static int BROADCAST_RESOURCE_MSG_PER_ROUND = BROADCAST_RESOURCE_SECTION_SIZE * BROADCAST_RESOURCE_CELL_DENSITY;

    /*
    0-7 | Zone
    8-9 | Status
     */
    public static void writeBroadcastResource(int index) throws GameActionException {
//////         log("Writing 'Broadcast Resource' " + index);

        int zoneIndex = getBroadcastZone(index);

        int msg = 0;

        for (int i = BROADCAST_RESOURCE_CELL_DENSITY; --i >= 0;) {
            if (zoneIndex >= ZONE_TOTAL_NUM) {
                zoneIndex -= ZONE_TOTAL_NUM;
            }

            int zx = zoneIndex % ZONE_XNUM;
            int zy = zoneIndex / ZONE_XNUM;

            msg = (msg + zoneResourceStatus[zx][zy]) << BROADCAST_RESOURCE_SHIFT;

//            // draw resource zone
//            {
//                MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
//                int[] color = PINK;
//                switch (zoneResourceStatus[zx][zy]) {
//                    case ZONE_UNKNOWN_FLAG:
//                        color = BLACK;
//                        break;
//                    case ZONE_EMPTY_FLAG:
//                        color = RED;
//                        break;
//                    case ZONE_MINE_FLAG:
//                        color = GREEN;
//                        break;
//
//                    default:
//                        logi("WARNING: 'displayZoneStatus' Unknown zone status! " + zoneResourceStatus[zx][zy]);
//                }
//                Debug.drawDot(loc, color);
//
//            }
//
//            // draw danger zone
//            {
//                MapLocation loc = new MapLocation(zx * ZONE_SIZE + 1, zy * ZONE_SIZE + 1);
//                int[] color = PINK;
//                if (zoneDangerLastRound[zx][zy] == 0) {
//                    color = GRAY;
//                } else if (roundNum - zoneDangerLastRound[zx][zy] <= Miner.ZONE_DANGER_WAIT) {
//                    color = PINK;
//                } else {
//                    color = YELLOW;
//                }
//                Debug.drawDot(loc, color);
//            }

            zoneIndex++;
        }
        msg = msg >> BROADCAST_RESOURCE_SHIFT;

        writeCell(msg, BROADCAST_RESOURCE_SECTION_OFFSET + index);
    }

    public static void readBroadcastResource(int msgInfo, int msgIndex) throws GameActionException {
//        log("Reading 'Broadcast Resource' " + msgInfo + " " + msgIndex);

        int zoneIndex = (getBroadcastZone(msgIndex) + BROADCAST_RESOURCE_CELL_DENSITY) % ZONE_TOTAL_NUM;

        for (int i = BROADCAST_RESOURCE_CELL_DENSITY; --i >= 0;) {
            zoneIndex--;
            if (zoneIndex < 0) {
                zoneIndex += ZONE_TOTAL_NUM;
            }

            int zx = zoneIndex % ZONE_XNUM;
            int zy = zoneIndex / ZONE_XNUM;
            int status = msgInfo & BROADCAST_RESOURCE_MASK;

            if (myType == ARCHON) {
                Archon.updateResourceZoneCount(zoneResourceStatus[zx][zy], status, zx, zy);
            }
            zoneResourceStatus[zx][zy] = status;

            msgInfo = msgInfo >> BROADCAST_RESOURCE_SHIFT;
        }
        //
    }

    public static void broadcastResources() throws GameActionException {
        int a = Clock.getBytecodesLeft();
        for (int i = Comms.BROADCAST_RESOURCE_SECTION_SIZE; --i >= 0;) {
            Comms.writeBroadcastResource(i);
        }
        int b = Clock.getBytecodesLeft();
//////         log("bytecode 'w_b_r' " + (a - b));
    }

    public static void readBroadcastResourceSection() throws GameActionException {
        if (Archon.isPrimaryArchon()) {
            return;
        }
        int a = Clock.getBytecodesLeft();
        readMessageSection(BROADCAST_RESOURCE_SECTION_ID, BROADCAST_RESOURCE_SECTION_OFFSET, BROADCAST_RESOURCE_SECTION_SIZE);
        int b = Clock.getBytecodesLeft();
//////         log("bytecode 'r_b_r' " + (a - b));
    }

    /*
    Returns broadcast zone based on msgIndex and roundNum
    msgIndex is the relative index
     */
    public static int getBroadcastZone(int msgIndex) {
        // based on curRoundNum
        int startIndex = (roundNum - 1) * BROADCAST_RESOURCE_MSG_PER_ROUND;
        return (startIndex + msgIndex * BROADCAST_RESOURCE_CELL_DENSITY) % ZONE_TOTAL_NUM;
    }

    final public static int REPORT_ENEMY_REPEAT_WAIT = 8;

    /*
    0-7 | Zone
    8 | Danger (enemy can attack)
     */
    public static void writeReportEnemy(MapLocation loc, boolean hasDanger) throws GameActionException {
//////         log("Writing 'Report Enemy' " + loc + " " + hasDanger);

        int zx = loc.x / ZONE_SIZE;
        int zy = loc.y / ZONE_SIZE;

        // skip if not enough turns
        if (zoneDangerLastRound[zx][zy] != 0 && roundNum - zoneDangerLastRound[zx][zy] < REPORT_ENEMY_REPEAT_WAIT) {
//////             tlog("[SKIPPING]");
            return;
        }

        int msg = zone2bits(zx, zy);
        if (hasDanger) {
            msg += BIT8;
        }

        writeToEmptyCell(msg, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE);
    }

    public static void readReportEnemy(int msgInfo) throws GameActionException {
        int[] zone = bits2zone(msgInfo & ZONE_POS_MASK);
//        int dangerBit = ;
//////         log("Reading 'Report Enemy' " + zone[0] + " " + zone[1]);

        // danger bit
        boolean hasDanger = ((msgInfo >> 8) & 1) == 1;
        if (hasDanger) {
            zoneDangerLastRound[zone[0]][zone[1]] = roundNum;
        }

        if (addToReportedEnemyLocs) {
            MapLocation loc = zone2Loc(zone[0], zone[1]);
            reportedEnemyLocs[reportedEnemyCount] = loc;
            if (hasDanger) {
                isReportedEnemyLocDanger[reportedEnemyCount] = true;
            }
            reportedEnemyCount++;
        }
    }

    public static MapLocation[] reportedEnemyLocs;
    public static boolean[] isReportedEnemyLocDanger;
    public static int reportedEnemyCount;
    public static boolean addToReportedEnemyLocs;

    public static void readReportEnemySection(boolean addToList) throws GameActionException {
        int a = Clock.getBytecodesLeft();
        addToReportedEnemyLocs = addToList;
        if (addToReportedEnemyLocs) {
            reportedEnemyLocs = new MapLocation[REPORT_ENEMY_SECTION_SIZE];
            isReportedEnemyLocDanger = new boolean[REPORT_ENEMY_SECTION_SIZE];
            reportedEnemyCount = 0;

            readMessageSection(REPORT_ENEMY_SECTION_ID, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE);
        } else {
            readMessageSection(REPORT_ENEMY_SECTION_ID, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE);
        }




        int b = Clock.getBytecodesLeft();
//////         log("bytecode 'en' " + (a - b) + " " + reportedEnemyCount);
    }

    public static MapLocation commonExploreLoc = new MapLocation(0, 0);
    public static int commonExploreDist = P_INF;

    public static void writeCommonExplore(int index, MapLocation loc) throws GameActionException {
//////         log("Writing 'Common Explore' " + loc);

        int msg = loc2bits(loc);

        writeCell(msg, COMMON_EXPLORE_SECTION_OFFSET + index);
    }


    public static void readCommonExplore(int msgInfo) throws GameActionException {
        MapLocation loc = bits2loc(msgInfo & LOC_MASK);
//////         log("Reading 'Common Explore' " + loc);

        int dist = here.distanceSquaredTo(loc);
        if (dist < commonExploreDist) {
            commonExploreLoc = loc;
            commonExploreDist = dist;
        }
    }

    public static void writeCommonExploreSection() throws GameActionException {
        for (int i = COMMON_EXPLORE_SECTION_SIZE; --i >= 0;) {
            MapLocation loc = getRandomLoc();
            int count = 0;
            while (loc.isWithinDistanceSquared(getClosestAllyArchon(loc), 64)) {
                loc = getRandomLoc();
                count++;
                if (count >= 3) { // try at most 3 times
                    break;
                }
            }
            writeCommonExplore(i, loc);
        }
    }

    public static void readCommonExploreSection() throws GameActionException {
        commonExploreLoc = null;
        commonExploreDist = P_INF;
//////         log("Reading common explore section");

        readMessageSection(COMMON_EXPLORE_SECTION_ID, COMMON_EXPLORE_SECTION_OFFSET, COMMON_EXPLORE_SECTION_SIZE);
    }

    public static void readAllyUnitCount(int msgInfo, int msgIndex) throws GameActionException {
        allyUnitCounts[msgIndex] = msgInfo;
    }


    public static void writeAllyUnitCount(RobotType rt) throws GameActionException {
        int index = getUnitCountIndex(rt);
        if (index < 0) {
            return;
        }
        int newCount = 1 + readCell(ALLY_UNIT_COUNT_SECTION_OFFSET + index);

//////         log("Writing 'Ally Unit' " + newCount);
        writeCell(newCount, ALLY_UNIT_COUNT_SECTION_OFFSET + index);
    }

    public static void readAllyUnitCountSections() throws GameActionException {
        readMessageSection(ALLY_UNIT_COUNT_SECTION_ID, ALLY_UNIT_COUNT_SECTION_OFFSET, ALLY_UNIT_COUNT_SECTION_SIZE);
    }

    public static RobotType[] unitCountIndex2Type = new RobotType[] {SOLDIER, BUILDER, MINER, WATCHTOWER, LABORATORY};
    public static int getUnitCountIndex(RobotType rt) {
        switch (rt) {
            case SOLDIER:
                return 0;
            case BUILDER:
                return 1;
            case MINER:
                return 2;
            case WATCHTOWER:
                return 3;
            case LABORATORY:
                return 4;
            default:
                // special, don't warn
//                logi("WARNING: unknown unit");
        }
        return -1;
    }
}
