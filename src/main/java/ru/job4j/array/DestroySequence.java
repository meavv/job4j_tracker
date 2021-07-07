package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        char[] rsl = new char[seq.length];
        for (int i = 0; i < seq.length; i++) {
            if (i < 5) {
                rsl[i] = '0';
            }
            if (i >= seq.length - 5) {
                rsl[i] = '1';
            }
            if (i >= 5 && i < seq.length - 5) {
                rsl[i] = seq[i];
            }
        }
        return rsl;
    }
}