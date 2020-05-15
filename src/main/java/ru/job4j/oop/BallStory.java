package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball("Kolobok");
        Hare hare = new Hare("Kosoy");
        Wolf wolf = new Wolf("Gray");
        Fox fox = new Fox("Orange");
        ball.name();
        ball.rolling();
        hare.name();
        ball.song();
        hare.tryEat(ball);
        ball.rolling();
        wolf.name();
        ball.song();
        wolf.tryEat(ball);
        ball.rolling();
        fox.name();
        ball.song();
        fox.tryEat(ball);
    }
}
