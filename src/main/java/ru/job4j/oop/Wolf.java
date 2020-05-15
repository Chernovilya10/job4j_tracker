package ru.job4j.oop;

public class Wolf {
    String name;

    public Wolf(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("My name is " + this.name);
    }

    public void tryEat(Ball ball) {
        System.out.println("I couldn't eat " + ball.name);
    }
}
