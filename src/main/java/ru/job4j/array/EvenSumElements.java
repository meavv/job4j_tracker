package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        boolean rsl = false;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {

            sum += data[i];
        }
        if (sum % 2 == 0) {
            rsl = true;
        }
        return rsl;
    }
}