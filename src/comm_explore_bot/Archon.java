package comm_explore_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static comm_explore_bot.Comms.*;
import static comm_explore_bot.Debug.*;
import static comm_explore_bot.Map.*;
import static comm_explore_bot.Utils.*;
import static comm_explore_bot.Zone.*;

public class Archon extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables


    public static int[] archonSpawnBit;

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
//        startBytecode("str");
//        String s = "abc";
//        stopBytecode("str");
//        startBytecode("str2");
//        String s2 = "abcdef";
//        stopBytecode("str2");
//        printBuffer();
//        rc.resign();

    }

    public static RobotType[] potentialSpawns = new RobotType[]{MINER, SOLDIER, BUILDER};
    public static int numSpawns = 0;
    public static int myArchonIndex = -1;

    public static boolean madeContact = false;

    public static RobotType nextSpawnType = MINER;

    // code run each turn
    public static void turn() throws GameActionException {
        myHealing = myType.getHealing(rc.getLevel());

//        if (roundNum == 25) {
//            rc.resign();
//        }

        // put role-specific updates here

        for (int i = 0; i < 4; i++) {
            log("a " + i + ": " + allyArchonLocs[i] + " " + isAllyArchonLive[i] + " " + archonSpawnBit[i]);
        }

        if (Archon.isPrimaryArchon()) { // broadcast if is primary archon
            Comms.broadcastResources();

            if (roundNum % 50 == 2) { // common explore update frequency
                Comms.writeCommonExploreSection();
            }

        }

        readSpawnCountSection();

        updateMinerGoal();

        if (reportedEnemyCount > 0) {
            madeContact = true;
        }
        log("contact " + madeContact);


        if (isPrimaryArchon()) {
            Zone.displayZoneResourceStatus();
        }

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
                MapLocation buildDest = getBuildDest();

                Direction dir = tryBuild(nextSpawnType, buildDest);
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
        double bestScore = N_INF;
        RobotInfo bestRobot = null;
        for (int i = actionableAllyRobots.length; --i >= 0; ) {
            RobotInfo ri = actionableAllyRobots[i];
            if (ri.type.isBuilding()) {
                continue;
            }
            if (ri.health < ri.type.getMaxHealth(ri.level)) {
                double score = getRepairScore(ri);
                if (score > bestScore) {
                    bestScore = score;
                    bestRobot = ri;
                }
            }
        }

        if (bestRobot != null) {
            Actions.doRepair(bestRobot.location);
            return;
        }
    }

    public static boolean checkTrySpawn() {
        if (rc.getTeamLeadAmount(us) > 500) {
            return true;
        }

        // get archon index
        int relIndex = 0;
        for (int i = MAX_ARCHONS; --i > myArchonIndex; ) {
            if (isAllyArchonLive[i]) {
                relIndex++;
            }
        }
        log("checktry " + relIndex + " " + teamSpawnCount + " " + rc.getArchonCount());

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
                if (random() < 0.75) {
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
                if (roundNum > 1) {
                    logi("WARNING: 'updateResourceZoneCount' Zone flag should not be possible " + zoneResourceStatus[zx][zy]);
                }
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

    public static MapLocation getBuildDest() throws GameActionException {
        MapLocation[] leadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius, 2);
        if (leadLocs.length > 64) {
            leadLocs = rc.senseNearbyLocationsWithLead(20);
        }

        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = leadLocs.length; --i >= 0; ) {
            MapLocation loc = leadLocs[i];
            int dist = here.distanceSquaredTo(loc);
            if (dist < bestDist) {
                bestLoc = loc;
                bestDist = dist;
            }
        }

        if (bestLoc == null || bestLoc == here) {
            return null;
        } else {
            return bestLoc;
        }
    }

    public static Direction tryBuild(RobotType rt, MapLocation buildDest) throws GameActionException {
        if (true || buildDest == null) { // build on cheapest tile
            Direction bestDir = null;
            int bestRubble = P_INF;
            for (Direction dir : DIRS) {
                MapLocation loc = here.add(dir);
                if (!rc.onTheMap(loc)) {
                    continue;
                }
                if (rc.canSenseRobotAtLocation(loc)) { // skip if occupied
                    continue;
                }
                int rubble = rc.senseRubble(loc);
                if (rubble < bestRubble) {
                    bestDir = dir;
                    bestRubble = rubble;
                }
            }

            if (bestDir != null) {
                Actions.doBuildRobot(rt, bestDir);
                return bestDir;
            } else {
                return null;
            }
        }

        log("bfs " + buildDest);
        // build using bfs
        Direction buildDir = BFS20.getBestDir(buildDest);
        tlog("res " + buildDir);
        if (buildDir != null) {
            Actions.doBuildRobot(rt, buildDir);
            return buildDir;
        } else {
            return null;
        }
    }

    public static boolean isPrimaryArchon() {
        if (myType != ARCHON) {
            return false;
        }

        for (int i = MAX_ARCHONS; --i > myArchonIndex; ) {
            if (isAllyArchonLive[i]) {
                return false;
            }
        }
        return true;
    }

    public static int myHealing;

    public static double getRepairScore(RobotInfo ri) {
        int score;
        if (sensedEnemies.length > 0) {
            // prioritize lower health if close combat
            score = 1000 - ri.health;
        } else {
            // prioritize higher health if far combat
            score = ri.health;
        }

        score += 1000 * Math.min(myHealing, ri.type.getMaxHealth(ri.level) - ri.health);

        // attack troops in this priority
        switch (ri.type) {
            case SOLDIER:
                score += 4e6;
                break;
            case SAGE:
                score += 3e6;
                break;
            case MINER:
                score += 2e6;
                break;
            case BUILDER:
                score += 1e6;
                break;
        }

        return score;
    }
}
