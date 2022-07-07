package ru.job4j.tracker;

import ru.job4j.react.Observe;

import java.util.List;

public class FindAllActions implements UserAction {
    private final Output out;

    public FindAllActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all Item";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        try {
            List<Item> items = tracker.findAll();
            getByReact(System.out::println, items);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void getByReact(Observe<Item> observe, List<Item> data) throws InterruptedException {
        for (Item datum : data) {
            Thread.sleep(1000);
            observe.receive(datum);
        }
    }
}
