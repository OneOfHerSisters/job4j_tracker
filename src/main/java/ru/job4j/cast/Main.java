package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train = new Train();
        Vehicle train2 = new Train();
        Vehicle train3 = new Train();
        Vehicle plane = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle[] vehicles = {bus, bus2, train, train2, train3, plane, plane2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
