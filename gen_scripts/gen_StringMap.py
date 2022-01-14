import math
import random
random.seed(1)

NUM_BROADCASTS = 4
ZONE_SIZE = 4
MAP_MIN = 20
MAP_MAX = 60
PACKAGE_NAME = "comm_explore_bot"

ZONE_MIN = math.ceil(MAP_MIN / ZONE_SIZE)
ZONE_MAX = math.ceil(MAP_MAX / ZONE_SIZE)

def pad(x):
    return "\\" + str(oct(int(x)))[2:]

count = 0
all_str_maps = {}
for zx_max in range(ZONE_MIN, ZONE_MAX + 1):
    for zy_max in range(ZONE_MIN, ZONE_MAX + 1):
        arr = [i for i in range(zx_max * zy_max)]
        random.shuffle(arr)
        if len(arr) == 168:
            print(arr)

        arr = [pad(i) for i in arr]
        str_map = "\"" + "".join(arr) + "\""
        all_str_maps[zx_max * zy_max] = str_map

print(len(all_str_maps))

for i, (k, v) in enumerate(all_str_maps.items()):
    print(i, k, v)
    if i == 5:
        break


"""
FILE GENERATION
"""

# header
file_contents = f'''package {PACKAGE_NAME};

import battlecode.common.*;
import static battlecode.common.Direction.*;

import static {PACKAGE_NAME}.Debug.*;
import static {PACKAGE_NAME}.Robot.*;
import static {PACKAGE_NAME}.Zone.*;

public class ZoneString {{

public static String baseString = "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

public static String isExploredStr;
public static String zoneIndex2strIndex;

public static void init() {{
isExploredStr = baseString.substring(0, ZONE_TOTAL_NUM);
zoneIndex2strIndex = getZoneMapString();
}}

/*
Given a zoneIndex
find its explored value
 */
public static boolean getExplored(int zoneIndex) {{
    // cast to int
    int strIndex = (int) zoneIndex2strIndex.charAt(zoneIndex);
    return isExploredStr.charAt(strIndex) == '1';
}}

/*
Given a zoneIndex
find its explored value
 */
public static void setExplored(int zoneIndex, boolean explored) {{
    // cast to int
    int strIndex = (int) zoneIndex2strIndex.charAt(zoneIndex);
    isExploredStr = isExploredStr.substring(0, strIndex) + (explored ? "1": "0") + isExploredStr.substring(strIndex + 1);
}}

/*
Given a char c and an offset (for the isExploredStr),
find the zoneIndex corresponding to the first index where we find char 'c' (after applying offset)
 */
public static int[] findUnexplored(int offset) {{
    int strIndex = isExploredStr.indexOf('0', offset);
    return new int[] {{zoneIndex2strIndex.indexOf(strIndex), strIndex}};
}}

public static String getZoneMapString() {{

switch(ZONE_TOTAL_NUM) {{
'''

for k, v in all_str_maps.items():
    file_contents += f"case {k}:\n"
    file_contents += f"return {v};\n"

# end of switch
file_contents += "}\n"



# end of method and class
file_contents += f"""
logi("WARNING: 'getZoneMapString' has unsupported zone num " + ZONE_TOTAL_NUM + " " + ZONE_XNUM + " " + ZONE_YNUM);
return null;
}}
}}
"""




with open(f"../src/{PACKAGE_NAME}/ZoneString.java", "w") as f:
    f.write(file_contents)
