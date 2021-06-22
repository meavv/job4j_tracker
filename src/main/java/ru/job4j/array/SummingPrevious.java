package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] list = new int[n];
        list[0] = a;
        list[1] = b;
        int count = a + b;
        for (int i = 2; i < list.length; i++) {
            list[i] = count;
            count = count + list[i];
        }
        return list;
    }
}