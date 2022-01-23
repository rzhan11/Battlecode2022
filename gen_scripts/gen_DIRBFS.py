import math

MAX_R2 = 34


def get_r2(x, y):
    return x * x + y * y

max_radius = math.floor(math.sqrt(MAX_R2))

range_locs = []
for i in range(-max_radius, max_radius + 1):
    for j in range(-max_radius, max_radius + 1):
        r2 = get_r2(i, j)
        if r2 <= MAX_R2:
            range_locs += [(i, j)]

DIRS = {
    (1, 0): "EAST",
    (1, 1): "NORTHEAST",
    (0, 1): "NORTH",
    (-1, 1): "NORTHWEST",
    (-1, 0): "WEST",
    (-1, -1): "SOUTHWEST",
    (0, -1): "SOUTH",
    (1, -1): "SOUTHEAST",
    (0, 0): "CENTER",
}

visited = set()

cur_loc = (0, 0)
dir_seq = []

while True:
    best_next_loc = None
    best_dir = None
    best_score = float("-inf")
    for dx, dy in DIRS:
        new_loc = (cur_loc[0] + dx, cur_loc[1] + dy)
        if new_loc in visited:
            continue
        if new_loc not in range_locs:
            continue
        dist = get_r2(new_loc[0], new_loc[1])
        if dist > best_score:
            best_score = dist
            best_next_loc = new_loc
            best_dir = DIRS[(dx, dy)]

    if best_next_loc is not None:
        cur_loc = best_next_loc
        visited.add(cur_loc)
        dir_seq += [(cur_loc, best_dir)]
    else:
        break

print(len(dir_seq), len(range_locs))

final_seq = [dir for loc, dir in dir_seq][::-1]
print(final_seq)

def format_array(arr):
    return "{" + ",".join(arr) + "}"

print(format_array(final_seq))
