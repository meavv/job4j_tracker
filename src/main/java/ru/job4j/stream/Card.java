package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(a -> Stream.of(Value.values())
                        .map(b -> a + " " + b))
                .forEach(System.out::println);
    }
}

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}