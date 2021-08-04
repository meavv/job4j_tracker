package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> iterator) {
        return Stream.iterate(iterator, Iterator::hasNext, x -> x)
                .flatMap(it -> Stream.iterate(iterator.next(), Iterator::hasNext, x -> x))
                .map(Iterator::next)
                .collect(Collectors.toList());
    }
}