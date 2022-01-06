package micro_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static micro_bot.Debug.*;
import static micro_bot.Robot.*;
import static micro_bot.Utils.*;


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
        return ((loc.y & COORD_MASK) << COORD_BITS) + (loc.x & COORD_MASK);
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
        int bef = Clock.getBytecodesLeft();
        for (int i = COMM_ARRAY_SIZE; --i >= 0;) {
            commArray[i] = rc.readSharedArray(i);
        }
        int aft = Clock.getBytecodesLeft();
    }

    final public static int MASK1 = 1;
    final public static int MASK2 = 3;
    final public static int MASK3 = 7;
    final public static int MASK4 = 15;
    final public static int MASK5 = 31;
    final public static int MASK6 = 63;
    final public static int MASK7 = 127;
    final public static int MASK8 = 255;

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

    final public static int REPORT_ENEMY_SECTION_ID = 4;
    final public static int REPORT_ENEMY_SECTION_OFFSET = REPORT_RESOURCE_SECTION_OFFSET + REPORT_RESOURCE_SECTION_SIZE;
    final public static int REPORT_ENEMY_SECTION_SIZE = 16;

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
        int sectionEnd = sectionOffset + sectionSize;
        for (int i = sectionOffset; i < sectionEnd; i++) {
            if (readCell(i) < 0) { // write into empty location
                return i;
            }
        }
        return -1;
    }

    public static int findEmptyCellWithoutDups(int data, int sectionOffset, int sectionSize) throws GameActionException {
        int sectionEnd = sectionOffset + sectionSize;
        for (int i = sectionOffset; i < sectionEnd; i++) {
            if (readCell(i) < 0) { // write into empty location
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
        data += 1 << 15; // used bit

        commArray[cellIndex] = data;
        rc.writeSharedArray(cellIndex, data);
    }

    /*
    Returns message from cell
     */
    public static int readCell(int cellIndex) throws GameActionException {
        return commArray[cellIndex] - (1 << 15);
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
                // todo
                break;
            case REPORT_ENEMY_SECTION_ID:
                readReportEnemy(msgInfo);
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
     */
    public static void writeAllyArchon(MapLocation loc, int archonIndex, boolean live) throws GameActionException {
        log("Writing 'Ally Archon' message " + loc + " " + archonIndex + " " + live);

        int msg = loc2bits(loc);
        if (roundNum % 2 == 1) {
            msg += 1 << 12; // initial turn parity (should be odd)
        }
        if (live) {
            msg += 1 << 13; // live
        }

        writeCell(msg, ALLY_ARCHON_SECTION_OFFSET + archonIndex);
    }

    public static void readAllyArchon(int msgInfo, int archonIndex) throws GameActionException {
        // location
        allyArchonLocs[archonIndex] = bits2loc(msgInfo & LOC_MASK);

        // live
        int liveBit = (msgInfo >> 13) & 1;
        isAllyArchonLive[archonIndex] = (liveBit == 1);

        // turn parity
        if (isAllyArchonLive[archonIndex] && myType == ARCHON) {
            int tpBit = (msgInfo >> 12) & 1;
            // if tp is off, then bot is dead
            if (tpBit % 2 != roundNum % 2) {
                // signal dead
                writeAllyArchon(allyArchonLocs[archonIndex], archonIndex, false);
            }
        }
    }

    public static void readAllyArchonSection() throws GameActionException {
        readMessageSection(ALLY_ARCHON_SECTION_ID, ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE);
    }

    public static void writeReportEnemy(MapLocation loc, RobotType rt) throws GameActionException {
        log("Writing 'Report Enemy' message " + loc + " " + rt);

        int msg = loc2bits(loc);
        msg += rt2int(rt) << 12;

        writeToEmptyCell(msg, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE);
    }

    public static void readReportEnemy(int msgInfo) throws GameActionException {
        MapLocation loc = bits2loc(msgInfo & LOC_MASK);
        RobotType rt = int2rt((msgInfo >> 12) & MASK3);

        reportedEnemyLocs[reportedEnemyCount++] = loc;
        log("Reported enemy at " + loc + " " + rt);
    }

    public static MapLocation[] reportedEnemyLocs;
    public static int reportedEnemyCount;
    public static void readReportEnemySection() throws GameActionException {
        reportedEnemyLocs = new MapLocation[REPORT_ENEMY_SECTION_SIZE];
        reportedEnemyCount = 0;

        readMessageSection(REPORT_ENEMY_SECTION_ID, REPORT_ENEMY_SECTION_OFFSET, REPORT_ENEMY_SECTION_SIZE);
    }
}
