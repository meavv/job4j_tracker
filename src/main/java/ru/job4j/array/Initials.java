package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String rsl = null;
        for (int i = 0; i < fio.length; i++) {
            if (i == 0) {
                rsl = fio[i] + ' ';
            } else {
                rsl = rsl + fio[i].charAt(0) + '.';
            }
        }
        return rsl;
    }
}