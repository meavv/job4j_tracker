package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item x = new Item();
        x.setName("Qwe");
        x.setId(3);
        System.out.println(x);
    }

}