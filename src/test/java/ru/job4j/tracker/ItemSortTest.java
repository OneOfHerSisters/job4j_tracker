package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemSortTest {
    @Test
    void whenSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "B"),
                new Item(2, "A"),
                new Item(3, "C")
        );

        List<Item> expected = Arrays.asList(
                new Item(2, "A"),
                new Item(1, "B"),
                new Item(3, "C")
        );

        Collections.sort(items, new ItemAscByName());

        assertThat(items).isEqualTo(expected);
    }

    @Test
    void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "B"),
                new Item(2, "A"),
                new Item(3, "C")
        );

        List<Item> expected = Arrays.asList(
                new Item(3, "C"),
                new Item(1, "B"),
                new Item(2, "A")
        );

        Collections.sort(items, new ItemDescByName());

        assertThat(items).isEqualTo(expected);
    }
}