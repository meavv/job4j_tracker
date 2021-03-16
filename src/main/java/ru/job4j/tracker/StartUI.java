package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item x = new Item();
        tracker.add(x);
        System.out.println(tracker.findById(1));
    }

}