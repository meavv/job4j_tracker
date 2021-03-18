package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                tracker.add(item);
                item.setName(name);
            }
            else if (select == 1) {
                Item[] items = tracker.findAll();
                System.out.println(Arrays.toString(items));
            }
            else if (select == 2) {
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.replace(id, item);
            }
            else if (select == 3) {
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                tracker.delete(id);
            }
            else if (select == 4) {
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println(tracker.findById(id));
            }
            else if (select == 5) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                System.out.println(Arrays.toString(items));
            }
            else if (select == 6) {
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}