package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void max1To2() {
        int expected = 2;
        int first = 1;
        int second = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max1To2To3() {
        int expected = 3;
        int first = 1;
        int second = 2;
        int third = 3;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max1To2To3To4() {
        int expected = 4;
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }
}