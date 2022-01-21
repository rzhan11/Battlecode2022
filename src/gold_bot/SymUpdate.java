package gold_bot;

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static gold_bot.Debug.*;
import static gold_bot.Map.*;
import static gold_bot.Robot.*;
import static gold_bot.Zone.*;

public class SymUpdate {

public static int[][] getCheckOffsets(double dx, double dy, Symmetry sym, Direction dir) {

switch (sym) {
    case H:
        dy = 0;
        break;
    case V:
        dx = 0;
        break;
    case R:
        break;
}

int index = (int) ( (2 * dx + MAX_MAP_SIZE) + (2 * dy + MAX_MAP_SIZE) * (2 * MAX_MAP_SIZE) );
// index += dir2int(dir) * ((2 * MAX_MAP_SIZE) * (2 * MAX_MAP_SIZE));

switch (sym) {
case H:
switch (dir) {
case EAST:
return gcl_EAST_h(index);
case NORTHEAST:
return gcl_NORTHEAST_h(index);
case NORTH:
return gcl_NORTH_h(index);
case NORTHWEST:
return gcl_NORTHWEST_h(index);
case WEST:
return gcl_WEST_h(index);
case SOUTHWEST:
return gcl_SOUTHWEST_h(index);
case SOUTH:
return gcl_SOUTH_h(index);
case SOUTHEAST:
return gcl_SOUTHEAST_h(index);
}
break;
case V:
switch (dir) {
case EAST:
return gcl_EAST_v(index);
case NORTHEAST:
return gcl_NORTHEAST_v(index);
case NORTH:
return gcl_NORTH_v(index);
case NORTHWEST:
return gcl_NORTHWEST_v(index);
case WEST:
return gcl_WEST_v(index);
case SOUTHWEST:
return gcl_SOUTHWEST_v(index);
case SOUTH:
return gcl_SOUTH_v(index);
case SOUTHEAST:
return gcl_SOUTHEAST_v(index);
}
break;
case R:
switch (dir) {
case EAST:
return gcl_EAST_r(index);
case NORTHEAST:
return gcl_NORTHEAST_r(index);
case NORTH:
return gcl_NORTH_r(index);
case NORTHWEST:
return gcl_NORTHWEST_r(index);
case WEST:
return gcl_WEST_r(index);
case SOUTHWEST:
return gcl_SOUTHWEST_r(index);
case SOUTH:
return gcl_SOUTH_r(index);
case SOUTHEAST:
return gcl_SOUTHEAST_r(index);
}
break;

}
return null;
}


public static int[][] gcl_EAST_h (int index) {
switch (index) {
case 7260:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7258:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7256:
return new int[][] { {3,3,4,4,4,4,4}, {-3,3,-2,-1,0,1,2} };
case 7254:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 7259:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7257:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7255:
return new int[][] { {3,3,4,4,4,4,4}, {-3,3,-2,-1,0,1,2} };
case 7253:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
}

return null;
}

public static int[][] gcl_NORTHEAST_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-2,-1,2,3,3,4,4,4,4,4}, {4,4,3,2,3,-2,-1,0,1,2} };
case 7258:
return new int[][] { {0,2,3,3,4,4,4,4,4}, {4,3,2,3,-2,-1,0,1,2} };
case 7262:
return new int[][] { {-2}, {4} };
case 7256:
return new int[][] { {3,3,4,4,4,4,4}, {2,3,-2,-1,0,1,2} };
case 7254:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 7259:
return new int[][] { {-1,0,2,3,3,4,4,4,4,4}, {4,4,3,2,3,-2,-1,0,1,2} };
case 7261:
return new int[][] { {-2,-1,2,3}, {4,4,3,2} };
case 7257:
return new int[][] { {1,2,3,3,4,4,4,4,4}, {4,3,2,3,-2,-1,0,1,2} };
case 7263:
return new int[][] { {-2}, {4} };
case 7255:
return new int[][] { {2,3,4,4,4,4,4}, {3,2,-2,-1,0,1,2} };
case 7253:
return new int[][] { {3,4,4,4,4}, {2,-2,-1,0,1} };
}

return null;
}

public static int[][] gcl_NORTH_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7258:
return new int[][] { {0,3,4}, {4,3,2} };
case 7262:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7256:
return new int[][] { {3,4}, {3,2} };
case 7264:
return new int[][] { {-4,-3}, {2,3} };
case 7254:
return new int[][] { {4}, {2} };
case 7266:
return new int[][] { {-4}, {2} };
case 7259:
return new int[][] { {-1,0,3,4}, {4,4,3,2} };
case 7261:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7257:
return new int[][] { {1,3,4}, {4,3,2} };
case 7263:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7255:
return new int[][] { {3,4}, {3,2} };
case 7265:
return new int[][] { {-4,-3}, {2,3} };
case 7253:
return new int[][] { {4}, {2} };
case 7267:
return new int[][] { {-4}, {2} };
}

return null;
}

public static int[][] gcl_NORTHWEST_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,2,3,3,4,4} };
case 7258:
return new int[][] { {0}, {4} };
case 7262:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,2,3,3,4} };
case 7264:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,2,3} };
case 7266:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7259:
return new int[][] { {-3,-2,-1,0}, {2,3,4,4} };
case 7261:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,2,3,3,4,4} };
case 7257:
return new int[][] { {1}, {4} };
case 7263:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,2,3,3,4} };
case 7265:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,2,3} };
case 7267:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
}

return null;
}

public static int[][] gcl_WEST_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7262:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7264:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,3} };
case 7266:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7261:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7263:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7265:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,3} };
case 7267:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
}

return null;
}

public static int[][] gcl_SOUTHWEST_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4} };
case 7258:
return new int[][] { {0}, {-4} };
case 7262:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,-2,-4,-3} };
case 7264:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,-2} };
case 7266:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7259:
return new int[][] { {-3,-2,-1,0}, {-2,-3,-4,-4} };
case 7261:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4} };
case 7257:
return new int[][] { {1}, {-4} };
case 7263:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,-2,-4,-3} };
case 7265:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,-2} };
case 7267:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
}

return null;
}

public static int[][] gcl_SOUTH_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7258:
return new int[][] { {0,3,4}, {-4,-3,-2} };
case 7262:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7256:
return new int[][] { {3,4}, {-3,-2} };
case 7264:
return new int[][] { {-4,-3}, {-2,-3} };
case 7254:
return new int[][] { {4}, {-2} };
case 7266:
return new int[][] { {-4}, {-2} };
case 7259:
return new int[][] { {-1,0,3,4}, {-4,-4,-3,-2} };
case 7261:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7257:
return new int[][] { {1,3,4}, {-4,-3,-2} };
case 7263:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7255:
return new int[][] { {3,4}, {-3,-2} };
case 7265:
return new int[][] { {-4,-3}, {-2,-3} };
case 7253:
return new int[][] { {4}, {-2} };
case 7267:
return new int[][] { {-4}, {-2} };
}

return null;
}

public static int[][] gcl_SOUTHEAST_h (int index) {
switch (index) {
case 7260:
return new int[][] { {-2,-1,2,3,3,4,4,4,4,4}, {-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7258:
return new int[][] { {0,2,3,3,4,4,4,4,4}, {-4,-3,-3,-2,-2,-1,0,1,2} };
case 7262:
return new int[][] { {-2}, {-4} };
case 7256:
return new int[][] { {3,3,4,4,4,4,4}, {-3,-2,-2,-1,0,1,2} };
case 7254:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 7259:
return new int[][] { {-1,0,2,3,3,4,4,4,4,4}, {-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7261:
return new int[][] { {-2,-1,2,3}, {-4,-4,-3,-2} };
case 7257:
return new int[][] { {1,2,3,3,4,4,4,4,4}, {-4,-3,-3,-2,-2,-1,0,1,2} };
case 7263:
return new int[][] { {-2}, {-4} };
case 7255:
return new int[][] { {2,3,4,4,4,4,4}, {-3,-2,-2,-1,0,1,2} };
case 7253:
return new int[][] { {3,4,4,4,4}, {-2,-1,0,1,2} };
}

return null;
}

public static int[][] gcl_EAST_v (int index) {
switch (index) {
case 7260:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 7020:
return new int[][] { {2,3,4}, {4,3,0} };
case 7500:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 6780:
return new int[][] { {2,3}, {4,3} };
case 7740:
return new int[][] { {2,3}, {-4,-3} };
case 6540:
return new int[][] { {2}, {4} };
case 7980:
return new int[][] { {2}, {-4} };
case 7140:
return new int[][] { {2,3,4,4}, {4,3,-1,0} };
case 7380:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6900:
return new int[][] { {2,3,4}, {4,3,1} };
case 7620:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 6660:
return new int[][] { {2,3}, {4,3} };
case 7860:
return new int[][] { {2,3}, {-4,-3} };
case 6420:
return new int[][] { {2}, {4} };
case 8100:
return new int[][] { {2}, {-4} };
}

return null;
}

public static int[][] gcl_NORTHEAST_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {4,4,4,4,3,4,2,3,-2,-1} };
case 7020:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {4,4,4,4,3,4,2,3,0} };
case 7500:
return new int[][] { {4}, {-2} };
case 6780:
return new int[][] { {-2,-1,0,1,2,2,3}, {4,4,4,4,3,4,3} };
case 6540:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 7140:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {4,4,4,4,3,4,2,3,-1,0} };
case 7380:
return new int[][] { {2,3,4,4}, {3,2,-2,-1} };
case 6900:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {4,4,4,4,3,4,2,3,1} };
case 7620:
return new int[][] { {4}, {-2} };
case 6660:
return new int[][] { {-2,-1,0,1,2,2,3}, {4,4,4,4,3,4,2} };
case 6420:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,3} };
}

return null;
}

public static int[][] gcl_NORTH_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 7020:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 6780:
return new int[][] { {-3,-2,-1,0,1,2,3}, {3,4,4,4,4,4,3} };
case 6540:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 7140:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 6900:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 6660:
return new int[][] { {-3,-2,-1,0,1,2,3}, {3,4,4,4,4,4,3} };
case 6420:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
}

return null;
}

public static int[][] gcl_NORTHWEST_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,2,3,3,4,4,4,4,4} };
case 7020:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {0,2,3,3,4,4,4,4,4} };
case 7500:
return new int[][] { {-4}, {-2} };
case 6780:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {3,3,4,4,4,4,4} };
case 6540:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 7140:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-1,0,2,3,3,4,4,4,4,4} };
case 7380:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,2,3} };
case 6900:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {1,2,3,3,4,4,4,4,4} };
case 7620:
return new int[][] { {-4}, {-2} };
case 6660:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {2,3,4,4,4,4,4} };
case 6420:
return new int[][] { {-2,-1,0,1,2}, {3,4,4,4,4} };
}

return null;
}

public static int[][] gcl_WEST_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 7020:
return new int[][] { {-4,-3,-2}, {0,3,4} };
case 7500:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 6780:
return new int[][] { {-3,-2}, {3,4} };
case 7740:
return new int[][] { {-3,-2}, {-3,-4} };
case 6540:
return new int[][] { {-2}, {4} };
case 7980:
return new int[][] { {-2}, {-4} };
case 7140:
return new int[][] { {-4,-4,-3,-2}, {-1,0,3,4} };
case 7380:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 6900:
return new int[][] { {-4,-3,-2}, {1,3,4} };
case 7620:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 6660:
return new int[][] { {-3,-2}, {3,4} };
case 7860:
return new int[][] { {-3,-2}, {-3,-4} };
case 6420:
return new int[][] { {-2}, {4} };
case 8100:
return new int[][] { {-2}, {-4} };
}

return null;
}

