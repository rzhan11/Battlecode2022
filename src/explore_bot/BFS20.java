package explore_bot;

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static explore_bot.Debug.*;
import static explore_bot.Map.*;
import static explore_bot.Robot.*;

public class BFS20 {

public static MapLocation target;
public static MapLocation l_n1p0;
public static double v_n1p0;
public static Direction d_n1p0;
public static int p_n1p0;
public static MapLocation l_p0n1;
public static double v_p0n1;
public static Direction d_p0n1;
public static int p_p0n1;
public static MapLocation l_p0p1;
public static double v_p0p1;
public static Direction d_p0p1;
public static int p_p0p1;
public static MapLocation l_p1p0;
public static double v_p1p0;
public static Direction d_p1p0;
public static int p_p1p0;
public static MapLocation l_n1n1;
public static double v_n1n1;
public static Direction d_n1n1;
public static int p_n1n1;
public static MapLocation l_n1p1;
public static double v_n1p1;
public static Direction d_n1p1;
public static int p_n1p1;
public static MapLocation l_p1n1;
public static double v_p1n1;
public static Direction d_p1n1;
public static int p_p1n1;
public static MapLocation l_p1p1;
public static double v_p1p1;
public static Direction d_p1p1;
public static int p_p1p1;
public static MapLocation l_n2p0;
public static double v_n2p0;
public static Direction d_n2p0;
public static int p_n2p0;
public static MapLocation l_p0n2;
public static double v_p0n2;
public static Direction d_p0n2;
public static int p_p0n2;
public static MapLocation l_p0p2;
public static double v_p0p2;
public static Direction d_p0p2;
public static int p_p0p2;
public static MapLocation l_p2p0;
public static double v_p2p0;
public static Direction d_p2p0;
public static int p_p2p0;
public static MapLocation l_n2n1;
public static double v_n2n1;
public static Direction d_n2n1;
public static int p_n2n1;
public static MapLocation l_n2p1;
public static double v_n2p1;
public static Direction d_n2p1;
public static int p_n2p1;
public static MapLocation l_n1n2;
public static double v_n1n2;
public static Direction d_n1n2;
public static int p_n1n2;
public static MapLocation l_n1p2;
public static double v_n1p2;
public static Direction d_n1p2;
public static int p_n1p2;
public static MapLocation l_p1n2;
public static double v_p1n2;
public static Direction d_p1n2;
public static int p_p1n2;
public static MapLocation l_p1p2;
public static double v_p1p2;
public static Direction d_p1p2;
public static int p_p1p2;
public static MapLocation l_p2n1;
public static double v_p2n1;
public static Direction d_p2n1;
public static int p_p2n1;
public static MapLocation l_p2p1;
public static double v_p2p1;
public static Direction d_p2p1;
public static int p_p2p1;
public static MapLocation l_n2n2;
public static double v_n2n2;
public static Direction d_n2n2;
public static int p_n2n2;
public static MapLocation l_n2p2;
public static double v_n2p2;
public static Direction d_n2p2;
public static int p_n2p2;
public static MapLocation l_p2n2;
public static double v_p2n2;
public static Direction d_p2n2;
public static int p_p2n2;
public static MapLocation l_p2p2;
public static double v_p2p2;
public static Direction d_p2p2;
public static int p_p2p2;
public static MapLocation l_n3p0;
public static double v_n3p0;
public static Direction d_n3p0;
public static int p_n3p0;
public static MapLocation l_p0n3;
public static double v_p0n3;
public static Direction d_p0n3;
public static int p_p0n3;
public static MapLocation l_p0p3;
public static double v_p0p3;
public static Direction d_p0p3;
public static int p_p0p3;
public static MapLocation l_p3p0;
public static double v_p3p0;
public static Direction d_p3p0;
public static int p_p3p0;
public static MapLocation l_n3n1;
public static double v_n3n1;
public static Direction d_n3n1;
public static int p_n3n1;
public static MapLocation l_n3p1;
public static double v_n3p1;
public static Direction d_n3p1;
public static int p_n3p1;
public static MapLocation l_n1n3;
public static double v_n1n3;
public static Direction d_n1n3;
public static int p_n1n3;
public static MapLocation l_n1p3;
public static double v_n1p3;
public static Direction d_n1p3;
public static int p_n1p3;
public static MapLocation l_p1n3;
public static double v_p1n3;
public static Direction d_p1n3;
public static int p_p1n3;
public static MapLocation l_p1p3;
public static double v_p1p3;
public static Direction d_p1p3;
public static int p_p1p3;
public static MapLocation l_p3n1;
public static double v_p3n1;
public static Direction d_p3n1;
public static int p_p3n1;
public static MapLocation l_p3p1;
public static double v_p3p1;
public static Direction d_p3p1;
public static int p_p3p1;
public static MapLocation l_n3n2;
public static double v_n3n2;
public static Direction d_n3n2;
public static int p_n3n2;
public static MapLocation l_n3p2;
public static double v_n3p2;
public static Direction d_n3p2;
public static int p_n3p2;
public static MapLocation l_n2n3;
public static double v_n2n3;
public static Direction d_n2n3;
public static int p_n2n3;
public static MapLocation l_n2p3;
public static double v_n2p3;
public static Direction d_n2p3;
public static int p_n2p3;
public static MapLocation l_p2n3;
public static double v_p2n3;
public static Direction d_p2n3;
public static int p_p2n3;
public static MapLocation l_p2p3;
public static double v_p2p3;
public static Direction d_p2p3;
public static int p_p2p3;
public static MapLocation l_p3n2;
public static double v_p3n2;
public static Direction d_p3n2;
public static int p_p3n2;
public static MapLocation l_p3p2;
public static double v_p3p2;
public static Direction d_p3p2;
public static int p_p3p2;
public static MapLocation l_n4p0;
public static double v_n4p0;
public static Direction d_n4p0;
public static int p_n4p0;
public static MapLocation l_p0n4;
public static double v_p0n4;
public static Direction d_p0n4;
public static int p_p0n4;
public static MapLocation l_p0p4;
public static double v_p0p4;
public static Direction d_p0p4;
public static int p_p0p4;
public static MapLocation l_p4p0;
public static double v_p4p0;
public static Direction d_p4p0;
public static int p_p4p0;
public static MapLocation l_n4n1;
public static double v_n4n1;
public static Direction d_n4n1;
public static int p_n4n1;
public static MapLocation l_n4p1;
public static double v_n4p1;
public static Direction d_n4p1;
public static int p_n4p1;
public static MapLocation l_n1n4;
public static double v_n1n4;
public static Direction d_n1n4;
public static int p_n1n4;
public static MapLocation l_n1p4;
public static double v_n1p4;
public static Direction d_n1p4;
public static int p_n1p4;
public static MapLocation l_p1n4;
public static double v_p1n4;
public static Direction d_p1n4;
public static int p_p1n4;
public static MapLocation l_p1p4;
public static double v_p1p4;
public static Direction d_p1p4;
public static int p_p1p4;
public static MapLocation l_p4n1;
public static double v_p4n1;
public static Direction d_p4n1;
public static int p_p4n1;
public static MapLocation l_p4p1;
public static double v_p4p1;
public static Direction d_p4p1;
public static int p_p4p1;
public static MapLocation l_n3n3;
public static double v_n3n3;
public static Direction d_n3n3;
public static int p_n3n3;
public static MapLocation l_n3p3;
public static double v_n3p3;
public static Direction d_n3p3;
public static int p_n3p3;
public static MapLocation l_p3n3;
public static double v_p3n3;
public static Direction d_p3n3;
public static int p_p3n3;
public static MapLocation l_p3p3;
public static double v_p3p3;
public static Direction d_p3p3;
public static int p_p3p3;
public static MapLocation l_n4n2;
public static double v_n4n2;
public static Direction d_n4n2;
public static int p_n4n2;
public static MapLocation l_n4p2;
public static double v_n4p2;
public static Direction d_n4p2;
public static int p_n4p2;
public static MapLocation l_n2n4;
public static double v_n2n4;
public static Direction d_n2n4;
public static int p_n2n4;
public static MapLocation l_n2p4;
public static double v_n2p4;
public static Direction d_n2p4;
public static int p_n2p4;
public static MapLocation l_p2n4;
public static double v_p2n4;
public static Direction d_p2n4;
public static int p_p2n4;
public static MapLocation l_p2p4;
public static double v_p2p4;
public static Direction d_p2p4;
public static int p_p2p4;
public static MapLocation l_p4n2;
public static double v_p4n2;
public static Direction d_p4n2;
public static int p_p4n2;
public static MapLocation l_p4p2;
public static double v_p4p2;
public static Direction d_p4p2;
public static int p_p4p2;


public static double bestEstimation;
public static double initialDist;

public static double speed_n3n2;
public static double speed_n3p2;
public static double speed_n2n3;
public static double speed_n2p3;
public static double speed_p2n3;
public static double speed_p2p3;
public static double speed_p3n2;
public static double speed_p3p2;
public static double speed_n4p0;
public static double speed_p0n4;
public static double speed_p0p4;
public static double speed_p4p0;
public static double speed_n4n1;
public static double speed_n4p1;
public static double speed_n1n4;
public static double speed_n1p4;
public static double speed_p1n4;
public static double speed_p1p4;
public static double speed_p4n1;
public static double speed_p4p1;
public static double speed_n3n3;
public static double speed_n3p3;
public static double speed_p3n3;
public static double speed_p3p3;
public static double speed_n4n2;
public static double speed_n4p2;
public static double speed_n2n4;
public static double speed_n2p4;
public static double speed_p2n4;
public static double speed_p2p4;
public static double speed_p4n2;
public static double speed_p4p2;


public static Direction getBestDir(MapLocation tar) throws GameActionException {
target = tar;

l_n1p0 = here.add(WEST);
v_n1p0 = 1000000;
d_n1p0 = null;
l_p0n1 = here.add(SOUTH);
v_p0n1 = 1000000;
d_p0n1 = null;
l_p0p1 = here.add(NORTH);
v_p0p1 = 1000000;
d_p0p1 = null;
l_p1p0 = here.add(EAST);
v_p1p0 = 1000000;
d_p1p0 = null;
l_n1n1 = here.add(SOUTHWEST);
v_n1n1 = 1000000;
d_n1n1 = null;
l_n1p1 = here.add(NORTHWEST);
v_n1p1 = 1000000;
d_n1p1 = null;
l_p1n1 = here.add(SOUTHEAST);
v_p1n1 = 1000000;
d_p1n1 = null;
l_p1p1 = here.add(NORTHEAST);
v_p1p1 = 1000000;
d_p1p1 = null;
l_n2p0 = l_n1p0.add(WEST);
v_n2p0 = 1000000;
d_n2p0 = null;
l_p0n2 = l_p0n1.add(SOUTH);
v_p0n2 = 1000000;
d_p0n2 = null;
l_p0p2 = l_p0p1.add(NORTH);
v_p0p2 = 1000000;
d_p0p2 = null;
l_p2p0 = l_p1p0.add(EAST);
v_p2p0 = 1000000;
d_p2p0 = null;
l_n2n1 = l_n1p0.add(SOUTHWEST);
v_n2n1 = 1000000;
d_n2n1 = null;
l_n2p1 = l_n1p0.add(NORTHWEST);
v_n2p1 = 1000000;
d_n2p1 = null;
l_n1n2 = l_p0n1.add(SOUTHWEST);
v_n1n2 = 1000000;
d_n1n2 = null;
l_n1p2 = l_p0p1.add(NORTHWEST);
v_n1p2 = 1000000;
d_n1p2 = null;
l_p1n2 = l_p0n1.add(SOUTHEAST);
v_p1n2 = 1000000;
d_p1n2 = null;
l_p1p2 = l_p0p1.add(NORTHEAST);
v_p1p2 = 1000000;
d_p1p2 = null;
l_p2n1 = l_p1p0.add(SOUTHEAST);
v_p2n1 = 1000000;
d_p2n1 = null;
l_p2p1 = l_p1p0.add(NORTHEAST);
v_p2p1 = 1000000;
d_p2p1 = null;
l_n2n2 = l_n1n1.add(SOUTHWEST);
v_n2n2 = 1000000;
d_n2n2 = null;
l_n2p2 = l_n1p1.add(NORTHWEST);
v_n2p2 = 1000000;
d_n2p2 = null;
l_p2n2 = l_p1n1.add(SOUTHEAST);
v_p2n2 = 1000000;
d_p2n2 = null;
l_p2p2 = l_p1p1.add(NORTHEAST);
v_p2p2 = 1000000;
d_p2p2 = null;
l_n3p0 = l_n2p0.add(WEST);
v_n3p0 = 1000000;
d_n3p0 = null;
l_p0n3 = l_p0n2.add(SOUTH);
v_p0n3 = 1000000;
d_p0n3 = null;
l_p0p3 = l_p0p2.add(NORTH);
v_p0p3 = 1000000;
d_p0p3 = null;
l_p3p0 = l_p2p0.add(EAST);
v_p3p0 = 1000000;
d_p3p0 = null;
l_n3n1 = l_n2p0.add(SOUTHWEST);
v_n3n1 = 1000000;
d_n3n1 = null;
l_n3p1 = l_n2p0.add(NORTHWEST);
v_n3p1 = 1000000;
d_n3p1 = null;
l_n1n3 = l_p0n2.add(SOUTHWEST);
v_n1n3 = 1000000;
d_n1n3 = null;
l_n1p3 = l_p0p2.add(NORTHWEST);
v_n1p3 = 1000000;
d_n1p3 = null;
l_p1n3 = l_p0n2.add(SOUTHEAST);
v_p1n3 = 1000000;
d_p1n3 = null;
l_p1p3 = l_p0p2.add(NORTHEAST);
v_p1p3 = 1000000;
d_p1p3 = null;
l_p3n1 = l_p2p0.add(SOUTHEAST);
v_p3n1 = 1000000;
d_p3n1 = null;
l_p3p1 = l_p2p0.add(NORTHEAST);
v_p3p1 = 1000000;
d_p3p1 = null;
l_n3n2 = l_n2n1.add(SOUTHWEST);
v_n3n2 = 1000000;
d_n3n2 = null;
l_n3p2 = l_n2p1.add(NORTHWEST);
v_n3p2 = 1000000;
d_n3p2 = null;
l_n2n3 = l_n1n2.add(SOUTHWEST);
v_n2n3 = 1000000;
d_n2n3 = null;
l_n2p3 = l_n1p2.add(NORTHWEST);
v_n2p3 = 1000000;
d_n2p3 = null;
l_p2n3 = l_p1n2.add(SOUTHEAST);
v_p2n3 = 1000000;
d_p2n3 = null;
l_p2p3 = l_p1p2.add(NORTHEAST);
v_p2p3 = 1000000;
d_p2p3 = null;
l_p3n2 = l_p2n1.add(SOUTHEAST);
v_p3n2 = 1000000;
d_p3n2 = null;
l_p3p2 = l_p2p1.add(NORTHEAST);
v_p3p2 = 1000000;
d_p3p2 = null;
l_n4p0 = l_n3p0.add(WEST);
v_n4p0 = 1000000;
d_n4p0 = null;
l_p0n4 = l_p0n3.add(SOUTH);
v_p0n4 = 1000000;
d_p0n4 = null;
l_p0p4 = l_p0p3.add(NORTH);
v_p0p4 = 1000000;
d_p0p4 = null;
l_p4p0 = l_p3p0.add(EAST);
v_p4p0 = 1000000;
d_p4p0 = null;
l_n4n1 = l_n3p0.add(SOUTHWEST);
v_n4n1 = 1000000;
d_n4n1 = null;
l_n4p1 = l_n3p0.add(NORTHWEST);
v_n4p1 = 1000000;
d_n4p1 = null;
l_n1n4 = l_p0n3.add(SOUTHWEST);
v_n1n4 = 1000000;
d_n1n4 = null;
l_n1p4 = l_p0p3.add(NORTHWEST);
v_n1p4 = 1000000;
d_n1p4 = null;
l_p1n4 = l_p0n3.add(SOUTHEAST);
v_p1n4 = 1000000;
d_p1n4 = null;
l_p1p4 = l_p0p3.add(NORTHEAST);
v_p1p4 = 1000000;
d_p1p4 = null;
l_p4n1 = l_p3p0.add(SOUTHEAST);
v_p4n1 = 1000000;
d_p4n1 = null;
l_p4p1 = l_p3p0.add(NORTHEAST);
v_p4p1 = 1000000;
d_p4p1 = null;
l_n3n3 = l_n2n2.add(SOUTHWEST);
v_n3n3 = 1000000;
d_n3n3 = null;
l_n3p3 = l_n2p2.add(NORTHWEST);
v_n3p3 = 1000000;
d_n3p3 = null;
l_p3n3 = l_p2n2.add(SOUTHEAST);
v_p3n3 = 1000000;
d_p3n3 = null;
l_p3p3 = l_p2p2.add(NORTHEAST);
v_p3p3 = 1000000;
d_p3p3 = null;
l_n4n2 = l_n3n1.add(SOUTHWEST);
v_n4n2 = 1000000;
d_n4n2 = null;
l_n4p2 = l_n3p1.add(NORTHWEST);
v_n4p2 = 1000000;
d_n4p2 = null;
l_n2n4 = l_n1n3.add(SOUTHWEST);
v_n2n4 = 1000000;
d_n2n4 = null;
l_n2p4 = l_n1p3.add(NORTHWEST);
v_n2p4 = 1000000;
d_n2p4 = null;
l_p2n4 = l_p1n3.add(SOUTHEAST);
v_p2n4 = 1000000;
d_p2n4 = null;
l_p2p4 = l_p1p3.add(NORTHEAST);
v_p2p4 = 1000000;
d_p2p4 = null;
l_p4n2 = l_p3n1.add(SOUTHEAST);
v_p4n2 = 1000000;
d_p4n2 = null;
l_p4p2 = l_p3p1.add(NORTHEAST);
v_p4p2 = 1000000;
d_p4p2 = null;


int xmin = -Math.min(here.x, 4);
int ymin = -Math.min(here.y, 4);
int xmax = Math.min(XMAX - here.x, 4);
int ymax = Math.min(YMAX - here.y, 4);
log("bounds " + xmin + " " + ymin + " " + xmax + " " + ymax);
switch (xmin) {
case -4: 
switch (xmax) {
case 0: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n4n4_p0p0();
case 1: 
return bfs_n4n4_p0p1();
case 2: 
return bfs_n4n4_p0p2();
case 3: 
return bfs_n4n4_p0p3();
case 4: 
return bfs_n4n4_p0p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n4n3_p0p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n4n2_p0p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n4n1_p0p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n4p0_p0p4();
}
break;}
break;case 1: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n4n4_p1p0();
case 1: 
return bfs_n4n4_p1p1();
case 2: 
return bfs_n4n4_p1p2();
case 3: 
return bfs_n4n4_p1p3();
case 4: 
return bfs_n4n4_p1p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n4n3_p1p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n4n2_p1p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n4n1_p1p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n4p0_p1p4();
}
break;}
break;case 2: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n4n4_p2p0();
case 1: 
return bfs_n4n4_p2p1();
case 2: 
return bfs_n4n4_p2p2();
case 3: 
return bfs_n4n4_p2p3();
case 4: 
return bfs_n4n4_p2p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n4n3_p2p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n4n2_p2p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n4n1_p2p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n4p0_p2p4();
}
break;}
break;case 3: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n4n4_p3p0();
case 1: 
return bfs_n4n4_p3p1();
case 2: 
return bfs_n4n4_p3p2();
case 3: 
return bfs_n4n4_p3p3();
case 4: 
return bfs_n4n4_p3p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n4n3_p3p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n4n2_p3p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n4n1_p3p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n4p0_p3p4();
}
break;}
break;case 4: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n4n4_p4p0();
case 1: 
return bfs_n4n4_p4p1();
case 2: 
return bfs_n4n4_p4p2();
case 3: 
return bfs_n4n4_p4p3();
case 4: 
return bfs_n4n4_p4p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n4n3_p4p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n4n2_p4p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n4n1_p4p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n4p0_p4p4();
}
break;}
break;}
break;case -3: 
switch (xmax) {
case 4: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n3n4_p4p0();
case 1: 
return bfs_n3n4_p4p1();
case 2: 
return bfs_n3n4_p4p2();
case 3: 
return bfs_n3n4_p4p3();
case 4: 
return bfs_n3n4_p4p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n3n3_p4p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n3n2_p4p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n3n1_p4p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n3p0_p4p4();
}
break;}
break;}
break;case -2: 
switch (xmax) {
case 4: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n2n4_p4p0();
case 1: 
return bfs_n2n4_p4p1();
case 2: 
return bfs_n2n4_p4p2();
case 3: 
return bfs_n2n4_p4p3();
case 4: 
return bfs_n2n4_p4p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n2n3_p4p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n2n2_p4p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n2n1_p4p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n2p0_p4p4();
}
break;}
break;}
break;case -1: 
switch (xmax) {
case 4: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_n1n4_p4p0();
case 1: 
return bfs_n1n4_p4p1();
case 2: 
return bfs_n1n4_p4p2();
case 3: 
return bfs_n1n4_p4p3();
case 4: 
return bfs_n1n4_p4p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_n1n3_p4p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_n1n2_p4p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_n1n1_p4p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_n1p0_p4p4();
}
break;}
break;}
break;case 0: 
switch (xmax) {
case 4: 
switch (ymin) {
case -4: 
switch (ymax) {
case 0: 
return bfs_p0n4_p4p0();
case 1: 
return bfs_p0n4_p4p1();
case 2: 
return bfs_p0n4_p4p2();
case 3: 
return bfs_p0n4_p4p3();
case 4: 
return bfs_p0n4_p4p4();
}
break;case -3: 
switch (ymax) {
case 4: 
return bfs_p0n3_p4p4();
}
break;case -2: 
switch (ymax) {
case 4: 
return bfs_p0n2_p4p4();
}
break;case -1: 
switch (ymax) {
case 4: 
return bfs_p0n1_p4p4();
}
break;case 0: 
switch (ymax) {
case 4: 
return bfs_p0p0_p4p4();
}
break;}
break;}
break;}

