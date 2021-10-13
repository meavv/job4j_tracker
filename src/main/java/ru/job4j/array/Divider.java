package ru.job4j.array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int anInt : ints) {
            if (num % anInt != 0) {
                return false;
            }
        }
        return true;
    }
}