package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Passengers...");
    }

    @Override
    public int refuel(int fuel) {
            return fuel;
    }
}
