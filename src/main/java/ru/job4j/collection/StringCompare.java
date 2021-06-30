package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return Character.compare(left.charAt(i), right.charAt(i));
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}


//Меньше нуля - если входящее значение больше, чем текущий объект.
//
//Ноль - если значение равны.
//
//Больше нуля - если текущее значение больше, чем входящее.
//        Примечание. Текущее значение - это объект у которого вызван метод compareTo.