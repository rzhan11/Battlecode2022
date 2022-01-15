package archon_attack_bot;

import battlecode.common.*;

import javax.swing.*;

import static battlecode.common.RobotType.*;

import static archon_attack_bot.Comms.*;
import static archon_attack_bot.Debug.*;
import static archon_attack_bot.HardCode.*;
import static archon_attack_bot.Map.*;
import static archon_attack_bot.Utils.*;
import static archon_attack_bot.Zone.*;

public class ArchonPortable extends Archon {


    public static boolean shouldTransformTurret;
    public static int shouldTransformTurretRound;
    public static MapLocation settleLoc;
    public static int settleLocRubble;

    final public static int SETTLE_PATIENCE = 20;

    /*
    Called evertime we start this
     */
    public static void init() {
        shouldTransformTurret = false;
        shouldTransformTurretRound = -1;
        settleLoc = null;
        settleLocRubble = -1;
    }

    public static void turn() throws GameActionException {
        // notify that i am moving
        writeArchonMove(myArchonIndex);

        //
        if (checkTrySpawn()) {
            teamSpawnCount = (teamSpawnCount + 1) % rc.getArchonCount();
            Comms.writeSpawnCount(teamSpawnCount);
        }


        if (!rc.isMovementReady()) {
            HardCode.initBFS30();
            return;
        }

        if (!shouldTransformTurret) {
            boolean transformed = checkTransform();
            // find best spot
            MapLocation bestLoc = here;
            int bestRubble = rc.senseRubble(here);
            for (int i = BFS30.length; --i >= 0;) {
                MapLocation loc = here.translate(BFS30[i][0], BFS30[i][1]);
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

        if (shouldTransformTurret) {
            // try move
            if (roundNum - shouldTransformTurretRound <= SETTLE_PATIENCE) {
                if (rc.senseRubble(here) <= settleLocRubble) {
                    // settle if good enough
                    Actions.doTransform();
                    return;
                } else {
                    Direction moveDir = BFS.move(settleLoc);
                    return;
                }
            } else { // if a lot of time has passed, use greedy
                // move to best
                Direction moveDir = Nav.moveBetterTile();
                if (moveDir != null) {
                    return;
                }
                Actions.doTransform();
                return;
            }
        }

        MapLocation bestLoc = null;
        int bestDist = P_INF;
        for (int i = reportedEnemyCount; --i >= 0;) {
            MapLocation loc = reportedEnemyLocs[i];
            int dist = here.distanceSquaredTo(loc);
            if (dist < bestDist) {
                bestLoc = loc;
                bestDist = dist;
            }
        }

        log("bestLoc " + bestLoc);
        if (bestLoc != null) {
            Direction moveDir = BFS.move(bestLoc);
            drawLine(here, bestLoc, BLACK);
            return;
        }
    }

    public static boolean checkTransform() throws GameActionException {
        if (sensedEnemies.length > 0) {
            shouldTransformTurret = true;
            shouldTransformTurretRound = roundNum;
            return true;
        }
        return false;
    }

}
