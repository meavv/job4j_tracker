package ru.job4j.tracker;

public class DeleteActions implements UserAction {
    private final Output out;

    public DeleteActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Ошибочка");
        }
        return true;
    }
}
