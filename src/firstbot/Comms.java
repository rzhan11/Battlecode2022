package firstbot;

import battlecode.common.*;

import static firstbot.Debug.*;
import static firstbot.Robot.*;


public class Comms {

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
    Our COMMS array is divided into a NEWS section and MESSAGE section.

    NEWS section has preset types of news at locations.
        - news can be updated each turn

    MESSAGE section can contain many types of messages
        - contains many types of messages
        - messages contain a header (indicating type of message) and content section (indicating details about message)
            - example: A message header could indicate "FOUND_ENEMY" and the message content section contains 12 bits representing MapLocation of enemy
        - dynamic message size is 18 bits
            - message header size will be 6 bits (for 64 message types)
            - message content size will be 12 bits (to fit a MapLocation)

    IMPORTANT:
        - messages can only be sent on odd turns (allowing all units to read them on even turns)
        - archons will clear message board at the start of odd turns

    Potential todos:
        - create MessageQueue for units, to hold messages
        - priority messages (and a way to recover/resend overwritten messages)
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

    Dynamic section:
        - remaining 55 x 16 = 880 bits
        - 880 / 18 = 48 dynamic messages
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

    final public static int CELL_FULL_MASK = (1 << 16) - 1;
    final public static int CELL_RIGHT_MASK = (1 << 8) - 1;
    final public static int CELL_LEFT_MASK = CELL_RIGHT_MASK << 8;

    /*
    Requires startBit % 8 == 0
     */
    public static int read24BitsFromIndex(int startBit) {
        int leftCellIndex = startBit / COMM_CELL_BITS;

        if (startBit % 16 == 0) { // left full + right half
            return commArray[leftCellIndex] + ((commArray[leftCellIndex + 1] & CELL_RIGHT_MASK) << 16);
        } else { // left half + right full
            return ((commArray[leftCellIndex] & CELL_LEFT_MASK) >>> 8) + (commArray[leftCellIndex + 1] << 8);
        }
    }

    public static void write24BitsToIndex(int data, int startBit) throws GameActionException {
        int leftCellIndex = startBit / COMM_CELL_BITS;
        int rightCellIndex = leftCellIndex + 1;
        if (startBit % 16 == 0) { // left full + right half
            int leftData = data & CELL_FULL_MASK;
            int rightData = data >>> 16;
            commArray[leftCellIndex] = leftData;
            commArray[rightCellIndex] = setBits(commArray[rightCellIndex], rightData, 0, 8);
        } else { // left half + right full
            int leftData = data & CELL_RIGHT_MASK;
            int rightData = data >>> 8;
            commArray[leftCellIndex] = setBits(commArray[rightCellIndex], leftData, 8, 16);
            commArray[rightCellIndex] = rightData;
        }
        rc.writeSharedArray(leftCellIndex, commArray[leftCellIndex]);
        rc.writeSharedArray(rightCellIndex, commArray[rightCellIndex]);
    }

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
}
