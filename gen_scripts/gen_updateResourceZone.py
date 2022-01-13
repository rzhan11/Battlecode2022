import math

ZONE_SIZE = 4
MAP_MAX = 60
PACKAGE_NAME = "comm_explore_bot"

def get_method_name(zx, zy):
    return f"u_z_{zx}_{zy}"

file_contents = f"""package {PACKAGE_NAME};

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static {PACKAGE_NAME}.Map.*;
import static {PACKAGE_NAME}.Robot.*;
import static {PACKAGE_NAME}.Zone.*;

public class ZoneUpdate {{

public static void updateResourceZoneStatus(int zx, int zy) throws GameActionException {{

int dx = Math.min(ZONE_SIZE, mapWidth - zx * ZONE_SIZE);
int dy = Math.min(ZONE_SIZE, mapHeight - zy * ZONE_SIZE);

switch (dx) {{
"""


for dx in range(1, ZONE_SIZE + 1):
    file_contents += f"""case {dx}:
switch (dy) {{
"""
    for dy in range(1, ZONE_SIZE + 1):
        file_contents += f"""case {dy}:
{get_method_name(dx, dy)}(zx, zy);
return;
"""

    file_contents += "}\n" # end of inner switch

file_contents += "}\n" # end of switch
file_contents += "}\n" # end of method


def write_method(dx_max, dy_max):
    method_contents = f"""public static void {get_method_name(dx_max, dy_max)}(int zx, int zy) throws GameActionException {{
MapLocation loc = new MapLocation(zx * ZONE_SIZE, zy * ZONE_SIZE);
"""
    for dx in range(dx_max):
        for dy in range(dy_max):
            method_contents += f"""if (rc.senseLead(loc) > 0) {{
zoneResourceStatus[zx][zy] = ZONE_MINE_FLAG;
return;
}}
"""
            if dx % 2 == 0:
                if dy == dy_max - 1:
                    dir_name = "EAST"
                else:
                    dir_name = "NORTH"
            else:
                if dy == dy_max - 1:
                    dir_name = "EAST"
                else:
                    dir_name = "SOUTH"

            method_contents += f"loc = loc.add({dir_name});\n"

    method_contents += "}\n" # end of method
    return method_contents


method_arr = []
for dx in range(1, ZONE_SIZE + 1):
    for dy in range(1, ZONE_SIZE + 1):
        method_arr += [write_method(dx, dy)]

file_contents += "\n\n".join(method_arr)

# end of class
file_contents += "}\n"


with open(f"../src/{PACKAGE_NAME}/ZoneUpdate.java", "w") as f:
    f.write(file_contents)
