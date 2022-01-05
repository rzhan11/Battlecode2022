package firstbot;

import battlecode.common.*;

import static firstbot.Comms.*;
import static firstbot.MsgComms.*;

public class Message {
    int type;
    int info;

    public Message(int msgBits) {
        this.type = msgBits & TYPE_MASK;
        this.info = msgBits & INFO_MASK;
    }

    public Message(int msgType, int msgInfo) {
        this.type = msgType;
        this.info = msgInfo;
    }

    // assumes m1 and m2 != null
    public static boolean hasSameContent(Message m1, Message m2) {
        return m1.type == m2.type && m1.info == m2.info;
    }

    @Override
    public String toString() {
//        if (USE_BASIC_MESSAGES) {
//            return type + " " + info + " " + repeat;
//        }

        String str = "";

        switch (type) {
            case EMPTY_MSG:
                str += "[EMPTY]";
                break;

            case REPORT_ENEMY:
                str += "[ENEMY@] " + bits2loc(info); break;


            default:
                str += type + " " + info;
                break;
        }
        return str;
    }
}