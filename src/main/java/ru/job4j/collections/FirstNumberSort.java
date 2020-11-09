package ru.job4j.collections;

import java.util.Comparator;

public class FirstNumberSort implements Comparator<String> {
    /**
     * Метод по сортировке элементов по номеру, если в коллекцию/массив добавляется элемент заголовка в формате "номер. наименование"
     *
     * @param first  - первый элемент массива
     * @param second - второй-=-
     * @return
     */
    @Override
    public int compare(String first, String second) {
//        String firstStringNumber = "";
//        int firstNumber = 0;
//        for (int i = 0; i < first.length(); i++) {
//            char symbol = first.charAt(i);
//            if (symbol == '.') {
//                break;
//            }
//            firstStringNumber = firstStringNumber + symbol;
//            try {
//                firstNumber = Integer.parseInt(firstStringNumber);
//            } catch (Exception e) {
//                System.err.println("Указано неверное число, напиши в формате: " + "число.наименование");
//            }
//        }
//
//        String secondStringNumber = "";
//        int secondNumber = 0;
//        for (int i = 0; i < second.length(); i++) {
//            char symbol = second.charAt(i);
//            if (symbol == '.') {
//                break;
//            }
//            secondStringNumber = secondStringNumber + symbol;
//            try {
//                secondNumber = Integer.parseInt(secondStringNumber);
//            } catch (Exception e) {
//                System.err.println("Указано неверное число, напиши в формате: " + "число.наименование");
//            }
//        }
//        return Integer.compare(firstNumber, secondNumber);
//    }

        String[] firstArray = first.split("\\.");
        String[] secondArray = second.split("\\.");
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; i < Math.min(firstArray.length, secondArray.length); i++) {
            firstNumber = Integer.parseInt(firstArray[i]);
            secondNumber = Integer.parseInt(secondArray[i]);
            if (firstNumber != secondNumber) {
                break;
            }
        }
            return Integer.compare(firstNumber, secondNumber);
    }
}