logi("WARNING: 'Unexpected map offsets' " + xmin + " " + ymin + " " + ymax + " " + ymax);
return null;
}

public static Direction bfs_n4n4_p0p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,speed_n2n4)))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p0p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,speed_n2n4))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p0p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2n4))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p0p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2n4))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p0p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,speed_n2p4)))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n4_p1p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,speed_n2n4))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p1p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,speed_n2n4)))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p1p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2n4)))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p1p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2n4)))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}

return null;
}


public static Direction bfs_n4n4_p1p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_p1n4,Math.max(speed_p1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,speed_n2p4)))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n4_p2p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,Math.max(speed_n2n4,speed_p2n4))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p2p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,Math.max(speed_n2n4,speed_p2n4)))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p2p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,speed_p2n4)))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p2p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,speed_p2n4))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p2p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_p1n4,Math.max(speed_p1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,Math.max(speed_n2p4,Math.max(speed_p2n4,speed_p2p4)))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n4_p3p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n4n2,Math.max(speed_n2n4,speed_p2n4))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p3p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n4n2,Math.max(speed_n2n4,speed_p2n4)))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p3p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,speed_p2n4))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p3p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,speed_p2n4))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}

return null;
}


public static Direction bfs_n4n4_p3p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_p1n4,Math.max(speed_p1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,Math.max(speed_n2p4,Math.max(speed_p2n4,speed_p2p4)))))))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n4_p4p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n4n2,Math.max(speed_n2n4,Math.max(speed_p2n4,speed_p4n2)))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n4n4_p4p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n4n2,Math.max(speed_n2n4,Math.max(speed_p2n4,speed_p4n2)))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n4n4_p4p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,Math.max(speed_p2n4,Math.max(speed_p4n2,speed_p4p2)))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n4n4_p4p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,Math.max(speed_p2n4,Math.max(speed_p4n2,speed_p4p2)))))))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n4n4_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_p1n4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2n4,Math.max(speed_n2p4,Math.max(speed_p2n4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2))))))))))))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n4n3_p0p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2p4))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n3_p1p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2p4)))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n3_p2p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n3_p3p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n3_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}
if (v_n4n2 > v_n3n3 + p_n4n2) {
v_n4n2 = v_n3n3 + p_n4n2;
d_n4n2 = d_n3n3;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2p4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2)))))))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n4n2_p0p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2p4))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n2_p1p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,speed_n2p4)))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n2_p2p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4)))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n2_p3p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n2_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n3n2 + p_n4n1) {
v_n4n1 = v_n3n2 + p_n4n1;
d_n4n1 = d_n3n2;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4n2 = 10 + rc.senseRubble(l_n4n2);
if (v_n4n2 > v_n3n1 + p_n4n2) {
v_n4n2 = v_n3n1 + p_n4n2;
d_n4n2 = d_n3n1;
}
if (v_n4n2 > v_n3n2 + p_n4n2) {
v_n4n2 = v_n3n2 + p_n4n2;
d_n4n2 = d_n3n2;
}
if (v_n4n2 > v_n4n1 + p_n4n2) {
v_n4n2 = v_n4n1 + p_n4n2;
d_n4n2 = d_n4n1;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -2:
return d_n4n2;
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4n2 = (initialDist - Math.sqrt(l_n4n2.distanceSquaredTo(target))) / v_n4n2;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n4n2,Math.max(speed_n4p2,Math.max(speed_n2p4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2)))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4n2) {
return d_n4n2;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n4n1_p0p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_n3p3,Math.max(speed_n4p2,speed_n2p4))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n1_p1p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_n4p2,speed_n2p4)))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4n1_p2p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4)))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n1_p3p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4)))))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4n1_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}
if (v_n4p0 > v_n3n1 + p_n4p0) {
v_n4p0 = v_n3n1 + p_n4p0;
d_n4p0 = d_n3n1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n4n1 = 10 + rc.senseRubble(l_n4n1);
if (v_n4n1 > v_n3p0 + p_n4n1) {
v_n4n1 = v_n3p0 + p_n4n1;
d_n4n1 = d_n3p0;
}
if (v_n4n1 > v_n3n1 + p_n4n1) {
v_n4n1 = v_n3n1 + p_n4n1;
d_n4n1 = d_n3n1;
}
if (v_n4n1 > v_n4p0 + p_n4n1) {
v_n4n1 = v_n4p0 + p_n4n1;
d_n4n1 = d_n4p0;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case -1:
return d_n4n1;
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4n1 = (initialDist - Math.sqrt(l_n4n1.distanceSquaredTo(target))) / v_n4n1;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n4n1,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n4p2,Math.max(speed_n2p4,Math.max(speed_p2p4,speed_p4p2)))))))))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4n1) {
return d_n4n1;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n4p0_p0p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_n3p3,Math.max(speed_n4p2,speed_n2p4)))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4p0_p1p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_n4p2,speed_n2p4))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}

