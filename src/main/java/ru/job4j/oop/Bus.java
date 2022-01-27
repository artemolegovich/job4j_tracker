package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Rides on roads.");
    }

    @Override
    public void fuel() {
        System.out.println("Uses petrol as fuel.");
    }
}
