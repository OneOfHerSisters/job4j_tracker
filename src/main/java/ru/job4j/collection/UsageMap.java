package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> info = new HashMap<>();
        info.put("test@gmail.com", "Jan Kowalski");
        for (String key : info.keySet()) {
            System.out.println(key + ": " + info.get(key));
        }

        for (Map.Entry<String, String> entry : info.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
