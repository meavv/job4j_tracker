package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        TreeMap<Character, Integer> treeSet = new TreeMap<>();
        char rsl = ' ';
        str = str.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        char[] strToArray = str.toCharArray();
        for (char c : strToArray) {
            treeSet.putIfAbsent(c, 0);
        }
        for (char c : strToArray) {
            treeSet.computeIfPresent(c, (k, value) -> value + 1);
        }
        int x = treeSet.get(treeSet.firstKey());
        for (Integer c : treeSet.values()) {
            if (x < c) {
                x = c;
            }
        }
        rsl = treeSet.firstKey();
        for (Character c : treeSet.keySet()) {
            if (treeSet.get(c) > treeSet.get(rsl)) {
                rsl = c;
            }
        }
        return rsl;
    }

}