public static int[][] gcl_SOUTHWEST_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7020:
return new int[][] { {-4}, {0} };
case 7500:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7740:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {-3,-4,-3,-4,-4,-4,-4} };
case 7980:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 7140:
return new int[][] { {-4,-4,-3,-2}, {-1,0,-2,-3} };
case 7380:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,-3,-2,-4,-3,-4,-4,-4,-4} };
case 6900:
return new int[][] { {-4}, {1} };
case 7620:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7860:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {-3,-4,-3,-4,-4,-4,-4} };
case 8100:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
}

return null;
}

public static int[][] gcl_SOUTH_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7500:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7740:
return new int[][] { {-3,-2,-1,0,1,2,3}, {-3,-4,-4,-4,-4,-4,-3} };
case 7980:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 7380:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7620:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7860:
return new int[][] { {-3,-2,-1,0,1,2,3}, {-3,-4,-4,-4,-4,-4,-3} };
case 8100:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
}

return null;
}

public static int[][] gcl_SOUTHEAST_v (int index) {
switch (index) {
case 7260:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1} };
case 7020:
return new int[][] { {4}, {0} };
case 7500:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2} };
case 7740:
return new int[][] { {-2,-1,0,1,2,2,3}, {-4,-4,-4,-4,-4,-3,-3} };
case 7980:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 7140:
return new int[][] { {2,3,4,4}, {-3,-2,-1,0} };
case 7380:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1} };
case 6900:
return new int[][] { {4}, {1} };
case 7620:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2} };
case 7860:
return new int[][] { {-2,-1,0,1,2,2,3}, {-4,-4,-4,-4,-4,-3,-3} };
case 8100:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
}

return null;
}

public static int[][] gcl_EAST_r (int index) {
switch (index) {
case 7260:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7258:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7020:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7500:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 7018:
return new int[][] { {2,3,4,4,4,4,4}, {4,3,-2,-1,0,1,2} };
case 7498:
return new int[][] { {2,3,4,4,4,4,4}, {-4,-3,-2,-1,0,1,2} };
case 7022:
return new int[][] { {2}, {4} };
case 7502:
return new int[][] { {2}, {-4} };
case 7256:
return new int[][] { {2,3,3,4,4,4,4,4}, {-4,-3,3,-2,-1,0,1,2} };
case 6780:
return new int[][] { {2,3,4}, {4,3,2} };
case 7740:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7016:
return new int[][] { {2,3,4,4,4,4,4}, {4,3,-2,-1,0,1,2} };
case 7496:
return new int[][] { {2,3,4,4,4,4,4}, {-4,-3,-2,-1,0,1,2} };
case 6778:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7738:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 6782:
return new int[][] { {2}, {4} };
case 7742:
return new int[][] { {2}, {-4} };
case 6776:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7736:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 7254:
return new int[][] { {3,4,4,4,4,4}, {-3,-2,-1,0,1,2} };
case 6540:
return new int[][] { {2,3}, {4,3} };
case 7980:
return new int[][] { {2,3}, {-4,-3} };
case 7014:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7494:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 6538:
return new int[][] { {2,3,4}, {4,3,2} };
case 7978:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 6542:
return new int[][] { {2}, {4} };
case 7982:
return new int[][] { {2}, {-4} };
case 6774:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7734:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6536:
return new int[][] { {2,3,4}, {4,3,2} };
case 7976:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7252:
return new int[][] { {4,4}, {-2,-1} };
case 6300:
return new int[][] { {2}, {4} };
case 8220:
return new int[][] { {2}, {-4} };
case 7012:
return new int[][] { {4}, {0} };
case 7492:
return new int[][] { {4}, {-2} };
case 6298:
return new int[][] { {2}, {4} };
case 8218:
return new int[][] { {2}, {-4} };
case 6534:
return new int[][] { {2}, {4} };
case 7974:
return new int[][] { {2}, {-4} };
case 7140:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7380:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 7138:
return new int[][] { {2,3,3,4,4,4,4,4}, {4,-3,3,-2,-1,0,1,2} };
case 7378:
return new int[][] { {2,3,3,4,4,4,4,4}, {-4,-3,3,-2,-1,0,1,2} };
case 6900:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7620:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6898:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7618:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 6902:
return new int[][] { {2}, {4} };
case 7622:
return new int[][] { {2}, {-4} };
case 7136:
return new int[][] { {2,3,3,4,4,4,4,4}, {4,-3,3,-2,-1,0,1,2} };
case 7376:
return new int[][] { {2,3,3,4,4,4,4,4}, {-4,-3,3,-2,-1,0,1,2} };
case 6896:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7616:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 6660:
return new int[][] { {2,3}, {4,3} };
case 7860:
return new int[][] { {2,3}, {-4,-3} };
case 6658:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7858:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6662:
return new int[][] { {2}, {4} };
case 7862:
return new int[][] { {2}, {-4} };
case 7134:
return new int[][] { {3,4,4,4,4,4}, {3,-2,-1,0,1,2} };
case 7374:
return new int[][] { {3,4,4,4,4,4}, {-3,-2,-1,0,1,2} };
case 6656:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7856:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6894:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7614:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 6420:
return new int[][] { {2}, {4} };
case 8100:
return new int[][] { {2}, {-4} };
case 6418:
return new int[][] { {2,3}, {4,3} };
case 8098:
return new int[][] { {2,3}, {-4,-3} };
case 6654:
return new int[][] { {2,3,4}, {4,3,2} };
case 7854:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7132:
return new int[][] { {4,4}, {-1,0} };
case 7372:
return new int[][] { {4,4}, {-2,-1} };
case 6416:
return new int[][] { {2,3}, {4,3} };
case 8096:
return new int[][] { {2,3}, {-4,-3} };
case 6892:
return new int[][] { {4}, {1} };
case 7612:
return new int[][] { {4}, {-2} };
case 7259:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7019:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7499:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 7021:
return new int[][] { {2,3}, {4,3} };
case 7501:
return new int[][] { {2,3}, {-4,-3} };
case 7257:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,4,-3,3,-2,-1,0,1,2} };
case 7017:
return new int[][] { {2,3,4,4,4,4,4}, {4,3,-2,-1,0,1,2} };
case 7497:
return new int[][] { {2,3,4,4,4,4,4}, {-4,-3,-2,-1,0,1,2} };
case 6779:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7739:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6781:
return new int[][] { {2,3}, {4,3} };
case 7741:
return new int[][] { {2,3}, {-4,-3} };
case 7255:
return new int[][] { {3,3,4,4,4,4,4}, {-3,3,-2,-1,0,1,2} };
case 6777:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7737:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 7015:
return new int[][] { {2,3,4,4,4,4,4}, {4,3,-2,-1,0,1,2} };
case 7495:
return new int[][] { {2,3,4,4,4,4,4}, {-4,-3,-2,-1,0,1,2} };
case 6539:
return new int[][] { {2,3}, {4,3} };
case 7979:
return new int[][] { {2,3}, {-4,-3} };
case 6541:
return new int[][] { {2}, {4} };
case 7981:
return new int[][] { {2}, {-4} };
case 6775:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7735:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 6537:
return new int[][] { {2,3,4}, {4,3,2} };
case 7977:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7253:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 7013:
return new int[][] { {3,4,4,4}, {3,0,1,2} };
case 7493:
return new int[][] { {3,4,4,4}, {-3,-2,-1,0} };
case 6535:
return new int[][] { {2,3,4}, {4,3,2} };
case 7975:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 6773:
return new int[][] { {3,4}, {3,2} };
case 7733:
return new int[][] { {3,4}, {-3,-2} };
case 6299:
return new int[][] { {2}, {4} };
case 8219:
return new int[][] { {2}, {-4} };
case 6297:
return new int[][] { {2}, {4} };
case 8217:
return new int[][] { {2}, {-4} };
case 7139:
return new int[][] { {2,3,3,4,4,4,4,4}, {4,-3,3,-2,-1,0,1,2} };
case 7379:
return new int[][] { {2,3,3,4,4,4,4,4}, {-4,-3,3,-2,-1,0,1,2} };
case 7141:
return new int[][] { {2,3}, {4,3} };
case 7381:
return new int[][] { {2,3}, {-4,-3} };
case 7137:
return new int[][] { {2,3,3,4,4,4,4,4}, {4,-3,3,-2,-1,0,1,2} };
case 7377:
return new int[][] { {2,3,3,4,4,4,4,4}, {-4,-3,3,-2,-1,0,1,2} };
case 6899:
return new int[][] { {2,3,4,4,4}, {4,3,0,1,2} };
case 7619:
return new int[][] { {2,3,4,4,4}, {-4,-3,-2,-1,0} };
case 6901:
return new int[][] { {2,3}, {4,3} };
case 7621:
return new int[][] { {2,3}, {-4,-3} };
case 6897:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7617:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 7135:
return new int[][] { {2,3,4,4,4,4,4}, {4,3,-2,-1,0,1,2} };
case 7375:
return new int[][] { {2,3,4,4,4,4,4}, {-4,-3,-2,-1,0,1,2} };
case 6659:
return new int[][] { {2,3,4}, {4,3,2} };
case 7859:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 6661:
return new int[][] { {2,3}, {4,3} };
case 7861:
return new int[][] { {2,3}, {-4,-3} };
case 6895:
return new int[][] { {2,3,4,4,4,4}, {4,3,-1,0,1,2} };
case 7615:
return new int[][] { {2,3,4,4,4,4}, {-4,-3,-2,-1,0,1} };
case 6657:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7857:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 7133:
return new int[][] { {3,4,4,4,4}, {3,-1,0,1,2} };
case 7373:
return new int[][] { {3,4,4,4,4}, {-3,-2,-1,0,1} };
case 6655:
return new int[][] { {2,3,4,4}, {4,3,1,2} };
case 7855:
return new int[][] { {2,3,4,4}, {-4,-3,-2,-1} };
case 6419:
return new int[][] { {2,3}, {4,3} };
case 8099:
return new int[][] { {2,3}, {-4,-3} };
case 6421:
return new int[][] { {2}, {4} };
case 8101:
return new int[][] { {2}, {-4} };
case 6893:
return new int[][] { {3,4,4}, {3,1,2} };
case 7613:
return new int[][] { {3,4,4}, {-3,-2,-1} };
case 6417:
return new int[][] { {2,3}, {4,3} };
case 8097:
return new int[][] { {2,3}, {-4,-3} };
case 6653:
return new int[][] { {3}, {3} };
case 7853:
return new int[][] { {3}, {-3} };
case 6415:
return new int[][] { {2}, {4} };
case 8095:
return new int[][] { {2}, {-4} };
}

return null;
}

