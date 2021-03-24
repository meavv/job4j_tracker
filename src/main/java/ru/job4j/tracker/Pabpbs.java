package ru.job4j.tracker;

public class Pabpbs {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Qwe"));
        System.out.println("Item{id=" + item.getId() + ", name=" + item.getName() + "}");
    }


}
