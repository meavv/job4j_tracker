package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                rsl = Character.compare(left.charAt(i),right.charAt(i));
                return rsl;
            } else {
                rsl = Integer.compare(left.length(), right.length());
            }
        }
        return rsl;
    }
}


//Меньше нуля - если входящее значение больше, чем текущий объект.
//
//Ноль - если значение равны.
//
//Больше нуля - если текущее значение больше, чем входящее.
//        Примечание. Текущее значение - это объект у которого вызван метод compareTo.