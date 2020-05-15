package ru.job4j.oop;

public class Ball {
    String name;

    public Ball(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("My name is " + this.name);
    }

    public void rolling() {
        System.out.println("Rolling...");
    }

    public void song() {
        System.out.println("Song: I believe I can roll...");
    }
}
