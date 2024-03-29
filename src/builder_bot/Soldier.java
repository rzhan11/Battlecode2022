package builder_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static builder_bot.Debug.*;
import static builder_bot.Explore.*;
import static builder_bot.Zone.*;

public class Soldier extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();

        curEnemyDangers = new RobotInfo[curEnemyDangers_MAX_LEN];
//        curEnemyNeutrals = new RobotInfo[curEnemyNeutrals_MAX_LEN];
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        initEnemyTypeArrays();

        // go home
        updateHomeLoc();
        log("home " + homeLoc + " " + rc.getHealth());
        if (homeLoc != null) {
            if (rc.isMovementReady()) {
                Direction moveDir = moveHome();
            }
        }

        if (curEnemyDangerCount > 0) {
            if (rc.isActionReady() || rc.isMovementReady()) {
                Utils.startBytecode("smartAttack");
                smartAttack();
                Utils.stopBytecode("smartAttack");
                return;
            }
        }

        if (homeLoc != null) {
            if (rc.isActionReady()) {
                tryAttack();
            }
            return;
        }

        tryAttack();
        moveLogic();
        tryAttack();
    }

    // complex smart attack (<= 5 soldiers or even 1v1s)

    // simple smart attack (find weakest soldier, ignore moves)


    public static double smartAttack_BestOurDPS;
    public static Direction smartAttack_BestOurDPSDir;

    public static void smartAttack() throws GameActionException {
        // there is at least 1 enemy

        Direction bestMoveDir = null;
        RobotInfo bestEnemy = null;
        double bestScore = N_INF;

        smartAttack_BestOurDPS = N_INF; // reset this variable
        smartAttack_BestOurDPSDir = Direction.CENTER;
        if (rc.isMovementReady()) { // check moveable directions
            for (int i = DIRS.length; --i >= 0; ) {
                Direction dir = ALL_DIRS[i];

                double localBestScore = getSmartAttackScore(dir);

                if (localBestScore > bestScore) {
                    bestEnemy = smartAttack_LocalBestEnemy;
                    bestScore = localBestScore;
                    bestMoveDir = dir;
                }
            }
        }

        // center direction
        {
            Direction dir = Direction.CENTER;
            double localBestScore = getSmartAttackScore(dir);
            if (localBestScore > bestScore) {
                bestEnemy = smartAttack_LocalBestEnemy;
                bestScore = localBestScore;
                bestMoveDir = dir;
            }
        }

        // if there is a target that can be hit
        // move if needed
        String text = "smart: ";

        if (bestMoveDir != null) {
            if (bestMoveDir == Direction.CENTER) {
                // shoot then move
                if (bestEnemy != null) {
                    Actions.doAttack(bestEnemy.location);
                    text += "hit-";
                } else {
                    text += "nohit-";
                }
                if (smartAttack_BestOurDPSDir != Direction.CENTER) {
                    Actions.doMove(smartAttack_BestOurDPSDir);
                    text += "move";
                } else {
                    text += "nomove";
                }
            } else {
                // move then shoot
                Actions.doMove(bestMoveDir); // always move
                if (bestEnemy != null) {
                    Actions.doAttack(bestEnemy.location);
                    text += "move-hit";
                } else {
                    // just move
                    text += "move-nohit";
                }
            }
        } else {
            // should never reach here
            logi("WARNING: 'smartAttack' shouldn't reach here");
        }

        rc.setIndicatorString(text);
    }

    public static RobotInfo smartAttack_LocalBestEnemy;

    public static double getSmartAttackScore(Direction dir) throws GameActionException {
        if (dir != Direction.CENTER && !rc.canMove(dir)) { // skip if cannot move
            return N_INF;
        }

        double myDamage = myType.damage;
        MapLocation destLoc = rc.adjacentLocation(dir);

        smartAttack_LocalBestEnemy = null;

        double bestTheirDPSDecrease = 0.0;
        double ourHurt = 0.0;
        for (int j = curEnemyDangerCount; --j >= 0; ) {
            RobotInfo ri = curEnemyDangers[j];
            MapLocation loc = ri.location;
            if (destLoc.isWithinDistanceSquared(loc, myActionRadius)) { // if i can hit it
                double theirTime = (10 + rc.senseRubble(loc)) / 10.0;
                // score = how much damage being taken away
                // score = d^2 / (health * theirTime)
                // make it 1.01 to favor aggression
                double score = 1.01 * (myDamage * Math.min(myDamage, ri.health) / ri.health) * (1 / theirTime);
                if (score > bestTheirDPSDecrease) {
                    smartAttack_LocalBestEnemy = ri;
                    bestTheirDPSDecrease = score;
                }

                // update hurt value
                ourHurt += myDamage / theirTime;
            } else if (destLoc.isWithinDistanceSquared(loc, myVisionRadius)) {
                // reduced hurt value for this
                double theirTime = (10 + rc.senseRubble(loc)) / 10.0;

                // update (reduced) hurt value
                ourHurt += 0.25 * myDamage / theirTime;
            }
        }
        // divide by local time
        double localDelay = (10 + rc.senseRubble(destLoc)) / 10.0;
        bestTheirDPSDecrease /= localDelay;
//        log("local " + dir + " " + myHealth + " " + ourHurt + " " + myDamage + " " + localDelay);

        // calculate ourHealth from ourHurt and healing
        ourHurt = Math.min(myHealth, ourHurt); // cap hurt at total health
        double ourHealth = myHealth - ourHurt;
        MapLocation archonLoc = getClosestAllyArchon(here, true);
        if (archonLoc != null && destLoc.isWithinDistanceSquared(archonLoc, ARCHON.actionRadiusSquared)) {
            double numSplit = Math.max(1, (1 + sensedAllySoldierCount) * 0.5);
            double healAmt = Math.min(2.0, myType.getMaxHealth(1) - ourHealth);
            // heals by 2
            ourHealth += healAmt / numSplit;
        }

        // calculate ourDPS from ourHealth
        double ourDPS = (ourHealth / myHealth) * myDamage / localDelay;

        // if it is the center dir, we can move after attacking, so we can use the best dps
        if (ourDPS > smartAttack_BestOurDPS) {
            smartAttack_BestOurDPS = ourDPS;
            smartAttack_BestOurDPSDir = dir;
        }
        if (dir == Direction.CENTER) {
            ourDPS = smartAttack_BestOurDPS;
        }
//        tlog("ourHurt/DPS " + ourHurt + " " + ourDPS);
//        tlog("theirDPS/delay " + bestTheirDPSDecrease + " " + localDelay);

        double localBestScore;
        if (rc.isActionReady()) {
            localBestScore = bestTheirDPSDecrease + ourDPS;
//            tlog("can attack");
        } else {
            localBestScore = ourDPS;
            smartAttack_LocalBestEnemy = null;
//            tlog("cannot attack");
        }
//        tlog("score " + localBestScore);
//        logline();

        return localBestScore;
    }

    public static RobotInfo[] curEnemyDangers;
    public static int curEnemyDangerCount;
    final public static int curEnemyDangers_MAX_LEN = 20;
    public static RobotInfo[] curEnemyNeutrals;
