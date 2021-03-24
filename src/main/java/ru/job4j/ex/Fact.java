package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int x = fact.calc(4);
        System.out.println(x);

    }

    public int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Start should be less then finish.");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}