package ru.job4j.collections.ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {

    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rst = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rst.add(cell);
            }
        }
        return rst;
    }
}