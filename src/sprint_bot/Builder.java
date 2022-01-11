package sprint_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;
import static sprint_bot.Debug.logi;
import static sprint_bot.Utils.*;

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

        // avoid danger
        {
            Miner.updateDanger();
            Direction moveDir = Miner.avoidDanger();
            if (moveDir != null) {
                return moveDir;
            }
        }

        // move away from ally archons
        for (int i = MAX_ARCHONS; --i >= 0;) {
            if (!isAllyArchonLive[i]) {
                continue;
            }
            MapLocation loc = allyArchonLocs[i];
            if (here.isWithinDistanceSquared(loc, 5)) {
                Direction moveDir = Nav.fuzzyAwaySimple(loc);
                return moveDir;
            }
        }

        //
        MapLocation bestRepairLoc = null;
        int bestScore = N_INF;
        // get closest ally tower
        MapLocation closestAllyTowerLoc = null;
        int closestAllyTowerDist = P_INF;

        int searchCount = Math.min(15, sensedAllies.length);
        for (int i = searchCount; --i >= 0;) {
            RobotInfo ri = sensedAllies[i];
            RobotType rt = ri.type;
            MapLocation loc = ri.location;
            if (rt.isBuilding() && ri.health < rt.getMaxHealth(ri.level)) {
                int score = getRepairScore(ri);
                if (score > bestScore) {
                    bestRepairLoc = loc;
                    bestScore = score;
                }
            }
            if (rt == WATCHTOWER) {
                int dist = here.distanceSquaredTo(loc);
                if (dist < closestAllyTowerDist) {
                    closestAllyTowerLoc = loc;
                    closestAllyTowerDist = dist;
                }
            }
        }

        // go to repair loc
        if (bestRepairLoc != null) {
            Direction moveDir = BFS.move(bestRepairLoc);
            return moveDir;
        }

        // go to nearest tower
//        if (closestAllyTowerLoc != null) {
//            Direction moveDir = BFS.move(closestAllyTowerLoc);
//            return moveDir;
//        }

        return Nav.wander(spawnLoc, 8, 9, false);
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
