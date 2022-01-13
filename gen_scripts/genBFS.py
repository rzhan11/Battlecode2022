import math

MAX_MAP_SIZE = 60
MAX_R2 = 13
MAX_RUBBLE = 100
PACKAGE_NAME = "comm_explore_bot"

max_radius = math.floor(math.sqrt(MAX_R2))

def get_r2(x, y):
    return x * x + y * y

locs = []
for i in range(-max_radius, max_radius + 1):
    for j in range(-max_radius, max_radius + 1):
        r2 = get_r2(i, j)
        if r2 <= MAX_R2:
            locs += [(i, j, r2)]

locs.sort(key=lambda x: x[2])
# print(locs)

def get_loc_suffix(x, y):
    name = "_"
    if x >= 0:
        name += "p"
    else:
        name += "n"
    name += str(abs(x))
    if y >= 0:
        name += "p"
    else:
        name += "n"
    name += str(abs(y))
    return name

def get_method_name(xmin, ymin, xmax, ymax):
    return f"bfs{get_loc_suffix(xmin, ymin)}{get_loc_suffix(xmax, ymax)}"

# for (x, y, r) in locs:
#     print(x, y, get_loc_suffix(x, y))


def in_range(x, y):
    return x * x + y * y <= MAX_R2

# print()
DIRS = {
    (1, 0): "EAST",
    (1, 1): "NORTHEAST",
    (0, 1): "NORTH",
    (-1, 1): "NORTHWEST",
    (-1, 0): "WEST",
    (-1, -1): "SOUTHWEST",
    (0, -1): "SOUTH",
    (1, -1): "SOUTHEAST"
}
prev_locs = {(x, y): [] for x, y, r in locs}
for (x, y, r) in locs:
    r2 = get_r2(x, y)
    # special case for adjacent tiles
    rel_locs = []
    for dx, dy in DIRS:
        nx = x + dx
        ny = y + dy
        nr2 = get_r2(nx, ny)
        if nr2 < r2:
            rel_locs += [(nx, ny)]
    rel_locs.sort(key=lambda x: get_r2(x[0], x[1]))
    prev_locs[(x, y)] = rel_locs

# print(prev_locs)

edge_locs = []
for (x, y, r) in locs:
    for dx, dy in DIRS:
        nx = x + dx
        ny = y + dy
        nr2 = get_r2(nx, ny)
        if nr2 > MAX_R2:
            edge_locs += [(x, y)]
            break

print(edge_locs)

# ''' taken from stackoverflow '''
# import numpy as np
#
# def unit_vector(vector):
#     return vector / np.linalg.norm(vector)
#
# def angle_between(v1, v2):
#     v1_u = unit_vector(v1)
#     v2_u = unit_vector(v2)
#     return np.arccos(np.clip(np.dot(v1_u, v2_u), -1.0, 1.0))
#
# dir2edges = {}
# for dx, dy in DIRS:
#     edges = []
#     for x, y in edge_locs:
#         ang = angle_between((dx, dy), (x, y))
#         if abs(ang) <= math.pi / 2 + 0.00001:
#             edges += [(x, y)]
#     dir2edges[(dx, dy)] = edges
#     print(DIRS[(dx, dy)], len(edges), edges)
# print(len(edge_locs))
'''
FILE GENERATION
'''



def write_method(xmin, ymin, xmax, ymax):
    method_contents = ""

    method_contents += f"public static Direction {get_method_name(xmin, ymin, xmax, ymax)}() throws GameActionException {{\n"

    # adjacent locations
    for (x, y), rel_locs in prev_locs.items():
        if not (xmin <= x <= xmax and ymin <= y <= ymax):
            continue

        suf = get_loc_suffix(x, y)
        if 1 <= get_r2(x, y) <= 2:
            dir_name = DIRS[(x, y)]
