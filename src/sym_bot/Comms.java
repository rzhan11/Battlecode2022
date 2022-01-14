package sym_bot;

import battlecode.common.*;

import static sym_bot.Debug.*;
import static sym_bot.Robot.*;


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

    final public static int SYM_INFO_SECTION_ID = 3;
    final public static int SYM_INFO_SECTION_OFFSET = ALLY_ARCHON_SECTION_OFFSET + ALLY_ARCHON_SECTION_SIZE;
    final public static int SYM_INFO_SECTION_SIZE = 3;

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
                // todo: add message type to this switch

                default:
                    logi("ERROR: Unknown sectionID " + sectionID);
                    break;
            }
        }
    }

    /*
    All message section that need to be periodically cleared should be put here
     */
    public static void clearMessageBoard() throws GameActionException {
        int[][] sectionInfo = new int[][]{

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

        writeCell(msg, ALLY_ARCHON_SECTION_OFFSET + archonIndex);
    }

    public static void readAllyArchon(int msgInfo, int archonIndex) throws GameActionException {
        log("Reading 'Ally Archon' " + msgInfo + " " + archonIndex);

        // location
        allyArchonLocs[archonIndex] = bits2loc(msgInfo & LOC_MASK);

        // live
        int liveBit = (msgInfo >> 13) & 1;
        isAllyArchonLive[archonIndex] = (liveBit == 1);

    }

    public static void readAllyArchonSection() throws GameActionException {
        readMessageSection(ALLY_ARCHON_SECTION_ID, ALLY_ARCHON_SECTION_OFFSET, ALLY_ARCHON_SECTION_SIZE, false);
    }

    // todo:
    /*
    This section has size 3.
    Message 1 = horizontal sym
    Message 2 = vertical sym
    Message 3 = rotational sym
    --
    Inside one message, should contain info about:
        Symmetry is not possible
        Must be this symmetry
        Whether HQ 1/2/3/4's symmetric location has been explored, has a enemy hq or not
     */
    public static void writeSymInfo(Symmetry sym) {
    }

    public static void readSymInfo(int msgInfo, int msgIndex) {

    }

    public static void readSymInfoSection() throws GameActionException {
        readMessageSection(SYM_INFO_SECTION_ID, SYM_INFO_SECTION_OFFSET, SYM_INFO_SECTION_SIZE, false);
    }
}
