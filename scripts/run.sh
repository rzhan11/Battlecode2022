cd ..
./gradlew run \
-PteamA=firstbot \
-PteamB=firstbot \
-Pmaps=intersection \
2>&1 | tee scripts/logs/log.txt 
