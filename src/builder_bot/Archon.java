package builder_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static builder_bot.Comms.*;
import static builder_bot.Debug.*;
import static builder_bot.HardCode.*;
import static builder_bot.Symmetry.*;
import static builder_bot.Zone.*;

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


    public static RobotType nextSpawnType = MINER;

    public static MapLocation bestRepairLoc;


    // code run each turn
    public static void turn() throws GameActionException {
        myHealing = myType.getHealing(rc.getLevel());

        updateLatestDanger();

//        if (roundNum == 100) {
//            rc.resign();
//        }

        // put role-specific updates here

        for (int i = 0; i < 4; i++) {
            log("a " + i + ": " + allyArchonLocs[i] + " " + isAllyArchonLive[i] + " " + archonSpawnBit[i]);
        }

        for (int i = 0; i < 3; i++) {
            log(SYMS[i].text + ": " + symmetryState[i]);
        }

        for (RobotType rt: unitCountIndex2Type) {
            log(rt + ": " + getUnitCount(rt));
        }

        if (Archon.isPrimaryArchon()) { // broadcast resources if is primary archon
            Comms.broadcastResources();
        }

        updateBuildLab();

        readSpawnCountSection();

        updateMinerGoal();

        // do portable archon stuff
        if (rc.getMode() == RobotMode.PORTABLE) {
            ArchonPortable.turn();
            return;
        }

        /*
        END OF ALL UPDATES
         */

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
                boolean isBuildLab = checkShouldBuildLabBuilder();
                switch(nextSpawnType) {
                    case MINER:
                        buildDest = getBuildDestMiner();
                        dir = tryBuild(nextSpawnType, buildDest);
                        break;
                    case SOLDIER:
                    case SAGE:
                        // get best tile
                        if (sensedEnemies.length > 0) { // build on best tile if there are enemies
                            dir = tryBuildBestRubble(nextSpawnType);
                        } else {
                            buildDest = getBuildDestSoldier();
                            dir = tryBuild(nextSpawnType, buildDest);
                        }
                        break;
                    case BUILDER:
                        if (isBuildLab) {
                            buildDest = getBuildDestBuilder();
                            dir = tryBuild(nextSpawnType, buildDest, true);
                        } else {
                            buildDest = null;
                            dir = tryBuildBestRubble(nextSpawnType);
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
//                            writeSoldierSpawnCommand(dir);
                            Comms.writeSpawnCommand(dir, 17);
                            break;
                        case BUILDER:
                            writeBuilderSpawnCommand(dir, buildDest, isBuildLab);
                            // update lab stage
                            Comms.writeBuildLab(LAB_NEEDED_LAB_STAGE, 10);
                            //
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
        // waiting for a builder + lab
        if (curLabStage == BUILDER_NEEDED_LAB_STAGE) {
            if (curLabArchonIndex == myArchonIndex) {
                // if i'm the main builder, make sure we have almost enough for a lab + builder
                // aka we have at least the cost of the lab
                int cost = LABORATORY.buildCostLead;
                if (rc.getTeamLeadAmount(us) < cost) {
                    return false;
                } else {
                    return true; // immediately return if true
                }
            } else {
                // if i'm not the main builder, only build if:
                // we still have enough for a lab + builder (after our build)
                int cost = LABORATORY.buildCostLead + BUILDER.buildCostLead;
                cost += 75;
                if (rc.getTeamLeadAmount(us) < cost) {
                    return false;
                }
            }
        }

        // waiting for a lab
        if (curLabStage == LAB_NEEDED_LAB_STAGE) {
            // if we're waiting for a lab, only build if:
            // we still have enough for a lab (after our build)
            int cost = LABORATORY.buildCostLead;
            cost += 75;
            if (rc.getTeamLeadAmount(us) < cost) {
                return false;
            }
        }

        if (rc.getTeamLeadAmount(us) > 500) {
            return true;
        }

        // get archon index
        int relIndex = 0;
        for (int i = MAX_ARCHONS; --i > myArchonIndex; ) {
            // count number of stationary archons
            if (isAllyArchonLive[i]) {
                relIndex++;
            }
        }

//        log("index " + relIndex + " " + rc.getArchonCount() + " " + )
        if (relIndex % rc.getArchonCount() == teamSpawnCount % rc.getArchonCount()) {
            return true;
        }

        return false;
    }

    public static void pickNextSpawnType() {
        int numMiners = getUnitCount(MINER);
        int numFighters = getUnitCount(SOLDIER) + getUnitCount(SAGE);
        log("Standard: " + numFighters + " " + numMiners + " vs " + minerGoal);

        // build builder if needed
        log("lab " + curLabStage + " " + curLabArchonIndex + " " + myArchonIndex);
        if (checkShouldBuildLabBuilder()) {
            nextSpawnType = BUILDER;
            return;
        }

        if (rc.getTeamGoldAmount(us) >= SAGE.buildCostGold) {
            nextSpawnType = SAGE;
            return;
        }

        // build soldier if in danger
        if (sensedEnemies.length > 0) {
            nextSpawnType = SOLDIER;
            return;
        }

        // build miner if need to target loc
        updateMineHelpTargetLoc();
        if (numFighters >= numMiners / 3.0) { // at least a 1 to 3 ratio
            if (myMineHelpTargetLoc != null) {
                nextSpawnType = MINER;
                return;
            }
        }


        // hard coded early game
        if (mySpawnCount < 3) {
            nextSpawnType = MINER;
            return;
        } else if (mySpawnCount == 3) {
            nextSpawnType = SOLDIER;
            return;
        }

        /*
        Standard build order
         */

        double soldierGoal = numMiners;

        // mineLocs
        if (numMiners >= minerGoal) {
            soldierGoal = minerGoal + (numMiners - minerGoal) * 3;
        }

        if (numFighters <= soldierGoal) {
            nextSpawnType = SOLDIER;
            return;
        } else {
            nextSpawnType = MINER;
            return;
        }
    }

    public static boolean checkShouldBuildLabBuilder() {
        return curLabStage == BUILDER_NEEDED_LAB_STAGE && curLabArchonIndex == myArchonIndex;
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

    final public static int BUILD_LAB_DELAY = 50; // wait at least this number of rounds

    public static void updateBuildLab() throws GameActionException {
        if (!isPrimaryArchon()) {
            return;
        }

        // wait at least 50 rounds between lab building attempts
        if (roundNum - curLabSentRound < BUILD_LAB_DELAY) {
            return;
        }

        // only need to set stage if necessary
        if (curLabStage != NO_LAB_STAGE) {
            return;
        }

        // when to build new labs?
//        boolean needMoreLab = getUnitCount(LABORATORY) == 0 && roundNum > 50;
        boolean needMoreLab;
        if (roundNum >= 50) {
            int targetLabNum = 1 + getUnitCount(SOLDIER) / 15;

            if (getUnitCount(LABORATORY) < targetLabNum) {
                needMoreLab = true;
            } else {
                needMoreLab = false;
            }
        } else {
            needMoreLab = false;
        }


        // first one should be built at
        if (needMoreLab) {
            if (getUnitCount(BUILDER) == 0) {
                // find best archon to spawn lab
                int bestIndex = -1;
                int bestDist = N_INF; // want to maximize this
                for (int i = MAX_ARCHONS; --i >= 0;) {
                    log("i " + i + " " + isAllyArchonLive[i] + " " + allyArchonMoveIndex);
                    if (isAllyArchonLive[i] && allyArchonMoveIndex != i) {
                        MapLocation loc = allyArchonLocs[i];
                        MapLocation enemyLoc = getClosestEnemyArchonSymLoc(loc);
                        int dist = loc.distanceSquaredTo(enemyLoc);
                        if (dist > bestDist) {
                            bestDist = dist;
                            bestIndex = i;
                        }
                    }
                }

                if (bestIndex != -1) {
                    Comms.writeBuildLab(BUILDER_NEEDED_LAB_STAGE, bestIndex);
                } else {
                    logi("WARNING: 'updateBuildLab' unexpected bestIndex " + bestIndex);
                }
                return;
            } else {
                Comms.writeBuildLab(LAB_NEEDED_LAB_STAGE, 10);
            }
        }
    }

//    public static boolean checkLabPhase() {
//        if (roundNum > 100) {
//            if (unknownCount <= ZONE_TOTAL_NUM / 2) { // if we have explored at least half
//                return true;
//            }
//        }
//        return false;
//    }

    public static MapLocation myMineHelpTargetLoc;
    public static int myMineHelpTargetIndex;

    public static void updateMineHelpTargetLoc() {
        myMineHelpTargetLoc = null;
        myMineHelpTargetIndex = -1;
        int myTargetDist = P_INF;

        for (int i = mineHelpCacheLen; --i >= 0;) {
            MapLocation loc = mineHelpCache[i];
            int dist = here.distanceSquaredTo(loc);
            if (dist < myTargetDist) {
                myMineHelpTargetLoc = loc;
                myMineHelpTargetIndex = i;
                myTargetDist = dist;
            }
        }
        // done
    }

    public static void updateMineHelpSpawnSuccess() {
        mineHelpNumSpawns[myMineHelpTargetIndex]--;
        if (mineHelpNumSpawns[myMineHelpTargetIndex] == 0) {
            mineHelpCacheLen--;
            mineHelpCache[myMineHelpTargetIndex] = mineHelpCache[mineHelpCacheLen];
            mineHelpNumSpawns[myMineHelpTargetIndex] = mineHelpNumSpawns[mineHelpCacheLen];
        }
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

    public static MapLocation getBuildDestBuilder() throws GameActionException {
        // inits if hasn't already
        HardCode.init_OFFSET9();

        int[][] offsets = HardCode.OFFSET9;

        MapLocation bestLoc = null;
        int bestRubble = P_INF;
        int bestDist = P_INF;
        for (int i = offsets.length; --i >= 0;) {
            MapLocation loc = here.translate(offsets[i][0], offsets[i][1]);
            if (rc.onTheMap(loc) && !rc.isLocationOccupied(loc)) {
                int rubble = rc.senseRubble(loc);
                if (rubble < bestRubble) {
                    bestLoc = loc;
                    bestRubble = rubble;
                    bestDist = here.distanceSquaredTo(loc);
                } else if (rubble == bestRubble) {
                    int dist = here.distanceSquaredTo(loc);
                    if (dist < bestDist) {
                        bestLoc = loc;
                        bestRubble = rubble;
                        bestDist = dist;
                    }
                }
            }
        }

        if (bestLoc == null) {
            return here;
        }

        return bestLoc;
    }

    public static Direction tryBuild(RobotType rt, MapLocation buildDest) throws GameActionException {
        return tryBuild(rt, buildDest, false);
    }

    public static Direction tryBuild(RobotType rt, MapLocation buildDest, boolean useCheap) throws GameActionException {
        if (buildDest == null) { // build on cheapest tile
            Direction buildDir = tryBuildBestRubble(rt);
            return buildDir;
        }

        // build using bfs
        Direction buildDir;
        if (useCheap) {
            buildDir = BFS13.getBestDir(buildDest);
        } else {
            buildDir = BFS20.getBestDir(buildDest);
        }

        if (buildDir != null) {
            Actions.doBuildRobot(rt, buildDir);
            return buildDir;
        } else {
            return tryBuildBestRubble(rt);
        }
    }

    public static Direction tryBuildBestRubble(RobotType rt) throws GameActionException {
        Direction bestDir = getBuildBestRubbleDir();

        if (bestDir != null) {
            Actions.doBuildRobot(rt, bestDir);
            return bestDir;
        } else {
            return null;
        }
    }

    public static Direction getBuildBestRubbleDir() throws GameActionException {
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

        return bestDir;
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

        // is close enough to conflict
        if (conflictLoc != null) {
            if (Math.sqrt(here.distanceSquaredTo(conflictLoc)) <= 13) {
                return false;
            }
        }

        // check no other archon is moving
        if (allyArchonMoveIndex != -1) {
            return false;
        }

        // don't move if i am the builder builder
        if (checkShouldBuildLabBuilder()) {
            return false;
        }

        // don't do as solo archon
        if (rc.getArchonCount() == 1) {
            return false;
        }

        // check better location
        if (rc.senseRubble(here) > 0) {
            if (checkBetterRubble()) {
                return true;
            }
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

    public static MapLocation rubbleCheckCenter;
    public static MapLocation rubbleCheckCurLoc;
    public static int rubbleCheckIndex;

    public static boolean checkBetterRubble() throws GameActionException {
        if (here != rubbleCheckCenter) {
            // reset
            rubbleCheckCenter = here;
            rubbleCheckCurLoc = here;
            rubbleCheckIndex = DIRS34.length;
        }

        if (rubbleCheckIndex == -1) {
            return false;
        }

        // check 10 locations for better rubble
        int hereRubble = rc.senseRubble(here);
        int numCheck = 20;
        for (int i = numCheck; --i >= 0;) {
            if (rubbleCheckIndex <= 0) {
                return false;
            }
            rubbleCheckIndex--;
            rubbleCheckCurLoc = rubbleCheckCurLoc.add(DIRS34[rubbleCheckIndex]);
            //
            if (rc.onTheMap(rubbleCheckCurLoc)) {
                if (rc.senseRubble(rubbleCheckCurLoc) < hereRubble) {
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


    public static MapLocation conflictLoc;
    public static int conflictRound;

    public static void updateLatestDanger() {
        if (roundNum - conflictRound >= 20) {
            conflictLoc = null;
        }

        // check if new loc is better
        MapLocation bestLoc = getClosestEnemyReport(here);
        if (bestLoc != null) { // if we have a new loc
            if (conflictLoc == null) { // conflictLoc doesn't exist
                conflictLoc = bestLoc;
                conflictRound = roundNum;
            } else { // conflictLoc does exist
                if (bestLoc.equals(conflictRound)) {
                    // is the same target
                    conflictRound = roundNum;
                } else { // is a diff target
                    // wait at least 10 rounds before switching targets
                    if (roundNum - conflictRound >= 10) { // switch if better
                        if (here.distanceSquaredTo(bestLoc) < here.distanceSquaredTo(conflictLoc)) {
                            conflictLoc = bestLoc;
                            conflictRound = roundNum;
                        }
                    }
                }
            }
        }
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