public static int[][] gcl_NORTHEAST_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4,4}, {4,4,4,4,3,4,2,3,-2,-1,0,1,2} };
case 7258:
return new int[][] { {0,1,2,2,3,3,4,4,4,4,4}, {4,4,3,4,2,3,-2,-1,0,1,2} };
case 7020:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4}, {4,4,4,4,3,4,2,3,0,1,2} };
case 7500:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 7262:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 7018:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4}, {4,4,4,4,3,4,2,3,-1,0,1,2} };
case 7498:
return new int[][] { {3,4,4,4,4,4}, {2,-2,-1,0,1,2} };
case 7022:
return new int[][] { {-2,-1,0,1,2,2}, {4,4,4,4,3,4} };
case 7256:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {3,4,2,3,-2,-1,0,1,2} };
case 6780:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {4,4,4,4,3,4,2,3,2} };
case 7740:
return new int[][] { {4}, {-2} };
case 7264:
return new int[][] { {-2}, {4} };
case 7016:
return new int[][] { {0,1,2,2,3,3,4,4,4,4}, {4,4,3,4,2,3,-1,0,1,2} };
case 7496:
return new int[][] { {3,4,4,4,4,4}, {2,-2,-1,0,1,2} };
case 6778:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {4,4,4,4,3,4,2,3,1,2} };
case 7738:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6782:
return new int[][] { {-2,-1,0,1,2,2}, {4,4,4,4,3,4} };
case 7024:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 6776:
return new int[][] { {0,1,2,2,3,3,4,4}, {4,4,3,4,2,3,1,2} };
case 7736:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6784:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 7254:
return new int[][] { {3,3,4,4,4,4,4}, {2,3,-2,-1,0,1,2} };
case 6540:
return new int[][] { {-2,-1,0,1,2,2,3}, {4,4,4,4,3,4,3} };
case 7014:
return new int[][] { {2,2,3,3,4,4,4}, {3,4,2,3,0,1,2} };
case 7494:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 6538:
return new int[][] { {-2,-1,0,1,2,2,3}, {4,4,4,4,3,4,3} };
case 7978:
return new int[][] { {4}, {-2} };
case 6542:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 7026:
return new int[][] { {-2}, {4} };
case 6774:
return new int[][] { {2,2,3,4}, {3,4,3,2} };
case 7734:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6536:
return new int[][] { {0,1,2,3}, {4,4,4,3} };
case 7976:
return new int[][] { {4}, {-2} };
case 6544:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 6786:
return new int[][] { {-2}, {4} };
case 7252:
return new int[][] { {4,4}, {-2,-1} };
case 6300:
return new int[][] { {-2,-1}, {4,4} };
case 7012:
return new int[][] { {4}, {0} };
case 7492:
return new int[][] { {4}, {-2} };
case 6298:
return new int[][] { {0}, {4} };
case 6302:
return new int[][] { {-2}, {4} };
case 6534:
return new int[][] { {2}, {4} };
case 7974:
return new int[][] { {4}, {-2} };
case 6546:
return new int[][] { {-2}, {4} };
case 7140:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4}, {4,4,4,4,3,4,2,3,-1,0,1,2} };
case 7380:
return new int[][] { {2,3,4,4,4,4}, {3,2,-2,-1,0,1} };
case 7138:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4,4,4}, {4,4,4,3,4,2,3,-2,-1,0,1,2} };
case 7378:
return new int[][] { {2,3,3,4,4,4,4,4}, {3,2,3,-2,-1,0,1,2} };
case 7142:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,3} };
case 6900:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {4,4,4,4,3,4,2,3,1,2} };
case 7620:
return new int[][] { {4,4}, {-2,-1} };
case 6898:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4}, {4,4,4,4,3,4,2,3,0,1,2} };
case 7618:
return new int[][] { {4,4,4,4}, {-2,-1,0,1} };
case 6902:
return new int[][] { {-2,-1,0,1,2,2}, {4,4,4,4,3,4} };
case 7136:
return new int[][] { {1,2,2,3,3,4,4,4,4,4}, {4,3,4,2,3,-2,-1,0,1,2} };
case 7376:
return new int[][] { {2,3,3,4,4,4,4,4}, {3,2,3,-2,-1,0,1,2} };
case 7144:
return new int[][] { {-2,-1}, {4,4} };
case 6896:
return new int[][] { {0,1,2,2,3,3,4,4,4}, {4,4,3,4,2,3,0,1,2} };
case 7616:
return new int[][] { {4,4,4,4}, {-2,-1,0,1} };
case 6660:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {4,4,4,4,3,4,2,3} };
case 6904:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 6658:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {4,4,4,4,3,4,2,3,2} };
case 7858:
return new int[][] { {4,4}, {-2,-1} };
case 6662:
return new int[][] { {-2,-1,0,1,2,2}, {4,4,4,4,3,4} };
case 7134:
return new int[][] { {2,3,3,4,4,4,4}, {3,2,3,-1,0,1,2} };
case 7374:
return new int[][] { {3,4,4,4,4,4}, {2,-2,-1,0,1,2} };
case 6656:
return new int[][] { {0,1,2,2,3,3,4}, {4,4,3,4,2,3,2} };
case 7856:
return new int[][] { {4,4}, {-2,-1} };
case 6664:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 6894:
return new int[][] { {2,2,3,3,4,4}, {3,4,2,3,1,2} };
case 7614:
return new int[][] { {4,4,4,4}, {-2,-1,0,1} };
case 6906:
return new int[][] { {-2}, {4} };
case 6420:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6418:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6422:
return new int[][] { {-2,-1,0,1}, {4,4,4,4} };
case 6654:
return new int[][] { {2,2,3}, {3,4,2} };
case 7854:
return new int[][] { {4,4}, {-2,-1} };
case 6666:
return new int[][] { {-2}, {4} };
case 7132:
return new int[][] { {4,4}, {-1,0} };
case 7372:
return new int[][] { {4,4}, {-2,-1} };
case 6416:
return new int[][] { {1,2}, {4,3} };
case 6424:
return new int[][] { {-2,-1}, {4,4} };
case 6892:
return new int[][] { {4}, {1} };
case 7612:
return new int[][] { {4}, {-2} };
case 7259:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4,4,4}, {4,4,4,3,4,2,3,-2,-1,0,1,2} };
case 7261:
return new int[][] { {-2,-1,0,1,2,3}, {4,4,4,4,3,2} };
case 7019:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4}, {4,4,4,4,3,4,2,3,-1,0,1,2} };
case 7499:
return new int[][] { {3,4,4,4,4}, {2,-2,-1,0,1} };
case 7021:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {4,4,4,4,3,4,2,3} };
case 7257:
return new int[][] { {1,2,2,3,3,4,4,4,4,4}, {4,3,4,2,3,-2,-1,0,1,2} };
case 7263:
return new int[][] { {-2,-1}, {4,4} };
case 7017:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4,4}, {4,4,4,3,4,2,3,-1,0,1,2} };
case 7497:
return new int[][] { {3,4,4,4,4,4}, {2,-2,-1,0,1,2} };
case 7023:
return new int[][] { {-2,-1,0,1}, {4,4,4,4} };
case 6779:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {4,4,4,4,3,4,2,3,1,2} };
case 7739:
return new int[][] { {4,4}, {-2,-1} };
case 6781:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {4,4,4,4,3,4,2,3} };
case 7255:
return new int[][] { {2,3,3,4,4,4,4,4}, {3,2,3,-2,-1,0,1,2} };
case 6777:
return new int[][] { {-1,0,1,2,2,3,3,4,4}, {4,4,4,3,4,2,3,1,2} };
case 7737:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6783:
return new int[][] { {-2,-1,0,1}, {4,4,4,4} };
case 7015:
return new int[][] { {1,2,2,3,3,4,4,4,4}, {4,3,4,2,3,-1,0,1,2} };
case 7495:
return new int[][] { {3,4,4,4,4,4}, {2,-2,-1,0,1,2} };
case 7025:
return new int[][] { {-2,-1}, {4,4} };
case 6539:
return new int[][] { {-2,-1,0,1,2,2,3}, {4,4,4,4,3,4,3} };
case 6541:
return new int[][] { {-2,-1,0,1,2,2}, {4,4,4,4,3,4} };
case 6775:
return new int[][] { {1,2,2,3,3,4,4}, {4,3,4,2,3,1,2} };
case 7735:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6785:
return new int[][] { {-2,-1}, {4,4} };
case 6537:
return new int[][] { {-1,0,1,2,2,3}, {4,4,4,3,4,3} };
case 7977:
return new int[][] { {4}, {-2} };
case 6543:
return new int[][] { {-2,-1,0,1}, {4,4,4,4} };
case 7253:
return new int[][] { {3,4,4,4,4}, {2,-1,0,1,2} };
case 7013:
return new int[][] { {3,3,4,4}, {2,3,1,2} };
case 7493:
return new int[][] { {4,4,4,4}, {-2,-1,0,1} };
case 6535:
return new int[][] { {1,2,2}, {4,3,4} };
case 7975:
return new int[][] { {4}, {-2} };
case 6545:
return new int[][] { {-2,-1}, {4,4} };
case 6773:
return new int[][] { {3,3}, {2,3} };
case 7733:
return new int[][] { {4,4}, {-2,-1} };
case 6299:
return new int[][] { {-1,0}, {4,4} };
case 6301:
return new int[][] { {-2,-1}, {4,4} };
case 6297:
return new int[][] { {1}, {4} };
case 6303:
return new int[][] { {-2}, {4} };
case 7139:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4,4}, {4,4,4,4,3,4,2,3,-2,-1,0,1,2} };
case 7379:
return new int[][] { {2,3,3,4,4,4,4,4}, {3,2,3,-2,-1,0,1,2} };
case 7141:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {4,4,4,4,3,4,2,3} };
case 7137:
return new int[][] { {0,1,2,2,3,3,4,4,4,4,4}, {4,4,3,4,2,3,-2,-1,0,1,2} };
case 7377:
return new int[][] { {2,3,3,4,4,4,4,4}, {3,2,3,-2,-1,0,1,2} };
case 6899:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4}, {4,4,4,4,3,4,2,3,0,1,2} };
case 7619:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6901:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {4,4,4,4,3,4,2,3} };
case 7143:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 6897:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4}, {4,4,4,3,4,2,3,0,1,2} };
case 7617:
return new int[][] { {4,4,4,4}, {-2,-1,0,1} };
case 6903:
return new int[][] { {-2,-1,0,1}, {4,4,4,4} };
case 7135:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {3,4,2,3,-2,-1,0,1,2} };
case 7375:
return new int[][] { {3,3,4,4,4,4,4}, {2,3,-2,-1,0,1,2} };
case 6659:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {4,4,4,4,3,4,2,3,2} };
case 7859:
return new int[][] { {4}, {-2} };
case 6661:
return new int[][] { {-2,-1,0,1,2,2,3}, {4,4,4,4,3,4,3} };
case 7145:
return new int[][] { {-2}, {4} };
case 6895:
return new int[][] { {1,2,2,3,3,4,4,4}, {4,3,4,2,3,0,1,2} };
case 7615:
return new int[][] { {4,4,4,4}, {-2,-1,0,1} };
case 6657:
return new int[][] { {-1,0,1,2,2,3,3,4}, {4,4,4,3,4,2,3,2} };
case 7857:
return new int[][] { {4,4}, {-2,-1} };
case 6663:
return new int[][] { {-2,-1,0,1}, {4,4,4,4} };
case 6905:
return new int[][] { {-2,-1}, {4,4} };
case 7133:
return new int[][] { {3,3,4,4,4}, {2,3,0,1,2} };
case 7373:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 6655:
return new int[][] { {1,2,2,3,4}, {4,3,4,3,2} };
case 7855:
return new int[][] { {4,4}, {-2,-1} };
case 6419:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6421:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6665:
return new int[][] { {-2,-1}, {4,4} };
case 6893:
return new int[][] { {3,3,4}, {2,3,2} };
case 7613:
return new int[][] { {4,4,4}, {-2,-1,0} };
case 6417:
return new int[][] { {0,1,2}, {4,4,4} };
case 6423:
return new int[][] { {-2,-1,0}, {4,4,4} };
case 6653:
return new int[][] { {3}, {3} };
case 7853:
return new int[][] { {4}, {-2} };
case 6415:
return new int[][] { {2}, {4} };
case 6425:
return new int[][] { {-2}, {4} };
}

return null;
}

