package ru.job4j.exceptions;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        if (data[index] == null) {
            throw new NullPointerException("Element of the array not initialized");
        }
            return data[index];
    }

    public static void main(String[] args) {
//        String[] data = {"one", "two", "three"};
        String[] data = new String[3];
        String rsl = Find.get(data, 2);
        System.out.println(rsl);
    }

}
