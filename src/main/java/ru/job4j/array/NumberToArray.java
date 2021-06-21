package ru.job4j.array;


public class NumberToArray {
    public static int[] resolve(int number) {
        String s = Integer.toString(number);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }
}