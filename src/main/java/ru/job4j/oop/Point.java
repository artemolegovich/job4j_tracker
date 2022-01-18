package ru.job4j.oop;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(6, 4);
        Point b = new Point(2, 2);
        System.out.println(a.distance(b));
    }
}
