package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            if (data[i] == el) {
                break;
            }
        }
        sum = sum - el;
        if (sum % 2 != 0) {
            sum = 0;
        }
        return sum;
    }
}