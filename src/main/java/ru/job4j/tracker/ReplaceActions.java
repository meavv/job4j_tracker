package ru.job4j.tracker;

public class ReplaceActions implements UserAction {
    private final Output out;

    public ReplaceActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace id";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Заявка изменена");
        } else {
            out.println("ОШИБКА");
        }
        return true;
    }
}