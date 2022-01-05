package firstbot;

import battlecode.common.*;
import static battlecode.common.RobotType.*;

import static firstbot.Comms.*;
import static firstbot.Debug.*;
import static firstbot.Utils.*;

public class Archon extends Robot {
    // constants

    // public static int[] SLANDERER_COSTS;

    // variables



    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
    }

    public static RobotType[] potentialSpawns = new RobotType[]{MINER, BUILDER, SOLDIER};
    public static int numSpawns = 0;
    public static int myArchonIndex = -1;

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // second turn update

        for (int i = 0; i < 4; i++) {
            log("i " + i + ": " + allyArchonLocs[i]);
        }

        if (myID == 5) {
            printBuffer();
            rc.resign();
        }

        if (!rc.isActionReady()) {
            return;
        }


        // rotate through different spawns
        if (randInt(5) == 0) {
            RobotType spawnType = potentialSpawns[numSpawns % 3];
            if (rc.getTeamLeadAmount(us) >= spawnType.buildCostLead) {
                for (int i = DIRS.length; --i >= 0; ) {
                    Direction dir = DIRS[i];
                    MapLocation loc = here.add(dir);
                    if (!rc.onTheMap(loc)) {
                        continue;
                    }
                    if (!rc.canSenseRobotAtLocation(loc)) {
                        Actions.doBuildRobot(spawnType, dir);
                        numSpawns++;
                        return;
                    }
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
}