return null;
}


public static Direction bfs_n4p0_p2p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4p0_p3p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n4p2,Math.max(speed_n2p4,speed_p2p4))))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}

return null;
}


public static Direction bfs_n4p0_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_n4p0 = 10 + rc.senseRubble(l_n4p0);
if (v_n4p0 > v_n3p0 + p_n4p0) {
v_n4p0 = v_n3p0 + p_n4p0;
d_n4p0 = d_n3p0;
}
if (v_n4p0 > v_n3p1 + p_n4p0) {
v_n4p0 = v_n3p1 + p_n4p0;
d_n4p0 = d_n3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}

p_n4p1 = 10 + rc.senseRubble(l_n4p1);
if (v_n4p1 > v_n3p0 + p_n4p1) {
v_n4p1 = v_n3p0 + p_n4p1;
d_n4p1 = d_n3p0;
}
if (v_n4p1 > v_n3p1 + p_n4p1) {
v_n4p1 = v_n3p1 + p_n4p1;
d_n4p1 = d_n3p1;
}
if (v_n4p1 > v_n3p2 + p_n4p1) {
v_n4p1 = v_n3p2 + p_n4p1;
d_n4p1 = d_n3p2;
}
if (v_n4p1 > v_n4p0 + p_n4p1) {
v_n4p1 = v_n4p0 + p_n4p1;
d_n4p1 = d_n4p0;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n4p2 = 10 + rc.senseRubble(l_n4p2);
if (v_n4p2 > v_n3p1 + p_n4p2) {
v_n4p2 = v_n3p1 + p_n4p2;
d_n4p2 = d_n3p1;
}
if (v_n4p2 > v_n3p2 + p_n4p2) {
v_n4p2 = v_n3p2 + p_n4p2;
d_n4p2 = d_n3p2;
}
if (v_n4p2 > v_n4p1 + p_n4p2) {
v_n4p2 = v_n4p1 + p_n4p2;
d_n4p2 = d_n4p1;
}
if (v_n4p2 > v_n3p3 + p_n4p2) {
v_n4p2 = v_n3p3 + p_n4p2;
d_n4p2 = d_n3p3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -4:
switch (dy) {
case 0:
return d_n4p0;
case 1:
return d_n4p1;
case 2:
return d_n4p2;
}
break;
case -3:
switch (dy) {
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_n4p0 = (initialDist - Math.sqrt(l_n4p0.distanceSquaredTo(target))) / v_n4p0;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n4p1 = (initialDist - Math.sqrt(l_n4p1.distanceSquaredTo(target))) / v_n4p1;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n4p2 = (initialDist - Math.sqrt(l_n4p2.distanceSquaredTo(target))) / v_n4p2;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_n4p0,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n4p1,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4p1,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n4p2,Math.max(speed_n2p4,Math.max(speed_p2p4,speed_p4p2)))))))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_n4p0) {
return d_n4p0;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n4p1) {
return d_n4p1;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n4p2) {
return d_n4p2;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3n4_p4p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n2n4,Math.max(speed_p2n4,speed_p4n2))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n3n4_p4p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n2n4,Math.max(speed_p2n4,speed_p4n2)))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n3n4_p4p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_p3n3,Math.max(speed_n2n4,Math.max(speed_p2n4,Math.max(speed_p4n2,speed_p4p2))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3n4_p4p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n2n4,Math.max(speed_p2n4,Math.max(speed_p4n2,speed_p4p2))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3n4_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}
if (v_n2n4 > v_n3n3 + p_n2n4) {
v_n2n4 = v_n3n3 + p_n2n4;
d_n2n4 = d_n3n3;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_p1n4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n2n4,Math.max(speed_n2p4,Math.max(speed_p2n4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2)))))))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3n3_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3n3 = 10 + rc.senseRubble(l_n3n3);
if (v_n3n3 > v_n2n2 + p_n3n3) {
v_n3n3 = v_n2n2 + p_n3n3;
d_n3n3 = d_n2n2;
}
if (v_n3n3 > v_n2n3 + p_n3n3) {
v_n3n3 = v_n2n3 + p_n3n3;
d_n3n3 = d_n2n3;
}
if (v_n3n3 > v_n3n2 + p_n3n3) {
v_n3n3 = v_n3n2 + p_n3n3;
d_n3n3 = d_n3n2;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -3:
return d_n3n3;
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3n3 = (initialDist - Math.sqrt(l_n3n3.distanceSquaredTo(target))) / v_n3n3;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2n3,Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3n3,Math.max(speed_n3p3,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2))))))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3n3) {
return d_n3n3;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3n2_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n2n2 + p_n3n1) {
v_n3n1 = v_n2n2 + p_n3n1;
d_n3n1 = d_n2n2;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3n2 = 10 + rc.senseRubble(l_n3n2);
if (v_n3n2 > v_n2n1 + p_n3n2) {
v_n3n2 = v_n2n1 + p_n3n2;
d_n3n2 = d_n2n1;
}
if (v_n3n2 > v_n2n2 + p_n3n2) {
v_n3n2 = v_n2n2 + p_n3n2;
d_n3n2 = d_n2n2;
}
if (v_n3n2 > v_n3n1 + p_n3n2) {
v_n3n2 = v_n3n1 + p_n3n2;
d_n3n2 = d_n3n1;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -2:
return d_n3n2;
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3n2 = (initialDist - Math.sqrt(l_n3n2.distanceSquaredTo(target))) / v_n3n2;
speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n3p2,Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2))))))))))))))));
if (bestEstimation == speed_n3n2) {
return d_n3n2;
}
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3n1_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}
if (v_n3p0 > v_n2n1 + p_n3p0) {
v_n3p0 = v_n2n1 + p_n3p0;
d_n3p0 = d_n2n1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n3n1 = 10 + rc.senseRubble(l_n3n1);
if (v_n3n1 > v_n2p0 + p_n3n1) {
v_n3n1 = v_n2p0 + p_n3n1;
d_n3n1 = d_n2p0;
}
if (v_n3n1 > v_n2n1 + p_n3n1) {
v_n3n1 = v_n2n1 + p_n3n1;
d_n3n1 = d_n2n1;
}
if (v_n3n1 > v_n3p0 + p_n3n1) {
v_n3n1 = v_n3p0 + p_n3n1;
d_n3n1 = d_n3p0;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case -1:
return d_n3n1;
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,speed_p4p2)))))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n3p0_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_n3p0 = 10 + rc.senseRubble(l_n3p0);
if (v_n3p0 > v_n2p0 + p_n3p0) {
v_n3p0 = v_n2p0 + p_n3p0;
d_n3p0 = d_n2p0;
}
if (v_n3p0 > v_n2p1 + p_n3p0) {
v_n3p0 = v_n2p1 + p_n3p0;
d_n3p0 = d_n2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}

