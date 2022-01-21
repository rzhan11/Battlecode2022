import math
import random
random.seed(1)

MAX_MAP_SIZE = 60
MAX_R2 = 20
PACKAGE_NAME = "gold_bot"

max_radius = math.floor(math.sqrt(MAX_R2))

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

dir_order = {
    "NORTH": 0,
    "NORTHEAST": 1,
    "EAST": 2,
    "SOUTHEAST": 3,
    "SOUTH": 4,
    "SOUTHWEST": 5,
    "WEST": 6,
    "NORTHWEST": 7,
}

def get_r2(x, y):
    return x * x + y * y

def get_hsym_loc(loc):
    x, y = loc
    return (-x, y)

def get_vsym_loc(loc):
    x, y = loc
    return (x, -y)

def get_rsym_loc(loc):
    x, y = loc
    return (-x, -y)

range_locs = []
for i in range(-max_radius, max_radius + 1):
    for j in range(-max_radius, max_radius + 1):
        r2 = get_r2(i, j)
        if r2 <= MAX_R2:
            range_locs += [(i, j, r2)]


print(range_locs)
print()

dir2new_loc = {}
for dx, dy in DIRS.keys(): # we just moved dx, dy
    good_locs = []
    for ox, oy, _ in range_locs:
        distx = ox + dx
        disty = oy + dy
        if get_r2(distx, disty) > MAX_R2:
            good_locs += [(ox, oy)]
    dir2new_loc[(dx, dy)] = good_locs


# range_locs= [()]
max_len = 0
all_check_offsets = {}
for cox in [0, 0.5]:
    for coy in [0, 0.5]:
        offset_range_locs = []
        for i in range(-(max_radius + 2), max_radius + 1):
            for j in range(-(max_radius + 2), max_radius + 1):
                cx, cy = cox + i, coy + j
                if get_r2(cx, cy) <= MAX_R2:
                    offset_range_locs += [(cx, cy, get_r2(cx, cy))]
        offset_range_locs.sort(key=lambda x: x[2])
        print(len(offset_range_locs), offset_range_locs)
        print()

        for cx, cy, _ in offset_range_locs: # where the bot is relative to center of map
            for dir in dir2new_loc.keys(): # for each direction

                check_offsets = {
                    "h": [],
                    "v": [],
                    "r": []
                }
                used_true_locs = {
                    "h": set(),
                    "v": set(),
                    "r": set(),
                }
                good_offsets = dir2new_loc[dir]
                for ox, oy in good_offsets: # offsets (from current bot loc) that go to new locs
                    nx, ny = cx + ox, cy + oy # new location, relative to map center

                    for sym_id, sym_op in [("h", get_hsym_loc), ("v", get_vsym_loc), ("r", get_rsym_loc)]:
                        sym_loc = sym_op((nx, ny)) # hsym location of new loc
                        cur_r2 = get_r2(sym_loc[0] - cx, sym_loc[1] - cy)
                        if cur_r2 <= MAX_R2 and not (sym_loc[0] == nx and sym_loc[1] == ny):
                            # if sym_loc == (0, 1):
                            #     print(sym_loc, check_offsets[sym_id])
                            if sym_loc not in used_true_locs[sym_id]: # dont add duplicates
                                check_offsets[sym_id] += [(ox, oy)]
                                used_true_locs[sym_id].add((nx, ny))

                cur_len = sum(len(v) for v in check_offsets.values())
                # if cur_len == 10 and dir == (1, 1):
                #     print("[[[]]]", cx, cy, dir, check_offsets)

                max_len = max(max_len, cur_len)
                if cur_len > 0:
                    all_check_offsets[(cx, cy, dir)] = check_offsets

print("max_len", max_len)

def get_switch_index(dx, dy, dir, sym):
    if sym == "h":
        dy = 0
    elif sym == "v":
        dx = 0

    index = (2 * dx + MAX_MAP_SIZE) + (2 * dy + MAX_MAP_SIZE) * (2 * MAX_MAP_SIZE)

    # index += dir_order[dir] * ((2 * MAX_MAP_SIZE) * (2 * MAX_MAP_SIZE));

    return int(index)


def get_method_name(dir, sym):
    # if dx < 0:
    #     dx = f"n{abs(dx)}"
    # if dy < 0:
    #     dy = f"n{abs(dy)}"
    return f"gcl_{dir}_{sym}"

def format_array(arr):
    left = [str(a) for a, b in arr]
    right = [str(b) for a, b in arr]
    l_str = "{" + ",".join(left) + "}"
    r_str = "{" + ",".join(right) + "}"
    return f"new int[][] {{ {l_str}, {r_str} }}"


"""
FILE GENERATION
"""

# header
file_contents = f'''package {PACKAGE_NAME};

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static {PACKAGE_NAME}.Debug.*;
import static {PACKAGE_NAME}.Map.*;
import static {PACKAGE_NAME}.Robot.*;
import static {PACKAGE_NAME}.Zone.*;

public class SymUpdate {{

public static int[][] getCheckOffsets(double dx, double dy, Symmetry sym, Direction dir) {{

switch (sym) {{
    case H:
        dy = 0;
        break;
    case V:
        dx = 0;
        break;
    case R:
        break;
}}

int index = (int) ( (2 * dx + MAX_MAP_SIZE) + (2 * dy + MAX_MAP_SIZE) * (2 * MAX_MAP_SIZE) );
// index += dir2int(dir) * ((2 * MAX_MAP_SIZE) * (2 * MAX_MAP_SIZE));

switch (sym) {{
'''

for sym in "hvr":
    file_contents += f"case {sym.upper()}:\n"
    file_contents += f"switch (dir) {{\n"
    for dir in DIRS.values():
        file_contents += f"case {dir}:\n"
        file_contents += f"return {get_method_name(dir, sym)}(index);\n"

    file_contents += "}\n" # end of switch
    file_contents += f"break;\n"



file_contents += f'''
}}
return null;
}}

'''

for sym in "hvr":
    for dir_name in DIRS.values():
        used_cases = set()


        file_contents += f'''
public static int[][] {get_method_name(dir_name, sym)} (int index) {{
switch (index) {{
'''

        for (dx, dy, dir), check_offsets in all_check_offsets.items():
            if DIRS[dir] != dir_name:
                continue

            offsets_arr = check_offsets[sym]
            if len(offsets_arr) == 0:
                continue

            index = get_switch_index(dx, dy, dir_name, sym)

            if index in used_cases:
                continue
            else:
                used_cases.add(index)
            file_contents += f"case {index}:\n"
            # print(dx, dy, dir, sym)
            file_contents += f"return {format_array(offsets_arr)};\n"


        # end of switch
        file_contents += "}\n"
        # end of method
        file_contents += f"""
return null;
}}
"""


# end of class
file_contents += f"""
}}
"""


# exit()

with open(f"../src/{PACKAGE_NAME}/SymUpdate.java", "w") as f:
    f.write(file_contents)
