package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int positive = 0;
        int negative = 0;
        for (int datum : data) {
            if (datum < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        return negative % 2 != 0;
    }
}