#
            # method_contents += f"if (rc.onTheMap(l{suf})) {{\n"
            method_contents += f"if (!rc.canSenseRobotAtLocation(l{suf})) {{\n"
            method_contents += f"v{suf} = 10 + rc.senseRubble(l{suf});\n"


            method_contents += f"d{suf} = {dir_name};\n"


            method_contents += f"}}\n"
            # method_contents += f"}}\n"

    method_contents += "\n"

    # non-adjacent locations
    for (x, y), rel_locs in prev_locs.items():
        if not (xmin <= x <= xmax and ymin <= y <= ymax):
            continue
        if get_r2(x, y) <= 2:
            continue

        suf = get_loc_suffix(x, y)

        method_contents += f"p{suf} = 10 + rc.senseRubble(l{suf});\n"

        for px, py in rel_locs:
            if not (xmin <= px <= xmax and ymin <= py <= ymax):
                continue

            psuf = get_loc_suffix(px, py)

            method_contents += f"if (v{suf} > v{psuf} + p{suf}) {{\n"

            method_contents += f"v{suf} = v{psuf} + p{suf};\n"
            method_contents += f"d{suf} = d{psuf};\n"

            method_contents += f"}}\n"


        method_contents += "\n"

    # for targets within vision
    method_contents += f'''
int dx = target.x - here.x;
int dy = target.y - here.y;
    '''

    method_contents += "\n"

    method_contents += f"switch (dx) {{\n"
    for x in range(-max_radius, max_radius + 1):
        if not (xmin <= x <= xmax):
            continue

        method_contents += f"case {x}:\n"
        method_contents += f"switch (dy) {{\n"
        for y in range(-max_radius, max_radius + 1):
            if not (ymin <= y <= ymax):
                continue

            if 0 < get_r2(x, y) <= MAX_R2:
                method_contents += f"case {y}:\n"
                method_contents += f"return d{get_loc_suffix(x, y)};\n"



        method_contents += f"}}\n"
        method_contents += f"break;\n"


    method_contents += f"}}\n"

    method_contents += "\n"

    # for target outside of vision
    method_contents += "initialDist = Math.sqrt(here.distanceSquaredTo(target));\n"

    method_contents += "\n"

    # calculate speeds
    for i, (x, y) in enumerate(edge_locs):
        if not (xmin <= x <= xmax and ymin <= y <= ymax):
            continue

        suf = get_loc_suffix(x, y)
        method_contents += f"speed{suf} = (initialDist - Math.sqrt(l{suf}.distanceSquaredTo(target))) / v{suf};\n"

    # get best speed
    method_contents += f"bestEstimation = "

    total = 0
    for x, y in edge_locs:
        if not (xmin <= x <= xmax and ymin <= y <= ymax):
            continue
        total += 1

    count = 0
    for x, y in edge_locs:
        if not (xmin <= x <= xmax and ymin <= y <= ymax):
            continue
        if count == 0:
            count += 1
            continue
        suf = get_loc_suffix(x, y)
        if count + 1 == total:
            method_contents += f"speed{suf}"
        else:
            method_contents += f"Math.max(speed{suf},"
        count += 1
    method_contents += (")" * (count - 2)) + ";\n"

    # find best speed
    for i, (x, y) in enumerate(edge_locs):
        if not (xmin <= x <= xmax and ymin <= y <= ymax):
            continue

        suf = get_loc_suffix(x, y)
        method_contents += f"if (bestEstimation == speed{suf}) {{\n"
        method_contents += f"return d{suf};\n"
        method_contents += "}\n";

    method_contents += "\n"

    # return
    method_contents += "return null;\n"

    method_contents += "}\n"

    return method_contents

''' FILE START '''



file_contents = ""

# header
file_contents += f'''package {PACKAGE_NAME};

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static {PACKAGE_NAME}.Debug.*;
import static {PACKAGE_NAME}.Map.*;
import static {PACKAGE_NAME}.Robot.*;

public class BFS{MAX_R2} {{

public static MapLocation target;
'''




# declare all variables
for (x, y), rel_locs in prev_locs.items():
    if not (x == 0 and y == 0):
        suf = get_loc_suffix(x, y)
        file_contents += f"public static MapLocation l{suf};\n"
        file_contents += f"public static double v{suf};\n"
        file_contents += f"public static Direction d{suf};\n"
        file_contents += f"public static int p{suf};\n"

file_contents += "\n"

# initialize all edge loc variables
file_contents += '''
public static double bestEstimation;
public static double initialDist;
'''

