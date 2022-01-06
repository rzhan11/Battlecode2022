package micro_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;
import static micro_bot.Debug.logi;
import static micro_bot.Utils.*;

public class Builder extends Robot {
    // constants

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // try to build random watchtower TESTING
        if (random() < 0.5) {

            if (rc.getTeamLeadAmount(us) > 1000) {
                Direction randDir = getRandomDir();
                for (int i = 8; --i >= 0;) {
                    if (rc.canBuildRobot(WATCHTOWER, randDir)) {
                        MapLocation loc = here.add(randDir);
                        if ((loc.x + loc.y) % 3 != 0) { // only build on lattice
                            continue;
                        }
                        Actions.doBuildRobot(WATCHTOWER, randDir);
                        return;
                    }
                    randDir = randDir.rotateLeft();
                }
            }
        }

        tryRepair();
        Direction moveDir = moveLogic();
        if (moveDir != null) {
            tryRepair();
        }
    }

    public static Direction moveLogic() throws GameActionException {
        if (!rc.isMovementReady()) {
            return null;
        }

        MapLocation bestRepairLoc = null;
        int bestScore = N_INF;

        for (int i = sensedAllies.length; --i >= 0;) {
            RobotInfo ri = sensedAllies[i];
            RobotType rt = ri.type;
            if (rt.isBuilding() && ri.health < rt.getMaxHealth(ri.level)) {
                int score = getHealScore(ri);
                if (score > bestScore) {
                    bestRepairLoc = ri.location;
                    bestScore = score;
                }
            }
        }

        // repair if found a location
        if (bestRepairLoc != null) {
            Direction moveDir = Nav.fuzzyTo(bestRepairLoc);
            return moveDir;
        }

        // move randomly
        Direction randDir = getRandomDir();
        for (int i = 8; --i >= 0;) {
            if (rc.canMove(randDir)) {
                Actions.doMove(randDir);
                return randDir;
            }
            randDir = randDir.rotateLeft();
        }

        return null;
    }

    public static void tryRepair() throws GameActionException {
        if (!rc.isActionReady()) {
            return;
        }

        MapLocation bestRepairLoc = null;
        int bestScore = N_INF;

        RobotInfo[] closeAllies = rc.senseNearbyRobots(myActionRadius, us);
        for (int i = closeAllies.length; --i >= 0;) {
            RobotInfo ri = closeAllies[i];
            RobotType rt = ri.type;
            if (rt.isBuilding() && ri.health < rt.getMaxHealth(ri.level)) {
                int score = getHealScore(ri);
                if (score > bestScore) {
                    bestRepairLoc = ri.location;
                    bestScore = score;
                }
            }
        }

        // repair if found a location
        if (bestRepairLoc != null) {
            Actions.doRepair(bestRepairLoc);
            return;
        }
    }

    /*
    Priority:
    1. Low health archons (<500)
    2. Watchtower
    3. Any health archons
    4. Laboratory
    ---
    Finished buildings get prio over prototypes
    Prio lower health
     */
    public static int getHealScore(RobotInfo ri) {
        int score = 0;
        switch (ri.type) {
            case ARCHON:
                if (ri.health < 500) {
                    score += 4e6;
                } else {
                    score += 2e6;
                }
                break;
            case WATCHTOWER:
                score += 3e6;
                break;

            case LABORATORY:
                score += 1e6;
                break;

            default:
                logi("WARNING: 'getHealScore' unexpected unit " + ri.type);
        }
        if (ri.mode != RobotMode.PROTOTYPE) {
            score += 1e3;
        }
        score += 1000 - ri.health;
        return score;
    }
}
