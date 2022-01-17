package sprint2_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static sprint2_bot.Comms.*;
import static sprint2_bot.Debug.*;
import static sprint2_bot.Utils.*;
import static sprint2_bot.Zone.*;

public class Archon extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables


    public static int[] archonSpawnBit;
    public static int numStartArchons;


    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        numStartArchons = rc.getArchonCount();

    }

    public static int mySpawnCount = 0;
    public static int myArchonIndex = -1;

    public static boolean madeContact = false;

    public static RobotType nextSpawnType = MINER;

    public static MapLocation bestRepairLoc;


    // code run each turn
    public static void turn() throws GameActionException {
        myHealing = myType.getHealing(rc.getLevel());

//        if (roundNum == 5) {
//            rc.resign();
//        }

        // put role-specific updates here

        for (int i = 0; i < 4; i++) {
            log("a " + i + ": " + allyArchonLocs[i] + " " + isAllyArchonLive[i] + " " + archonSpawnBit[i]);
        }

        if (Archon.isPrimaryArchon()) { // broadcast if is primary archon
            Comms.broadcastResources();

            if (roundNum % COMMON_EXPLORE_UPDATE_FREQ == 1) { // common explore update frequency
                Comms.writeCommonExploreSection();
            }

        }

        readSpawnCountSection();

        updateMinerGoal();

        if (reportedEnemyCount > 0) {
            madeContact = true;
        }
        log("contact " + madeContact);

        // do portable archon stuff
        if (rc.getMode() == RobotMode.PORTABLE) {
            ArchonPortable.turn();
            return;
        }

        if (!rc.isActionReady()) {
            return;
        }

        // update best repair loc
        updateBestRepairLoc();

        // transform if needed
        boolean transformed = checkTransform();
        if (transformed) {
            Actions.doTransform();
            ArchonPortable.init();
            writeArchonMove(myArchonIndex);
            return;
        }

        // check moving
        pickNextSpawnType();


        // rotate through different spawns
        boolean shouldTrySpawn = checkTrySpawn();
        log("should " + shouldTrySpawn + " " + rc.getTeamLeadAmount(us) + " " + nextSpawnType);
        if (shouldTrySpawn) {
            if (rc.getTeamLeadAmount(us) >= nextSpawnType.buildCostLead) {
                MapLocation buildDest = null;
                Direction dir = null;
                switch(nextSpawnType) {
                    case MINER:
                        buildDest = getBuildDestMiner();
                        dir = tryBuild(nextSpawnType, buildDest);
                        break;
                    case SOLDIER:
                    case SAGE:
                    case BUILDER:
                        // get best tile
                        if (sensedEnemies.length > 0) { // build on best tile if there are enemies
                            dir = tryBuildBestRubble(nextSpawnType);
                        } else {
                            buildDest = getBuildDestSoldier();
                            dir = tryBuild(nextSpawnType, buildDest);
                        }
                        break;
                }


                if (dir != null) {
                    // send command
                    switch(nextSpawnType) {
                        case MINER:
                            writeMinerSpawnCommand(dir);
                            break;
                        case SOLDIER:
                        case SAGE:
                        case BUILDER:
//                            writeSoldierSpawnCommand(dir);
                            Comms.writeSpawnCommand(dir, 17);
                            break;
                        default:
                            logi("WARNING: 'Archon.spawn' code should never reach here " + nextSpawnType);
                    }

                    // update team variables
                    teamSpawnCount = (teamSpawnCount + 1) % rc.getArchonCount();
                    Comms.writeSpawnCount(teamSpawnCount);
                    // update self variables
                    mySpawnCount++;
                    return;
                }
            }
        }

        tryRepair();
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

        if (relIndex % rc.getArchonCount() == teamSpawnCount % rc.getArchonCount()) {
            return true;
        }
        return false;
    }

    public static void pickNextSpawnType() {
        int numMiners = getUnitCount(MINER);
        int numSoldiers = getUnitCount(SOLDIER);
        log("Standard: " + numSoldiers + " " + numMiners + " vs " + minerGoal);

        if (rc.getTeamGoldAmount(us) >= SAGE.buildCostGold) {
            nextSpawnType = SAGE;
            return;
        }

        // build soldier if in danger
        if (sensedEnemies.length > 0) {
            nextSpawnType = SOLDIER;
            return;
        }

        // hard coded early game
        if (mySpawnCount < 3) {
            nextSpawnType = MINER;
            return;
        } else if (mySpawnCount == 3) {
            nextSpawnType = SOLDIER;
            return;
        }

        // build builder if rich
        if (rc.getTeamLeadAmount(us) > 500) {
            if (random() < 0.2) {
                nextSpawnType = BUILDER;
                return;
            }
        }

        /*
        Standard build order
         */

        double soldierGoal = numMiners;

        // mineLocs
        if (numMiners >= minerGoal) {
            soldierGoal = minerGoal + (numMiners - minerGoal) * 4;
        }

        if (numSoldiers <= soldierGoal) {
            nextSpawnType = SOLDIER;
            return;
        } else {
            nextSpawnType = MINER;
            return;
        }
    }

    public static int minerGoal;

    public static void updateMinerGoal() {
        log("unknownCount " + unknownCount);
        log("unknownFrontierCount " + unknownFrontierCount);
        log("mineCount " + mineCount);

        double numMineMiners = Math.sqrt(mineCount) * 4;

        double numExploreMiners = Math.sqrt(unknownCount);

        minerGoal = (int) Math.max(numExploreMiners, rc.getArchonCount() * 3);
//        minerGoal = 30;
        log("minerGoal " + minerGoal + " " + numMineMiners + " " + numExploreMiners);
        logline();

        String s = "mg:" + minerGoal + " mm" + (int) numMineMiners + " me:" + (int) numExploreMiners + " u:" + unknownCount + " uf:" + unknownFrontierCount + " mc:" + mineCount;
        if (isPrimaryArchon()) {
            s = "[P] " + s;
        }
        rc.setIndicatorString(s);
    }

    public static MapLocation getBuildDestMiner() throws GameActionException {
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

        if (bestLoc == null || bestLoc.equals(here)) {
            return null;
        } else {
            return bestLoc;
        }
    }

    public static MapLocation getBuildDestSoldier() throws GameActionException {
        // find a target location
        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = reportedEnemyCount; --i >= 0;) {
            MapLocation loc = reportedEnemyLocs[i];
            int dist = here.distanceSquaredTo(loc);
            if (dist < bestDist) {
                bestDist = dist;
                bestLoc = loc;
            }
        }

        if (bestLoc == null || bestLoc.equals(here)) {
            return null;
        } else {
            return bestLoc;
        }
    }

    public static Direction tryBuild(RobotType rt, MapLocation buildDest) throws GameActionException {
        if (buildDest == null) { // build on cheapest tile
            Direction buildDir = tryBuildBestRubble(rt);
            return buildDir;
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

    public static Direction tryBuildBestRubble(RobotType rt) throws GameActionException {
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

    public static boolean isPrimaryArchon() {
        if (myType != ARCHON) {
            return false;
        }

        if (rc.getArchonCount() == 1) {
            return true;
        }

        if (rc.getMode() == RobotMode.PORTABLE) {
            return false;
        }

        for (int i = MAX_ARCHONS; --i > myArchonIndex; ) {
            if (isAllyArchonLive[i] && allyArchonMoveIndex != i) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimaryArchonTrue() {
        if (myType != ARCHON) {
            return false;
        }

        if (rc.getArchonCount() == 1) {
            return true;
        }

        if (rc.getMode() == RobotMode.PORTABLE) {
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

    public static boolean checkTransform() throws GameActionException {
        // don't do this early
        if (roundNum < 25) {
            return false;
        }

        // check not in danger
        if (timeSinceEnemy <= 10) {
            return false;
        }

        // check no other archon is moving
        if (allyArchonMoveIndex != -1) {
            return false;
        }

        // don't do as solo archon
        if (rc.getArchonCount() == 1) {
            return false;
        }

        // don't move if ppl need healing
        if (bestRepairLoc != null) {
            return false;
        }

        if (reportedEnemyCount > 0) {
            int[] farthestData = getFarthestArchonToDanger();
            int farthestArchonIndex = farthestData[0];
            int farthestDist = farthestData[1];

            log("far ai " + farthestArchonIndex + " " + farthestDist);
            if (farthestArchonIndex == myArchonIndex) {
                if (Math.sqrt(farthestDist) >= 10) { //
                    return true;
                }
            }
        }

        return false;
    }

    public static int[] getFarthestArchonToDanger() {
        int farthestArchonIndex = -1;
        int farthestDist = N_INF;
        // check if i am the farthest from danger
        for (int ai = MAX_ARCHONS; --ai >= 0;) {
            if (isAllyArchonLive[ai]) {
                MapLocation loc = allyArchonLocs[ai];
                int localMinDist = P_INF;
                for (int i = reportedEnemyCount; --i >= 0;) {
                    int dist = loc.distanceSquaredTo(reportedEnemyLocs[i]);
                    localMinDist = Math.min(dist, localMinDist);
                }
                if (localMinDist > farthestDist) {
                    farthestDist = localMinDist;
                    farthestArchonIndex = ai;
                }
            }
        }

        return new int[] {farthestArchonIndex, farthestDist};
    }

    public static int getClosestArchonToDanger() {
        int closestArchonIndex = -1;
        int closestDist = P_INF;
        // check if i am the farthest from danger
        for (int ai = MAX_ARCHONS; --ai >= 0;) {
            if (isAllyArchonLive[ai]) {
                MapLocation loc = allyArchonLocs[ai];
                int localMinDist = P_INF;
                for (int i = reportedEnemyCount; --i >= 0;) {
                    int dist = loc.distanceSquaredTo(reportedEnemyLocs[i]);
                    localMinDist = Math.min(dist, localMinDist);
                }
                if (localMinDist < closestDist) {
                    closestDist = localMinDist;
                    closestArchonIndex = ai;
                }
            }
        }

        return closestArchonIndex;
    }

    public static void tryRepair() throws GameActionException {
        if (bestRepairLoc != null) {
            Actions.doRepair(bestRepairLoc);
            return;
        }
    }

    public static void updateBestRepairLoc() {
        bestRepairLoc = null;

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
            bestRepairLoc = bestRobot.location;
        }
    }
}
