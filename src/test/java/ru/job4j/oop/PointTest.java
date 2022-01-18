package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22To64Then4dot47() {
        double expected = 4.47;
        Point a = new Point(2, 2);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22To22Then0() {
        double expected = 0;
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when122To344Then3Dot46() {
        double expected = 3.46;
        Point a = new Point(1, 2, 2);
        Point b = new Point(3, 4, 4);
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}