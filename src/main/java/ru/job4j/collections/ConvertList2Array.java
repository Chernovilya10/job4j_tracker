package ru.job4j.collections;

import java.util.List;

public class ConvertList2Array {

    /**
     * метод разбивает коллекцию на думерный массив с заданным количеством элементов в группе
     * @param list - кооллекция из элементов
     * @param cells - количество элементов в группе
     * @return возвращает двумерный массив
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        System.out.println(groups);
        int[][] array = new int[groups][cells];
        int row = 0;
        int cell = 0;
            for (Integer num : list) {
                array[row][cell] = num;
                cell++;
                if (cell == cells) {
                    cell = 0;
                    row++;
                }
            }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
