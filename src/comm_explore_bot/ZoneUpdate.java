package comm_explore_bot;

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static comm_explore_bot.Map.*;
import static comm_explore_bot.Robot.*;
import static comm_explore_bot.Zone.*;

public class ZoneUpdate {

public static void updateResourceZoneStatus(int zx, int zy) throws GameActionException {

int dx = Math.min(ZONE_SIZE, mapWidth - zx * ZONE_SIZE);
int dy = Math.min(ZONE_SIZE, mapHeight - zy * ZONE_SIZE);

switch (dx) {
case 1:
switch (dy) {
case 1:
u_z_1_1(zx, zy);
return;
case 2:
u_z_1_2(zx, zy);
return;
case 3:
u_z_1_3(zx, zy);
return;
case 4:
u_z_1_4(zx, zy);
return;
}
case 2:
switch (dy) {
case 1:
u_z_2_1(zx, zy);
return;
case 2:
u_z_2_2(zx, zy);
return;
case 3:
u_z_2_3(zx, zy);
return;
case 4:
u_z_2_4(zx, zy);
return;
}
case 3:
switch (dy) {
case 1:
u_z_3_1(zx, zy);
return;
case 2:
u_z_3_2(zx, zy);
return;
case 3:
u_z_3_3(zx, zy);
return;
case 4:
u_z_3_4(zx, zy);
return;
}
case 4:
switch (dy) {
case 1:
u_z_4_1(zx, zy);
return;
case 2:
u_z_4_2(zx, zy);
return;
case 3:
u_z_4_3(zx, zy);
return;
case 4:
u_z_4_4(zx, zy);
return;
}
}
}
public static void u_z_1_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_1_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_1_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_1_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_2_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_2_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_2_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_2_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_3_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_3_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_3_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_3_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_4_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_4_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_4_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}


public static void u_z_4_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(NORTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(SOUTH);
if (rc.senseLead(loc) > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}
loc = loc.add(EAST);
}
}
