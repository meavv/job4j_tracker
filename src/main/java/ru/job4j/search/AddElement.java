package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        list.add(str);
        if (check.equals(list)) {
            return false;
        }
        return true;
    }
}