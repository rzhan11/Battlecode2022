package smartspawn_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;
import static smartspawn_bot.Debug.logi;
import static smartspawn_bot.Utils.*;

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
        if (random() < 0.5 && rc.isActionReady()) {
            // mutate towers if rich
            RobotInfo[] adjAllies = rc.senseNearbyRobots(2, us);
            if (rc.getTeamGoldAmount(us) >= 100) {
                for (RobotInfo ri: adjAllies) {
                    if (ri != null && ri.mode == RobotMode.TURRET && ri.type == WATCHTOWER) {
                        if (ri.level == 2) {
                            Actions.doMutate(ri.location);
                            return;
                        }
                    }
                }
            }

            // mutate towers if rich
            if (rc.getTeamLeadAmount(us) >= 2500) {
                for (RobotInfo ri: adjAllies) {
                    if (ri != null && ri.mode == RobotMode.TURRET  && ri.type == WATCHTOWER) {
                        if (ri.level == 1) {
                            if (rc.getTeamLeadAmount(us) >= 4000 || sensedEnemies.length > 0 && ri.health < ri.type.getMaxHealth(ri.level)) {
                                // only upgrade if this tower is near frontlines
                                Actions.doMutate(ri.location);
                                return;
                            }
                        }
                    }
                }
            }

            if (rc.getTeamLeadAmount(us) > 1000) {
                RobotType spawnType = WATCHTOWER;
                if (random() < 0.1) {
                    if (timeSinceEnemy > 50 && roundNum > 500) {
                        spawnType = LABORATORY;
                    }
                }

                Direction randDir = getRandomDir();
                for (int i = 8; --i >= 0;) {
                    if (rc.canBuildRobot(spawnType, randDir)) {
                        MapLocation loc = here.add(randDir);
                        if ((loc.x + loc.y) % 3 != 0) { // only build on lattice
                            continue;
                        }
                        if (spawnType == WATCHTOWER && loc.x % 8 == 0) {
                            continue;
                        }
                        Actions.doBuildRobot(spawnType, randDir);
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
                int score = getRepairScore(ri);
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
                int score = getRepairScore(ri);
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
    public static int getRepairScore(RobotInfo ri) {
        int score = 0;
        switch (ri.type) {
            case ARCHON:
                if (ri.health < 250) {
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
        // prioritize built buildings
        if (ri.mode != RobotMode.PROTOTYPE) {
            score += 1e3;
            score += 1000 - ri.health;
        } else { // for prototypes, prioritize higher health ones
            score += ri.health;
        }
        return score;
    }
}
