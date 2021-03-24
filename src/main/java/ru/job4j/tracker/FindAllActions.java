package ru.job4j.tracker;

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
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            out.println(item);
        }
        return true;
    }
}