file_contents += "\n"

for i, (x, y) in enumerate(edge_locs):
    suf = get_loc_suffix(x, y)
    file_contents += f"public static double speed{suf};\n";
file_contents += "\n"

file_contents += '''
public static Direction getBestDir(MapLocation tar) throws GameActionException {
target = tar;

'''

# initialize all standard loc variables
for (x, y), rel_locs in prev_locs.items():
    if not (x == 0 and y == 0):
        suf = get_loc_suffix(x, y)

        (px, py) = rel_locs[0]
        (dx, dy) = (x - px, y - py)
        prev_l = f"l{get_loc_suffix(px, py)}" if (px != 0 or py != 0) else "here"
        dir_name = DIRS[(dx, dy)]
        l = f"{prev_l}.add({dir_name})"
        v = "1000000"
        d = "null"

        file_contents += f"l{suf} = {l};\n"
        file_contents += f"v{suf} = {v};\n"
        file_contents += f"d{suf} = {d};\n"
file_contents += "\n"

# PUT LARGE SWITCH HERE
file_contents += f'''
int xmin = -Math.min(here.x, {max_radius});
int ymin = -Math.min(here.y, {max_radius});
int xmax = Math.min(XMAX - here.x, {max_radius});
int ymax = Math.min(YMAX - here.y, {max_radius});
log("bounds " + xmin + " " + ymin + " " + xmax + " " + ymax);
'''

file_contents += f"switch (xmin) {{\n"
for xmin in range(-max_radius, 1):
    file_contents += f"case {xmin}: \n"

    file_contents += f"switch (xmax) {{\n"
    for xmax in range(0, max_radius + 1):
        if xmin != -max_radius and xmax != max_radius:
            continue
        file_contents += f"case {xmax}: \n"

        file_contents += f"switch (ymin) {{\n"
        for ymin in range(-max_radius, 1):
            file_contents += f"case {ymin}: \n"

            file_contents += f"switch (ymax) {{\n"
            for ymax in range(0, max_radius + 1):
                if ymin != -max_radius and ymax != max_radius:
                    continue
                file_contents += f"case {ymax}: \n"
                file_contents += f"return {get_method_name(xmin, ymin, xmax, ymax)}();\n";
            file_contents += "}\n"
            file_contents += "break;"

        file_contents += "}\n"
        file_contents += "break;"

    file_contents += "}\n"
    file_contents += "break;"

file_contents += "}\n"

# file_contents += f"switch (xmin * {(max_radius + 1)**3} + ymin * {(max_radius + 1)**2} + xmax * {(max_radius + 1)} + ymax) {{\n"
# for xmin in range(0, max_radius + 1):
#     for ymin in range(0, max_radius + 1):
#         for xmax in range(0, max_radius + 1):
#             for ymax in range(0, max_radius + 1):
#                 if xmin != max_radius and xmax != max_radius:
#                     continue
#                 if ymin != max_radius and ymax != max_radius:
#                     continue
#                 index = xmin * (max_radius + 1)**3 + ymin * (max_radius + 1)**2 + xmax * (max_radius + 1) + ymax
#                 file_contents += f"case {index}: \n"
#                 file_contents += f"return {get_method_name(-xmin, -ymin, xmax, ymax)}();\n";
#
# file_contents += "}\n"



file_contents += f'''
logi("WARNING: 'Unexpected map offsets' " + xmin + " " + ymin + " " + ymax + " " + ymax);
return null;
}}

'''

''' switch-methods '''
method_arr = []
for xmin in range(-max_radius, 1):
    for ymin in range(-max_radius, 1):
        for xmax in range(0, max_radius + 1):
            for ymax in range(0, max_radius + 1):
                if xmin != -max_radius and xmax != max_radius:
                    continue
                if ymin != -max_radius and ymax != max_radius:
                    continue
                method_arr += [write_method(xmin, ymin, xmax, ymax)]

file_contents += "\n\n".join(method_arr)
# file_contents += write_method(0, 0, 4, 4)

# footer
file_contents += f'''
}}
'''

with open(f"../src/{PACKAGE_NAME}/BFS{MAX_R2}.java", "w") as f:
    f.write(file_contents)
