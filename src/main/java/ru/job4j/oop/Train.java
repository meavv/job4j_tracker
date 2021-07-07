package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Едет по рельсам");
    }

    @Override
    public void countPassengers() {
        System.out.println("Вместит 500 пассажиров");

    }
}