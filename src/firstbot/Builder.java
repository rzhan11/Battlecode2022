package firstbot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;
import static firstbot.Utils.*;

public class Builder extends Robot {
    // constants

    // variables
    public static int healTarget;
    public static RobotInfo target;

    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms
        // Comms.writeXBounds();
        healTarget = -1;
        target = null;
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here

        // try to build random watchtower TESTING
        Direction randDir = DIRS[randInt(DIRS.length)];
        for (int i = 8; --i >= 0;) {
            if (rc.canBuildRobot(WATCHTOWER, randDir)) {
                Actions.doBuildRobot(WATCHTOWER, randDir);
            }
            randDir = randDir.rotateLeft();
        }

        // check if target building needs healing
        if (rc.canSenseRobot(healTarget)) {
            RobotInfo bot = rc.senseRobot(healTarget);
            if (target.health == target.type.getMaxHealth((target.health))) {
                healTarget = -1;
                target = null;
            }
            else {
                target = bot;
            }
        }

        // look for buildings nearby to heal
        if (healTarget == -1) {
            RobotInfo[] nearbyRobots = rc.senseNearbyRobots(-1, us);
            for (int i = nearbyRobots.length - 1; --i >= 0;) {
                RobotInfo bot = nearbyRobots[i];
                RobotType type = bot.getType();
                if (type == ARCHON || type == WATCHTOWER || type == LABORATORY) {
                    if (bot.health < type.getMaxHealth(bot.level)) {
                        healTarget = bot.ID;
                        target = bot;
                    }
                }
            }
        }

        // heal building if needed

        if (healTarget > 0) {
            if (rc.canRepair(target.location)) {
                Actions.doRepair(target.location);
            }
            else {
                MapLocation here = rc.getLocation();
                MapLocation there = target.location;

                Direction d = here.directionTo(there);
                if (rc.canMove(d)) {
                    Actions.doMove(d);
                }
            }
        }
        else {
            // move randomly
            randDir = DIRS[randInt(DIRS.length)];
            for (int i = 8; --i >= 0;) {
                if (rc.canMove(randDir)) {
                    Actions.doMove(randDir);
                }
                randDir = randDir.rotateLeft();
            }
        }
    }
}
