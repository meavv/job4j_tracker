package ru.job4j.oop;

public class Battery {
    private int load;

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

}
