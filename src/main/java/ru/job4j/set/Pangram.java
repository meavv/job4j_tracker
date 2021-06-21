package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pangram {
    public static boolean checkString(String s) {
        int count = 0;
        HashSet<Character> names = new HashSet<Character>();
        char[] result = s.replaceAll("\\s+","").toCharArray();
        for (char c : result) {
            if (names.add(c)) {
                count++;
            }
        }
        return count == 26;
    }
}