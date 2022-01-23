package ru.job4j.tracker;

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

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String name) {
        Item[] rsl =  new Item[items.length];
        int size = 0;
        for (Item element : items) {
            if (element != null && name.equals(element.getName())) {
                rsl[size++] = element;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int size = 0;
        for (Item element : items) {
            if (element != null) {
                result[size++] = element;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
