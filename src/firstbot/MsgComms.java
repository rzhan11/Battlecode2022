package firstbot;

import battlecode.common.*;

import static firstbot.Comms.*;
import static firstbot.Debug.*;

public class MsgComms {
    /*
    MESSAGE CONSTANTS
     */

    // MESSAGE SECTION OFFSET = NEWS section bit size
    final public static int MSG_SECTION_OFFSET = 4 * 16 + 4 * 16 + 1 * 16;

    // MESSAGE BIT SIZE CONSTANTS
    final public static int MSG_BITS = 24;
    final public static int TYPE_BITS = 6;
    final public static int INFO_BITS = 18;

    final public static int MAX_MSG_COUNT = (MAX_COMM_BITS - MSG_SECTION_OFFSET) / MSG_BITS;

    // MESSAGE PART OFFSETS
    final public static int INFO_OFFSET = 0;
    final public static int TYPE_OFFSET = INFO_BITS;

    // MESSAGE PART BITMASKS
    final public static int INFO_MASK = ((1 << INFO_BITS) - 1) << INFO_OFFSET; // offset = 0
    final public static int TYPE_MASK = ((1 << TYPE_BITS) - 1) << TYPE_OFFSET;

    // MESSAGE HEADER CONSTANTS
    final public static int EMPTY_MSG = 0 << TYPE_OFFSET;

    final public static int REPORT_ENEMY = 1 << TYPE_OFFSET;
    final public static int REPORT_ENEMY_ARCHON = 2 << TYPE_OFFSET;

    public static Message[] messageArray = new Message[MAX_MSG_COUNT];


    public static int getMessageStartBit(int msgIndex) throws GameActionException {
        return MSG_SECTION_OFFSET + msgIndex * MSG_BITS;
    }

    public static void loadMessageArray() throws GameActionException {
        int bef = Clock.getBytecodesLeft();
        int startBit = getMessageStartBit(MAX_MSG_COUNT - 1);
        for (int i = MAX_MSG_COUNT; --i >= 0;) {
            int msgBits = read24BitsFromIndex(startBit);
            messageArray[i] = new Message(msgBits);
            startBit -= MSG_BITS;
        }
        int aft = Clock.getBytecodesLeft();
        System.out.println("BEF/AFT " + (aft - bef) + " " + MAX_MSG_COUNT);
    }

    public static void writeMessage(Message msg) throws GameActionException {
        // look through comms array
        for (int i = MAX_MSG_COUNT; --i >= 0;) {
            if (messageArray[i].type == EMPTY_MSG) {
                writeMessageToIndex(msg, i);
                return;
            }
        }
    }

    public static void writeMessageToIndex(Message msg, int msgIndex) throws GameActionException {
        int startBit = getMessageStartBit(msgIndex);
        write24BitsToIndex(msg.type + msg.info, startBit);
    }

    /*
    Start of messages
     */

    public static void writeReportEnemy(MapLocation loc) throws GameActionException {
        log("Writing 'Report Enemy' message " + loc);

        Message msg = new Message(REPORT_ENEMY, loc2bits(loc));
        writeMessageToIndex(msg, 4);
    }


}