public static int[][] gcl_NORTH_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 7258:
return new int[][] { {0,1,2,3,4}, {4,4,4,3,2} };
case 7020:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 7262:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 7018:
return new int[][] { {-2,-1,0,1,2,3,4}, {4,4,4,4,4,3,2} };
case 7498:
return new int[][] { {4}, {2} };
case 7022:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {2,3,4,4,4,4,4} };
case 7502:
return new int[][] { {-4}, {2} };
case 7256:
return new int[][] { {2,3,4}, {4,3,2} };
case 6780:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {2,3,4,4,4,4,4,3} };
case 7264:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7016:
return new int[][] { {0,1,2,3,4}, {4,4,4,3,2} };
case 7496:
return new int[][] { {4}, {2} };
case 6778:
return new int[][] { {-2,-1,0,1,2,3,4}, {4,4,4,4,4,3,2} };
case 6782:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {2,3,4,4,4,4,4} };
case 7024:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 7504:
return new int[][] { {-4}, {2} };
case 6776:
return new int[][] { {0,1,2,3,4}, {4,4,4,3,2} };
case 6784:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 7254:
return new int[][] { {3,4}, {3,2} };
case 6540:
return new int[][] { {-3,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 7266:
return new int[][] { {-4,-3}, {2,3} };
case 7014:
return new int[][] { {2,3,4}, {4,3,2} };
case 7494:
return new int[][] { {4}, {2} };
case 6538:
return new int[][] { {-2,-1,0,1,2,3}, {4,4,4,4,4,3} };
case 6542:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 7026:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7506:
return new int[][] { {-4}, {2} };
case 6774:
return new int[][] { {2,3,4}, {4,3,2} };
case 6536:
return new int[][] { {0,1,2,3}, {4,4,4,3} };
case 6544:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 6786:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7252:
return new int[][] { {4}, {2} };
case 6300:
return new int[][] { {-2,-1}, {4,4} };
case 7268:
return new int[][] { {-4}, {2} };
case 7012:
return new int[][] { {4}, {2} };
case 6298:
return new int[][] { {0}, {4} };
case 6302:
return new int[][] { {-2}, {4} };
case 7028:
return new int[][] { {-4}, {2} };
case 6534:
return new int[][] { {2}, {4} };
case 6546:
return new int[][] { {-4}, {2} };
case 7140:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 7138:
return new int[][] { {-1,0,1,2,3,4}, {4,4,4,4,3,2} };
case 7378:
return new int[][] { {3,4}, {3,2} };
case 7142:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 7382:
return new int[][] { {-4,-3}, {2,3} };
case 6900:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {2,3,4,4,4,4,4,3,2} };
case 6898:
return new int[][] { {-2,-1,0,1,2,3,4}, {4,4,4,4,4,3,2} };
case 6902:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {2,3,4,4,4,4,4} };
case 7136:
return new int[][] { {1,2,3,4}, {4,4,3,2} };
case 7376:
return new int[][] { {3,4}, {3,2} };
case 7144:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7384:
return new int[][] { {-4,-3}, {2,3} };
case 6896:
return new int[][] { {0,1,2,3,4}, {4,4,4,3,2} };
case 6660:
return new int[][] { {-3,-2,-1,0,1,2,3}, {3,4,4,4,4,4,3} };
case 6904:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 6658:
return new int[][] { {-2,-1,0,1,2,3,4}, {4,4,4,4,4,3,2} };
case 6662:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {2,3,4,4,4,4,4} };
case 7134:
return new int[][] { {3,4}, {3,2} };
case 7374:
return new int[][] { {4}, {2} };
case 7146:
return new int[][] { {-4,-3}, {2,3} };
case 7386:
return new int[][] { {-4}, {2} };
case 6656:
return new int[][] { {0,1,2,3,4}, {4,4,4,3,2} };
case 6664:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 6894:
return new int[][] { {2,3,4}, {4,3,2} };
case 6906:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 6420:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6418:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6422:
return new int[][] { {-3,-2,-1,0}, {3,4,4,4} };
case 6654:
return new int[][] { {2,3,4}, {4,3,2} };
case 6666:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7132:
return new int[][] { {4}, {2} };
case 6416:
return new int[][] { {1,2}, {4,4} };
case 6424:
return new int[][] { {-3,-2}, {3,4} };
case 7148:
return new int[][] { {-4}, {2} };
case 6892:
return new int[][] { {4}, {2} };
case 6908:
return new int[][] { {-4}, {2} };
case 7259:
return new int[][] { {-1,0,1,2,3,4}, {4,4,4,4,3,2} };
case 7261:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 7019:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {3,4,4,4,4,4,3,2} };
case 7021:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {2,3,4,4,4,4,4,3} };
case 7257:
return new int[][] { {1,2,3,4}, {4,4,3,2} };
case 7263:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7017:
return new int[][] { {-1,0,1,2,3,4}, {4,4,4,4,3,2} };
case 7497:
return new int[][] { {4}, {2} };
case 7023:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 7503:
return new int[][] { {-4}, {2} };
case 6779:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {3,4,4,4,4,4,3,2} };
case 6781:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {2,3,4,4,4,4,4,3} };
case 7255:
return new int[][] { {3,4}, {3,2} };
case 6777:
return new int[][] { {-1,0,1,2,3,4}, {4,4,4,4,3,2} };
case 6783:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 7265:
return new int[][] { {-4,-3}, {2,3} };
case 7015:
return new int[][] { {1,2,3,4}, {4,4,3,2} };
case 7495:
return new int[][] { {4}, {2} };
case 7025:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7505:
return new int[][] { {-4}, {2} };
case 6539:
return new int[][] { {-2,-1,0,1,2,3}, {4,4,4,4,4,3} };
case 6541:
return new int[][] { {-3,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 6775:
return new int[][] { {1,2,3,4}, {4,4,3,2} };
case 6785:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 6537:
return new int[][] { {-1,0,1,2,3}, {4,4,4,4,3} };
case 6543:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 7253:
return new int[][] { {4}, {2} };
case 7267:
return new int[][] { {-4}, {2} };
case 7013:
return new int[][] { {3,4}, {3,2} };
case 7027:
return new int[][] { {-4,-3}, {2,3} };
case 6535:
return new int[][] { {1,2,3}, {4,4,3} };
case 6545:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 6773:
return new int[][] { {3,4}, {3,2} };
case 6299:
return new int[][] { {-1,0}, {4,4} };
case 6301:
return new int[][] { {-2,-1}, {4,4} };
case 6787:
return new int[][] { {-4,-3}, {2,3} };
case 6297:
return new int[][] { {1}, {4} };
case 6303:
return new int[][] { {-2}, {4} };
case 7139:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {3,4,4,4,4,4,3,2} };
case 7379:
return new int[][] { {3,4}, {3,2} };
case 7141:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {2,3,4,4,4,4,4,3} };
case 7381:
return new int[][] { {-4,-3}, {2,3} };
case 7137:
return new int[][] { {0,1,2,3,4}, {4,4,4,3,2} };
case 7377:
return new int[][] { {3,4}, {3,2} };
case 6899:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {3,4,4,4,4,4,3,2} };
case 6901:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {2,3,4,4,4,4,4,3} };
case 7143:
return new int[][] { {-4,-3,-2,-1,0}, {2,3,4,4,4} };
case 7383:
return new int[][] { {-4,-3}, {2,3} };
case 6897:
return new int[][] { {-1,0,1,2,3,4}, {4,4,4,4,3,2} };
case 6903:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 7135:
return new int[][] { {2,3,4}, {4,3,2} };
case 7375:
return new int[][] { {3,4}, {3,2} };
case 6659:
return new int[][] { {-3,-2,-1,0,1,2,3}, {3,4,4,4,4,4,3} };
case 6661:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {2,3,4,4,4,4,4} };
case 7145:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7385:
return new int[][] { {-4,-3}, {2,3} };
case 6895:
return new int[][] { {1,2,3,4}, {4,4,3,2} };
case 6657:
return new int[][] { {-1,0,1,2,3,4}, {4,4,4,4,3,2} };
case 6663:
return new int[][] { {-4,-3,-2,-1,0,1}, {2,3,4,4,4,4} };
case 6905:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7133:
return new int[][] { {3,4}, {3,2} };
case 7373:
return new int[][] { {4}, {2} };
case 6655:
return new int[][] { {1,2,3,4}, {4,4,3,2} };
case 6419:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6421:
return new int[][] { {-3,-2,-1,0,1}, {3,4,4,4,4} };
case 6665:
return new int[][] { {-4,-3,-2,-1}, {2,3,4,4} };
case 7147:
return new int[][] { {-4,-3}, {2,3} };
case 7387:
return new int[][] { {-4}, {2} };
case 6893:
return new int[][] { {3,4}, {3,2} };
case 6417:
return new int[][] { {0,1,2}, {4,4,4} };
case 6423:
return new int[][] { {-3,-2,-1}, {3,4,4} };
case 6907:
return new int[][] { {-4,-3}, {2,3} };
case 6653:
return new int[][] { {3}, {3} };
case 6415:
return new int[][] { {2}, {4} };
case 6425:
return new int[][] { {-3}, {3} };
case 6667:
return new int[][] { {-4}, {2} };
}

return null;
}

