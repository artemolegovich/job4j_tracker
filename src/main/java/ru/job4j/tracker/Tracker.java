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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        int length = size - index - 1;
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, length);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String name) {
        Item[] rsl =  new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (name.equals(items[i].getName())) {
                rsl[count++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
}
