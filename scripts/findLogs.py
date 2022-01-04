import json

with open("logs/log_indices.txt") as f:
    log_indices = json.load(f)
    log_starts = log_indices["log_starts"]
    log_ends = log_indices["log_ends"]

with open("logs/log.txt") as f:
    lines = f.read().split("\n")

while True:
    try:
        print("Type 'q' to end")
        rin = input("Round: ")
        round = int( rin )
        print("Type 'all' for all IDs")
        id = input("ID: ")
        if id == "all":
            ids = list(log_starts[round].keys())
            ids = [int(i) for i in ids]
            ids.sort()
            print(ids)
            continue

        if id in log_starts[round]:
            s_i = log_starts[round][id]
            e_i = log_ends[round][id]
            for i in range(s_i, e_i):
                print(lines[i])
            print("[----]")
        else:
            print(f"ID '{id}' not found")
    except ValueError:
        if rin == "q":
            exit()
        print("Bad input")
