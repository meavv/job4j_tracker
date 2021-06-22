package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        for (int i = number; i < string.length; i++) {
            if (string[i] == c) {
                rsl = i;
            }
        }
        return rsl;
    }
}