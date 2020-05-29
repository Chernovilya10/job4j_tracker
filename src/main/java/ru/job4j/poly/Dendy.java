package ru.job4j.poly;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Games:");
            System.out.println("1. Tanks");
            System.out.println("2. Super Mario");
            System.out.println("3. Exit");
            System.out.println("Choose the number to start the game.");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                System.out.println("Game over.");
                run = false;
            } else if (select == 1) {
                System.out.println("Tanks loading...");
            } else if (select == 2) {
                System.out.println("Super Mario loading...");
            } else {
                System.out.println("This game is not available");
            }
            System.lineSeparator();
        }
    }
}
