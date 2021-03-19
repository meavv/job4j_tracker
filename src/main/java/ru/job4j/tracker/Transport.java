package ru.job4j.tracker;

public interface Transport {
    void passenger(int pass);
    void ride();
    double refuel(double fuel);
}