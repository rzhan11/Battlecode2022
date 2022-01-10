
with open("logs/log.txt", "r") as file:
    lines = file.read().split("\n")
print("log.txt has", len(lines), "lines")

most_bfs_byte = 0
most_bfs_info = None

def isHeader(line):
    return all(c in line for c in "[:#@]")

index = 0
while index < len(lines):
    if "Match Starting" in lines[index]:
        matchName = lines[index + 1][9:]
        print(matchName)
        index += 2
        header = "none"
        while index < len(lines):
            if "Match Finished" in lines[index]:
                break
            if isHeader(lines[index]):
                header = lines[index][:lines[index].index("]") + 1]
                myTeam = header[header.index("[") + 1:header.index(":")]
                myType = header[header.index(":") + 1:header.index("#")]
                id = header[header.index("#") + 1:header.index("@")]
                roundNum = header[header.index("@") + 1:header.index("]")]

            if "bfs" in lines[index]:
                words = lines[index].split()
                bytecode = int(words[2])
                if bytecode > most_bfs_byte:
                    most_bfs_byte = bytecode
                    most_bfs_info = header
                    print(most_bfs_byte, most_bfs_info)
            index += 1
    index += 1
