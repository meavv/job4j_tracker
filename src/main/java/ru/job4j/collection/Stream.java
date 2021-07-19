package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Consumer<Integer> consumer = arrayList::add;
        for (int i = -3; i <= 3; i++) {
            consumer.accept(i);
        }
        System.out.println(arrayList);
        List<Integer> list = arrayList.stream().filter(
                a -> a > 0
        ).collect(Collectors.toList());
        System.out.println(list);
    }
}