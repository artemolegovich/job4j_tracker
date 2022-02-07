package ru.job4j.oop;

public class Airport {
    public static void main(String[] args) {
        final Airbus a320 = new Airbus("A320");
        System.out.println(a320);
        a320.printModel();
        a320.printCountEngine();

        Airbus a380 = new Airbus("A380");
        System.out.println(a380);
        a380.printModel();
        a380.printCountEngine();
    }
}
