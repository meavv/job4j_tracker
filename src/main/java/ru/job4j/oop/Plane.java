package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летит по воздуху");
    }

    @Override
    public void countPassengers() {
        System.out.println("Вместит 150 пассажиров");
    }
}