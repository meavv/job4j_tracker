package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] lefts = left.toLowerCase().toCharArray();
        char[] rights = right.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : lefts) {
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (key, value) -> value + 1);
        }
        for (char d : rights) {
            map.computeIfPresent(d, (key, value) -> value - 1);
            if (map.get(d) == null || map.get(d) < 0) {
                return false;
            }
        }
        return true;
    }
}