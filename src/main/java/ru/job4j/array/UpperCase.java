package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] list = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            list[i] = Character.toUpperCase(string[i]);
        }
        return list;
    }
}