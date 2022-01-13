import json, pickle
import gzip
import pandas as pd

with open("../server_matches/explore_bot-vs-sprint_bot-on-eckleburg.bc22", "rb") as f:
    gzip_f = gzip.GzipFile(fileobj=f)
    lines = gzip_f.read()

print(lines)
