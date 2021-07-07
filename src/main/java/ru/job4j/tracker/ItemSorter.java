package ru.job4j.tracker;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static List<Item> sort(List items) {
        Collections.sort(items);
        return items;
    }

    public static List<Item> reverse(List items) {
        Collections.sort(items, Collections.reverseOrder());
        return items;
    }
}