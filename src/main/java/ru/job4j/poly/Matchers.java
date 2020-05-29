package ru.job4j.poly;

import java.util.Scanner;

public class Matchers {
    /**
     * Method main - метод описывает формат игры 11, Смысл игры в следующем:
     * На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.
     * Алгоритм программы следующий: выигрывает тот игрок, перед которым осталось 3 или менее спичек, игра вылетает если
     * убрали спичек больше 3 и меньше 1
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's start the game!" + System.lineSeparator());
        int firstPlayer = 0;
        int secondPlayer = 0;
        int count = 11;
        while (count > 0) {
            System.out.println("First player, Please, take 1, 2 or 3 matchers");
            System.lineSeparator();
            firstPlayer = Integer.valueOf(input.nextLine());
            if ((firstPlayer <= 3) && (firstPlayer >= 1)) {
                System.out.println("First player took " + firstPlayer + " matcher(s)");
            } else {
                System.err.println("Incorrect number. Please, take 1, 2 or 3 matchers");
                break;
            }
            System.lineSeparator();
            count = count - firstPlayer;        //после выбора 1ого игрока
            System.out.println("Balance of the matchers: " + count);
            if (count <= 3) {
                System.out.println("Congratulation, Second player win");    //Выигрывает 2ой игрок, т.к. перед ним осталось 3 и менее спичек после выбора 1ого игрока
                break;
            }
            System.lineSeparator();

            System.out.println("Second player, Please, take 1, 2 or 3 matchers");
            secondPlayer = Integer.valueOf(input.nextLine());
            if ((secondPlayer <= 3) && (secondPlayer >= 1)) {
                System.out.println("Second player took " + secondPlayer + " matcher(s)");
            } else {
                System.err.println("Incorrect number. Please, take 1, 2 or 3 matchers");
                break;
            }
            System.lineSeparator();
            count = count - secondPlayer;       //после выбора 2ого игрока
            System.out.println("Balance of the matchers: " + count);
            if (count <= 3) {
                System.out.println("Congratulation, First player win");      //Выигрывает 1ый игрок, т.к. перед ним осталось 3 и менее спичек после выбора 2ого игрока
                break;
            }
        }
    }
}
