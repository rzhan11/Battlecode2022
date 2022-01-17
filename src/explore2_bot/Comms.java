package explore2_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static explore2_bot.Debug.*;
import static explore2_bot.Zone.*;
import static explore2_bot.Robot.*;
import static explore2_bot.Utils.*;


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
//    public static int[] commArray = new int[COMM_ARRAY_SIZE];


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

    final public static int SPAWN_COUNT_SECTION_ID = 1;
    final public static int SPAWN_COUNT_SECTION_OFFSET = ALLY_ARCHON_SECTION_OFFSET + ALLY_ARCHON_SECTION_SIZE;
    final public static int SPAWN_COUNT_SECTION_SIZE = 1;

    final public static int SPAWN_COMMAND_SECTION_ID = 2;
    final public static int SPAWN_COMMAND_SECTION_OFFSET = SPAWN_COUNT_SECTION_OFFSET + SPAWN_COUNT_SECTION_SIZE;
    final public static int SPAWN_COMMAND_SECTION_SIZE = 4;

    final public static int ENEMY_ARCHON_SECTION_ID = 3;
    final public static int ENEMY_ARCHON_SECTION_OFFSET = SPAWN_COMMAND_SECTION_OFFSET + SPAWN_COMMAND_SECTION_SIZE;
    final public static int ENEMY_ARCHON_SECTION_SIZE = 4;

    final public static int ARCHON_MOVE_SECTION_ID = 4;
    final public static int ARCHON_MOVE_SECTION_OFFSET = ENEMY_ARCHON_SECTION_OFFSET + ENEMY_ARCHON_SECTION_SIZE;
    final public static int ARCHON_MOVE_SECTION_SIZE = 1;

    final public static int FLAG_SECTION_ID = 5;
    final public static int FLAG_SECTION_OFFSET = ARCHON_MOVE_SECTION_OFFSET + ARCHON_MOVE_SECTION_SIZE;
    final public static int FLAG_SECTION_SIZE = 1;

    final public static int REPORT_RESOURCE_SECTION_ID = 6;
    final public static int REPORT_RESOURCE_SECTION_OFFSET = FLAG_SECTION_OFFSET + FLAG_SECTION_SIZE;
    final public static int REPORT_RESOURCE_SECTION_SIZE = 16;

    final public static int BROADCAST_RESOURCE_SECTION_ID = 7;
    final public static int BROADCAST_RESOURCE_SECTION_OFFSET = REPORT_RESOURCE_SECTION_OFFSET + REPORT_RESOURCE_SECTION_SIZE;
    final public static int BROADCAST_RESOURCE_SECTION_SIZE = 4;

    final public static int REPORT_ENEMY_SECTION_ID = 8;
    final public static int REPORT_ENEMY_SECTION_OFFSET = BROADCAST_RESOURCE_SECTION_OFFSET + BROADCAST_RESOURCE_SECTION_SIZE;
    final public static int REPORT_ENEMY_SECTION_SIZE = 8;

    final public static int COMMON_EXPLORE_SECTION_ID = 9;
    final public static int COMMON_EXPLORE_SECTION_OFFSET = REPORT_ENEMY_SECTION_OFFSET + REPORT_ENEMY_SECTION_SIZE;
    final public static int COMMON_EXPLORE_SECTION_SIZE = 4;

    final public static int ALLY_UNIT_COUNT_SECTION_ID = 10;
    final public static int ALLY_UNIT_COUNT_SECTION_OFFSET = COMMON_EXPLORE_SECTION_OFFSET + COMMON_EXPLORE_SECTION_SIZE;
    final public static int ALLY_UNIT_COUNT_SECTION_SIZE = 5;

    final public static int MINE_HELP_SECTION_ID = 11;
    final public static int MINE_HELP_SECTION_OFFSET = ALLY_UNIT_COUNT_SECTION_OFFSET + ALLY_UNIT_COUNT_SECTION_SIZE;
    final public static int MINE_HELP_SECTION_SIZE = 5;

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
            tlog("Write fail " + sectionOffset + " " +sectionSize);
        }

        return cellIndex;
    }

    public static int findEmptyCell(int sectionOffset, int sectionSize) throws GameActionException {
        for (int i = sectionOffset + sectionSize; --i >= sectionOffset;) {
            if (rc.readSharedArray(i) == 0) { // write into empty location
                return i;
            }
        }
        return -1;
    }

    public static int findEmptyCellWithoutDups(int data, int sectionOffset, int sectionSize) throws GameActionException {
        for (int i = sectionOffset + sectionSize; --i >= sectionOffset;) {
            if (rc.readSharedArray(i) == 0) { // write into empty location
                return i;
            }

            if (readCell(i) == data) {
                tlog("Dup found at " + i);
                return -1;
            }
        }
        return -1;
    }

    /*
    Writes message to cell
     */
    public static void writeCell(int data, int cellIndex) throws GameActionException {
        tlog("Write success " + cellIndex + " " + data);
        data += BIT15; // used bit

//        commArray[cellIndex] = data;
        rc.writeSharedArray(cellIndex, data);
    }

    /*
    Returns message from cell
     */
    public static int readCell(int cellIndex) throws GameActionException {
        return rc.readSharedArray(cellIndex) & MASK15;
    }

    public static void readMessageSection(int sectionID, int sectionOffset, int sectionSize, boolean skipEmpty) throws GameActionException {
        int cellIndex = sectionOffset + sectionSize;
        for (int msgIndex = sectionSize; --msgIndex >= 0;) {
            cellIndex--;
            // readMessage() below: NOTE: CHANGES TO RETURN/BREAK/CONTINUE
            int msgInfo = rc.readSharedArray(cellIndex); // relative index within a section
            if (msgInfo == 0) { // empty message
                if (skipEmpty) { // CHANGED
                    log("[SKIP] " + msgIndex + " " + cellIndex);
                    break;
                } else {
                    continue;
                }
            }
            // remove 'used' bit
            msgInfo -= BIT15;

            switch (sectionID) {
                case ALLY_ARCHON_SECTION_ID:
                    readAllyArchon(msgInfo, msgIndex);
                    break;
                case SPAWN_COUNT_SECTION_ID:
                    readSpawnCount(msgInfo);
                    break;
                case SPAWN_COMMAND_SECTION_ID:
                    readSpawnCommand(msgInfo, msgIndex);
                    break;
                case ENEMY_ARCHON_SECTION_ID:
                    // todo
                    break;
                case ARCHON_MOVE_SECTION_ID:
                    readArchonMove(msgInfo);
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
                case MINE_HELP_SECTION_ID:
                    readMineHelp(msgInfo);
                    break;


                default:
                    logi("ERROR: Unknown sectionID " + sectionID);
                    break;
            }
        }
    }

    /*
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
            case SPAWN_COUNT_SECTION_ID:
                readSpawnCount(msgInfo);
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
     */

    /*
    All message section that need to be periodically cleared should be put here
     */
    public static void clearMessageBoard() throws GameActionException {
        int[][] sectionInfo = new int[][]{
                {REPORT_RESOURCE_SECTION_OFFSET, REPORT_RESOURCE_SECTION_SIZE},
                {REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE},
                {ALLY_UNIT_COUNT_SECTION_OFFSET, ALLY_UNIT_COUNT_SECTION_SIZE},
                {MINE_HELP_SECTION_OFFSET, MINE_HELP_SECTION_SIZE},
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
//            commArray[i] = 0;
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
        log("Writing 'Ally Archon' " + loc + " " + archonIndex + " " + live);

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
//        log("Reading 'Ally Archon' " + msgInfo + " " + archonIndex);

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
            if (archonIndex > Archon.myArchonIndex) { // only check archons who go before it
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
        readMessageSection(ALLY_ARCHON_SECTION_ID, ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE, false);
    }

    /*
    0-1 | Spawn counter % number of archons
     */
    public static int teamSpawnCount;

    public static void writeSpawnCount(int count) throws GameActionException {
//        log("Writing 'Spawn Count' " + count);

        int msg = count;

        writeCell(msg, SPAWN_COUNT_SECTION_OFFSET);
    }

    public static void readSpawnCount(int msgInfo) throws GameActionException {
//        log("Reading 'Spawn Count' " + msgInfo);
        teamSpawnCount = msgInfo % rc.getArchonCount();
    }

    public static void readSpawnCountSection() throws GameActionException {
        readMessageSection(SPAWN_COUNT_SECTION_ID, SPAWN_COUNT_SECTION_OFFSET, SPAWN_COUNT_SECTION_SIZE, false);
    }

    public static int storedSpawnCommand = -1;

    public static void sendStoredSpawnCommand() throws GameActionException {
        if (storedSpawnCommand != -1) {
            writeCell(storedSpawnCommand, SPAWN_COMMAND_SECTION_OFFSET + Archon.myArchonIndex);
            storedSpawnCommand = -1;
        } else {
            rc.writeSharedArray(SPAWN_COMMAND_SECTION_OFFSET + Archon.myArchonIndex, 0);
        }
    }

    /*
    0-2 | dir
    3-14 | command
     */
    public static void writeSpawnCommand(Direction dir, int command) throws GameActionException {
        log("Writing 'Spawn Command' " + dir + " " + command);

        int msg = (command << 3) + Map.dir2int(dir);

        storedSpawnCommand = msg;
    }

    public static void readSpawnCommand(int msgInfo, int msgIndex) throws GameActionException {
//        log("Reading 'Spawn Command' " + msgInfo + " " + msgIndex);

        // dir
        Direction dir = DIRS[msgInfo & MASK3];
        MapLocation loc = allyArchonLocs[msgIndex].add(dir);
        if (here.equals(loc)) {
            int command = msgInfo >>> 3;
//            tlog("[ME] " + command);
            switch(myType) {
                case MINER:
                    readMinerSpawnCommand(msgInfo >>> 3);
                    break;
            }
        }
    }

    public static void readSpawnCommandSection() throws GameActionException {
        readMessageSection(SPAWN_COMMAND_SECTION_ID, SPAWN_COMMAND_SECTION_OFFSET, SPAWN_COMMAND_SECTION_SIZE, false);
    }


    public static void writeMinerSpawnCommand(Direction buildDir) throws GameActionException {
        MapLocation loc = Explore.getInitialExploreLoc();
        int msg = loc2bits(loc);

        writeSpawnCommand(buildDir, msg);
    }

    public static void readMinerSpawnCommand(int msg) throws GameActionException {
        MapLocation loc = bits2loc(msg & LOC_MASK);
        tlog("Reading 'Miner Spawn Command' " + loc);

        Explore.initExploreLoc = loc;
    }

    final public static int ARCHON_MOVE_DELAY = 30;
    public static int allyArchonMoveIndex = -1;

    public static void writeArchonMove(int archonIndex) throws GameActionException {
        log("Writing 'Archon Move' " + archonIndex + " " + roundNum);

        int msg = (roundNum << 2) + archonIndex;
        writeCell(msg, ARCHON_MOVE_SECTION_OFFSET);
    }

    public static void readArchonMove(int msgInfo) throws GameActionException {
        int archonIndex = msgInfo & MASK2;
        int lastMoveRound = msgInfo >>> 2;
        log("Reading 'Archon Move' " + archonIndex + " " + lastMoveRound);
        tlog(lastMoveRound + " " + ARCHON_MOVE_DELAY + " " + isAllyArchonLive[archonIndex]);
        if (roundNum - lastMoveRound <= ARCHON_MOVE_DELAY) {
            if(isAllyArchonLive[archonIndex]) {
                allyArchonMoveIndex = archonIndex;
            }
        }
    }

    public static void readArchonMoveSection() throws GameActionException {
        allyArchonMoveIndex = -1;
        readMessageSection(ARCHON_MOVE_SECTION_ID, ARCHON_MOVE_SECTION_OFFSET, ARCHON_MOVE_SECTION_SIZE, false);
    }


    /*
    0-7 | Zone
    8-9 | Status
     */
    public static void writeReportResource(int zx, int zy, int status) throws GameActionException {
        log("Writing 'Report Resource' " + zx + " " + zy + " s:" + status);

        int msg = zone2bits(zx, zy);
        msg += status << 8;

        writeToEmptyCell(msg, REPORT_RESOURCE_SECTION_OFFSET, REPORT_RESOURCE_SECTION_SIZE);
    }

    public static void readReportResource(int msgInfo) throws GameActionException {
        int[] zone = bits2zone(msgInfo & ZONE_POS_MASK);
        int status = msgInfo >>> 8;
//        log("Reading 'Report Resource' " + zone[0] + " " + zone[1] + " s:" + status);

        if (myType == ARCHON) {
            Zone.updateResourceZoneCount(zoneResourceStatus[zone[0]][zone[1]], status, zone[0], zone[1]);
        }
        zoneResourceStatus[zone[0]][zone[1]] = status;
    }

    public static void readReportResourceSection() throws GameActionException {
        startBytecode("readReportResourceSection");
        readMessageSection(REPORT_RESOURCE_SECTION_ID, REPORT_RESOURCE_SECTION_OFFSET, REPORT_RESOURCE_SECTION_SIZE, true);
        stopBytecode("readReportResourceSection");
    }

    // IMPORTANT: max cell density should be 7
    final public static int BROADCAST_RESOURCE_CELL_DENSITY = 7; // number of messages per cell
    final public static int BROADCAST_RESOURCE_SHIFT = 2; // number of messages per cell
    final public static int BROADCAST_RESOURCE_MASK = MASK2; // number of messages per cell
    final public static int BROADCAST_RESOURCE_MSG_PER_ROUND = BROADCAST_RESOURCE_SECTION_SIZE * BROADCAST_RESOURCE_CELL_DENSITY;

    /*
    0-13 | Zone
     */
    public static void writeBroadcastResource(int index) throws GameActionException {
        // insert in reverse order
        int zoneIndex = (getBroadcastZoneIndex(index) + BROADCAST_RESOURCE_CELL_DENSITY) % ZONE_TOTAL_NUM; // start at end
        int zx = zoneIndex / ZONE_YNUM;
        int zy = zoneIndex % ZONE_YNUM;
        log("Writing 'Broadcast Resource' " + index);
        tlog("zoneIndex " + zoneIndex + " " + zx + " " + zy);
        int[] zoneRow = zoneResourceStatus[zx];

        int msg = 0;

        for (int i = BROADCAST_RESOURCE_CELL_DENSITY; --i >= 0;) {
            zy--;
            if (zy == -1) {
                zy += ZONE_YNUM; // should be ZONE_YNUM - 1
                zx--;
                if (zx == -1) {
                    zx += ZONE_XNUM; // should be ZONE_XNUM - 1
                }
                zoneRow = zoneResourceStatus[zx];
            }

            msg = (msg + zoneRow[zy]) << BROADCAST_RESOURCE_SHIFT;


            // draw resource zone
            {
                MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
                int[] color = PINK;
                switch (zoneResourceStatus[zx][zy]) {
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
                        logi("WARNING: 'displayZoneStatus' Unknown zone status! " + zoneResourceStatus[zx][zy]);
                }
                Debug.drawDot(loc, color);

            }

            // draw danger zone
//            {
//                MapLocation loc = new MapLocation(zx * ZONE_SIZE + 1, zy * ZONE_SIZE + 1);
//                int[] color;
//                if (zoneDangerLastRound[zx][zy] == 0) {
//                    color = GRAY;
//                } else if (roundNum - zoneDangerLastRound[zx][zy] <= Miner.ZONE_DANGER_WAIT) {
//                    color = PINK;
//                } else {
//                    color = YELLOW;
//                }
//                Debug.drawDot(loc, color);
//            }
        }
        msg = msg >> BROADCAST_RESOURCE_SHIFT;

        writeCell(msg, BROADCAST_RESOURCE_SECTION_OFFSET + index);
    }

    public static void readBroadcastResource(int msgInfo, int msgIndex) throws GameActionException {
        int zoneIndex = getBroadcastZoneIndex(msgIndex);
        int zx = zoneIndex / ZONE_YNUM;
        int zy = zoneIndex % ZONE_YNUM;
//        log("Reading 'Broadcast Resource' " + msgInfo + " " + msgIndex);
//        tlog("zoneIndex " + zoneIndex + " " + zx + " " + zy);

        int[] zoneRow = zoneResourceStatus[zx];

        for (int i = BROADCAST_RESOURCE_CELL_DENSITY; --i >= 0;) {
            if (myType == ARCHON) {
                int status = msgInfo & BROADCAST_RESOURCE_MASK;
                // update based on old vs new
                Zone.updateResourceZoneCount(zoneRow[zy], status, zx, zy);
            }
            zoneRow[zy] = msgInfo & BROADCAST_RESOURCE_MASK;

            msgInfo = msgInfo >> BROADCAST_RESOURCE_SHIFT;

            zy++;
            if (zy == ZONE_YNUM) {
                zy = 0;
                zx++;
                if (zx == ZONE_XNUM) {
                    zx = 0;
                }
                zoneRow = zoneResourceStatus[zx];
            }
        }
        //
    }

    public static void broadcastResources() throws GameActionException {
        startBytecode("broadcastResources");
        for (int i = Comms.BROADCAST_RESOURCE_SECTION_SIZE; --i >= 0;) {
            Comms.writeBroadcastResource(i);
        }
        stopBytecode("broadcastResources");
    }

    public static void readBroadcastResourceSection() throws GameActionException {
        if (Archon.isPrimaryArchon()) {
            return;
        }
        startBytecode("readBroadcastResourceSection");
        readMessageSection(BROADCAST_RESOURCE_SECTION_ID, BROADCAST_RESOURCE_SECTION_OFFSET, BROADCAST_RESOURCE_SECTION_SIZE, false);
        stopBytecode("readBroadcastResourceSection");
    }

    /*
    Returns broadcast zone based on msgIndex and roundNum
    msgIndex is the relative index
     */
    public static int getBroadcastZoneIndex(int msgIndex) {
        // based on curRoundNum
        int startIndex = roundNum * BROADCAST_RESOURCE_MSG_PER_ROUND;
        return (startIndex + msgIndex * BROADCAST_RESOURCE_CELL_DENSITY) % ZONE_TOTAL_NUM;
    }

    final public static int REPORT_ENEMY_REPEAT_WAIT = 4;

    /*
    0-7 | Zone
    8 | Danger (enemy can attack)
     */
    public static void writeReportEnemy(MapLocation loc, boolean hasDanger) throws GameActionException {
        log("Writing 'Report Enemy' " + loc + " " + hasDanger);

        int zx = loc.x / ZONE_SIZE;
        int zy = loc.y / ZONE_SIZE;

        // skip if not enough turns
        if (zoneDangerLastRound[zx][zy] != 0 && roundNum - zoneDangerLastRound[zx][zy] < REPORT_ENEMY_REPEAT_WAIT) {
            tlog("[SKIPPING]");
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
//        log("Reading 'Report Enemy' " + zone[0] + " " + zone[1]);

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
        startBytecode("readReportEnemySection");
        addToReportedEnemyLocs = addToList;
        if (addToReportedEnemyLocs) {
            if (reportedEnemyLocs == null) { // init
                reportedEnemyLocs = new MapLocation[REPORT_ENEMY_SECTION_SIZE];
                isReportedEnemyLocDanger = new boolean[REPORT_ENEMY_SECTION_SIZE];
            }
            reportedEnemyCount = 0;

            readMessageSection(REPORT_ENEMY_SECTION_ID, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE, true);
        } else {
            readMessageSection(REPORT_ENEMY_SECTION_ID, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE, true);
        }



        stopBytecode("readReportEnemySection");
    }


    public static MapLocation commonExploreLoc;
    public static int commonExploreDist = P_INF;

    public static int COMMON_EXPLORE_UPDATE_FREQ = 10;

    /*
    0-7 | Zone
    8 | Empty (0 means exists, 1 means empty)
     */
    public static void writeCommonExplore(int msgIndex, int zoneIndex) throws GameActionException {
        int msg;
        if (zoneIndex != -1) { // still have zones
            int zx = zoneIndex / ZONE_YNUM;
            int zy = zoneIndex % ZONE_YNUM;
            log("Writing 'Common Explore' " + msgIndex + " " + zoneIndex + " " + zx + " " + zy);

            msg = zone2bits(zx, zy);
        } else {
            log("Writing 'Common Explore' " + msgIndex + " -1");
            msg = BIT8; // signal empty bit
        }

        writeCell(msg, COMMON_EXPLORE_SECTION_OFFSET + msgIndex);
    }


    public static void readCommonExplore(int msgInfo) throws GameActionException {
        // check empty
        int emptyBit = (msgInfo & BIT8) >>> 8;
        if (emptyBit == 1) { // is empty
            log("Reading 'Common Explore' empty");
            return;
        }

        int[] zone = bits2zone(msgInfo & ZONE_POS_MASK);
        MapLocation loc = zone2Loc(zone[0], zone[1]);
        log("Reading 'Common Explore' " + zone[0] + " " + zone[1]);

        int dist = here.distanceSquaredTo(loc);
        if (dist < commonExploreDist) {
            commonExploreLoc = loc;
            commonExploreDist = dist;
        }
    }

    public static void writeCommonExploreSection() throws GameActionException {
        int[] indexInfo = new int[] {0, -1}; // [zoneIndex, strIndex]
        for (int i = COMMON_EXPLORE_SECTION_SIZE; --i >= 0;) {
            if (indexInfo[0] >= 0) { // if previous was valid
                indexInfo = ZoneString.findUnexplored(indexInfo[1] + 1);
                if (indexInfo[1] >= 0) { // good
                    writeCommonExplore(i, indexInfo[0]);
                } else { // bad
                    writeCommonExplore(i, -1);
                }
            } else { // bad
                writeCommonExplore(i, -1);
            }
        }
    }

    public static void readCommonExploreSection() throws GameActionException {
        startBytecode("readCommonExploreSection");
        commonExploreLoc = null;
        commonExploreDist = P_INF;
        log("Reading common explore section");

        readMessageSection(COMMON_EXPLORE_SECTION_ID, COMMON_EXPLORE_SECTION_OFFSET, COMMON_EXPLORE_SECTION_SIZE, false);
        stopBytecode("readCommonExploreSection");
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

        log("Writing 'Ally Unit' " + newCount);
        writeCell(newCount, ALLY_UNIT_COUNT_SECTION_OFFSET + index);
    }

    public static void readAllyUnitCountSections() throws GameActionException {
        readMessageSection(ALLY_UNIT_COUNT_SECTION_ID, ALLY_UNIT_COUNT_SECTION_OFFSET, ALLY_UNIT_COUNT_SECTION_SIZE, false);
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

    final public static int MINE_HELP_UPDATE_FREQ = 5;
    public static int lastWriteMineHelpRound = -(MINE_HELP_UPDATE_FREQ + 10);

    public static void writeMineHelp(MapLocation loc) throws GameActionException {
        if (roundNum - lastWriteMineHelpRound < MINE_HELP_UPDATE_FREQ) {
            log("[WRITE-SKIP]");
            return;
        }

        lastWriteMineHelpRound = roundNum;

        int[] zone = loc2Zone(loc);
        int msg = zone2bits(zone[0], zone[1]);
        log("Writing 'Mine Help' " + loc + " " + zone[0] + " " + zone[1]);

        writeToEmptyCell(msg, MINE_HELP_SECTION_OFFSET, MINE_HELP_SECTION_SIZE);
    }

    final public static int MINE_HELP_DURATION = 10;
    final public static int MINE_HELP_CACHE_SIZE = 10;
    final public static int MINE_HELP_RANGE = 225;

    public static MapLocation[] mineHelpCacheLoc = new MapLocation[MINE_HELP_CACHE_SIZE];
    public static int mineHelpCacheIndex;
    public static int mineHelpCacheLen;

    public static void readMineHelp(int msgInfo) {
        int[] zone = bits2zone(msgInfo);
        MapLocation loc = zone2Loc(zone[0], zone[1]);
        log("Reading 'Mine Help' " + loc + " " + zone[0] + " " + zone[1]);

        // check if exists already
        boolean exists = false;
        {
            int index = mineHelpCacheIndex;
            for (int i = mineHelpCacheLen; --i >= 0;) {
                if (loc.equals(mineHelpCacheLoc[i])) {
                    exists = true;
                    break;
                }

                index++;
                if (index == MINE_HELP_CACHE_SIZE) {
                    index = 0;
                }
            }
        }

        // add to queue if close enough
        if (!exists && here.isWithinDistanceSquared(loc, MINE_HELP_RANGE)) {
            if (mineHelpCacheLen < MINE_HELP_CACHE_SIZE) {
                // if closer than front, swap with front
                if (mineHelpCacheLen > 0) {
                    int oldDist = here.distanceSquaredTo(mineHelpCacheLoc[mineHelpCacheIndex]);
                    int newDist = here.distanceSquaredTo(loc);
                    if (Math.sqrt(newDist) < Math.sqrt(oldDist) - 5) { // closer by 5
                        MapLocation temp = loc;
                        loc = mineHelpCacheLoc[mineHelpCacheIndex];
                        mineHelpCacheLoc[mineHelpCacheIndex] = temp;
                    }
                }

                mineHelpCacheLoc[(mineHelpCacheIndex + mineHelpCacheLen) % MINE_HELP_CACHE_SIZE] = loc;
                mineHelpCacheLen++;
            }
        }
    }

    public static void readMineHelpSection() throws GameActionException {
        startBytecode("readMineHelpSection");
        readMessageSection(MINE_HELP_SECTION_ID, MINE_HELP_SECTION_OFFSET, MINE_HELP_SECTION_SIZE, false);
        stopBytecode("readMineHelpSection");
    }
}