public static int[][] gcl_NORTHWEST_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,1,2,2,3,3,4,4,4,4,4} };
case 7258:
return new int[][] { {0,1,2}, {4,4,4} };
case 7020:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {0,1,2,2,3,3,4,4,4,4,4} };
case 7500:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 7262:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,2,2,3,3,4,4,4} };
case 7018:
return new int[][] { {-2,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 7022:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,2,2,3,3,4,4,4,4} };
case 7502:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,2} };
case 7256:
return new int[][] { {2}, {4} };
case 6780:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {2,2,3,3,4,4,4,4,4} };
case 7740:
return new int[][] { {-4}, {-2} };
case 7264:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,2,3,3,4} };
case 7016:
return new int[][] { {0,1,2}, {4,4,4} };
case 6778:
return new int[][] { {-2,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 6782:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {0,1,2,2,3,3,4,4,4,4} };
case 7742:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 7024:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,2,3,3,4,4} };
case 7504:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,2} };
case 6776:
return new int[][] { {0,1,2}, {4,4,4} };
case 6784:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1}, {0,1,2,2,3,3,4,4} };
case 7744:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 6540:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {3,3,4,4,4,4,4} };
case 7266:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,2,3} };
case 7014:
return new int[][] { {2}, {4} };
case 6538:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6542:
return new int[][] { {-4,-3,-3,-2,-2,-1,0}, {2,2,3,3,4,4,4} };
case 7982:
return new int[][] { {-4}, {-2} };
case 7026:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,2,3} };
case 7506:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 6774:
return new int[][] { {2}, {4} };
case 6536:
return new int[][] { {0,1,2}, {4,4,4} };
case 6544:
return new int[][] { {-4,-3,-3,-2}, {2,2,3,4} };
case 7984:
return new int[][] { {-4}, {-2} };
case 6786:
return new int[][] { {-4,-4,-4,-3}, {0,1,2,3} };
case 7746:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 6300:
return new int[][] { {-2,-1}, {4,4} };
case 7268:
return new int[][] { {-4,-4}, {-2,-1} };
case 6298:
return new int[][] { {0}, {4} };
case 6302:
return new int[][] { {-2}, {4} };
case 7028:
return new int[][] { {-4}, {0} };
case 7508:
return new int[][] { {-4}, {-2} };
case 6534:
return new int[][] { {2}, {4} };
case 6546:
return new int[][] { {-4}, {2} };
case 7986:
return new int[][] { {-4}, {-2} };
case 7140:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-1,0,1,2,2,3,3,4,4,4,4,4} };
case 7380:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,3} };
case 7138:
return new int[][] { {-2,-1,0,1,2}, {3,4,4,4,4} };
case 7142:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,2,2,3,3,4,4,4,4} };
case 7382:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,2,3,3} };
case 6900:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {1,2,2,3,3,4,4,4,4,4} };
case 7620:
return new int[][] { {-4,-4}, {-2,-1} };
case 6898:
return new int[][] { {-2,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 6902:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-1,0,1,2,2,3,3,4,4,4,4} };
case 7622:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 7136:
return new int[][] { {1,2}, {4,4} };
case 7144:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,2,3,3,4,4} };
case 7384:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,2,3,3} };
case 6896:
return new int[][] { {0,1,2}, {4,4,4} };
case 6660:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {2,3,3,4,4,4,4,4} };
case 6904:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-1,0,1,2,2,3,3,4,4} };
case 7624:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 6658:
return new int[][] { {-2,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 6662:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1}, {1,2,2,3,3,4,4,4,4} };
case 7862:
return new int[][] { {-4,-4}, {-2,-1} };
case 7146:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,2,3} };
case 7386:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,2} };
case 6656:
return new int[][] { {0,1,2}, {4,4,4} };
case 6664:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1}, {1,2,2,3,3,4,4} };
case 7864:
return new int[][] { {-4,-4}, {-2,-1} };
case 6894:
return new int[][] { {2}, {4} };
case 6906:
return new int[][] { {-4,-4,-4,-4,-3,-3}, {-1,0,1,2,2,3} };
case 7626:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 6420:
return new int[][] { {-2,-2,-1,0,1}, {3,4,4,4,4} };
case 6418:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6422:
return new int[][] { {-3,-2,-2,-1}, {3,3,4,4} };
case 6654:
return new int[][] { {2}, {4} };
case 6666:
return new int[][] { {-4,-4,-3}, {1,2,2} };
case 7866:
return new int[][] { {-4,-4}, {-2,-1} };
case 6416:
return new int[][] { {1,2}, {4,4} };
case 6424:
return new int[][] { {-3,-2}, {3,3} };
case 7148:
return new int[][] { {-4,-4}, {-1,0} };
case 7388:
return new int[][] { {-4,-4}, {-2,-1} };
case 6908:
return new int[][] { {-4}, {1} };
case 7628:
return new int[][] { {-4}, {-2} };
case 7259:
return new int[][] { {-3,-2,-1,0,1,2}, {2,3,4,4,4,4} };
case 7261:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,2,2,3,3,4,4,4,4} };
case 7019:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {2,3,3,4,4,4,4,4} };
case 7021:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-1,0,1,2,2,3,3,4,4,4,4,4} };
case 7501:
return new int[][] { {-4,-4,-4,-4,-3}, {-2,-1,0,1,2} };
case 7257:
return new int[][] { {1,2}, {4,4} };
case 7263:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,2,3,3,4,4} };
case 7017:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 7023:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,2,2,3,3,4,4,4} };
case 7503:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,2} };
case 6779:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {2,3,3,4,4,4,4,4} };
case 6781:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {1,2,2,3,3,4,4,4,4,4} };
case 7741:
return new int[][] { {-4,-4}, {-2,-1} };
case 6777:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6783:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0}, {0,1,2,2,3,3,4,4,4} };
case 7743:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 7265:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,2,3,3} };
case 7015:
return new int[][] { {1,2}, {4,4} };
case 7025:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,2,3,3,4} };
case 7505:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,2} };
case 6539:
return new int[][] { {-2,-2,-1,0,1,2}, {3,4,4,4,4,4} };
case 6541:
return new int[][] { {-3,-3,-2,-2,-1,0,1}, {2,3,3,4,4,4,4} };
case 6775:
return new int[][] { {1,2}, {4,4} };
case 6785:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2}, {0,1,2,2,3,3,4} };
case 7745:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 6537:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6543:
return new int[][] { {-4,-3,-3,-2,-2,-1}, {2,2,3,3,4,4} };
case 7983:
return new int[][] { {-4}, {-2} };
case 7267:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7027:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7507:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 6535:
return new int[][] { {1,2}, {4,4} };
case 6545:
return new int[][] { {-4,-3,-3}, {2,2,3} };
case 7985:
return new int[][] { {-4}, {-2} };
case 6299:
return new int[][] { {-1,0}, {4,4} };
case 6301:
return new int[][] { {-2,-1}, {4,4} };
case 6787:
return new int[][] { {-4,-4}, {1,2} };
case 7747:
return new int[][] { {-4,-4}, {-2,-1} };
case 6297:
return new int[][] { {1}, {4} };
case 6303:
return new int[][] { {-2}, {4} };
case 7139:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {2,3,3,4,4,4,4,4} };
case 7141:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,1,2,2,3,3,4,4,4,4,4} };
case 7381:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,2,3,3} };
case 7137:
return new int[][] { {0,1,2}, {4,4,4} };
case 6899:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {2,3,3,4,4,4,4,4} };
case 6901:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {0,1,2,2,3,3,4,4,4,4,4} };
case 7621:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 7143:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,2,2,3,3,4,4,4} };
case 7383:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,2,3,3} };
case 6897:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6903:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-1,0,1,2,2,3,3,4,4,4} };
case 7623:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 7135:
return new int[][] { {2}, {4} };
case 6659:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {3,3,4,4,4,4,4} };
case 6661:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {2,2,3,3,4,4,4,4,4} };
case 7861:
return new int[][] { {-4}, {-2} };
case 7145:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,2,3,3,4} };
case 7385:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,2,3} };
case 6895:
return new int[][] { {1,2}, {4,4} };
case 6657:
return new int[][] { {-1,0,1,2}, {4,4,4,4} };
case 6663:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0}, {1,2,2,3,3,4,4,4} };
case 7863:
return new int[][] { {-4,-4}, {-2,-1} };
case 6905:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2}, {-1,0,1,2,2,3,3,4} };
case 7625:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 6655:
return new int[][] { {1,2}, {4,4} };
case 6419:
return new int[][] { {-2,-1,0,1,2}, {4,4,4,4,4} };
case 6421:
return new int[][] { {-3,-2,-2,-1,0}, {3,3,4,4,4} };
case 6665:
return new int[][] { {-4,-4,-3,-3,-2}, {1,2,2,3,4} };
case 7865:
return new int[][] { {-4,-4}, {-2,-1} };
case 7147:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7387:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 6417:
return new int[][] { {0,1,2}, {4,4,4} };
case 6423:
return new int[][] { {-3,-2,-2}, {3,3,4} };
case 6907:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7627:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 6415:
return new int[][] { {2}, {4} };
case 6425:
return new int[][] { {-3}, {3} };
case 6667:
return new int[][] { {-4}, {2} };
case 7867:
return new int[][] { {-4}, {-2} };
}

return null;
}

public static int[][] gcl_WEST_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7020:
return new int[][] { {-4,-4,-4,-3,-2}, {0,1,2,3,4} };
case 7500:
return new int[][] { {-4,-4,-4,-3,-2}, {-2,-1,0,-3,-4} };
case 7262:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7018:
return new int[][] { {-2}, {4} };
case 7498:
return new int[][] { {-2}, {-4} };
case 7022:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,3,4} };
case 7502:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,-3,-4} };
case 6780:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7740:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7264:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,-4} };
case 6778:
return new int[][] { {-2}, {4} };
case 7738:
return new int[][] { {-2}, {-4} };
case 6782:
return new int[][] { {-4,-4,-4,-3,-2}, {0,1,2,3,4} };
case 7742:
return new int[][] { {-4,-4,-4,-3,-2}, {-2,-1,0,-3,-4} };
case 7024:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,3,4} };
case 7504:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,-3,-4} };
case 6784:
return new int[][] { {-4,-4,-4,-3,-2}, {0,1,2,3,4} };
case 7744:
return new int[][] { {-4,-4,-4,-3,-2}, {-2,-1,0,-3,-4} };
case 6540:
return new int[][] { {-3,-2}, {3,4} };
case 7980:
return new int[][] { {-3,-2}, {-3,-4} };
case 7266:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-3} };
case 6538:
return new int[][] { {-2}, {4} };
case 7978:
return new int[][] { {-2}, {-4} };
case 6542:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7982:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7026:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,3} };
case 7506:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-3} };
case 6544:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7984:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 6786:
return new int[][] { {-4,-4,-4,-3}, {0,1,2,3} };
case 7746:
return new int[][] { {-4,-4,-4,-3}, {-2,-1,0,-3} };
case 6300:
return new int[][] { {-2}, {4} };
case 8220:
return new int[][] { {-2}, {-4} };
case 7268:
return new int[][] { {-4,-4}, {-2,-1} };
case 6302:
return new int[][] { {-2}, {4} };
case 8222:
return new int[][] { {-2}, {-4} };
case 7028:
return new int[][] { {-4}, {0} };
case 7508:
return new int[][] { {-4}, {-2} };
case 6546:
return new int[][] { {-4}, {2} };
case 7986:
return new int[][] { {-4}, {-2} };
case 7140:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,3,4} };
case 7380:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,-3,-4} };
case 7142:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,4} };
case 7382:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,-4} };
case 6900:
return new int[][] { {-4,-4,-3,-2}, {1,2,3,4} };
case 7620:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 6898:
return new int[][] { {-2}, {4} };
case 7618:
return new int[][] { {-2}, {-4} };
case 6902:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,3,4} };
case 7622:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,-3,-4} };
case 7144:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,4} };
case 7384:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,-4} };
case 6660:
return new int[][] { {-3,-2}, {3,4} };
case 7860:
return new int[][] { {-3,-2}, {-3,-4} };
case 6904:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,3,4} };
case 7624:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,-3,-4} };
case 6658:
return new int[][] { {-2}, {4} };
case 7858:
return new int[][] { {-2}, {-4} };
case 6662:
return new int[][] { {-4,-4,-3,-2}, {1,2,3,4} };
case 7862:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 7146:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,3} };
case 7386:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-3} };
case 6664:
return new int[][] { {-4,-4,-3,-2}, {1,2,3,4} };
case 7864:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 6906:
return new int[][] { {-4,-4,-4,-4,-3}, {-1,0,1,2,3} };
case 7626:
return new int[][] { {-4,-4,-4,-4,-3}, {-2,-1,0,1,-3} };
case 6420:
return new int[][] { {-2}, {4} };
case 8100:
return new int[][] { {-2}, {-4} };
case 6422:
return new int[][] { {-3,-2}, {3,4} };
case 8102:
return new int[][] { {-3,-2}, {-3,-4} };
case 6666:
return new int[][] { {-4,-4,-3}, {1,2,3} };
case 7866:
return new int[][] { {-4,-4,-3}, {-2,-1,-3} };
case 6424:
return new int[][] { {-3,-2}, {3,4} };
case 8104:
return new int[][] { {-3,-2}, {-3,-4} };
case 7148:
return new int[][] { {-4,-4}, {-1,0} };
case 7388:
return new int[][] { {-4,-4}, {-2,-1} };
case 6908:
return new int[][] { {-4}, {1} };
case 7628:
return new int[][] { {-4}, {-2} };
case 7261:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7019:
return new int[][] { {-3,-2}, {3,4} };
case 7499:
return new int[][] { {-3,-2}, {-3,-4} };
case 7021:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,3,4} };
case 7501:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,-3,-4} };
case 7263:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,3,-4,4} };
case 7023:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,3,4} };
case 7503:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,-3,-4} };
case 6779:
return new int[][] { {-3,-2}, {3,4} };
case 7739:
return new int[][] { {-3,-2}, {-3,-4} };
case 6781:
return new int[][] { {-4,-4,-3,-2}, {1,2,3,4} };
case 7741:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 6783:
return new int[][] { {-4,-4,-4,-3,-2}, {0,1,2,3,4} };
case 7743:
return new int[][] { {-4,-4,-4,-3,-2}, {-2,-1,0,-3,-4} };
case 7265:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,3} };
case 7025:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,3,4} };
case 7505:
return new int[][] { {-4,-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,2,-3,-4} };
case 6539:
return new int[][] { {-2}, {4} };
case 7979:
return new int[][] { {-2}, {-4} };
case 6541:
return new int[][] { {-3,-2}, {3,4} };
case 7981:
return new int[][] { {-3,-2}, {-3,-4} };
case 6785:
return new int[][] { {-4,-4,-4,-3,-2}, {0,1,2,3,4} };
case 7745:
return new int[][] { {-4,-4,-4,-3,-2}, {-2,-1,0,-3,-4} };
case 6543:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7983:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7267:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7027:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7507:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 6545:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7985:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 6301:
return new int[][] { {-2}, {4} };
case 8221:
return new int[][] { {-2}, {-4} };
case 6787:
return new int[][] { {-4,-4}, {1,2} };
case 7747:
return new int[][] { {-4,-4}, {-2,-1} };
case 6303:
return new int[][] { {-2}, {4} };
case 8223:
return new int[][] { {-2}, {-4} };
case 7139:
return new int[][] { {-3,-2}, {3,4} };
case 7379:
return new int[][] { {-3,-2}, {-3,-4} };
case 7141:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,4} };
case 7381:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,-4} };
case 6899:
return new int[][] { {-3,-2}, {3,4} };
case 7619:
return new int[][] { {-3,-2}, {-3,-4} };
case 6901:
return new int[][] { {-4,-4,-4,-3,-2}, {0,1,2,3,4} };
case 7621:
return new int[][] { {-4,-4,-4,-3,-2}, {-2,-1,0,-3,-4} };
case 7143:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,4} };
case 7383:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,3,-4} };
case 6903:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,3,4} };
case 7623:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,-3,-4} };
case 6659:
return new int[][] { {-3,-2}, {3,4} };
case 7859:
return new int[][] { {-3,-2}, {-3,-4} };
case 6661:
return new int[][] { {-4,-3,-2}, {2,3,4} };
case 7861:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7145:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,3} };
case 7385:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,3} };
case 6663:
return new int[][] { {-4,-4,-3,-2}, {1,2,3,4} };
case 7863:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 6905:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,3,4} };
case 7625:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-2,-1,0,1,-3,-4} };
case 6419:
return new int[][] { {-2}, {4} };
case 8099:
return new int[][] { {-2}, {-4} };
case 6421:
return new int[][] { {-3,-2}, {3,4} };
case 8101:
return new int[][] { {-3,-2}, {-3,-4} };
case 6665:
return new int[][] { {-4,-4,-3,-2}, {1,2,3,4} };
case 7865:
return new int[][] { {-4,-4,-3,-2}, {-2,-1,-3,-4} };
case 7147:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7387:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 6423:
return new int[][] { {-3,-2}, {3,4} };
case 8103:
return new int[][] { {-3,-2}, {-3,-4} };
case 6907:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7627:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 6425:
return new int[][] { {-3}, {3} };
case 8105:
return new int[][] { {-3}, {-3} };
case 6667:
return new int[][] { {-4}, {2} };
case 7867:
return new int[][] { {-4}, {-2} };
}

