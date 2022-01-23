package builder_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static builder_bot.Comms.*;
import static builder_bot.Debug.*;

public class Builder extends Robot {
    // constants

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms

        resetBuildLabLoc();
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // should build lab
        if (curLabStage == LAB_NEEDED_LAB_STAGE) {
            tryBuildLab();
            tryRepair();
            return;
        } else {
            resetBuildLabLoc();
        }


        tryRepair();
        Direction moveDir = moveLogic();
        if (moveDir != null) {
            tryRepair();
        }
    }

    final public static int BUILD_LAB_PATIENCE = 10;

    public static int buildLabStartRound;
    public static MapLocation buildLabLoc;
    public static int buildLabRubble;
    public static boolean buildLabAnywhere;

    public static void initBuildLabLoc(MapLocation loc) throws GameActionException {
        buildLabStartRound = roundNum;
        buildLabLoc = loc;
        buildLabAnywhere = false;
        if (buildLabLoc != null && rc.canSenseLocation(buildLabLoc)) {
            buildLabRubble = rc.senseRubble(buildLabLoc);
        } else {
            buildLabRubble = 10;
        }
    }

    public static void resetBuildLabLoc() {
        buildLabStartRound = -BUILD_LAB_PATIENCE;
        buildLabLoc = null;
        buildLabAnywhere = false;
    }

    public static void tryBuildLab() throws GameActionException {
        if (!canBuildLab() && !rc.isMovementReady()) {
            return;
        }

        if (roundNum - buildLabStartRound >= BUILD_LAB_PATIENCE) {
            buildLabAnywhere = true;
        }

        // if lab loc has a building on it
        if (buildLabLoc != null && rc.canSenseLocation(buildLabLoc)) {
            RobotInfo ri = rc.senseRobotAtLocation(buildLabLoc);
            if (ri != null && ri.type.isBuilding()) {
                buildLabAnywhere = true;
            }
        }

        // if impatient
        if (buildLabAnywhere) {
            tryBuildLabAdj(100);
            return;
        }

        // build if already at a good location
        {
            Direction buildDir = tryBuildLabAdj(buildLabRubble);
            if (buildDir != null) {
                return;
            }
        }

        // need to move
        if (!rc.isMovementReady()) {
            return;
        }


        // i am on the lab loc
        Direction moveDir;
        if (buildLabLoc != null) {
            if (here.equals(buildLabLoc)) {
                moveDir = Nav.moveBetterTileForce();
            } else { // move towards build lab loc
                if (here.isAdjacentTo(buildLabLoc)) {
                    moveDir = Nav.moveBetterTile(buildLabLoc, 2, true);
                } else {
                    moveDir = BFS.move(buildLabLoc);
                }
            }
        } else {
            MapLocation archonLoc = getClosestAllyArchon(here, false);
            moveDir = Nav.wander(archonLoc, 8, 9, 0);
        }

        // build if is now at a good location
        if (moveDir != null) {
            Direction buildDir = tryBuildLabAdj(buildLabRubble);
            if (buildDir != null) {
                return;
            }
        }
    }

    public static boolean canBuildLab() {
        return rc.isActionReady() && rc.getTeamLeadAmount(us) >= LABORATORY.buildCostLead;
    }

    public static void doBuildLab(Direction buildDir) throws GameActionException {
        Actions.doBuildRobot(LABORATORY, buildDir);
        Comms.writeBuildLab(NO_LAB_STAGE, 10);
        resetBuildLabLoc();
    }

    public static Direction tryBuildLabAdj(int maxRubble) throws GameActionException {
        Direction bestDir = Archon.getBuildBestRubbleDir();
        if (bestDir != null) {
            int rubble = rc.senseRubble(rc.adjacentLocation(bestDir));
            if (rubble <= maxRubble) {
                if (canBuildLab()) {
                    doBuildLab(bestDir);
                }
                return bestDir;
            }
        }
        return null;
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

        //
        MapLocation bestRepairLoc = null;
        int bestScore = N_INF;

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
        }

        // go to repair loc
        if (bestRepairLoc != null) {
            if (here.isWithinDistanceSquared(bestRepairLoc, myActionRadius)) {
                // already in range
                Direction moveDir = Nav.moveBetterTile(bestRepairLoc, myActionRadius, true);
                return moveDir;
            } else {
                // not in range yet
                Direction moveDir = BFS.move(bestRepairLoc);
                return moveDir;
            }
        }

        // go to nearest archon location
        MapLocation archonLoc = getClosestAllyArchon(here, false);
        if (archonLoc != null) {
            if (here.isWithinDistanceSquared(archonLoc, 16)) {
                return Nav.moveBetterTile(archonLoc, 16, true);
            } else {
                return BFS.move(archonLoc);
            }
        }

        return Nav.wander(spawnLoc, 8, 9, 0);
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

        // BUILD THEM LAB PROTOTYPES
        if (ri.mode == RobotMode.PROTOTYPE && ri.type == LABORATORY) {
            score += 6e6;
        }

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
