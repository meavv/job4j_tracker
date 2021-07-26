package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        int count = 0;
        for (char datum : data) {
            if (datum == '(') {
                count++;
            }
            if (datum == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}