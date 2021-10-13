package ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] % number;
        }
        return ints;
    }
}