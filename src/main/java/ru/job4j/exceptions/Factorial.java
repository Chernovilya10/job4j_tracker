package ru.job4j.exceptions;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int res = f.calc(3);
        System.out.println("Factorial is: " + res);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter 'n' should be above zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
