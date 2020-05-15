package ru.job4j.oop;

public class Hare {
    String name;

    public Hare(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("My name is " + this.name);
    }

    public void tryEat(Ball ball) {
        System.out.println("I couldn't eat " + ball.name);
    }
}
