package explore_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static explore_bot.Comms.*;
import static explore_bot.Debug.*;
import static explore_bot.Map.*;
import static explore_bot.Utils.*;
import static explore_bot.Zone.*;

public class Archon extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables


    public static int[] archonSpawnBit;

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
    }

    public static RobotType[] potentialSpawns = new RobotType[]{MINER, SOLDIER, BUILDER};
    public static int numSpawns = 0;
    public static int myArchonIndex = -1;

    public static boolean madeContact = false;

    public static RobotType nextSpawnType = MINER;

    // code run each turn
    public static void turn() throws GameActionException {

        if (roundNum == 25) {
            rc.resign();
        }

        // put role-specific updates here

        if (Archon.isPrimaryArchon()) { // broadcast if is primary archon
            Comms.broadcastResources();

            if (roundNum % 50 == 1) { // common explore update frequency
                Comms.writeCommonExploreSection();
            }

        }

        readSpawnCountSection();

        updateMinerGoal();

        if (reportedEnemyCount > 0) {
            madeContact = true;
        }
        log("contact " + madeContact);


//        if (isPrimaryArchon()) {
//            Zone.displayZoneResourceStatus();
//        }

        if (!rc.isActionReady()) {
            return;
        }

        if (sensedEnemies.length > 0) {
            nextSpawnType = SOLDIER;
        }

        // rotate through different spawns
        boolean shouldTrySpawn = checkTrySpawn();
        log("should " + shouldTrySpawn + " " + rc.getTeamLeadAmount(us) + " " + nextSpawnType);
        if (shouldTrySpawn) {
            if (rc.getTeamLeadAmount(us) >= nextSpawnType.buildCostLead) {
                Direction bestDir = getBuildDir();

                Direction dir = tryBuild(nextSpawnType, bestDir);
                if (dir != null) {
                    pickNextSpawnType();
                    numSpawns++;
                    teamSpawnCount = (teamSpawnCount + 1) % rc.getArchonCount();
                    Comms.writeSpawnCount(teamSpawnCount);
                    return;
                }
            }
        }

        // do heals if idle
        RobotInfo[] actionableAllyRobots = rc.senseNearbyRobots(myActionRadius, us);
        for (int i = actionableAllyRobots.length; --i >= 0;) {
            RobotInfo ri = actionableAllyRobots[i];
            if (ri.type.isBuilding()) {
                continue;
            }
            if (ri.health < ri.type.getMaxHealth(ri.level)) {
                Actions.doRepair(ri.location);
                return;
            }
        }
    }

    public static boolean checkTrySpawn() {
        if (rc.getTeamLeadAmount(us) > 500) {
            return true;
        }

        // get archon index
        int relIndex = 0;
        for (int i = myArchonIndex; --i >= 0;) {
            if (isAllyArchonLive[i]) {
                relIndex++;
            }
        }

        if (relIndex % rc.getArchonCount() == teamSpawnCount % rc.getArchonCount()) {
            return true;
        }
        return false;
    }

    public static void pickNextSpawnType() {
        // build builder if rich
        if (rc.getTeamLeadAmount(us) > 500 * rc.getArchonCount()) {
            if (random() < 0.2) {
                nextSpawnType = BUILDER;
                return;
            }
        }


        if (getUnitCount(MINER) < minerGoal) { // few miners
            if (madeContact || getUnitCount(MINER) > 20) {
                if (random() < 0.5) {
                    nextSpawnType = MINER;
                } else {
                    nextSpawnType = SOLDIER;
                }
            } else {
                if (random() < 1) {
                    nextSpawnType = MINER;
                } else {
                    nextSpawnType = SOLDIER;
                }
            }
        } else { // many miners
            if (random() < 0) {
                nextSpawnType = MINER;
            } else {
                nextSpawnType = SOLDIER;
            }
        }


    }

    public static void updateResourceZoneCount(int oldStatus, int newStatus, int zx, int zy) {
        if (oldStatus == newStatus) {
            return;
        }


        // decrement unknown/frontier
        switch (oldStatus) {
            case ZONE_UNKNOWN_FLAG:
                if (oldStatus == ZONE_UNKNOWN_FLAG) {
                    unknownCount--;
                    if (isFrontierZone[zx][zy]) {
                        unknownFrontierCount--;
                    }
                    isFrontierZone[zx][zy] = false;

                    // increment new frontiers
                    // cardinal
                    if (zx + 1 < ZONE_XNUM) {
                        // right
                        if (zoneResourceStatus[zx + 1][zy] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx + 1][zy]) {
                            isFrontierZone[zx + 1][zy] = true;
                            unknownFrontierCount++;
                        }
                        // right-up
                        if (zy + 1 < ZONE_YNUM && zoneResourceStatus[zx + 1][zy + 1] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx + 1][zy + 1]) {
                            isFrontierZone[zx + 1][zy + 1] = true;
                            unknownFrontierCount++;
                        }
                        // right-down
                        if (zy > 0 && checkValidZone(zx + 1, zy - 1) && zoneResourceStatus[zx + 1][zy - 1] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx + 1][zy - 1]) {
                            isFrontierZone[zx + 1][zy - 1] = true;
                            unknownFrontierCount++;
                        }
                    }
                    if (zx > 0) {
                        if (checkValidZone(zx - 1, zy) && zoneResourceStatus[zx - 1][zy] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx - 1][zy]) {
                            isFrontierZone[zx - 1][zy] = true;
                            unknownFrontierCount++;
                        }
                        if (zy + 1 < ZONE_YNUM && zoneResourceStatus[zx - 1][zy + 1] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx - 1][zy + 1]) {
                            isFrontierZone[zx - 1][zy + 1] = true;
                            unknownFrontierCount++;
                        }
                        if (zy > 0 && zoneResourceStatus[zx - 1][zy - 1] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx - 1][zy - 1]) {
                            isFrontierZone[zx - 1][zy - 1] = true;
                            unknownFrontierCount++;
                        }
                    }
                    // up
                    if (zy + 1 < ZONE_YNUM && zoneResourceStatus[zx][zy + 1] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx][zy + 1]) {
                        isFrontierZone[zx][zy + 1] = true;
                        unknownFrontierCount++;
                    }
                    // down
                    if (zy > 0 && zoneResourceStatus[zx][zy - 1] == ZONE_UNKNOWN_FLAG && !isFrontierZone[zx][zy - 1]) {
                        isFrontierZone[zx][zy - 1] = true;
                        unknownFrontierCount++;
                    }
                }
                break;
            case ZONE_EMPTY_FLAG:
                break;
            case ZONE_MINE_FLAG:
                mineCount--;
                break;
            default:
                logi("WARNING: 'updateResourceZoneCount' Unexpected zone flag1! " + zoneResourceStatus[zx][zy]);
        }


        switch (newStatus) {
            case ZONE_UNKNOWN_FLAG:
                logi("WARNING: 'updateResourceZoneCount' Zone flag should not be possible " + zoneResourceStatus[zx][zy]);
                break;
            case ZONE_EMPTY_FLAG:
                break;
            case ZONE_MINE_FLAG:
                mineCount++;
                break;
            default:
                logi("WARNING: 'updateResourceZoneCount' Unexpected zone flag2! " + zoneResourceStatus[zx][zy]);
        }
    }

    public static int minerGoal;

    public static void updateMinerGoal() {
        log("unknownCount " + unknownCount);
        log("unknownFrontierCount " + unknownFrontierCount);
        log("mineCount " + mineCount);

        minerGoal = (Math.min(unknownFrontierCount, 10)) + mineCount;
        minerGoal = (int) Math.max(minerGoal, Math.sqrt(rc.getArchonCount()) * 20);



        rc.setIndicatorString("mg:" + minerGoal + " u:" + unknownCount + " uf:" + unknownFrontierCount + " mc:" + mineCount);
    }

    public static Direction getBuildDir() throws GameActionException {
        MapLocation[] leadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius, 2);
        if (leadLocs.length > 64) {
            leadLocs = rc.senseNearbyLocationsWithLead(20);
        }

        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = leadLocs.length; --i >= 0;) {
            MapLocation loc = leadLocs[i];
            int dist = here.distanceSquaredTo(loc);
            if (dist < bestDist) {
                bestLoc = loc;
                bestDist = dist;
            }
        }

        if (bestLoc == null || bestLoc == here) {
            return Direction.NORTH;
        } else {
            return here.directionTo(bestLoc);
        }
    }

    public static Direction tryBuild(RobotType rt, Direction buildDir) throws GameActionException {
        for (Direction dir: getClosestDirs(buildDir)) {
            MapLocation loc = here.add(dir);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            if (!rc.canSenseRobotAtLocation(loc)) {
                Actions.doBuildRobot(rt, dir);
                return dir;
            }
        }
        return null;
    }

    public static boolean isPrimaryArchon() {
        if (myType != ARCHON) {
            return false;
        }

        for (int i = myArchonIndex; --i >= 0;) {
            if (isAllyArchonLive[i]) {
                return false;
            }
        }
        return true;
    }
}