import json

with open("logs/log.txt", "r") as file:
    lines = file.read().split("\n")
print("log.txt has", len(lines), "lines")


def isHeader(line):
    return all(c in line for c in "[:#@]")


MAX_ROUNDS = 2010

log_starts = [{} for i in range(MAX_ROUNDS)]
log_ends = [{} for i in range(MAX_ROUNDS)]

index = 0
while index < len(lines):
    if "Match Starting" in lines[index]:
        seenEvents = set()
        matchName = lines[index + 1][9:]
        print(matchName)
        index += 2
        header = "none"
        id = "-1"
        roundNum = -1

        while index < len(lines):
            if "Match Finished" in lines[index]:
                break
            if isHeader(lines[index]):
                # old header
                log_ends[roundNum][id] = index

                header = lines[index][:lines[index].index("]") + 1]
                myTeam = header[header.index("[") + 1:header.index(":")]
                myType = header[header.index(":") + 1:header.index("#")]
                id = header[header.index("#") + 1:header.index("@")]
                roundNum = int( header[header.index("@") + 1:header.index("]")] )

                log_starts[roundNum][id] = index


            index += 1
    index += 1

log_ends[roundNum][id] = index

with open("logs/log_indices.txt", "w") as f:
    json.dump({
        "log_starts": log_starts,
        "log_ends": log_ends
    }, f)