p_n3p1 = 10 + rc.senseRubble(l_n3p1);
if (v_n3p1 > v_n2p0 + p_n3p1) {
v_n3p1 = v_n2p0 + p_n3p1;
d_n3p1 = d_n2p0;
}
if (v_n3p1 > v_n2p1 + p_n3p1) {
v_n3p1 = v_n2p1 + p_n3p1;
d_n3p1 = d_n2p1;
}
if (v_n3p1 > v_n2p2 + p_n3p1) {
v_n3p1 = v_n2p2 + p_n3p1;
d_n3p1 = d_n2p2;
}
if (v_n3p1 > v_n3p0 + p_n3p1) {
v_n3p1 = v_n3p0 + p_n3p1;
d_n3p1 = d_n3p0;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n3p2 = 10 + rc.senseRubble(l_n3p2);
if (v_n3p2 > v_n2p1 + p_n3p2) {
v_n3p2 = v_n2p1 + p_n3p2;
d_n3p2 = d_n2p1;
}
if (v_n3p2 > v_n2p2 + p_n3p2) {
v_n3p2 = v_n2p2 + p_n3p2;
d_n3p2 = d_n2p2;
}
if (v_n3p2 > v_n3p1 + p_n3p2) {
v_n3p2 = v_n3p1 + p_n3p2;
d_n3p2 = d_n3p1;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_n3p3 = 10 + rc.senseRubble(l_n3p3);
if (v_n3p3 > v_n2p2 + p_n3p3) {
v_n3p3 = v_n2p2 + p_n3p3;
d_n3p3 = d_n2p2;
}
if (v_n3p3 > v_n2p3 + p_n3p3) {
v_n3p3 = v_n2p3 + p_n3p3;
d_n3p3 = d_n2p3;
}
if (v_n3p3 > v_n3p2 + p_n3p3) {
v_n3p3 = v_n3p2 + p_n3p3;
d_n3p3 = d_n3p2;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}
if (v_n2p4 > v_n3p3 + p_n2p4) {
v_n2p4 = v_n3p3 + p_n2p4;
d_n2p4 = d_n3p3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -3:
switch (dy) {
case 0:
return d_n3p0;
case 1:
return d_n3p1;
case 2:
return d_n3p2;
case 3:
return d_n3p3;
}
break;
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n3p2 = (initialDist - Math.sqrt(l_n3p2.distanceSquaredTo(target))) / v_n3p2;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_n3p3 = (initialDist - Math.sqrt(l_n3p3.distanceSquaredTo(target))) / v_n3p3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4p1,Math.max(speed_n3p3,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,speed_p4p2))))))))))));
if (bestEstimation == speed_n3p2) {
return d_n3p2;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_n3p3) {
return d_n3p3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2n4_p4p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p3n3,Math.max(speed_n2n4,Math.max(speed_p2n4,speed_p4n2))))))))));
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n2n4_p4p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3n3,Math.max(speed_n2n4,Math.max(speed_p2n4,speed_p4n2)))))))))));
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n2n4_p4p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_p2n3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3n3,Math.max(speed_n2n4,Math.max(speed_p2n4,Math.max(speed_p4n2,speed_p4p2)))))))))))));
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2n4_p4p3() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n2n4,Math.max(speed_p2n4,Math.max(speed_p4n2,speed_p4p2))))))))))))))));
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2n4_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_n2n3 + p_n1n4) {
v_n1n4 = v_n2n3 + p_n1n4;
d_n1n4 = d_n2n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2n4 = 10 + rc.senseRubble(l_n2n4);
if (v_n2n4 > v_n1n3 + p_n2n4) {
v_n2n4 = v_n1n3 + p_n2n4;
d_n2n4 = d_n1n3;
}
if (v_n2n4 > v_n2n3 + p_n2n4) {
v_n2n4 = v_n2n3 + p_n2n4;
d_n2n4 = d_n2n3;
}
if (v_n2n4 > v_n1n4 + p_n2n4) {
v_n2n4 = v_n1n4 + p_n2n4;
d_n2n4 = d_n1n4;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -4:
return d_n2n4;
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2n4 = (initialDist - Math.sqrt(l_n2n4.distanceSquaredTo(target))) / v_n2n4;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0n4,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_n1p4,Math.max(speed_p1n4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n2n4,Math.max(speed_n2p4,Math.max(speed_p2n4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2)))))))))))))))))))));
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2n4) {
return d_n2n4;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2n3_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_n2n2 + p_n1n3) {
v_n1n3 = v_n2n2 + p_n1n3;
d_n1n3 = d_n2n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2n3 = 10 + rc.senseRubble(l_n2n3);
if (v_n2n3 > v_n1n2 + p_n2n3) {
v_n2n3 = v_n1n2 + p_n2n3;
d_n2n3 = d_n1n2;
}
if (v_n2n3 > v_n2n2 + p_n2n3) {
v_n2n3 = v_n2n2 + p_n2n3;
d_n2n3 = d_n2n2;
}
if (v_n2n3 > v_n1n3 + p_n2n3) {
v_n2n3 = v_n1n3 + p_n2n3;
d_n2n3 = d_n1n3;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -3:
return d_n2n3;
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2n3 = (initialDist - Math.sqrt(l_n2n3.distanceSquaredTo(target))) / v_n2n3;
speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_n2p3,Math.max(speed_p2n3,Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3n3,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2))))))))))))))));
if (bestEstimation == speed_n2n3) {
return d_n2n3;
}
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2n2_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2n2 = 10 + rc.senseRubble(l_n2n2);
if (v_n2n2 > v_n1n1 + p_n2n2) {
v_n2n2 = v_n1n1 + p_n2n2;
d_n2n2 = d_n1n1;
}
if (v_n2n2 > v_n1n2 + p_n2n2) {
v_n2n2 = v_n1n2 + p_n2n2;
d_n2n2 = d_n1n2;
}
if (v_n2n2 > v_n2n1 + p_n2n2) {
v_n2n2 = v_n2n1 + p_n2n2;
d_n2n2 = d_n2n1;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -2:
return d_n2n2;
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_p2p3,Math.max(speed_p3n2,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,Math.max(speed_p4n2,speed_p4p2)))))))))))));
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2n1_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}
if (v_n2p0 > v_n1n1 + p_n2p0) {
v_n2p0 = v_n1n1 + p_n2p0;
d_n2p0 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n2n1 = 10 + rc.senseRubble(l_n2n1);
if (v_n2n1 > v_n1p0 + p_n2n1) {
v_n2n1 = v_n1p0 + p_n2n1;
d_n2n1 = d_n1p0;
}
if (v_n2n1 > v_n1n1 + p_n2n1) {
v_n2n1 = v_n1n1 + p_n2n1;
d_n2n1 = d_n1n1;
}
if (v_n2n1 > v_n2p0 + p_n2n1) {
v_n2n1 = v_n2p0 + p_n2n1;
d_n2n1 = d_n2p0;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case -1:
return d_n2n1;
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case -1:
return d_p0n1;
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,speed_p4p2)))))))))));
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n2p0_p4p4() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_n2p0 = 10 + rc.senseRubble(l_n2p0);
if (v_n2p0 > v_n1p0 + p_n2p0) {
v_n2p0 = v_n1p0 + p_n2p0;
d_n2p0 = d_n1p0;
}
if (v_n2p0 > v_n1p1 + p_n2p0) {
v_n2p0 = v_n1p1 + p_n2p0;
d_n2p0 = d_n1p1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}

