package ru.job4j.oop;

public class Buss implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Едет по дороге");
    }

    @Override
    public void countPassengers() {
        System.out.println("Вместит 30 пассажиров");
    }
}