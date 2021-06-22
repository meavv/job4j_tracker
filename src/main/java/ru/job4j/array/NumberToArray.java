package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int[] list = new int[Integer.toString(number).length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = number % 10;
            number /= 10;
        }
        return list;
    }
}