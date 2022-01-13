import math

ZONE_SIZE = 4
MAP_MAX = 60
PACKAGE_NAME = "comm_explore_bot"

def get_method_name(zx, zy):
    return f"u_z_{zx}_{zy}"

file_contents = f"""package {PACKAGE_NAME};

import battlecode.common.*;

import static {PACKAGE_NAME}.Map.*;
import static {PACKAGE_NAME}.Robot.*;
import static {PACKAGE_NAME}.Zone.*;

public class ZoneUpdate {{

public static void updateResourceZoneStatus(int zx, int zy) throws GameActionException {{

int dx = Math.min(ZONE_SIZE, mapWidth - zx * ZONE_SIZE);
int dy = Math.min(ZONE_SIZE, mapHeight - zy * ZONE_SIZE);

switch (zx) {{
"""


for zx in range(0, math.ceil(MAP_MAX / ZONE_SIZE) + 1):
    file_contents += f"""case {zx}:
switch (zy) {{
"""
    for zy in range(0, math.ceil(MAP_MAX / ZONE_SIZE) + 1):
        file_contents += f"""case {zy}:
{get_method_name(zx, zy)}(dx, dy);
return;
"""

    file_contents += "}\n" # end of inner switch

file_contents += "}\n" # end of switch
file_contents += "}\n" # end of method


def write_method(zx, zy):
    method_contents = f"""public static void {get_method_name(zx, zy)}(int dx, int dy) throws GameActionException {{
"""


    method_contents += f"switch (dx) {{\n"
    for dx_max in range(1, ZONE_SIZE + 1):
        method_contents += f"""case {dx_max}:
switch (dy) {{
"""
        for dy_max in range(1, ZONE_SIZE + 1):
            method_contents += f"case {dy_max}:\n"
                # do for each x, y in zx, zy
            for dx in range(dx_max):
                for dy in range(dy_max):
                    x = zx * ZONE_SIZE + dx
                    y = zy * ZONE_SIZE + dy
                    method_contents += f"""if (rc.senseLead(new MapLocation({x}, {y})) > 0) {{
zoneResourceStatus[{zx}][{zy}] = ZONE_MINE_FLAG;
return;
}}
"""

            method_contents += "return;\n"
        method_contents += "}\n" # end of inner switch


    method_contents += "}\n" # end of outer switch

    method_contents += "}\n" # end of method
    return method_contents


method_arr = []
for zx in range(0, math.ceil(MAP_MAX / ZONE_SIZE) + 1):
    for zy in range(0, math.ceil(MAP_MAX / ZONE_SIZE) + 1):
        method_arr += [write_method(zx, zy)]

file_contents += "\n\n".join(method_arr)

# end of class
file_contents += "}\n"


with open(f"../src/{PACKAGE_NAME}/ZoneUpdate.java", "w") as f:
    f.write(file_contents)
