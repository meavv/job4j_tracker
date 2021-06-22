package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String rsl = "";
        int count = 0;
        for (int i = 0; count < num; i++) {
            if (i > 3) {
                i = 0;
            }
            rsl = prizes[i];
            count++;
        }
        return rsl;
    }
}