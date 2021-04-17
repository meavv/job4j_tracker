package ru.job4j.search;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        int bound = list.size() - 1;
        String x = list.get(bound);
        list.remove(bound);
        if (index < list.size()) {

            list.set(index, x);
        }
        return list;
    }
}