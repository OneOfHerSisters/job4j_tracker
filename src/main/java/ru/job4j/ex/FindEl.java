package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
           if (value[i].equals(key)) {
               result = i;
               break;
           }
        }
        if (result == -1) {
           throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (value.contains(abuse)) {
                throw new ElementAbuseException("Detected abuse word: " + abuse);
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            String[] names = {"Polina", "Sasha", "Olya", "Stas"};
            indexOf(names, "Jerzy");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}