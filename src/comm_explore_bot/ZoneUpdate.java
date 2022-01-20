package comm_explore_bot;

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static comm_explore_bot.Debug.*;
import static comm_explore_bot.Map.*;
import static comm_explore_bot.Robot.*;
import static comm_explore_bot.Zone.*;

public class ZoneUpdate {

public static int curLead;

public static void updateResourceZoneStatus(int zx, int zy) throws GameActionException {

int dx = Math.min(ZONE_SIZE, mapWidth - zx * ZONE_SIZE);
int dy = Math.min(ZONE_SIZE, mapHeight - zy * ZONE_SIZE);

curLead = 0;

switch (dx) {
case 1:
switch (dy) {
case 1:
u_z_1_1(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 2:
u_z_1_2(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 3:
u_z_1_3(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 4:
u_z_1_4(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
}
case 2:
switch (dy) {
case 1:
u_z_2_1(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 2:
u_z_2_2(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 3:
u_z_2_3(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 4:
u_z_2_4(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
}
case 3:
switch (dy) {
case 1:
u_z_3_1(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 2:
u_z_3_2(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 3:
u_z_3_3(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 4:
u_z_3_4(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
}
case 4:
switch (dy) {
case 1:
u_z_4_1(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 2:
u_z_4_2(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 3:
u_z_4_3(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
case 4:
u_z_4_4(zx, zy);
if (curLead > 0) {
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
}
return;
}
}
logi("WARNING: 'ZoneUpdate.updateResourceZoneStatus' should not reach here " + zx + " " + zy + " " + dx + " " + dy);
}
public static void u_z_1_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_1_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_1_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_1_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_2_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_2_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_2_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_2_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_3_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_3_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_3_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_3_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_4_1(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_4_2(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_4_3(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}


public static void u_z_4_4(int zx, int zy) throws GameActionException {
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(NORTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(SOUTH);
curLead += rc.senseLead(loc);loc = loc.add(EAST);
}
}
