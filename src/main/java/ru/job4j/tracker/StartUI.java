package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));

                if (select == 0) {
                    System.out.println("=== Create a new Item ====");

                    String name = input.askStr("Enter name: ");
                    Item item = new Item(name);
                    tracker.add(item);

                } else if (select == 1) {
                    Item[] items = tracker.findAll();
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else if (select == 2) {

                    int id = Integer.parseInt(input.askStr("Enter id: "));

                    String name = input.askStr("Enter name: ");
                    Item item = new Item(name);
                    if (tracker.replace(id, item)) {
                        System.out.println("Заявка изменена");
                    } else {
                        System.out.println("ОШИБКА");
                    }
                } else if (select == 3) {

                    int id = Integer.parseInt(input.askStr("Enter id: "));
                    if (tracker.delete(id)) {
                        System.out.println("Заявка удалена");
                    } else {
                        System.out.println("Ошибочка");
                    }

                } else if (select == 4) {

                    int id = Integer.parseInt(input.askStr("Enter id: "));
                    Item rsl = tracker.findById(id);
                    if (rsl != null) {
                        System.out.println(rsl);
                    } else {
                        System.out.println("Указанного ИД не существует");
                    }

                } else if (select == 5) {

                    String name = input.askStr("Enter name: ");
                    Item[] items = tracker.findByName(name);
                    if (items.length > 0) {
                        for (int i = 0; i < items.length; i++) {
                            System.out.println(items[i]);
                        }
                    } else {
                        System.out.println("Заявок с таким именем нет");
                    }
                } else if (select == 6) {
                    run = false;
                }

        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}