return null;
}

public static int[][] gcl_SOUTHWEST_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7258:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 7020:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7500:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7262:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4} };
case 7498:
return new int[][] { {-2,-2,-1,0,1,2}, {-4,-3,-4,-4,-4,-4} };
case 7022:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-2} };
case 7502:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4,-4} };
case 7256:
return new int[][] { {2}, {-4} };
case 6780:
return new int[][] { {-4}, {2} };
case 7740:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7264:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,-2,-4,-3} };
case 7496:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 7738:
return new int[][] { {-2,-2,-1,0,1,2}, {-4,-3,-4,-4,-4,-4} };
case 6782:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7742:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,-3,-2,-4,-3,-4,-4,-4} };
case 7024:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-2} };
case 7504:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4} };
case 7736:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 6784:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7744:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,-3,-2,-4,-3,-4} };
case 7980:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {-3,-4,-3,-4,-4,-4,-4} };
case 7266:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,-2} };
case 7494:
return new int[][] { {2}, {-4} };
case 7978:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 6542:
return new int[][] { {-4}, {2} };
case 7982:
return new int[][] { {-4,-3,-3,-2,-2,-1,0}, {-2,-3,-2,-4,-3,-4,-4} };
case 7026:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7506:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,-2} };
case 7734:
return new int[][] { {2}, {-4} };
case 7976:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 6544:
return new int[][] { {-4}, {2} };
case 7984:
return new int[][] { {-4,-3,-3,-2}, {-2,-3,-2,-4} };
case 6786:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7746:
return new int[][] { {-4,-4,-4,-3}, {-2,-1,0,-3} };
case 8220:
return new int[][] { {-2,-1}, {-4,-4} };
case 7268:
return new int[][] { {-4,-4}, {-2,-1} };
case 8218:
return new int[][] { {0}, {-4} };
case 8222:
return new int[][] { {-2}, {-4} };
case 7028:
return new int[][] { {-4}, {0} };
case 7508:
return new int[][] { {-4}, {-2} };
case 7974:
return new int[][] { {2}, {-4} };
case 6546:
return new int[][] { {-4}, {2} };
case 7986:
return new int[][] { {-4}, {-2} };
case 7140:
return new int[][] { {-4,-4,-4,-4,-3,-2}, {-1,0,1,2,-2,-3} };
case 7380:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,1,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7378:
return new int[][] { {-2,-1,0,1,2}, {-3,-4,-4,-4,-4} };
case 7142:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,-2,-3} };
case 7382:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4,-4} };
case 6900:
return new int[][] { {-4,-4}, {1,2} };
case 7620:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7618:
return new int[][] { {-2,-2,-1,0,1,2}, {-4,-3,-4,-4,-4,-4} };
case 6902:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7622:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,-3,-2,-4,-3,-4,-4,-4} };
case 7376:
return new int[][] { {1,2}, {-4,-4} };
case 7144:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,-2,-3} };
case 7384:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4} };
case 7616:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 7860:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {-3,-2,-4,-3,-4,-4,-4,-4} };
case 6904:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7624:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,-3,-2,-4,-3,-4} };
case 7858:
return new int[][] { {-2,-2,-1,0,1,2}, {-4,-3,-4,-4,-4,-4} };
case 6662:
return new int[][] { {-4,-4}, {1,2} };
case 7862:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,-3,-2,-4,-3,-4,-4,-4} };
case 7146:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-2} };
case 7386:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,-2} };
case 7856:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 6664:
return new int[][] { {-4,-4}, {1,2} };
case 7864:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1}, {-2,-1,-3,-2,-4,-3,-4} };
case 7614:
return new int[][] { {2}, {-4} };
case 6906:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7626:
return new int[][] { {-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,-3,-2} };
case 8100:
return new int[][] { {-2,-2,-1,0,1}, {-4,-3,-4,-4,-4} };
case 8098:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 8102:
return new int[][] { {-3,-2,-2,-1}, {-3,-4,-3,-4} };
case 7854:
return new int[][] { {2}, {-4} };
case 6666:
return new int[][] { {-4,-4}, {1,2} };
case 7866:
return new int[][] { {-4,-4,-3}, {-2,-1,-3} };
case 8096:
return new int[][] { {1,2}, {-4,-4} };
case 8104:
return new int[][] { {-3,-2}, {-3,-4} };
case 7148:
return new int[][] { {-4,-4}, {-1,0} };
case 7388:
return new int[][] { {-4,-4}, {-2,-1} };
case 6908:
return new int[][] { {-4}, {1} };
case 7628:
return new int[][] { {-4}, {-2} };
case 7259:
return new int[][] { {-3,-2,-1,0,1,2}, {-2,-3,-4,-4,-4,-4} };
case 7261:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4,-4} };
case 7499:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {-3,-2,-4,-3,-4,-4,-4,-4} };
case 7021:
return new int[][] { {-4,-4,-4,-4,-3}, {-1,0,1,2,-2} };
case 7501:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,1,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7257:
return new int[][] { {1,2}, {-4,-4} };
case 7263:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1}, {-2,-1,0,1,2,-3,-2,-4,-3,-4} };
case 7497:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 7023:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-2} };
case 7503:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4} };
case 7739:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {-3,-2,-4,-3,-4,-4,-4,-4} };
case 6781:
return new int[][] { {-4,-4}, {1,2} };
case 7741:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7737:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 6783:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7743:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,-3,-2,-4,-3,-4,-4} };
case 7265:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,-2,-3} };
case 7495:
return new int[][] { {1,2}, {-4,-4} };
case 7025:
return new int[][] { {-4,-4,-4,-4,-4,-3}, {-2,-1,0,1,2,-2} };
case 7505:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,-2,-4,-3} };
case 7979:
return new int[][] { {-2,-2,-1,0,1,2}, {-4,-3,-4,-4,-4,-4} };
case 7981:
return new int[][] { {-3,-3,-2,-2,-1,0,1}, {-3,-2,-4,-3,-4,-4,-4} };
case 7735:
return new int[][] { {1,2}, {-4,-4} };
case 6785:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7745:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,-3,-2,-4,-3} };
case 7977:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 6543:
return new int[][] { {-4}, {2} };
case 7983:
return new int[][] { {-4,-3,-3,-2,-2,-1}, {-2,-3,-2,-4,-3,-4} };
case 7267:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7027:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7507:
return new int[][] { {-4,-4,-4,-4}, {-2,-1,0,1} };
case 7975:
return new int[][] { {1,2}, {-4,-4} };
case 6545:
return new int[][] { {-4}, {2} };
case 7985:
return new int[][] { {-4,-3,-3}, {-2,-3,-2} };
case 8219:
return new int[][] { {-1,0}, {-4,-4} };
case 8221:
return new int[][] { {-2,-1}, {-4,-4} };
case 6787:
return new int[][] { {-4,-4}, {1,2} };
case 7747:
return new int[][] { {-4,-4}, {-2,-1} };
case 8217:
return new int[][] { {1}, {-4} };
case 8223:
return new int[][] { {-2}, {-4} };
case 7379:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {-3,-2,-4,-3,-4,-4,-4,-4} };
case 7141:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,-2,-3} };
case 7381:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7377:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 7619:
return new int[][] { {-3,-3,-2,-2,-1,0,1,2}, {-3,-2,-4,-3,-4,-4,-4,-4} };
case 6901:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7621:
return new int[][] { {-4,-4,-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-1,0,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7143:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2}, {-2,-1,0,1,2,-3,-2,-3} };
case 7383:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,2,-3,-2,-4,-3,-4,-4} };
case 7617:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 6903:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7623:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,0,1,-3,-2,-4,-3,-4,-4} };
case 7375:
return new int[][] { {2}, {-4} };
case 7859:
return new int[][] { {-3,-2,-2,-1,0,1,2}, {-3,-4,-3,-4,-4,-4,-4} };
case 6661:
return new int[][] { {-4}, {2} };
case 7861:
return new int[][] { {-4,-3,-3,-2,-2,-1,0,1,2}, {-2,-3,-2,-4,-3,-4,-4,-4,-4} };
case 7145:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3}, {-2,-1,0,1,2,-3,-2} };
case 7385:
return new int[][] { {-4,-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,2,-3,-2,-4,-3} };
case 7615:
return new int[][] { {1,2}, {-4,-4} };
case 7857:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 6663:
return new int[][] { {-4,-4}, {1,2} };
case 7863:
return new int[][] { {-4,-4,-3,-3,-2,-2,-1,0}, {-2,-1,-3,-2,-4,-3,-4,-4} };
case 6905:
return new int[][] { {-4,-4,-4,-4}, {-1,0,1,2} };
case 7625:
return new int[][] { {-4,-4,-4,-4,-3,-3,-2,-2}, {-2,-1,0,1,-3,-2,-4,-3} };
case 7855:
return new int[][] { {1,2}, {-4,-4} };
case 8099:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 8101:
return new int[][] { {-3,-2,-2,-1,0}, {-3,-4,-3,-4,-4} };
case 6665:
return new int[][] { {-4,-4}, {1,2} };
case 7865:
return new int[][] { {-4,-4,-3,-3,-2}, {-2,-1,-3,-2,-4} };
case 7147:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 7387:
return new int[][] { {-4,-4,-4,-4,-4}, {-2,-1,0,1,2} };
case 8097:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 8103:
return new int[][] { {-3,-2,-2}, {-3,-4,-3} };
case 6907:
return new int[][] { {-4,-4,-4}, {0,1,2} };
case 7627:
return new int[][] { {-4,-4,-4}, {-2,-1,0} };
case 8095:
return new int[][] { {2}, {-4} };
case 8105:
return new int[][] { {-3}, {-3} };
case 6667:
return new int[][] { {-4}, {2} };
case 7867:
return new int[][] { {-4}, {-2} };
}

