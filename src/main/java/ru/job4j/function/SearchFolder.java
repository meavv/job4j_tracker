package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
        public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> list1 = new ArrayList<>();
        for (Folder folder : list) {
            if (pred.test(folder)) {
                list1.add(folder);
            }
        }
        return list1;
    }
}