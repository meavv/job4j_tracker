package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void passenger(int pass) {
        int passInBus = pass;
    }

    @Override
    public void ride() {
        boolean ride = true;
    }

    @Override
    public double refuel(double fuel) {
        double price = fuel * 10;
        return price;
    }
}
