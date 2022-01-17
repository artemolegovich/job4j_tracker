package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        System.out.println("When ball met Hare.");
        hare.tryEat(ball);
        System.out.println("When ball met wolf.");
        wolf.tryEat(ball);
        System.out.println("When ball met fox.");
        fox.tryEat(ball);
    }
}
