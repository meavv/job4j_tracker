package ru.job4j.tracker;

public class FindByIdActions implements UserAction {
    private final Output out;

    public FindByIdActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item rsl = tracker.findById(id);
        if (rsl != null) {
            out.println(rsl);
        } else {
            out.println("Указанного ИД не существует");
        }
        return true;
    }
}