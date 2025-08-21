package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> info = new HashMap<>();
        info.put("test@gmail.com", "Jan Kowalski");
        info.put("test@gmail.com", "Jerzy Trzaskowski");
        info.put("test2@gmail.com", "Jan Kowalski");
        info.put("test3@gmail.com", "Magda Boczar");
        info.put("test3@gmail.com", "Jan Pawel 2");
        for (String key : info.keySet()) {
            System.out.println(key + ": " + info.get(key));
        }

        for (Map.Entry<String, String> entry : info.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