p_n2p1 = 10 + rc.senseRubble(l_n2p1);
if (v_n2p1 > v_n1p0 + p_n2p1) {
v_n2p1 = v_n1p0 + p_n2p1;
d_n2p1 = d_n1p0;
}
if (v_n2p1 > v_n1p1 + p_n2p1) {
v_n2p1 = v_n1p1 + p_n2p1;
d_n2p1 = d_n1p1;
}
if (v_n2p1 > v_n2p0 + p_n2p1) {
v_n2p1 = v_n2p0 + p_n2p1;
d_n2p1 = d_n2p0;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_n2p2 = 10 + rc.senseRubble(l_n2p2);
if (v_n2p2 > v_n1p1 + p_n2p2) {
v_n2p2 = v_n1p1 + p_n2p2;
d_n2p2 = d_n1p1;
}
if (v_n2p2 > v_n1p2 + p_n2p2) {
v_n2p2 = v_n1p2 + p_n2p2;
d_n2p2 = d_n1p2;
}
if (v_n2p2 > v_n2p1 + p_n2p2) {
v_n2p2 = v_n2p1 + p_n2p2;
d_n2p2 = d_n2p1;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0p3 = 10 + rc.senseRubble(l_p0p3);
if (v_p0p3 > v_p0p2 + p_p0p3) {
v_p0p3 = v_p0p2 + p_p0p3;
d_p0p3 = d_p0p2;
}
if (v_p0p3 > v_n1p2 + p_p0p3) {
v_p0p3 = v_n1p2 + p_p0p3;
d_p0p3 = d_n1p2;
}
if (v_p0p3 > v_p1p2 + p_p0p3) {
v_p0p3 = v_p1p2 + p_p0p3;
d_p0p3 = d_p1p2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}

p_n1p3 = 10 + rc.senseRubble(l_n1p3);
if (v_n1p3 > v_p0p2 + p_n1p3) {
v_n1p3 = v_p0p2 + p_n1p3;
d_n1p3 = d_p0p2;
}
if (v_n1p3 > v_n1p2 + p_n1p3) {
v_n1p3 = v_n1p2 + p_n1p3;
d_n1p3 = d_n1p2;
}
if (v_n1p3 > v_n2p2 + p_n1p3) {
v_n1p3 = v_n2p2 + p_n1p3;
d_n1p3 = d_n2p2;
}
if (v_n1p3 > v_p0p3 + p_n1p3) {
v_n1p3 = v_p0p3 + p_n1p3;
d_n1p3 = d_p0p3;
}

p_p1p3 = 10 + rc.senseRubble(l_p1p3);
if (v_p1p3 > v_p0p2 + p_p1p3) {
v_p1p3 = v_p0p2 + p_p1p3;
d_p1p3 = d_p0p2;
}
if (v_p1p3 > v_p1p2 + p_p1p3) {
v_p1p3 = v_p1p2 + p_p1p3;
d_p1p3 = d_p1p2;
}
if (v_p1p3 > v_p2p2 + p_p1p3) {
v_p1p3 = v_p2p2 + p_p1p3;
d_p1p3 = d_p2p2;
}
if (v_p1p3 > v_p0p3 + p_p1p3) {
v_p1p3 = v_p0p3 + p_p1p3;
d_p1p3 = d_p0p3;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_n2p3 = 10 + rc.senseRubble(l_n2p3);
if (v_n2p3 > v_n1p2 + p_n2p3) {
v_n2p3 = v_n1p2 + p_n2p3;
d_n2p3 = d_n1p2;
}
if (v_n2p3 > v_n2p2 + p_n2p3) {
v_n2p3 = v_n2p2 + p_n2p3;
d_n2p3 = d_n2p2;
}
if (v_n2p3 > v_n1p3 + p_n2p3) {
v_n2p3 = v_n1p3 + p_n2p3;
d_n2p3 = d_n1p3;
}

p_p2p3 = 10 + rc.senseRubble(l_p2p3);
if (v_p2p3 > v_p1p2 + p_p2p3) {
v_p2p3 = v_p1p2 + p_p2p3;
d_p2p3 = d_p1p2;
}
if (v_p2p3 > v_p2p2 + p_p2p3) {
v_p2p3 = v_p2p2 + p_p2p3;
d_p2p3 = d_p2p2;
}
if (v_p2p3 > v_p1p3 + p_p2p3) {
v_p2p3 = v_p1p3 + p_p2p3;
d_p2p3 = d_p1p3;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0p4 = 10 + rc.senseRubble(l_p0p4);
if (v_p0p4 > v_p0p3 + p_p0p4) {
v_p0p4 = v_p0p3 + p_p0p4;
d_p0p4 = d_p0p3;
}
if (v_p0p4 > v_n1p3 + p_p0p4) {
v_p0p4 = v_n1p3 + p_p0p4;
d_p0p4 = d_n1p3;
}
if (v_p0p4 > v_p1p3 + p_p0p4) {
v_p0p4 = v_p1p3 + p_p0p4;
d_p0p4 = d_p1p3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}

p_n1p4 = 10 + rc.senseRubble(l_n1p4);
if (v_n1p4 > v_p0p3 + p_n1p4) {
v_n1p4 = v_p0p3 + p_n1p4;
d_n1p4 = d_p0p3;
}
if (v_n1p4 > v_n1p3 + p_n1p4) {
v_n1p4 = v_n1p3 + p_n1p4;
d_n1p4 = d_n1p3;
}
if (v_n1p4 > v_n2p3 + p_n1p4) {
v_n1p4 = v_n2p3 + p_n1p4;
d_n1p4 = d_n2p3;
}
if (v_n1p4 > v_p0p4 + p_n1p4) {
v_n1p4 = v_p0p4 + p_n1p4;
d_n1p4 = d_p0p4;
}

p_p1p4 = 10 + rc.senseRubble(l_p1p4);
if (v_p1p4 > v_p0p3 + p_p1p4) {
v_p1p4 = v_p0p3 + p_p1p4;
d_p1p4 = d_p0p3;
}
if (v_p1p4 > v_p1p3 + p_p1p4) {
v_p1p4 = v_p1p3 + p_p1p4;
d_p1p4 = d_p1p3;
}
if (v_p1p4 > v_p2p3 + p_p1p4) {
v_p1p4 = v_p2p3 + p_p1p4;
d_p1p4 = d_p2p3;
}
if (v_p1p4 > v_p0p4 + p_p1p4) {
v_p1p4 = v_p0p4 + p_p1p4;
d_p1p4 = d_p0p4;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p3p2 + p_p4p1) {
v_p4p1 = v_p3p2 + p_p4p1;
d_p4p1 = d_p3p2;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3p3 = 10 + rc.senseRubble(l_p3p3);
if (v_p3p3 > v_p2p2 + p_p3p3) {
v_p3p3 = v_p2p2 + p_p3p3;
d_p3p3 = d_p2p2;
}
if (v_p3p3 > v_p2p3 + p_p3p3) {
v_p3p3 = v_p2p3 + p_p3p3;
d_p3p3 = d_p2p3;
}
if (v_p3p3 > v_p3p2 + p_p3p3) {
v_p3p3 = v_p3p2 + p_p3p3;
d_p3p3 = d_p3p2;
}

p_n2p4 = 10 + rc.senseRubble(l_n2p4);
if (v_n2p4 > v_n1p3 + p_n2p4) {
v_n2p4 = v_n1p3 + p_n2p4;
d_n2p4 = d_n1p3;
}
if (v_n2p4 > v_n2p3 + p_n2p4) {
v_n2p4 = v_n2p3 + p_n2p4;
d_n2p4 = d_n2p3;
}
if (v_n2p4 > v_n1p4 + p_n2p4) {
v_n2p4 = v_n1p4 + p_n2p4;
d_n2p4 = d_n1p4;
}

p_p2p4 = 10 + rc.senseRubble(l_p2p4);
if (v_p2p4 > v_p1p3 + p_p2p4) {
v_p2p4 = v_p1p3 + p_p2p4;
d_p2p4 = d_p1p3;
}
if (v_p2p4 > v_p2p3 + p_p2p4) {
v_p2p4 = v_p2p3 + p_p2p4;
d_p2p4 = d_p2p3;
}
if (v_p2p4 > v_p1p4 + p_p2p4) {
v_p2p4 = v_p1p4 + p_p2p4;
d_p2p4 = d_p1p4;
}
if (v_p2p4 > v_p3p3 + p_p2p4) {
v_p2p4 = v_p3p3 + p_p2p4;
d_p2p4 = d_p3p3;
}

p_p4p2 = 10 + rc.senseRubble(l_p4p2);
if (v_p4p2 > v_p3p1 + p_p4p2) {
v_p4p2 = v_p3p1 + p_p4p2;
d_p4p2 = d_p3p1;
}
if (v_p4p2 > v_p3p2 + p_p4p2) {
v_p4p2 = v_p3p2 + p_p4p2;
d_p4p2 = d_p3p2;
}
if (v_p4p2 > v_p4p1 + p_p4p2) {
v_p4p2 = v_p4p1 + p_p4p2;
d_p4p2 = d_p4p1;
}
if (v_p4p2 > v_p3p3 + p_p4p2) {
v_p4p2 = v_p3p3 + p_p4p2;
d_p4p2 = d_p3p3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -2:
switch (dy) {
case 0:
return d_n2p0;
case 1:
return d_n2p1;
case 2:
return d_n2p2;
case 3:
return d_n2p3;
case 4:
return d_n2p4;
}
break;
case -1:
switch (dy) {
case 0:
return d_n1p0;
case 1:
return d_n1p1;
case 2:
return d_n1p2;
case 3:
return d_n1p3;
case 4:
return d_n1p4;
}
break;
case 0:
switch (dy) {
case 1:
return d_p0p1;
case 2:
return d_p0p2;
case 3:
return d_p0p3;
case 4:
return d_p0p4;
}
break;
case 1:
switch (dy) {
case 0:
return d_p1p0;
case 1:
return d_p1p1;
case 2:
return d_p1p2;
case 3:
return d_p1p3;
case 4:
return d_p1p4;
}
break;
case 2:
switch (dy) {
case 0:
return d_p2p0;
case 1:
return d_p2p1;
case 2:
return d_p2p2;
case 3:
return d_p2p3;
case 4:
return d_p2p4;
}
break;
case 3:
switch (dy) {
case 0:
return d_p3p0;
case 1:
return d_p3p1;
case 2:
return d_p3p2;
case 3:
return d_p3p3;
}
break;
case 4:
switch (dy) {
case 0:
return d_p4p0;
case 1:
return d_p4p1;
case 2:
return d_p4p2;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_n2p3 = (initialDist - Math.sqrt(l_n2p3.distanceSquaredTo(target))) / v_n2p3;
speed_p2p3 = (initialDist - Math.sqrt(l_p2p3.distanceSquaredTo(target))) / v_p2p3;
speed_p3p2 = (initialDist - Math.sqrt(l_p3p2.distanceSquaredTo(target))) / v_p3p2;
speed_p0p4 = (initialDist - Math.sqrt(l_p0p4.distanceSquaredTo(target))) / v_p0p4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1p4 = (initialDist - Math.sqrt(l_n1p4.distanceSquaredTo(target))) / v_n1p4;
speed_p1p4 = (initialDist - Math.sqrt(l_p1p4.distanceSquaredTo(target))) / v_p1p4;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3p3 = (initialDist - Math.sqrt(l_p3p3.distanceSquaredTo(target))) / v_p3p3;
speed_n2p4 = (initialDist - Math.sqrt(l_n2p4.distanceSquaredTo(target))) / v_n2p4;
speed_p2p4 = (initialDist - Math.sqrt(l_p2p4.distanceSquaredTo(target))) / v_p2p4;
speed_p4p2 = (initialDist - Math.sqrt(l_p4p2.distanceSquaredTo(target))) / v_p4p2;
bestEstimation = Math.max(speed_p2p3,Math.max(speed_p3p2,Math.max(speed_p0p4,Math.max(speed_p4p0,Math.max(speed_n1p4,Math.max(speed_p1p4,Math.max(speed_p4p1,Math.max(speed_p3p3,Math.max(speed_n2p4,Math.max(speed_p2p4,speed_p4p2))))))))));
if (bestEstimation == speed_n2p3) {
return d_n2p3;
}
if (bestEstimation == speed_p2p3) {
return d_p2p3;
}
if (bestEstimation == speed_p3p2) {
return d_p3p2;
}
if (bestEstimation == speed_p0p4) {
return d_p0p4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1p4) {
return d_n1p4;
}
if (bestEstimation == speed_p1p4) {
return d_p1p4;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3p3) {
return d_p3p3;
}
if (bestEstimation == speed_n2p4) {
return d_n2p4;
}
if (bestEstimation == speed_p2p4) {
return d_p2p4;
}
if (bestEstimation == speed_p4p2) {
return d_p4p2;
}

return null;
}


public static Direction bfs_n1n4_p4p0() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_p3n2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p3n3,Math.max(speed_p2n4,speed_p4n2))))))));
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n1n4_p4p1() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
v_p1n4 = v_p0n3 + p_p1n4;
d_p1n4 = d_p0n3;
}
if (v_p1n4 > v_p1n3 + p_p1n4) {
v_p1n4 = v_p1n3 + p_p1n4;
d_p1n4 = d_p1n3;
}
if (v_p1n4 > v_p2n3 + p_p1n4) {
v_p1n4 = v_p2n3 + p_p1n4;
d_p1n4 = d_p2n3;
}
if (v_p1n4 > v_p0n4 + p_p1n4) {
v_p1n4 = v_p0n4 + p_p1n4;
d_p1n4 = d_p0n4;
}

