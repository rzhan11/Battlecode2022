import math
import random
random.seed(1)

NUM_PARTITIONS = 4

for i in range(NUM_PARTITIONS + 1):
    for j in range(NUM_PARTITIONS + 1):
        x = i / NUM_PARTITIONS
        y = i / NUM_PARTITIONS
        if not (x == 0 or x == 1 or y == 0 or y == 1):
            continue