//    public static int curEnemyNeutralCount;
//    final public static int curEnemyNeutrals_MAX_LEN = 20;

    public static void initEnemyTypeArrays() throws GameActionException {
        curEnemyDangerCount = 0;
//        curEnemyNeutralCount = 0;

        // todo: optimize for dense units

        // put soldiers in
        if (curEnemyDangerCount < curEnemyDangers_MAX_LEN) {
            for (int i = sensedEnemySoldierCount; --i >= 0;) {
                curEnemyDangers[curEnemyDangerCount++] = sensedEnemySoldiers[i];
                if (curEnemyDangerCount >= curEnemyDangers_MAX_LEN) {
                    break;
                }
            }
        }
        // repeat for sages/watchtowers?
//        if (curEnemyDangerCount < curEnemyDangers_MAX_LEN) {
//            for (int i = sensedEnemySoldierCount; --i >= 0;) {
//                curEnemyDangers[curEnemyDangerCount++] = sensedEnemySoldiers[i];
//                if (curEnemyDangerCount >= curEnemyDangers_MAX_LEN) {
//                    break;
//                }
//            }
//        }

//        for (int i = sensedEnemies.length; --i >= 0; ) {
//            RobotInfo ri = sensedEnemies[i];
//            switch (ri.type) {
////                case SAGE:
//                case SOLDIER:
//                    if (curEnemyDangerCount < curEnemyDangers_MAX_LEN) {
//                        curEnemyDangers[curEnemyDangerCount++] = ri;
//                    }
//                    break;
//                default:
//                    if (curEnemyNeutralCount < curEnemyNeutrals_MAX_LEN) {
//                        curEnemyNeutrals[curEnemyNeutralCount++] = ri;
//                    }
//                    break;
//            }
//        }
    }


    public static Direction moveLogic() throws GameActionException {
        // skip turn, if cooldown is too high
        if (!rc.isMovementReady()) {
            return null;
        }


        updateTargetEnemyLoc();
        log("target " + targetEnemyLoc + " " + targetEnemyLocDanger);

        // if enemies are visible, but too far, chase
        // should automatically target the closest one
        if (sensedEnemies.length > 0) {
            Direction moveDir;

            // if not currently in danger, but has dangerous target, go to dangerous target
//                if (targetEnemyLocDanger) {
//                    moveDir = goToTargetEnemy();
//                    return moveDir;
//                }

            // chase current enemy
            moveDir = chaseNeutral();
            return moveDir;
        }

        // go towards target, if we have one
        if (targetEnemyLoc != null) {
            Direction moveDir = goToTargetEnemy();
            return moveDir;
        }


        Direction moveDir = Explore.exploreSimple();
        rc.setIndicatorString("exploring " + Explore.exploreLoc);
        return moveDir;
    }

    final public static int STAY_HOME_LEAD_MAX = 300;
    final public static int HOME_LOC_UPDATE_FREQ = 10;
    public static MapLocation homeLoc;
    public static int homeLocRound = 0;

    /*
    If myHealth > 45, reset homeLoc
    If myHealth < 15, go home
    Don't go home if lots of lead
     */
    public static void updateHomeLoc() throws GameActionException {
        // if has lots of health
        if (rc.getHealth() >= 49 || rc.getTeamLeadAmount(us) > STAY_HOME_LEAD_MAX) {
            homeLoc = null;
            return;
        }

        // if needs healing, try to find a homeLoc
        if (homeLoc == null) {
            if (rc.getHealth() <= 15 && rc.getTeamLeadAmount(us) < STAY_HOME_LEAD_MAX) {
                homeLoc = getClosestAllyArchon(here, true);
                homeLocRound = roundNum;
                return;
            }
        }

        // if old data, update the homeLoc
        if (homeLoc != null && roundNum - homeLocRound >= HOME_LOC_UPDATE_FREQ) {
            log("updating");
            homeLoc = getClosestAllyArchon(here, true);
            tlog("" + homeLoc);
            homeLocRound = roundNum;
            return;
        }
    }

    public static Direction moveHome() throws GameActionException {

        // can be healed
        if (here.isWithinDistanceSquared(homeLoc, ARCHON.actionRadiusSquared)) {
            // stay still
            // if near home and has a lot of people to be healed
            if (sensedAllySoldierCount >= 8 && myHealth <= 15 && sensedEnemySoldierCount == 0) {
                Nav.moveSuicideTile(true);
//                return null;
                Actions.doDisintegrate();
                return null;
            }
            rc.setIndicatorString("at home");
            if (sensedEnemySoldierCount == 0) {
                Direction moveDir = Nav.moveBetterTile(homeLoc, ARCHON.actionRadiusSquared, true);
                return moveDir;
            }
            // if enemy soldier count > 0, dont move and go to better tile
            return null;
        } else {
            rc.setIndicatorString("going home");
            if (sensedEnemySoldierCount == 0) {
                Direction moveDir = BFS.move(homeLoc);
                return moveDir;
            }
            return null;
        }
    }

    public static Direction runAwayFromEnemy() throws GameActionException {
        // find closest danger soldiers
        RobotInfo[] closeEnemies = sensedEnemies;
        MapLocation closestEnemySoldier = null;
        int bestDist = P_INF;
        for (int i = closeEnemies.length; --i >= 0; ) {
            RobotInfo ri = closeEnemies[i];
            if (ri.type == SOLDIER) {
                int dist = here.distanceSquaredTo(ri.location);
                if (dist < bestDist) {
                    bestDist = dist;
                    closestEnemySoldier = ri.location;
                }
            }
        }

        if (closestEnemySoldier != null) {
            return Nav.fuzzyAwaySimple(closestEnemySoldier);
        }
        return null;
    }


    public static Direction chaseNeutral() throws GameActionException {
        //
        if (attackableEnemies.length > 0) {
            Direction moveDir = Nav.moveBetterTile(bestAttackLoc, myActionRadius, true);
            rc.setIndicatorString("adjusting in range");
            return moveDir;
        }


        MapLocation bestLoc = null;
        int bestDist = P_INF;
        if (sensedEnemies.length > 20) {
            bestLoc = sensedEnemies[0].location;
            bestDist = here.distanceSquaredTo(bestLoc);
        } else {
            for (int i = sensedEnemies.length; --i >= 0; ) {
                MapLocation loc = sensedEnemies[i].location;
                int dist = here.distanceSquaredTo(loc);
                if (dist < bestDist) {
                    bestLoc = loc;
                    bestDist = dist;
                }
            }
        }

        if (bestLoc != null) {
            Direction moveDir = Nav.fuzzyToSimple(bestLoc);
            Debug.drawLine(here, bestLoc, RED);
            rc.setIndicatorString("chasing");
            return moveDir;
        }

        return null;
    }

    public static RobotInfo[] attackableEnemies;
    public static MapLocation bestAttackLoc;

    public static void updateAttackInfo() {

        bestAttackLoc = null;

        // if enemies in range, attack
        attackableEnemies = rc.senseNearbyRobots(myActionRadius, them);

        RobotInfo bestEnemy = null;
        int bestScore = N_INF;
        for (int i = attackableEnemies.length; --i >= 0; ) {
            int score = getAttackEnemyScore(attackableEnemies[i]);
            if (score > bestScore) {
                bestEnemy = attackableEnemies[i];
                bestScore = score;
            }
        }

        if (bestEnemy != null) {
            bestAttackLoc = bestEnemy.location;
        }
    }

    public static void tryAttack() throws GameActionException {
        updateAttackInfo();
        if (!rc.isActionReady()) {
            return;
        }

        if (bestAttackLoc != null) {
            Actions.doAttack(bestAttackLoc);
            return;
        }
    }

    public static int getAttackEnemyScore(RobotInfo ri) {
        // prioritize lower health
        int score = 1000 - ri.health;

        // attack troops in this priority
        switch (ri.type) {
            case SOLDIER:
                score += 7e6;
                break;
            case WATCHTOWER:
                score += 6e6;
                break;
            case SAGE:
                score += 5e6;
                break;
            case MINER:
                score += 4e6;
                break;
            case BUILDER:
                score += 3e6;
                break;
            case LABORATORY:
                score += 2e6;
                break;
            case ARCHON:
                score += 1e6;
                break;
        }

        return score;
    }

    public static MapLocation targetEnemyLoc;
    public static boolean targetEnemyLocDanger;
    final public static int GOTO_TARGET_ENEMY_DIST = 8;

    private static Direction goToTargetEnemy() throws GameActionException {
        Direction moveDir = BFS.move(targetEnemyLoc);
        drawLine(here, targetEnemyLoc, MAGENTA);
        rc.setIndicatorString("going to report " + targetEnemyLoc);
        return moveDir;
    }


    public static void updateTargetEnemyLoc() {
        // if close enough to enemy, pick new area
        if (targetEnemyLoc != null) {
            if (checkResetTargetEnemyLoc(targetEnemyLoc)) {
                resetTargetEnemyLoc();
            }
        }


        int index = getBestEnemyReportLoc();
        if (index >= 0) {
            MapLocation newLoc = Comms.reportedEnemyLocs[index];
            boolean newDanger = Comms.isReportedEnemyLocDanger[index];

            // ensure is not super close location
            if (checkResetTargetEnemyLoc(newLoc)) {
                return;
            }

            if (targetEnemyLoc == null) {
                targetEnemyLoc = newLoc;
                targetEnemyLocDanger = newDanger;
                return;
            }

            double curDist = Math.sqrt(here.distanceSquaredTo(targetEnemyLoc));
            int newScore = compareEnemyLocs(newLoc, newDanger, targetEnemyLoc, targetEnemyLocDanger);
            if (newScore < 0) { // must be better by at least 10 tiles
                if (Math.sqrt(-newScore) >= 10) {
                    targetEnemyLoc = newLoc;
                    targetEnemyLocDanger = newDanger;
                    return;
                }
            }
        }
    }

    public static boolean checkResetTargetEnemyLoc(MapLocation loc) {
        return here.isWithinDistanceSquared(loc, GOTO_TARGET_ENEMY_DIST);
    }

    public static void resetTargetEnemyLoc() {
        targetEnemyLoc = null;
        targetEnemyLocDanger = false;
    }

    public static void findNewTargetEnemyLoc() {
        int index = getBestEnemyReportLoc();
        if (index >= 0) {
            targetEnemyLoc = Comms.reportedEnemyLocs[index];
            targetEnemyLocDanger = Comms.isReportedEnemyLocDanger[index];
        } else {
            resetTargetEnemyLoc();
        }
    }

    /*
    Find closest danger enemy loc
     */
    final public static int MAX_REPORT_ENEMY_DIST = 400;

    public static int getBestEnemyReportLoc() {
        if (Comms.reportedEnemyCount == 0) {
            return -1;
        }

        int bestIndex = 0;
        MapLocation bestLoc = Comms.reportedEnemyLocs[0];
        boolean bestHasDanger = Comms.isReportedEnemyLocDanger[0];
        for (int i = Comms.reportedEnemyCount; --i >= 0; ) {
            MapLocation loc = Comms.reportedEnemyLocs[i];
            boolean hasDanger = Comms.isReportedEnemyLocDanger[i];
            if (compareEnemyLocs(loc, hasDanger, bestLoc, bestHasDanger) < 0) { // prefer new (1st) location
                bestIndex = i;
                bestLoc = loc;
                bestHasDanger = hasDanger;
            }
        }

        return bestIndex;
    }

    /*
    Returns negative if loc1 is better
    Returns 0 if equal
    Returns positive if loc2 is better
     */
    public static int compareEnemyLocs(MapLocation loc1, boolean danger1, MapLocation loc2, boolean danger2) {
        int dist1 = here.distanceSquaredTo(loc1);
        int dist2 = here.distanceSquaredTo(loc2);

        // prefer not visible
        if (checkResetTargetEnemyLoc(loc1)) { // loc1 is invalid
            if (!checkResetTargetEnemyLoc(loc2)) { // loc2 is valid
                return (int) 1e6;
            }
        } else { // loc1 is valid
            if (checkResetTargetEnemyLoc(loc2)) { // loc1 is invalid
                return (int) -1e6;
            }
        }


        // prefer not far
        if (dist1 >= MAX_REPORT_ENEMY_DIST) {
            if (dist2 < MAX_REPORT_ENEMY_DIST) { // 1 is far, 2 is close
                return 20000;
            }
        } else {
            if (dist2 >= MAX_REPORT_ENEMY_DIST) { // 1 is close, 2 is far
                return -20000;
            }
        }

        // prefer danger
//        if (danger1) {
//            if (!danger2) {
//                return -10000;
//            }
//        } else {
//            if (danger2) {
//                return 10000;
//            }
//        }

        // prefer close
        return dist1 - dist2;
    }
}
