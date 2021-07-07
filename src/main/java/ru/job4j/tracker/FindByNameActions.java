package ru.job4j.tracker;

import java.util.List;

public class FindByNameActions implements UserAction {
    private final Output out;

    public FindByNameActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявок с таким именем нет");
        }
        return true;
    }
}
