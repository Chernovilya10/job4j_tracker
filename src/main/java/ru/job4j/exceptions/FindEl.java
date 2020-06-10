package ru.job4j.exceptions;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rst = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rst = i;
                break;
            }
        }
        if (rst == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rst;
    }

    public static void main(String[] args) {
        String[] s = {"1", "2", "3"};
        try {
            int index = FindEl.indexOf(s, "p");
            System.out.println("index = " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