p_p4n1 = 10 + rc.senseRubble(l_p4n1);
if (v_p4n1 > v_p3p0 + p_p4n1) {
v_p4n1 = v_p3p0 + p_p4n1;
d_p4n1 = d_p3p0;
}
if (v_p4n1 > v_p3n1 + p_p4n1) {
v_p4n1 = v_p3n1 + p_p4n1;
d_p4n1 = d_p3n1;
}
if (v_p4n1 > v_p3n2 + p_p4n1) {
v_p4n1 = v_p3n2 + p_p4n1;
d_p4n1 = d_p3n2;
}
if (v_p4n1 > v_p4p0 + p_p4n1) {
v_p4n1 = v_p4p0 + p_p4n1;
d_p4n1 = d_p4p0;
}

p_p4p1 = 10 + rc.senseRubble(l_p4p1);
if (v_p4p1 > v_p3p0 + p_p4p1) {
v_p4p1 = v_p3p0 + p_p4p1;
d_p4p1 = d_p3p0;
}
if (v_p4p1 > v_p3p1 + p_p4p1) {
v_p4p1 = v_p3p1 + p_p4p1;
d_p4p1 = d_p3p1;
}
if (v_p4p1 > v_p4p0 + p_p4p1) {
v_p4p1 = v_p4p0 + p_p4p1;
d_p4p1 = d_p4p0;
}

p_p3n3 = 10 + rc.senseRubble(l_p3n3);
if (v_p3n3 > v_p2n2 + p_p3n3) {
v_p3n3 = v_p2n2 + p_p3n3;
d_p3n3 = d_p2n2;
}
if (v_p3n3 > v_p3n2 + p_p3n3) {
v_p3n3 = v_p3n2 + p_p3n3;
d_p3n3 = d_p3n2;
}
if (v_p3n3 > v_p2n3 + p_p3n3) {
v_p3n3 = v_p2n3 + p_p3n3;
d_p3n3 = d_p2n3;
}

p_p2n4 = 10 + rc.senseRubble(l_p2n4);
if (v_p2n4 > v_p1n3 + p_p2n4) {
v_p2n4 = v_p1n3 + p_p2n4;
d_p2n4 = d_p1n3;
}
if (v_p2n4 > v_p2n3 + p_p2n4) {
v_p2n4 = v_p2n3 + p_p2n4;
d_p2n4 = d_p2n3;
}
if (v_p2n4 > v_p1n4 + p_p2n4) {
v_p2n4 = v_p1n4 + p_p2n4;
d_p2n4 = d_p1n4;
}
if (v_p2n4 > v_p3n3 + p_p2n4) {
v_p2n4 = v_p3n3 + p_p2n4;
d_p2n4 = d_p3n3;
}

p_p4n2 = 10 + rc.senseRubble(l_p4n2);
if (v_p4n2 > v_p3n1 + p_p4n2) {
v_p4n2 = v_p3n1 + p_p4n2;
d_p4n2 = d_p3n1;
}
if (v_p4n2 > v_p3n2 + p_p4n2) {
v_p4n2 = v_p3n2 + p_p4n2;
d_p4n2 = d_p3n2;
}
if (v_p4n2 > v_p4n1 + p_p4n2) {
v_p4n2 = v_p4n1 + p_p4n2;
d_p4n2 = d_p4n1;
}
if (v_p4n2 > v_p3n3 + p_p4n2) {
v_p4n2 = v_p3n3 + p_p4n2;
d_p4n2 = d_p3n3;
}


int dx = target.x - here.x;
int dy = target.y - here.y;
    
