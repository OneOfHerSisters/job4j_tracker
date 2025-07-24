package ru.job4j.record;

import java.util.Objects;

public record PersonRecord(String name, int age) {
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
