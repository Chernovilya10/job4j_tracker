package ru.job4j.oop;

public class Fox {
    String name;

    public Fox(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("My name is " + this.name);
    }

    public void tryEat(Ball ball) {
        System.out.println("I ate " + ball.name);
    }
}
