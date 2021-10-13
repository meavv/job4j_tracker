package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int firstTeam = 0;
        int twoTeam = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                firstTeam = firstTeam + players[i];
            } else {
                twoTeam = twoTeam + players[i];
            }
        }
        if (firstTeam == twoTeam) {
            return 0;
        }
        return firstTeam > twoTeam ? 1 : 2;
    }
}
