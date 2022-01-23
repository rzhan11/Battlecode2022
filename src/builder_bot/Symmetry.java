package builder_bot;

import battlecode.common.*;

import static battlecode.common.RobotType.*;

import static builder_bot.Comms.*;
import static builder_bot.Debug.*;
import static builder_bot.Map.*;
import static builder_bot.Robot.*;
import static builder_bot.Utils.*;


public enum Symmetry {
    H(0, "[S-H]"),
    V(1, "[S-V]"),
    R(2, "[S-R]");

    final int index;
    final String text;
    Symmetry(int index, String text) {
        this.index = index;
        this.text = text;
    }

    /*
    Methods
     */


    public static Symmetry theSymmetry = null;

    public static int[] symmetryState = new int[3];
    public static boolean[] symmetryChanged = new boolean[3];
    final public static int SYMMETRY_UNKNOWN_FLAG = 0;
    final public static int SYMMETRY_TRUE_FLAG = 1;
    final public static int SYMMETRY_FALSE_FLAG = 2;

    public static MapLocation getSymLoc(MapLocation loc, Symmetry sym) {
        switch(sym) {
            case H:
                return new MapLocation(XMAX - loc.x, loc.y);
            case V:
                return new MapLocation(loc.x, YMAX - loc.y);
            case R:
                return new MapLocation(XMAX - loc.x, YMAX - loc.y);
            default:
                return null;
        }
    }

    public static int sym2int(Symmetry s) {
        switch (s) {
            case H:
                return 0;
            case V:
                return 1;
            case R:
                return 2;
        }
        logi("WARNING: 'sym2int' unexpected val " + s);
        return -1;
    }

    public static Symmetry int2sym(int i) {
        switch (i) {
            case 0:
                return Symmetry.H;
            case 1:
                return Symmetry.V;
            case 2:
                return Symmetry.R;
        }
        logi("WARNING: 'int2sym' unexpected num " + i);
        return null;
    }

    public static void updateSymmetryInfo() throws GameActionException {
        resetSymmetryChangedArray();
        if (myType == ARCHON && roundNum == 2) {
            checkOrigEnemyArchonSymLocs();
        }

        if (roundNum >= 2) {
            // new sym stuff
            if (true || theSymmetry == null) {
                startBytecode("updateSymmetryRubble");
                updateSymmetryRubble();
                stopBytecode("updateSymmetryRubble");

                updateSymmetryWithLogic();
            }
            writeSymmetrySection();
        }
    }


    public static void resetSymmetryChangedArray() {
        symmetryChanged[0] = false;
        symmetryChanged[1] = false;
        symmetryChanged[2] = false;
    }

    public static void setSymmetryState(int index, int flag) {
        if (symmetryState[index] != flag) {
            symmetryState[index] = flag;
            symmetryChanged[index] = true;
        }
    }

    public static void checkOrigEnemyArchonSymLocs() throws GameActionException {
        for (int i = MAX_ARCHONS; --i >= 0;) {
            MapLocation archonLoc = allyArchonLocs[i];
            if (archonLoc == null) {
                continue;
            }

            // done
            for (int symIndex = SYMS.length; --symIndex >= 0;) {
                if (symmetryState[symIndex] == SYMMETRY_UNKNOWN_FLAG) { // horizontal
                    MapLocation symLoc = getSymLoc(archonLoc, SYMS[symIndex]);
                    if (rc.canSenseLocation(symLoc)) {
                        RobotInfo ri = rc.senseRobotAtLocation(symLoc);
                        // check if
                        if ( !(ri != null && ri.type == ARCHON && ri.team == them) ) {
                            setSymmetryState(symIndex, SYMMETRY_FALSE_FLAG);
                        }
                    }
                }
            }
        }
    }

    public static void updateSymmetryRubble() throws GameActionException {
//        log("up " + Actions.myLastMoveRound + " " + roundNum + " " + Actions.myLastMoveDir);
        if (Actions.myLastMoveRound != roundNum - 1) {
            return;
        }

        double midX = XMAX / 2.0;
        double midY = YMAX / 2.0;

        double dx = here.x - midX;
        double dy = here.y - midY;

        for (int symIndex = SYMS.length; --symIndex >= 0;) {
            switch (symmetryState[symIndex]) { // if it is not unknown, skip
                case SYMMETRY_TRUE_FLAG:
                case SYMMETRY_FALSE_FLAG:
                    continue;
            }

            Symmetry sym = SYMS[symIndex];
            int[][] checkOffsets = SymUpdate.getCheckOffsets(dx, dy, sym, Actions.myLastMoveDir);
            if (checkOffsets == null) {
                continue;
            }
            int[] xOffs = checkOffsets[0];
            int[] yOffs = checkOffsets[1];
//            log("check " + xOffs.length + " " + sym.text);
            for (int i = xOffs.length; --i >= 0;) {
                MapLocation loc = here.translate(xOffs[i], yOffs[i]);
//                tlog("checking " + loc);
                MapLocation symLoc = getSymLoc(loc, sym);
                if (rc.canSenseLocation(loc) && rc.canSenseLocation(symLoc)) {
                    if (rc.senseRubble(loc) != rc.senseRubble(symLoc)) {
//                        log("SENSED " + loc + " " + symLoc);
                        setSymmetryState(symIndex, SYMMETRY_FALSE_FLAG);
                        break;
                    }
                }
            }
        }
    }

    public static void updateSymmetryWithLogic() {
        if (symmetryState[0] == SYMMETRY_FALSE_FLAG && symmetryState[1] == SYMMETRY_FALSE_FLAG) {
            setSymmetryState(2, SYMMETRY_TRUE_FLAG);
        }
        if (symmetryState[0] == SYMMETRY_FALSE_FLAG && symmetryState[2] == SYMMETRY_FALSE_FLAG) {
            setSymmetryState(1, SYMMETRY_TRUE_FLAG);
        }
        if (symmetryState[1] == SYMMETRY_FALSE_FLAG && symmetryState[2] == SYMMETRY_FALSE_FLAG) {
            setSymmetryState(0, SYMMETRY_TRUE_FLAG);
        }

        for (int i = SYMS.length; --i >= 0;) {
            if (symmetryState[i] == SYMMETRY_TRUE_FLAG) {
                theSymmetry = SYMS[i];
                break;
            }
        }
        // end
    }

}
