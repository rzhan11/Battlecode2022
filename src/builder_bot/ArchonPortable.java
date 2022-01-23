package builder_bot;

import battlecode.common.*;

import static builder_bot.Comms.*;
import static builder_bot.Debug.*;
import static builder_bot.HardCode.*;

public class ArchonPortable extends Archon {


    public static boolean shouldTransformTurret;
    public static int shouldTransformTurretRound;

    public static MapLocation settleLoc;
    public static int settleLocRubble;
    public static int settleMoves;

    final public static int SETTLE_PATIENCE = 10;

//    public static MapLocation conflictLoc;
//    public static int conflictLocRound = -100;

    /*
    Called evertime we start this
     */
    public static void init() {
        shouldTransformTurret = false;
        shouldTransformTurretRound = -1;
        settleLoc = null;
        settleLocRubble = -1;
        settleMoves = 0;
    }

    public static void turn() throws GameActionException {
        // notify that i am moving
        writeArchonMove(myArchonIndex);

        //
        if (checkTrySpawn()) {
            teamSpawnCount = (teamSpawnCount + 1) % rc.getArchonCount();
            Comms.writeSpawnCount(teamSpawnCount);
        }

        if (!shouldTransformTurret) {
            checkTransform();
        }

        if (!rc.isMovementReady()) {
            return;
        }

        if (shouldTransformTurret) {
            // try move
            if (settleMoves <= SETTLE_PATIENCE) {
                if (rc.senseRubble(here) <= settleLocRubble) {
                    // settle if good enough
                    Actions.doTransform();
                    return;
                } else {
                    Direction moveDir = BFS.move(settleLoc);
                    settleMoves++;
                    return;
                }
            } else { // if a lot of time has passed, use greedy
                // move to best
                Direction moveDir = Nav.moveBetterTile(false);
                if (moveDir != null) {
                    return;
                }
                Actions.doTransform();
                return;
            }
        }


        // go to conflict

        // check if reset current conflictLoc


        log("conflictLoc " + conflictLoc);
        if (conflictLoc != null) {
            Direction moveDir = BFS.move(conflictLoc);
            drawLine(here, conflictLoc, BLACK);
            return;
        } else {
            initiateTransform();
        }
    }

    public static boolean checkTransform() throws GameActionException {

        // is close enough to conflict
        if (conflictLoc != null) {
            if (Math.sqrt(here.distanceSquaredTo(conflictLoc)) <= 10) {
                initiateTransform();
                return true;
            }
        }

        if (sensedEnemies.length > 0) {
            initiateTransform();
            return true;
        }

        return false;
    }

    public static void initiateTransform() throws GameActionException {
        shouldTransformTurret = true;
        shouldTransformTurretRound = roundNum;
        findParkingSpot();
    }

    public static void findParkingSpot() throws GameActionException {
        // find best spot
        MapLocation bestLoc = here;
        int bestRubble = rc.senseRubble(here);
        MapLocation loc = here;
        for (int i = DIRS34.length; --i >= 0;) {
            loc = loc.add(DIRS34[i]);
            if (rc.onTheMap(loc)) {
                int rubble = rc.senseRubble(loc);
                if (rubble < bestRubble) {
                    bestLoc = loc;
                    bestRubble = rubble;
                }
            }
        }
        settleLoc = bestLoc;
        settleLocRubble = bestRubble;
    }

}
