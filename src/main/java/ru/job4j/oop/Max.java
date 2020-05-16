package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean max = left > right;
        int result = max ? left : right;
        return result;
    }

    public int max(int first, int second, int third) {
        int rst = third;
        if (first > second && first > third) {
            rst = first;
        } else if (second > third && second > first) {
            rst = second;
        }
        return rst;
    }

    public int max(int first, int second, int third, int forth) {
        int rst = max(first, second, third);
        if (rst < forth) {
            rst = forth;
        }
        return rst;
    }
}
