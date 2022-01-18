package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperations(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.minus(10));
        Calculator calc = new Calculator();
        System.out.println(calc.divide(10));
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperations(10));
    }
}
