package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (String word : words) {
            result = result + word + " ";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
}
