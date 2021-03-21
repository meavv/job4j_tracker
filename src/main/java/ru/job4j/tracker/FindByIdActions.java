package ru.job4j.tracker;

public class FindByIdActions implements UserAction {
    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item rsl = tracker.findById(id);
        if (rsl != null) {
            System.out.println(rsl);
        } else {
            System.out.println("Указанного ИД не существует");
        }
        return true;
    }
}