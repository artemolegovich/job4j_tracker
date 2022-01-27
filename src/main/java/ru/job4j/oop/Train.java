package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Rides on railroads.");
    }

    @Override
    public void fuel() {
        System.out.println("Uses coal as fuel.");
    }
}
