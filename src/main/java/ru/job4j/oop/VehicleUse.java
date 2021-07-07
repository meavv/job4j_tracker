package ru.job4j.oop;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle buss = new Buss();
        Vehicle plane = new Plane();

        Vehicle[] vehicles = new Vehicle[]{train, plane, buss};
        for (Vehicle v : vehicles) {
            v.move();
            v.countPassengers();
        }
    }
}
