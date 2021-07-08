package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 10;
        for (String el1: o1.split("/")) {
            for (String el2: o2.split("/")) {
                rsl = el1.compareTo(el2);
            }
        }
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}