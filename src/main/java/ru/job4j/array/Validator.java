package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        boolean rsl = false;
        int count = 0;
        for (int datum : data) {
            if (datum == value) {
                count++;
            }
        }
        if (count < (data.length/2)) {
            rsl = true;
        }
        return rsl;
    }
}