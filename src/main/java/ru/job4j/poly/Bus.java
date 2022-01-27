package ru.job4j.poly;

public class Bus implements Transport {
    public Bus() {
    }

    @Override
    public void drive() {
        System.out.println("Может ехать.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Возможное количество пассажиров: " + count);
    }

    @Override
    public double fill(double litres) {
        return litres * 48.5;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println("Описание автобуса:");
        bus.drive();
        bus.passengers(30);
        System.out.println("Стоимость заправки: " + bus.fill(70) + " рублей.");
    }
}
