cd ..

./gradlew run \
-PteamA=walker_bot \
-PteamB=walker_bot_nolog \
-Pmaps=intersection \
2>&1 | tee scripts/logs/log.txt

#./gradlew run \
#-PteamA=micro_bot \
#-PteamB=examplefuncsplayer \
#-Pmaps=intersection \
#2>&1 | tee scripts/logs/log.txt
