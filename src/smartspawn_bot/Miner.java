package smartspawn_bot;

import battlecode.common.*;

import static smartspawn_bot.Debug.logi;
import static smartspawn_bot.Zone.*;
import static smartspawn_bot.Utils.*;


public class Miner extends Robot {
    // constants



    // variables


    // things to do on turn 1 of existence
    public static void firstTurnSetup() throws GameActionException {
        // first turn comms

//        if (roundNum > 50) {
//            endTurn();
//            updateTurnInfo();
//        }
    }

    // code run each turn
    public static void turn() throws GameActionException {
        // put role-specific updates here



        tryMine();
        moveLogic();
        tryMine();
    }

    public static void moveLogic() throws GameActionException {
        // look for better spot to move

        if (!rc.isMovementReady()) {
            return;
        }

        // search surrounding tiles for lead
        {
            MapLocation[] visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius);
            if (visibleLeadLocs.length > 34) { // 68 / 2
                visibleLeadLocs = rc.senseNearbyLocationsWithLead(myVisionRadius / 2);
            }

            MapLocation bestLoc = null;
            int bestDist = P_INF;
            for (int i = visibleLeadLocs.length; --i >= 0;) {
                MapLocation loc = visibleLeadLocs[i];
                if (rc.senseLead(loc) > 1) {
                    int dist = here.distanceSquaredTo(loc);
                    if (dist < bestDist) {
                        bestLoc = loc;
                        bestDist = dist;
                    }
                }
            }

            if (bestLoc != null) {
                Direction moveDir = Nav.fuzzyTo(bestLoc);
                rc.setIndicatorString("going to " + bestLoc);
                Debug.drawLine(here, bestLoc, RED);
                return;
            }
        }

        // go towards unknown zones

        // check if target zones are known
        if (targetZoneLoc != null && zoneResourceStatus[targetZone[0]][targetZone[1]] != ZONE_UNKNOWN_FLAG) {
            targetZone = null;
            targetZoneLoc = null;
        }

        if (targetZoneLoc == null) {
            updateResourceZoneTargets();
        }

        // if no visible lead, go to unknown zone
        if (targetZoneLoc != null) {
            Direction moveDir = Nav.fuzzyTo(targetZoneLoc);
            rc.setIndicatorString("going to target zone " + targetZoneLoc);
            Debug.drawLine(here, targetZoneLoc, BLUE);
            return;
        }

        // exploring
        explore();
        rc.setIndicatorString("exploring " + exploreLoc);
    }

    public static int[] targetZone = null;
    public static MapLocation targetZoneLoc = null;

    public static void updateResourceZoneTargets() {
        int[] unknownZone = null;
        MapLocation unknownZoneLoc = null;
        int[] mineZone = null;
        MapLocation mineZoneLoc = null;

        int numOffsets = HardCode.ZONE_OFFSETS.length;
        int randStartIndex = randInt(numOffsets);
        for (int i = numOffsets; --i >= 0;) {
            int[] diffs = HardCode.ZONE_OFFSETS[(i + randStartIndex) % numOffsets];
            int zx = myZoneX + diffs[0];
            int zy = myZoneY + diffs[1];
            if (!checkValidZone(zx, zy)) {
                continue;
            }
            switch (zoneResourceStatus[zx][zy]) {
                case ZONE_UNKNOWN_FLAG:
                    unknownZone = new int[] {zx, zy};
                    unknownZoneLoc = zone2Loc(zx, zy);
                    break;
                case ZONE_EMPTY_FLAG:
                    mineZone = new int[] {zx, zy};
                    mineZoneLoc = zone2Loc(zx, zy);
                    break;
                case ZONE_MINE_FLAG:
                    break;
                default:
                    logi("WARNING: 'updateResourceZoneTargets' Unexpected zone flag! " + zoneResourceStatus[zx][zy]);
            }
        }

        if (unknownZoneLoc != null) {
            targetZone = unknownZone;
            targetZoneLoc = unknownZoneLoc;
//        } else {
//            targetZone = mineZone;
//            targetZoneLoc = mineZoneLoc;
        }
    }

    public static void tryMine() throws GameActionException {
        // mine lead if adjacent to it
        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            int curGold = rc.senseGold(loc);
            while (curGold > 0) {
                if (!rc.isActionReady()) {
                    return;
                }
                Actions.doMineGold(loc);
                curGold--;
            }
        }

        for (int i = ALL_DIRS.length; --i >= 0;) {
            MapLocation loc = here.add(ALL_DIRS[i]);
            if (!rc.onTheMap(loc)) {
                continue;
            }
            int curLead = rc.senseLead(loc);
            while (curLead > 1) {
                if (!rc.isActionReady()) {
                    return;
                }
                Actions.doMineLead(loc);
                curLead--;
            }
        }
    }
}
