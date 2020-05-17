package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        boolean max = first > second;
        int result = max ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int rst = max(first, second);
        if (rst < third) {
            rst = third;
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
