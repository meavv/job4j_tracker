package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Clean code", 500);
        Book two = new Book("Two", 800);
        Book three = new Book("Three", 1040);
        Book four = new Book("Four", 24);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + "-" + books[i].getPage());
        }
        System.out.println("Меняем местами");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + "-" + books[i].getPage());
        }
        System.out.println("Выводим только Clean code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName());
            }
        }
    }
}