return null;
}

public static int[][] gcl_SOUTH_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7258:
return new int[][] { {0,1,2,3,4}, {-4,-4,-4,-3,-2} };
case 7500:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7262:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7018:
return new int[][] { {4}, {-2} };
case 7498:
return new int[][] { {-2,-1,0,1,2,3,4}, {-4,-4,-4,-4,-4,-3,-2} };
case 7022:
return new int[][] { {-4}, {-2} };
case 7502:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {-2,-3,-4,-4,-4,-4,-4} };
case 7256:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7740:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {-2,-3,-4,-4,-4,-4,-4,-3} };
case 7264:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7016:
return new int[][] { {4}, {-2} };
case 7496:
return new int[][] { {0,1,2,3,4}, {-4,-4,-4,-3,-2} };
case 7738:
return new int[][] { {-2,-1,0,1,2,3,4}, {-4,-4,-4,-4,-4,-3,-2} };
case 7742:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {-2,-3,-4,-4,-4,-4,-4} };
case 7024:
return new int[][] { {-4}, {-2} };
case 7504:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7736:
return new int[][] { {0,1,2,3,4}, {-4,-4,-4,-3,-2} };
case 7744:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7254:
return new int[][] { {3,4}, {-3,-2} };
case 7980:
return new int[][] { {-3,-2,-1,0,1,2}, {-3,-4,-4,-4,-4,-4} };
case 7266:
return new int[][] { {-4,-3}, {-2,-3} };
case 7014:
return new int[][] { {4}, {-2} };
case 7494:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7978:
return new int[][] { {-2,-1,0,1,2,3}, {-4,-4,-4,-4,-4,-3} };
case 7982:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7026:
return new int[][] { {-4}, {-2} };
case 7506:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7734:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7976:
return new int[][] { {0,1,2,3}, {-4,-4,-4,-3} };
case 7984:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7746:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7252:
return new int[][] { {4}, {-2} };
case 8220:
return new int[][] { {-2,-1}, {-4,-4} };
case 7268:
return new int[][] { {-4}, {-2} };
case 7492:
return new int[][] { {4}, {-2} };
case 8218:
return new int[][] { {0}, {-4} };
case 8222:
return new int[][] { {-2}, {-4} };
case 7508:
return new int[][] { {-4}, {-2} };
case 7974:
return new int[][] { {2}, {-4} };
case 7986:
return new int[][] { {-4}, {-2} };
case 7380:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7138:
return new int[][] { {3,4}, {-3,-2} };
case 7378:
return new int[][] { {-1,0,1,2,3,4}, {-4,-4,-4,-4,-3,-2} };
case 7142:
return new int[][] { {-4,-3}, {-2,-3} };
case 7382:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7620:
return new int[][] { {-4,-3,-2,-1,0,1,2,3,4}, {-2,-3,-4,-4,-4,-4,-4,-3,-2} };
case 7618:
return new int[][] { {-2,-1,0,1,2,3,4}, {-4,-4,-4,-4,-4,-3,-2} };
case 7622:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {-2,-3,-4,-4,-4,-4,-4} };
case 7136:
return new int[][] { {3,4}, {-3,-2} };
case 7376:
return new int[][] { {1,2,3,4}, {-4,-4,-3,-2} };
case 7144:
return new int[][] { {-4,-3}, {-2,-3} };
case 7384:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7616:
return new int[][] { {0,1,2,3,4}, {-4,-4,-4,-3,-2} };
case 7860:
return new int[][] { {-3,-2,-1,0,1,2,3}, {-3,-4,-4,-4,-4,-4,-3} };
case 7624:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7858:
return new int[][] { {-2,-1,0,1,2,3,4}, {-4,-4,-4,-4,-4,-3,-2} };
case 7862:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {-2,-3,-4,-4,-4,-4,-4} };
case 7134:
return new int[][] { {4}, {-2} };
case 7374:
return new int[][] { {3,4}, {-3,-2} };
case 7146:
return new int[][] { {-4}, {-2} };
case 7386:
return new int[][] { {-4,-3}, {-2,-3} };
case 7856:
return new int[][] { {0,1,2,3,4}, {-4,-4,-4,-3,-2} };
case 7864:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7614:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7626:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 8100:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 8098:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 8102:
return new int[][] { {-3,-2,-1,0}, {-3,-4,-4,-4} };
case 7854:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7866:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7372:
return new int[][] { {4}, {-2} };
case 8096:
return new int[][] { {1,2}, {-4,-4} };
case 8104:
return new int[][] { {-3,-2}, {-3,-4} };
case 7388:
return new int[][] { {-4}, {-2} };
case 7612:
return new int[][] { {4}, {-2} };
case 7628:
return new int[][] { {-4}, {-2} };
case 7259:
return new int[][] { {-1,0,1,2,3,4}, {-4,-4,-4,-4,-3,-2} };
case 7261:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7499:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {-3,-4,-4,-4,-4,-4,-3,-2} };
case 7501:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {-2,-3,-4,-4,-4,-4,-4,-3} };
case 7257:
return new int[][] { {1,2,3,4}, {-4,-4,-3,-2} };
case 7263:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7017:
return new int[][] { {4}, {-2} };
case 7497:
return new int[][] { {-1,0,1,2,3,4}, {-4,-4,-4,-4,-3,-2} };
case 7023:
return new int[][] { {-4}, {-2} };
case 7503:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7739:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {-3,-4,-4,-4,-4,-4,-3,-2} };
case 7741:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {-2,-3,-4,-4,-4,-4,-4,-3} };
case 7255:
return new int[][] { {3,4}, {-3,-2} };
case 7737:
return new int[][] { {-1,0,1,2,3,4}, {-4,-4,-4,-4,-3,-2} };
case 7743:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7265:
return new int[][] { {-4,-3}, {-2,-3} };
case 7015:
return new int[][] { {4}, {-2} };
case 7495:
return new int[][] { {1,2,3,4}, {-4,-4,-3,-2} };
case 7025:
return new int[][] { {-4}, {-2} };
case 7505:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7979:
return new int[][] { {-2,-1,0,1,2,3}, {-4,-4,-4,-4,-4,-3} };
case 7981:
return new int[][] { {-3,-2,-1,0,1,2}, {-3,-4,-4,-4,-4,-4} };
case 7735:
return new int[][] { {1,2,3,4}, {-4,-4,-3,-2} };
case 7745:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7977:
return new int[][] { {-1,0,1,2,3}, {-4,-4,-4,-4,-3} };
case 7983:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7253:
return new int[][] { {4}, {-2} };
case 7267:
return new int[][] { {-4}, {-2} };
case 7493:
return new int[][] { {3,4}, {-3,-2} };
case 7507:
return new int[][] { {-4,-3}, {-2,-3} };
case 7975:
return new int[][] { {1,2,3}, {-4,-4,-3} };
case 7985:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7733:
return new int[][] { {3,4}, {-3,-2} };
case 8219:
return new int[][] { {-1,0}, {-4,-4} };
case 8221:
return new int[][] { {-2,-1}, {-4,-4} };
case 7747:
return new int[][] { {-4,-3}, {-2,-3} };
case 8217:
return new int[][] { {1}, {-4} };
case 8223:
return new int[][] { {-2}, {-4} };
case 7139:
return new int[][] { {3,4}, {-3,-2} };
case 7379:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {-3,-4,-4,-4,-4,-4,-3,-2} };
case 7141:
return new int[][] { {-4,-3}, {-2,-3} };
case 7381:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {-2,-3,-4,-4,-4,-4,-4,-3} };
case 7137:
return new int[][] { {3,4}, {-3,-2} };
case 7377:
return new int[][] { {0,1,2,3,4}, {-4,-4,-4,-3,-2} };
case 7619:
return new int[][] { {-3,-2,-1,0,1,2,3,4}, {-3,-4,-4,-4,-4,-4,-3,-2} };
case 7621:
return new int[][] { {-4,-3,-2,-1,0,1,2,3}, {-2,-3,-4,-4,-4,-4,-4,-3} };
case 7143:
return new int[][] { {-4,-3}, {-2,-3} };
case 7383:
return new int[][] { {-4,-3,-2,-1,0}, {-2,-3,-4,-4,-4} };
case 7617:
return new int[][] { {-1,0,1,2,3,4}, {-4,-4,-4,-4,-3,-2} };
case 7623:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7135:
return new int[][] { {3,4}, {-3,-2} };
case 7375:
return new int[][] { {2,3,4}, {-4,-3,-2} };
case 7859:
return new int[][] { {-3,-2,-1,0,1,2,3}, {-3,-4,-4,-4,-4,-4,-3} };
case 7861:
return new int[][] { {-4,-3,-2,-1,0,1,2}, {-2,-3,-4,-4,-4,-4,-4} };
case 7145:
return new int[][] { {-4,-3}, {-2,-3} };
case 7385:
return new int[][] { {-4,-3,-2}, {-2,-3,-4} };
case 7615:
return new int[][] { {1,2,3,4}, {-4,-4,-3,-2} };
case 7857:
return new int[][] { {-1,0,1,2,3,4}, {-4,-4,-4,-4,-3,-2} };
case 7863:
return new int[][] { {-4,-3,-2,-1,0,1}, {-2,-3,-4,-4,-4,-4} };
case 7625:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7133:
return new int[][] { {4}, {-2} };
case 7373:
return new int[][] { {3,4}, {-3,-2} };
case 7855:
return new int[][] { {1,2,3,4}, {-4,-4,-3,-2} };
case 8099:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 8101:
return new int[][] { {-3,-2,-1,0,1}, {-3,-4,-4,-4,-4} };
case 7865:
return new int[][] { {-4,-3,-2,-1}, {-2,-3,-4,-4} };
case 7147:
return new int[][] { {-4}, {-2} };
case 7387:
return new int[][] { {-4,-3}, {-2,-3} };
case 7613:
return new int[][] { {3,4}, {-3,-2} };
case 8097:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 8103:
return new int[][] { {-3,-2,-1}, {-3,-4,-4} };
case 7627:
return new int[][] { {-4,-3}, {-2,-3} };
case 7853:
return new int[][] { {3}, {-3} };
case 8095:
return new int[][] { {2}, {-4} };
case 8105:
return new int[][] { {-3}, {-3} };
case 7867:
return new int[][] { {-4}, {-2} };
}

return null;
}

