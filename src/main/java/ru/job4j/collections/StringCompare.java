package ru.job4j.collections;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
//        int size = first.length() >= second.length() ? first.length() : second.length();
        int rst = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);
            rst = Integer.compare(firstChar, secondChar);
            if (rst != 0) {
                break;
            }
        }
        if (rst == 0) {
            return Integer.compare(first.length(), second.length());
        }
        return rst;
    }
}