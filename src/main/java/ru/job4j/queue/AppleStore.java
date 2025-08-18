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
        String lastHappy = "";
        for (int i = 0; i < count && !queue.isEmpty(); i++) {
            lastHappy = queue.poll().name();
        }
        return lastHappy;
        }

    public String getFirstUpsetCustomer() {
        for (int i = 0; i < count && !queue.isEmpty(); i++) {
            queue.poll().name();
        }
        return queue.poll().name();
    }
}