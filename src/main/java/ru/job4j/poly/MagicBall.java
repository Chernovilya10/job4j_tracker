package ru.job4j.poly;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner orakul = new Scanner(System.in);
        System.out.print("Я великий Оракул.");
        for (int i = 0; i >= 0; i++) {              //Циклируем, чтобы безсконечно задавал вопросы
            System.out.print("Что ты хочешь узнать?" + System.lineSeparator());
            String question = orakul.nextLine();
            int number = new Random().nextInt(3);
            if (number == 0) {
                System.out.println("Да");
            } else if (number == 1) {
                System.out.println("Нет");
            } else {
                System.out.println("Может быть");
            }
        }
    }
}
