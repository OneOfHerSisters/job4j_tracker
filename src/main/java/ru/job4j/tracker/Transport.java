package ru.job4j.tracker;

public interface Transport {
    void move();

    void passengers(int count);

    int refuel(int fuel);
}
