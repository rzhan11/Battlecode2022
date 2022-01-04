package firstbot;

import battlecode.common.*;

import static firstbot.Debug.*;
import static firstbot.Robot.*;

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
                e.printStackTrace();
            }

            try {
                endTurn();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void firstTurnSetup() throws GameActionException {
        switch (myType) {
            case ARCHON:
                Archon.firstTurnSetup();
                break;
            case LABORATORY:
                Laboratory.firstTurnSetup();
                break;
            case WATCHTOWER:
                Watchtower.firstTurnSetup();
                break;
            case MINER:
                Miner.firstTurnSetup();
                break;
            case BUILDER:
                Builder.firstTurnSetup();
                break;
            case SOLDIER:
                Soldier.firstTurnSetup();
                break;
            case SAGE:
                Sage.firstTurnSetup();
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
            case LABORATORY:
                Laboratory.turn();
                break;
            case WATCHTOWER:
                Watchtower.turn();
                break;
            case MINER:
                Miner.turn();
                break;
            case BUILDER:
                Builder.turn();
                break;
            case SOLDIER:
                Soldier.turn();
                break;
            case SAGE:
                Sage.turn();
                break;
            default:
                logi("WARNING: 'turn' Unknown unit!");
        }
        printBuffer();
    }
}