switch (dx) {
case -1:
switch (dy) {
case -4:
return d_n1n4;
case -3:
return d_n1n3;
case -2:
return d_n1n2;
case -1:
return d_n1n1;
case 0:
return d_n1p0;
case 1:
return d_n1p1;
}
break;
case 0:
switch (dy) {
case -4:
return d_p0n4;
case -3:
return d_p0n3;
case -2:
return d_p0n2;
case -1:
return d_p0n1;
case 1:
return d_p0p1;
}
break;
case 1:
switch (dy) {
case -4:
return d_p1n4;
case -3:
return d_p1n3;
case -2:
return d_p1n2;
case -1:
return d_p1n1;
case 0:
return d_p1p0;
case 1:
return d_p1p1;
}
break;
case 2:
switch (dy) {
case -4:
return d_p2n4;
case -3:
return d_p2n3;
case -2:
return d_p2n2;
case -1:
return d_p2n1;
case 0:
return d_p2p0;
case 1:
return d_p2p1;
}
break;
case 3:
switch (dy) {
case -3:
return d_p3n3;
case -2:
return d_p3n2;
case -1:
return d_p3n1;
case 0:
return d_p3p0;
case 1:
return d_p3p1;
}
break;
case 4:
switch (dy) {
case -2:
return d_p4n2;
case -1:
return d_p4n1;
case 0:
return d_p4p0;
case 1:
return d_p4p1;
}
break;
}

initialDist = Math.sqrt(here.distanceSquaredTo(target));

speed_p2n3 = (initialDist - Math.sqrt(l_p2n3.distanceSquaredTo(target))) / v_p2n3;
speed_p3n2 = (initialDist - Math.sqrt(l_p3n2.distanceSquaredTo(target))) / v_p3n2;
speed_p0n4 = (initialDist - Math.sqrt(l_p0n4.distanceSquaredTo(target))) / v_p0n4;
speed_p4p0 = (initialDist - Math.sqrt(l_p4p0.distanceSquaredTo(target))) / v_p4p0;
speed_n1n4 = (initialDist - Math.sqrt(l_n1n4.distanceSquaredTo(target))) / v_n1n4;
speed_p1n4 = (initialDist - Math.sqrt(l_p1n4.distanceSquaredTo(target))) / v_p1n4;
speed_p4n1 = (initialDist - Math.sqrt(l_p4n1.distanceSquaredTo(target))) / v_p4n1;
speed_p4p1 = (initialDist - Math.sqrt(l_p4p1.distanceSquaredTo(target))) / v_p4p1;
speed_p3n3 = (initialDist - Math.sqrt(l_p3n3.distanceSquaredTo(target))) / v_p3n3;
speed_p2n4 = (initialDist - Math.sqrt(l_p2n4.distanceSquaredTo(target))) / v_p2n4;
speed_p4n2 = (initialDist - Math.sqrt(l_p4n2.distanceSquaredTo(target))) / v_p4n2;
bestEstimation = Math.max(speed_p3n2,Math.max(speed_p0n4,Math.max(speed_p4p0,Math.max(speed_n1n4,Math.max(speed_p1n4,Math.max(speed_p4n1,Math.max(speed_p4p1,Math.max(speed_p3n3,Math.max(speed_p2n4,speed_p4n2)))))))));
if (bestEstimation == speed_p2n3) {
return d_p2n3;
}
if (bestEstimation == speed_p3n2) {
return d_p3n2;
}
if (bestEstimation == speed_p0n4) {
return d_p0n4;
}
if (bestEstimation == speed_p4p0) {
return d_p4p0;
}
if (bestEstimation == speed_n1n4) {
return d_n1n4;
}
if (bestEstimation == speed_p1n4) {
return d_p1n4;
}
if (bestEstimation == speed_p4n1) {
return d_p4n1;
}
if (bestEstimation == speed_p4p1) {
return d_p4p1;
}
if (bestEstimation == speed_p3n3) {
return d_p3n3;
}
if (bestEstimation == speed_p2n4) {
return d_p2n4;
}
if (bestEstimation == speed_p4n2) {
return d_p4n2;
}

return null;
}


