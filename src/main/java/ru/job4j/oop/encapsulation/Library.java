package ru.job4j.oop.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book pushkin = new Book("Evgeni Onegin", 340);
        Book martin = new Book("Clean code", 500);
        Book tolstoi = new Book("War and Peace", 1200);
        Book sierra = new Book("Head first Java", 800);

        Book[] books = new Book[4];

        books[0] = pushkin;
        books[1] = martin;
        books[2] = tolstoi;
        books[3] = sierra;

        for (Book bk : books) {
            System.out.println(bk.getName() + ". Amount of pages - " + bk.getAmountOfPages());
        }

        System.out.println(System.lineSeparator() + "Change the first book with the last.");
        Book i = books[0];
        books[0] = books[3];
        books[3] = i;
        for (Book bk : books) {
            System.out.println(bk.getName() + ". Amount of pages - " + bk.getAmountOfPages());
        }

        System.out.println(System.lineSeparator() + "Show only 'Clean code'");
        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + ". Amount of pages - " + bk.getAmountOfPages());
            }
        }
    }
}