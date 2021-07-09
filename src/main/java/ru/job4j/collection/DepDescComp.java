package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String l, String r) {
        String[] left = l.split("/");
        String[] right = r.split("/");
        int rsl = right[0].compareTo(left[0]);
        return rsl == 0 ? l.compareTo(r) : rsl;
    }
}