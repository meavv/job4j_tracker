package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> list = List.of(origin.replaceAll("[^а-яА-Я]", " ").split(" "));
        String[] lineArray = line.split(" ");
        for (String s : lineArray) {
            if (!list.contains(s)) {
                return false;
            }
        }
        System.out.println(list);
        return true;
    }
}