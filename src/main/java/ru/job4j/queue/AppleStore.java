package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        int available = count;
        String lastHappy = "";
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Customer customer = queue.poll();
            if (available > 0) {
                    available--;
                    lastHappy = customer.name();
                } else {
                    break;
                }
            }
        return lastHappy;
        }

    public String getFirstUpsetCustomer() {
        int available = count;
        String firstUpset = "";
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Customer customer = queue.poll();
            if (available > 0) {
                available--;
            } else {
                firstUpset = customer.name();
                break;
            }
        }
        return firstUpset;
    }
}