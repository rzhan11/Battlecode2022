package micro_bot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static micro_bot.Comms.*;
import static micro_bot.Debug.*;
import static micro_bot.Map.*;
import static micro_bot.Resource.*;
import static micro_bot.Utils.*;

public class Archon extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables



    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms

    }

    public static RobotType[] potentialSpawns = new RobotType[]{MINER, SOLDIER, BUILDER};
    public static int numSpawns = 0;
    public static int myArchonIndex = -1;

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here
//        if (roundNum == 100) {
//            rc.resign();
//        }

        // second turn update

        for (int i = 0; i < 4; i++) {
            log("i " + i + ": " + allyArchonLocs[i] + " " + isAllyArchonLive[i]);
        }

        if (isPrimaryArchon()) {
            Resource.displayZoneStatus();
        }

//        if (myID == 5) {
//            printBuffer();
//            rc.resign();
//        }

        if (!rc.isActionReady()) {
            return;
        }

        // rotate through different spawns
        boolean shouldTrySpawn = roundNum % rc.getArchonCount() == myArchonIndex % rc.getArchonCount();
        shouldTrySpawn |= rc.getTeamLeadAmount(us) > 500;
        if (shouldTrySpawn) {
            // only spawn miner and soldier
            RobotType spawnType = potentialSpawns[numSpawns % 2];
            if (rc.getTeamLeadAmount(us) > 500 * rc.getArchonCount()) { // build builder if rich
                if (random() < 0.2) {
                    spawnType = BUILDER;
                } else {
                    if (random() < 0.8) {
                        spawnType = SOLDIER;
                    } else {
                        spawnType = MINER;
                    }
                }
            }
            if (rc.getTeamLeadAmount(us) >= spawnType.buildCostLead) {
                Direction dir = tryBuild(spawnType, Direction.NORTH);
                if (dir != null) {
                    numSpawns++;
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
        for (int i = myArchonIndex; --i >= 0;) {
            if (isAllyArchonLive[i]) {
                return false;
            }
        }
        return true;
    }
}
