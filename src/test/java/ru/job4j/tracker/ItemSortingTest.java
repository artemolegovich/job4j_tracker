package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemSortingTest {
    @Test
    public void whenSortAscending() {
        List<Item> items = Arrays.asList(
                new Item(1, "Ivanov"),
                new Item(2, "Petrov"),
                new Item(3, "Ershov"),
                new Item(4, "Aleksandrov")
        );
        List<Item> expected = Arrays.asList(
                new Item(4, "Aleksandrov"),
                new Item(3, "Ershov"),
                new Item(1, "Ivanov"),
                new Item(2, "Petrov")
        );
        Collections.sort(items, new ItemAscByName());
        assertEquals(expected, items);
    }

    @Test
    public void whenSortDescending() {
        List<Item> items = Arrays.asList(
                new Item(1, "Ivanov"),
                new Item(2, "Petrov"),
                new Item(3, "Ershov"),
                new Item(4, "Aleksandrov")
        );
        List<Item> expected = Arrays.asList(
                new Item(2, "Petrov"),
                new Item(1, "Ivanov"),
                new Item(3, "Ershov"),
                new Item(4, "Aleksandrov")
        );
        Collections.sort(items, new ItemDescByName());
        assertEquals(expected, items);
    }
}
