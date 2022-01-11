package sprint_bot;

import battlecode.common.*;

import static sprint_bot.Debug.*;
import static sprint_bot.Map.*;
import static sprint_bot.Robot.*;
import static sprint_bot.Utils.*;
import static sprint_bot.Zone.*;

public class Explore {
    public static boolean isExplorer;

    public static MapLocation exploreLoc;
    public static int attemptsSinceProgress = 0;

    public static int EXPLORE_PATIENCE = 10; // number of attempts to go towards a location before giving up
    public static int EXPLORE_DISTANCE_REQ = 9; // how close we will try to get to exploreLoc

    public static double momentumX;
    public static double momentumY;

    public static void init() {
        exploreLoc = getRandomLoc();
        isExplorer = random() < 0.5;
        momentumX = random();
        momentumY = random();
    }

    final public static int WALL_REPULSE_DIST = 2;
    final public static double WALL_FORCE_CONSTANT = 25;
    final public static double ALLY_FORCE_CONSTANT = 10.0;
    final public static double DANGER_FORCE_CONSTANT = 25.0;

    final public static double MAX_MOMENTUM = 10.0;

    public static void updateMomentum() {
        // edges
        if (here.x <= WALL_REPULSE_DIST) {
            int dist = here.x + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumX += force;
        } else if ((XMAX - here.x) <= WALL_REPULSE_DIST) {
            int dist = XMAX - here.x + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumX -= force;
        }
        if (here.y <= WALL_REPULSE_DIST) {
            int dist = here.y + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumY += force;
        } else if ((YMAX - here.y) <= WALL_REPULSE_DIST) {
            int dist = YMAX - here.y + 1;
            double force = WALL_FORCE_CONSTANT / (dist * dist);
            momentumY -= force;
        }

        int allySoldierCount = 0;

        // optimize in dense crowds
        int searchCount = Math.min(10, sensedAllies.length);
        // repel from ally archons/miners
        for (int i = searchCount; --i >= 0;) {
            RobotInfo ri = sensedAllies[i];
            switch (ri.type) {
//                case ARCHON:
                case MINER:
                    MapLocation loc = ri.location;
                    double dist_mag = Math.sqrt(here.distanceSquaredTo(loc));
                    double force = ALLY_FORCE_CONSTANT / (dist_mag * dist_mag);
                    int dx = here.x - loc.x;
                    int dy = here.y - loc.y;
                    momentumX += dx / dist_mag * force;
                    momentumY += dy / dist_mag * force;
                    break;
                case SOLDIER:
                    allySoldierCount++;
                default:
                    break;
            }
        }

        double allySupportFactor = Math.max(Math.min(allySoldierCount, 5), 1);


        // optimize in dense crowds
        searchCount = Math.min(10, sensedEnemies.length);
        // repel from ally archons/miners
        for (int i = searchCount; --i >= 0;) {
            RobotInfo ri = sensedEnemies[i];
            switch (ri.type) {
                case SAGE:
                case WATCHTOWER:
                case SOLDIER:
                    MapLocation loc = ri.location;
                    double dist_mag = Math.sqrt(here.distanceSquaredTo(loc));
                    double force = (DANGER_FORCE_CONSTANT / allySupportFactor) / (dist_mag * dist_mag);
                    int dx = here.x - loc.x;
                    int dy = here.y - loc.y;
                    momentumX += dx / dist_mag * force;
                    momentumY += dy / dist_mag * force;
                    break;
                default:
                    break;
            }
        }

        // enemy
        while (momentumX == 0 && momentumY == 0) {
            momentumX = random();
            momentumY = random();
        }

        double mag = momentumX * momentumX + momentumY * momentumY;
        if (mag > MAX_MOMENTUM) {
            momentumX *= MAX_MOMENTUM / mag;
            momentumY *= MAX_MOMENTUM / mag;
        }

        exploreLoc = getTargetLocFromMomentum(momentumX, momentumY);
    }

    public static MapLocation getTargetLocFromMomentum(double x, double y) {
        MapLocation loc = Map.getFarthestLoc(here, x, y);
//////         log(here + " " + x + " " + y + " " + loc);
        return loc;
    }

    public static int exploreCounter = 0;

    final public static int MOMENTUM_UPDATE_FREQ = 1;

    public static Direction exploreMomentum() throws GameActionException {
        exploreLoc = getTargetLocFromMomentum(momentumX, momentumY);

        rc.setIndicatorString("mom " + momentumX + " " + momentumY + " " + exploreLoc);
        drawLine(here, exploreLoc, BROWN);

        exploreCounter++;

        Direction moveDir = BFS.move(exploreLoc);
        return moveDir;
    }

    public static Direction exploreSimple() throws GameActionException {
        while (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            exploreLoc = getRandomLoc();
            attemptsSinceProgress = 0;
        }

        drawLine(here, exploreLoc, WHITE);

        Direction moveDir = BFS.move(exploreLoc);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return moveDir;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            exploreLoc = getRandomLoc();
            attemptsSinceProgress = 0;
            return exploreSimple();
        }

        return null;
    }

    public static void explore() throws GameActionException {
        if (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            chooseNewExploreLoc(0);
        }

        drawLine(here, exploreLoc, WHITE);

        Direction moveDir = Nav.fuzzyTo(exploreLoc);
        if (moveDir != null) {
            attemptsSinceProgress = 0;
            return;
        }

        attemptsSinceProgress++;
        if (attemptsSinceProgress > EXPLORE_PATIENCE) {
            chooseNewExploreLoc(0);
            explore();
        }
    }

    public static void chooseNewExploreLoc(int retryCount) {
        if (retryCount >= 4) {
            return;
        }

        // choose new location
        exploreLoc = getRandomLoc();
        attemptsSinceProgress = 0;

        // make sure to choose a location that is somewhat far away
        while (here.isWithinDistanceSquared(exploreLoc, EXPLORE_DISTANCE_REQ)) {
            exploreLoc = getRandomLoc();
        }

        // if already known zone, find a new one
        int[] zone = loc2Zone(exploreLoc);
        if (zoneResourceStatus[zone[0]][zone[1]] != ZONE_UNKNOWN_FLAG) {
            chooseNewExploreLoc(retryCount + 1);
        }
    }



}
