package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean run) {
        String result = run ? "Ball was eaten." : "Ball ran away.";
        System.out.println(result);
    }
}