public static Direction bfs_n1n4_p4p2() throws GameActionException {
if (rc.canMove(WEST)) {
v_n1p0 = 10 + rc.senseRubble(l_n1p0);
d_n1p0 = WEST;
}
if (rc.canMove(SOUTH)) {
v_p0n1 = 10 + rc.senseRubble(l_p0n1);
d_p0n1 = SOUTH;
}
if (rc.canMove(NORTH)) {
v_p0p1 = 10 + rc.senseRubble(l_p0p1);
d_p0p1 = NORTH;
}
if (rc.canMove(EAST)) {
v_p1p0 = 10 + rc.senseRubble(l_p1p0);
d_p1p0 = EAST;
}
if (rc.canMove(SOUTHWEST)) {
v_n1n1 = 10 + rc.senseRubble(l_n1n1);
d_n1n1 = SOUTHWEST;
}
if (rc.canMove(NORTHWEST)) {
v_n1p1 = 10 + rc.senseRubble(l_n1p1);
d_n1p1 = NORTHWEST;
}
if (rc.canMove(SOUTHEAST)) {
v_p1n1 = 10 + rc.senseRubble(l_p1n1);
d_p1n1 = SOUTHEAST;
}
if (rc.canMove(NORTHEAST)) {
v_p1p1 = 10 + rc.senseRubble(l_p1p1);
d_p1p1 = NORTHEAST;
}

p_p0n2 = 10 + rc.senseRubble(l_p0n2);
if (v_p0n2 > v_p0n1 + p_p0n2) {
v_p0n2 = v_p0n1 + p_p0n2;
d_p0n2 = d_p0n1;
}
if (v_p0n2 > v_p1n1 + p_p0n2) {
v_p0n2 = v_p1n1 + p_p0n2;
d_p0n2 = d_p1n1;
}
if (v_p0n2 > v_n1n1 + p_p0n2) {
v_p0n2 = v_n1n1 + p_p0n2;
d_p0n2 = d_n1n1;
}

p_p0p2 = 10 + rc.senseRubble(l_p0p2);
if (v_p0p2 > v_p0p1 + p_p0p2) {
v_p0p2 = v_p0p1 + p_p0p2;
d_p0p2 = d_p0p1;
}
if (v_p0p2 > v_n1p1 + p_p0p2) {
v_p0p2 = v_n1p1 + p_p0p2;
d_p0p2 = d_n1p1;
}
if (v_p0p2 > v_p1p1 + p_p0p2) {
v_p0p2 = v_p1p1 + p_p0p2;
d_p0p2 = d_p1p1;
}

p_p2p0 = 10 + rc.senseRubble(l_p2p0);
if (v_p2p0 > v_p1p0 + p_p2p0) {
v_p2p0 = v_p1p0 + p_p2p0;
d_p2p0 = d_p1p0;
}
if (v_p2p0 > v_p1p1 + p_p2p0) {
v_p2p0 = v_p1p1 + p_p2p0;
d_p2p0 = d_p1p1;
}
if (v_p2p0 > v_p1n1 + p_p2p0) {
v_p2p0 = v_p1n1 + p_p2p0;
d_p2p0 = d_p1n1;
}

p_n1n2 = 10 + rc.senseRubble(l_n1n2);
if (v_n1n2 > v_p0n1 + p_n1n2) {
v_n1n2 = v_p0n1 + p_n1n2;
d_n1n2 = d_p0n1;
}
if (v_n1n2 > v_n1n1 + p_n1n2) {
v_n1n2 = v_n1n1 + p_n1n2;
d_n1n2 = d_n1n1;
}
if (v_n1n2 > v_p0n2 + p_n1n2) {
v_n1n2 = v_p0n2 + p_n1n2;
d_n1n2 = d_p0n2;
}

p_n1p2 = 10 + rc.senseRubble(l_n1p2);
if (v_n1p2 > v_p0p1 + p_n1p2) {
v_n1p2 = v_p0p1 + p_n1p2;
d_n1p2 = d_p0p1;
}
if (v_n1p2 > v_n1p1 + p_n1p2) {
v_n1p2 = v_n1p1 + p_n1p2;
d_n1p2 = d_n1p1;
}
if (v_n1p2 > v_p0p2 + p_n1p2) {
v_n1p2 = v_p0p2 + p_n1p2;
d_n1p2 = d_p0p2;
}

p_p1n2 = 10 + rc.senseRubble(l_p1n2);
if (v_p1n2 > v_p0n1 + p_p1n2) {
v_p1n2 = v_p0n1 + p_p1n2;
d_p1n2 = d_p0n1;
}
if (v_p1n2 > v_p1n1 + p_p1n2) {
v_p1n2 = v_p1n1 + p_p1n2;
d_p1n2 = d_p1n1;
}
if (v_p1n2 > v_p0n2 + p_p1n2) {
v_p1n2 = v_p0n2 + p_p1n2;
d_p1n2 = d_p0n2;
}

p_p1p2 = 10 + rc.senseRubble(l_p1p2);
if (v_p1p2 > v_p0p1 + p_p1p2) {
v_p1p2 = v_p0p1 + p_p1p2;
d_p1p2 = d_p0p1;
}
if (v_p1p2 > v_p1p1 + p_p1p2) {
v_p1p2 = v_p1p1 + p_p1p2;
d_p1p2 = d_p1p1;
}
if (v_p1p2 > v_p0p2 + p_p1p2) {
v_p1p2 = v_p0p2 + p_p1p2;
d_p1p2 = d_p0p2;
}

p_p2n1 = 10 + rc.senseRubble(l_p2n1);
if (v_p2n1 > v_p1p0 + p_p2n1) {
v_p2n1 = v_p1p0 + p_p2n1;
d_p2n1 = d_p1p0;
}
if (v_p2n1 > v_p1n1 + p_p2n1) {
v_p2n1 = v_p1n1 + p_p2n1;
d_p2n1 = d_p1n1;
}
if (v_p2n1 > v_p2p0 + p_p2n1) {
v_p2n1 = v_p2p0 + p_p2n1;
d_p2n1 = d_p2p0;
}

p_p2p1 = 10 + rc.senseRubble(l_p2p1);
if (v_p2p1 > v_p1p0 + p_p2p1) {
v_p2p1 = v_p1p0 + p_p2p1;
d_p2p1 = d_p1p0;
}
if (v_p2p1 > v_p1p1 + p_p2p1) {
v_p2p1 = v_p1p1 + p_p2p1;
d_p2p1 = d_p1p1;
}
if (v_p2p1 > v_p2p0 + p_p2p1) {
v_p2p1 = v_p2p0 + p_p2p1;
d_p2p1 = d_p2p0;
}

p_p2n2 = 10 + rc.senseRubble(l_p2n2);
if (v_p2n2 > v_p1n1 + p_p2n2) {
v_p2n2 = v_p1n1 + p_p2n2;
d_p2n2 = d_p1n1;
}
if (v_p2n2 > v_p2n1 + p_p2n2) {
v_p2n2 = v_p2n1 + p_p2n2;
d_p2n2 = d_p2n1;
}
if (v_p2n2 > v_p1n2 + p_p2n2) {
v_p2n2 = v_p1n2 + p_p2n2;
d_p2n2 = d_p1n2;
}

p_p2p2 = 10 + rc.senseRubble(l_p2p2);
if (v_p2p2 > v_p1p1 + p_p2p2) {
v_p2p2 = v_p1p1 + p_p2p2;
d_p2p2 = d_p1p1;
}
if (v_p2p2 > v_p1p2 + p_p2p2) {
v_p2p2 = v_p1p2 + p_p2p2;
d_p2p2 = d_p1p2;
}
if (v_p2p2 > v_p2p1 + p_p2p2) {
v_p2p2 = v_p2p1 + p_p2p2;
d_p2p2 = d_p2p1;
}

p_p0n3 = 10 + rc.senseRubble(l_p0n3);
if (v_p0n3 > v_p0n2 + p_p0n3) {
v_p0n3 = v_p0n2 + p_p0n3;
d_p0n3 = d_p0n2;
}
if (v_p0n3 > v_p1n2 + p_p0n3) {
v_p0n3 = v_p1n2 + p_p0n3;
d_p0n3 = d_p1n2;
}
if (v_p0n3 > v_n1n2 + p_p0n3) {
v_p0n3 = v_n1n2 + p_p0n3;
d_p0n3 = d_n1n2;
}

p_p3p0 = 10 + rc.senseRubble(l_p3p0);
if (v_p3p0 > v_p2p0 + p_p3p0) {
v_p3p0 = v_p2p0 + p_p3p0;
d_p3p0 = d_p2p0;
}
if (v_p3p0 > v_p2p1 + p_p3p0) {
v_p3p0 = v_p2p1 + p_p3p0;
d_p3p0 = d_p2p1;
}
if (v_p3p0 > v_p2n1 + p_p3p0) {
v_p3p0 = v_p2n1 + p_p3p0;
d_p3p0 = d_p2n1;
}

p_n1n3 = 10 + rc.senseRubble(l_n1n3);
if (v_n1n3 > v_p0n2 + p_n1n3) {
v_n1n3 = v_p0n2 + p_n1n3;
d_n1n3 = d_p0n2;
}
if (v_n1n3 > v_n1n2 + p_n1n3) {
v_n1n3 = v_n1n2 + p_n1n3;
d_n1n3 = d_n1n2;
}
if (v_n1n3 > v_p0n3 + p_n1n3) {
v_n1n3 = v_p0n3 + p_n1n3;
d_n1n3 = d_p0n3;
}

p_p1n3 = 10 + rc.senseRubble(l_p1n3);
if (v_p1n3 > v_p0n2 + p_p1n3) {
v_p1n3 = v_p0n2 + p_p1n3;
d_p1n3 = d_p0n2;
}
if (v_p1n3 > v_p1n2 + p_p1n3) {
v_p1n3 = v_p1n2 + p_p1n3;
d_p1n3 = d_p1n2;
}
if (v_p1n3 > v_p2n2 + p_p1n3) {
v_p1n3 = v_p2n2 + p_p1n3;
d_p1n3 = d_p2n2;
}
if (v_p1n3 > v_p0n3 + p_p1n3) {
v_p1n3 = v_p0n3 + p_p1n3;
d_p1n3 = d_p0n3;
}

p_p3n1 = 10 + rc.senseRubble(l_p3n1);
if (v_p3n1 > v_p2p0 + p_p3n1) {
v_p3n1 = v_p2p0 + p_p3n1;
d_p3n1 = d_p2p0;
}
if (v_p3n1 > v_p2n1 + p_p3n1) {
v_p3n1 = v_p2n1 + p_p3n1;
d_p3n1 = d_p2n1;
}
if (v_p3n1 > v_p2n2 + p_p3n1) {
v_p3n1 = v_p2n2 + p_p3n1;
d_p3n1 = d_p2n2;
}
if (v_p3n1 > v_p3p0 + p_p3n1) {
v_p3n1 = v_p3p0 + p_p3n1;
d_p3n1 = d_p3p0;
}

p_p3p1 = 10 + rc.senseRubble(l_p3p1);
if (v_p3p1 > v_p2p0 + p_p3p1) {
v_p3p1 = v_p2p0 + p_p3p1;
d_p3p1 = d_p2p0;
}
if (v_p3p1 > v_p2p1 + p_p3p1) {
v_p3p1 = v_p2p1 + p_p3p1;
d_p3p1 = d_p2p1;
}
if (v_p3p1 > v_p2p2 + p_p3p1) {
v_p3p1 = v_p2p2 + p_p3p1;
d_p3p1 = d_p2p2;
}
if (v_p3p1 > v_p3p0 + p_p3p1) {
v_p3p1 = v_p3p0 + p_p3p1;
d_p3p1 = d_p3p0;
}

p_p2n3 = 10 + rc.senseRubble(l_p2n3);
if (v_p2n3 > v_p1n2 + p_p2n3) {
v_p2n3 = v_p1n2 + p_p2n3;
d_p2n3 = d_p1n2;
}
if (v_p2n3 > v_p2n2 + p_p2n3) {
v_p2n3 = v_p2n2 + p_p2n3;
d_p2n3 = d_p2n2;
}
if (v_p2n3 > v_p1n3 + p_p2n3) {
v_p2n3 = v_p1n3 + p_p2n3;
d_p2n3 = d_p1n3;
}

p_p3n2 = 10 + rc.senseRubble(l_p3n2);
if (v_p3n2 > v_p2n1 + p_p3n2) {
v_p3n2 = v_p2n1 + p_p3n2;
d_p3n2 = d_p2n1;
}
if (v_p3n2 > v_p2n2 + p_p3n2) {
v_p3n2 = v_p2n2 + p_p3n2;
d_p3n2 = d_p2n2;
}
if (v_p3n2 > v_p3n1 + p_p3n2) {
v_p3n2 = v_p3n1 + p_p3n2;
d_p3n2 = d_p3n1;
}

p_p3p2 = 10 + rc.senseRubble(l_p3p2);
if (v_p3p2 > v_p2p1 + p_p3p2) {
v_p3p2 = v_p2p1 + p_p3p2;
d_p3p2 = d_p2p1;
}
if (v_p3p2 > v_p2p2 + p_p3p2) {
v_p3p2 = v_p2p2 + p_p3p2;
d_p3p2 = d_p2p2;
}
if (v_p3p2 > v_p3p1 + p_p3p2) {
v_p3p2 = v_p3p1 + p_p3p2;
d_p3p2 = d_p3p1;
}

p_p0n4 = 10 + rc.senseRubble(l_p0n4);
if (v_p0n4 > v_p0n3 + p_p0n4) {
v_p0n4 = v_p0n3 + p_p0n4;
d_p0n4 = d_p0n3;
}
if (v_p0n4 > v_p1n3 + p_p0n4) {
v_p0n4 = v_p1n3 + p_p0n4;
d_p0n4 = d_p1n3;
}
if (v_p0n4 > v_n1n3 + p_p0n4) {
v_p0n4 = v_n1n3 + p_p0n4;
d_p0n4 = d_n1n3;
}

p_p4p0 = 10 + rc.senseRubble(l_p4p0);
if (v_p4p0 > v_p3p0 + p_p4p0) {
v_p4p0 = v_p3p0 + p_p4p0;
d_p4p0 = d_p3p0;
}
if (v_p4p0 > v_p3p1 + p_p4p0) {
v_p4p0 = v_p3p1 + p_p4p0;
d_p4p0 = d_p3p1;
}
if (v_p4p0 > v_p3n1 + p_p4p0) {
v_p4p0 = v_p3n1 + p_p4p0;
d_p4p0 = d_p3n1;
}

p_n1n4 = 10 + rc.senseRubble(l_n1n4);
if (v_n1n4 > v_p0n3 + p_n1n4) {
v_n1n4 = v_p0n3 + p_n1n4;
d_n1n4 = d_p0n3;
}
if (v_n1n4 > v_n1n3 + p_n1n4) {
v_n1n4 = v_n1n3 + p_n1n4;
d_n1n4 = d_n1n3;
}
if (v_n1n4 > v_p0n4 + p_n1n4) {
v_n1n4 = v_p0n4 + p_n1n4;
d_n1n4 = d_p0n4;
}

p_p1n4 = 10 + rc.senseRubble(l_p1n4);
if (v_p1n4 > v_p0n3 + p_p1n4) {
d_p1n4 = d_p0n3;
