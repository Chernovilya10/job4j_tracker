package ru.job4j.oop.encapsulation;

public class Book {
    private String name;
    private int amountOfPages;

    public Book(String name, int amountOfPages) {
        this.name = name;
        this.amountOfPages = amountOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }
}
