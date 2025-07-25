package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[size];
        int newSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl[newSize] = item;
                newSize++;
            }
        }
        return Arrays.copyOf(rsl, newSize);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items[index] = null;
            int length = size - index - 1;
            System.arraycopy(items, index + 1, items, index, length);
            items[size - 1] = null;
            size--;
        }
    }
}