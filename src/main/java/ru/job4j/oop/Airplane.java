package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Flies in the sky.");
    }

    @Override
    public void fuel() {
        System.out.println("Uses kerosene as fuel.");
    }
}
