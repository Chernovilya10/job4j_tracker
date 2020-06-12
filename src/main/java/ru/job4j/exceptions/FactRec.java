package ru.job4j.exceptions;

public class FactRec {

    public static int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int rst = calc(6);
        System.out.println(rst);
    }
}
