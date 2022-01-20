package archon_attack_bot;

import battlecode.common.*;

import static archon_attack_bot.Debug.*;
import static archon_attack_bot.Robot.*;

public class BFS {

    final public static int BYTECODE_REMAINING = 1000;
    final public static int BYTECODE_REMAINING_NON_SLAND = 2500;
    //static final int BYTECODE_BFS = 5000;
    final public static int GREEDY_TURNS = 4;

    public static int turnsGreedy = 0;

    public static MapLocation currentTarget = null;

    public static void reset(){
        turnsGreedy = 0;
        MapTracker.reset();
    }

    public static void update(MapLocation target){
        if (currentTarget == null || target.distanceSquaredTo(currentTarget) > 0){
            reset();
        } else --turnsGreedy;
        currentTarget = target;
        MapTracker.add(here);
    }

    public static void activateGreedy(){
        turnsGreedy = GREEDY_TURNS;
    }

    public static Direction move(MapLocation target) throws GameActionException {
        return move(target, false);
    }

    public static Direction move(MapLocation target, boolean greedy) throws GameActionException {
        if (here.isWithinDistanceSquared(target, 0)) {
            logi("WARNING: 'BFS.move' Already reached target");
            return null;
        }

        update(target);

        if (!greedy && turnsGreedy <= 0){

            //System.err.println("Using bfs");
            Utils.startBytecode("bfs");
            Direction dir;
            if (age < Zone.READ_BROADCAST_RESOURCE_ROUNDS) {
                dir = BFS13.getBestDir(target);
            } else {
                dir = BFS20.getBestDir(target);
            }
            Utils.stopBytecode("bfs");
            if (dir != null && !MapTracker.check(rc.adjacentLocation(dir))){
//                rc.setIndicatorString("using bfs");
                Actions.doMove(dir);
                return dir;
            } else activateGreedy();
        }

        // greedy movement
        {
            Direction moveDir = Nav.fuzzyTo(target);
            --turnsGreedy;
            return moveDir;
        }
    }
}