package ru.job4j.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        boolean rsl = false;
        if (list.contains(str)) {
            if (list.indexOf(str) == list.lastIndexOf(str)) {
                rsl = true;
            }
        }
        return rsl;
    }
}