package sym_bot;

import battlecode.common.*;

import static sym_bot.Debug.*;
import static sym_bot.Robot.*;

public strictfp class RobotPlayer {
    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {
        boolean firstTurn = true;

        while (true) {
            try {
                if (firstTurn) {
                    Robot.init(rc);
                }
                updateTurnInfo();
                if (firstTurn) {
                    firstTurnSetup();
                }

                turn();
                firstTurn = false;
            } catch (Exception e) {
                printBuffer();
                e.printStackTrace();
                Utils.clearBytecode();
//                rc.resign();
            }

            try {
                endTurn();
            } catch(Exception e) {
                printBuffer();
                e.printStackTrace();
            }
        }
    }

    private static void firstTurnSetup() throws GameActionException {
        switch (myType) {
            case ARCHON:
                Archon.firstTurnSetup();
                break;
            case MINER:
                Miner.firstTurnSetup();
                break;
            default:
                logi("WARNING: 'firstTurnSetup' Unknown unit!");
        }
    }

    private static void turn() throws GameActionException {
        switch (myType) {
            case ARCHON:
                Archon.turn();
                break;
            case MINER:
                Miner.turn();
                break;
            default:
                logi("WARNING: 'turn' Unknown unit!");
        }
        printBuffer();
    }
}