public static int[][] gcl_SOUTHEAST_r (int index) {
switch (index) {
case 7260:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7258:
return new int[][] { {0,1,2,2,3,3,4,4,4,4,4}, {-4,-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7020:
return new int[][] { {4,4,4}, {0,1,2} };
case 7500:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0} };
case 7262:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 7018:
return new int[][] { {3,4,4,4,4,4}, {-2,-2,-1,0,1,2} };
case 7498:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1} };
case 7502:
return new int[][] { {-2,-1,0,1,2,2}, {-4,-4,-4,-4,-4,-3} };
case 7256:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,-3,-3,-2,-2,-1,0,1,2} };
case 6780:
return new int[][] { {4}, {2} };
case 7740:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2} };
case 7264:
return new int[][] { {-2}, {-4} };
case 7016:
return new int[][] { {3,4,4,4,4,4}, {-2,-2,-1,0,1,2} };
case 7496:
return new int[][] { {0,1,2,2,3,3,4,4,4,4}, {-4,-4,-4,-3,-3,-2,-2,-1,0,1} };
case 6778:
return new int[][] { {4,4,4}, {0,1,2} };
case 7738:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1} };
case 7742:
return new int[][] { {-2,-1,0,1,2,2}, {-4,-4,-4,-4,-4,-3} };
case 7504:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 6776:
return new int[][] { {4,4,4}, {0,1,2} };
case 7736:
return new int[][] { {0,1,2,2,3,3,4,4}, {-4,-4,-4,-3,-3,-2,-2,-1} };
case 7744:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 7254:
return new int[][] { {3,3,4,4,4,4,4}, {-3,-2,-2,-1,0,1,2} };
case 7980:
return new int[][] { {-2,-1,0,1,2,2,3}, {-4,-4,-4,-4,-4,-3,-3} };
case 7014:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 7494:
return new int[][] { {2,2,3,3,4,4,4}, {-4,-3,-3,-2,-2,-1,0} };
case 6538:
return new int[][] { {4}, {2} };
case 7978:
return new int[][] { {-2,-1,0,1,2,2,3}, {-4,-4,-4,-4,-4,-3,-3} };
case 7982:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 7506:
return new int[][] { {-2}, {-4} };
case 6774:
return new int[][] { {4,4,4}, {0,1,2} };
case 7734:
return new int[][] { {2,2,3,4}, {-4,-3,-3,-2} };
case 6536:
return new int[][] { {4}, {2} };
case 7976:
return new int[][] { {0,1,2,3}, {-4,-4,-4,-3} };
case 7984:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 7746:
return new int[][] { {-2}, {-4} };
case 7252:
return new int[][] { {4,4}, {-2,-1} };
case 8220:
return new int[][] { {-2,-1}, {-4,-4} };
case 7012:
return new int[][] { {4}, {0} };
case 7492:
return new int[][] { {4}, {-2} };
case 8218:
return new int[][] { {0}, {-4} };
case 8222:
return new int[][] { {-2}, {-4} };
case 6534:
return new int[][] { {4}, {2} };
case 7974:
return new int[][] { {2}, {-4} };
case 7986:
return new int[][] { {-2}, {-4} };
case 7140:
return new int[][] { {2,3,4,4,4,4}, {-3,-2,-1,0,1,2} };
case 7380:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1} };
case 7138:
return new int[][] { {2,3,3,4,4,4,4,4}, {-3,-3,-2,-2,-1,0,1,2} };
case 7378:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4,4,4}, {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7382:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-3} };
case 6900:
return new int[][] { {4,4}, {1,2} };
case 7620:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1} };
case 6898:
return new int[][] { {4,4,4,4}, {-1,0,1,2} };
case 7618:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0} };
case 7622:
return new int[][] { {-2,-1,0,1,2,2}, {-4,-4,-4,-4,-4,-3} };
case 7136:
return new int[][] { {2,3,3,4,4,4,4,4}, {-3,-3,-2,-2,-1,0,1,2} };
case 7376:
return new int[][] { {1,2,2,3,3,4,4,4,4,4}, {-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7384:
return new int[][] { {-2,-1}, {-4,-4} };
case 6896:
return new int[][] { {4,4,4,4}, {-1,0,1,2} };
case 7616:
return new int[][] { {0,1,2,2,3,3,4,4,4}, {-4,-4,-4,-3,-3,-2,-2,-1,0} };
case 7860:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {-4,-4,-4,-4,-4,-3,-3,-2} };
case 7624:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 6658:
return new int[][] { {4,4}, {1,2} };
case 7858:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2} };
case 7862:
return new int[][] { {-2,-1,0,1,2,2}, {-4,-4,-4,-4,-4,-3} };
case 7134:
return new int[][] { {3,4,4,4,4,4}, {-2,-2,-1,0,1,2} };
case 7374:
return new int[][] { {2,3,3,4,4,4,4}, {-3,-3,-2,-2,-1,0,1} };
case 6656:
return new int[][] { {4,4}, {1,2} };
case 7856:
return new int[][] { {0,1,2,2,3,3,4}, {-4,-4,-4,-3,-3,-2,-2} };
case 7864:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 6894:
return new int[][] { {4,4,4,4}, {-1,0,1,2} };
case 7614:
return new int[][] { {2,2,3,3,4,4}, {-4,-3,-3,-2,-2,-1} };
case 7626:
return new int[][] { {-2}, {-4} };
case 8100:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 8098:
return new int[][] { {-1,0,1,2}, {-4,-4,-4,-4} };
case 8102:
return new int[][] { {-2,-1,0,1}, {-4,-4,-4,-4} };
case 6654:
return new int[][] { {4,4}, {1,2} };
case 7854:
return new int[][] { {2,2,3}, {-4,-3,-3} };
case 7866:
return new int[][] { {-2}, {-4} };
case 7132:
return new int[][] { {4,4}, {-1,0} };
case 7372:
return new int[][] { {4,4}, {-2,-1} };
case 8096:
return new int[][] { {1,2}, {-4,-4} };
case 8104:
return new int[][] { {-2,-1}, {-4,-4} };
case 6892:
return new int[][] { {4}, {1} };
case 7612:
return new int[][] { {4}, {-2} };
case 7259:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4,4,4}, {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7261:
return new int[][] { {-2,-1,0,1,2,3}, {-4,-4,-4,-4,-3,-2} };
case 7019:
return new int[][] { {3,4,4,4,4}, {-2,-1,0,1,2} };
case 7499:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1} };
case 7501:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {-4,-4,-4,-4,-4,-3,-3,-2} };
case 7257:
return new int[][] { {1,2,2,3,3,4,4,4,4,4}, {-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7263:
return new int[][] { {-2,-1}, {-4,-4} };
case 7017:
return new int[][] { {3,4,4,4,4,4}, {-2,-2,-1,0,1,2} };
case 7497:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4,4}, {-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1} };
case 7503:
return new int[][] { {-2,-1,0,1}, {-4,-4,-4,-4} };
case 6779:
return new int[][] { {4,4}, {1,2} };
case 7739:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1} };
case 7741:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {-4,-4,-4,-4,-4,-3,-3,-2} };
case 7255:
return new int[][] { {2,3,3,4,4,4,4,4}, {-3,-3,-2,-2,-1,0,1,2} };
case 6777:
return new int[][] { {4,4,4}, {0,1,2} };
case 7737:
return new int[][] { {-1,0,1,2,2,3,3,4,4}, {-4,-4,-4,-4,-3,-3,-2,-2,-1} };
case 7743:
return new int[][] { {-2,-1,0,1}, {-4,-4,-4,-4} };
case 7015:
return new int[][] { {3,4,4,4,4,4}, {-2,-2,-1,0,1,2} };
case 7495:
return new int[][] { {1,2,2,3,3,4,4,4,4}, {-4,-4,-3,-3,-2,-2,-1,0,1} };
case 7505:
return new int[][] { {-2,-1}, {-4,-4} };
case 7979:
return new int[][] { {-2,-1,0,1,2,2,3}, {-4,-4,-4,-4,-4,-3,-3} };
case 7981:
return new int[][] { {-2,-1,0,1,2,2}, {-4,-4,-4,-4,-4,-3} };
case 6775:
return new int[][] { {4,4,4}, {0,1,2} };
case 7735:
return new int[][] { {1,2,2,3,3,4,4}, {-4,-4,-3,-3,-2,-2,-1} };
case 7745:
return new int[][] { {-2,-1}, {-4,-4} };
case 6537:
return new int[][] { {4}, {2} };
case 7977:
return new int[][] { {-1,0,1,2,2,3}, {-4,-4,-4,-4,-3,-3} };
case 7983:
return new int[][] { {-2,-1,0,1}, {-4,-4,-4,-4} };
case 7253:
return new int[][] { {3,4,4,4,4}, {-2,-2,-1,0,1} };
case 7013:
return new int[][] { {4,4,4,4}, {-1,0,1,2} };
case 7493:
return new int[][] { {3,3,4,4}, {-3,-2,-2,-1} };
case 6535:
return new int[][] { {4}, {2} };
case 7975:
return new int[][] { {1,2,2}, {-4,-4,-3} };
case 7985:
return new int[][] { {-2,-1}, {-4,-4} };
case 6773:
return new int[][] { {4,4}, {1,2} };
case 7733:
return new int[][] { {3,3}, {-3,-2} };
case 8219:
return new int[][] { {-1,0}, {-4,-4} };
case 8221:
return new int[][] { {-2,-1}, {-4,-4} };
case 8217:
return new int[][] { {1}, {-4} };
case 8223:
return new int[][] { {-2}, {-4} };
case 7139:
return new int[][] { {2,3,3,4,4,4,4,4}, {-3,-3,-2,-2,-1,0,1,2} };
case 7379:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 7381:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {-4,-4,-4,-4,-4,-3,-3,-2} };
case 7137:
return new int[][] { {2,3,3,4,4,4,4,4}, {-3,-3,-2,-2,-1,0,1,2} };
case 7377:
return new int[][] { {0,1,2,2,3,3,4,4,4,4,4}, {-4,-4,-4,-3,-3,-2,-2,-1,0,1,2} };
case 6899:
return new int[][] { {4,4,4}, {0,1,2} };
case 7619:
return new int[][] { {-2,-1,0,1,2,2,3,3,4,4,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2,-1,0} };
case 7621:
return new int[][] { {-2,-1,0,1,2,2,3,3}, {-4,-4,-4,-4,-4,-3,-3,-2} };
case 7383:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 6897:
return new int[][] { {4,4,4,4}, {-1,0,1,2} };
case 7617:
return new int[][] { {-1,0,1,2,2,3,3,4,4,4}, {-4,-4,-4,-4,-3,-3,-2,-2,-1,0} };
case 7623:
return new int[][] { {-2,-1,0,1}, {-4,-4,-4,-4} };
case 7135:
return new int[][] { {3,3,4,4,4,4,4}, {-3,-2,-2,-1,0,1,2} };
case 7375:
return new int[][] { {2,2,3,3,4,4,4,4,4}, {-4,-3,-3,-2,-2,-1,0,1,2} };
case 6659:
return new int[][] { {4}, {2} };
case 7859:
return new int[][] { {-2,-1,0,1,2,2,3,3,4}, {-4,-4,-4,-4,-4,-3,-3,-2,-2} };
case 7861:
return new int[][] { {-2,-1,0,1,2,2,3}, {-4,-4,-4,-4,-4,-3,-3} };
case 7385:
return new int[][] { {-2}, {-4} };
case 6895:
return new int[][] { {4,4,4,4}, {-1,0,1,2} };
case 7615:
return new int[][] { {1,2,2,3,3,4,4,4}, {-4,-4,-3,-3,-2,-2,-1,0} };
case 6657:
return new int[][] { {4,4}, {1,2} };
case 7857:
return new int[][] { {-1,0,1,2,2,3,3,4}, {-4,-4,-4,-4,-3,-3,-2,-2} };
case 7863:
return new int[][] { {-2,-1,0,1}, {-4,-4,-4,-4} };
case 7625:
return new int[][] { {-2,-1}, {-4,-4} };
case 7133:
return new int[][] { {4,4,4,4,4}, {-2,-1,0,1,2} };
case 7373:
return new int[][] { {3,3,4,4,4}, {-3,-2,-2,-1,0} };
case 6655:
return new int[][] { {4,4}, {1,2} };
case 7855:
return new int[][] { {1,2,2,3,4}, {-4,-4,-3,-3,-2} };
case 8099:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 8101:
return new int[][] { {-2,-1,0,1,2}, {-4,-4,-4,-4,-4} };
case 7865:
return new int[][] { {-2,-1}, {-4,-4} };
case 6893:
return new int[][] { {4,4,4}, {0,1,2} };
case 7613:
return new int[][] { {3,3,4}, {-3,-2,-2} };
case 8097:
return new int[][] { {0,1,2}, {-4,-4,-4} };
case 8103:
return new int[][] { {-2,-1,0}, {-4,-4,-4} };
case 6653:
return new int[][] { {4}, {2} };
case 7853:
return new int[][] { {3}, {-3} };
case 8095:
return new int[][] { {2}, {-4} };
case 8105:
return new int[][] { {-2}, {-4} };
}

return null;
}

}
