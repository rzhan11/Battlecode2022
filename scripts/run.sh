cd ..

./gradlew run \
-PteamA=micro_bot \
-PteamB=micro_bot_nolog \
-Pmaps=maptestsmall \
2>&1 | tee scripts/logs/log.txt

#./gradlew run \
#-PteamA=micro_bot \
#-PteamB=examplefuncsplayer \
#-Pmaps=intersection \
#2>&1 | tee scripts/logs/log.txt
