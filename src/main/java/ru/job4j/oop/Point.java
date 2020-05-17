package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * Method distance - рассчитывает расстояние между двумя точками
     * @param that - ссылка на передаваемый объект класса Point
     * @return - возвращает расстояние м/д точками
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Method distance3d - рассчитывает расстояние между двумя точками в пространстве
     * @param that - ссылка на передаваемый объект класса Point
     * @return - возвращает расстояние м/д точками в пространстве
     */
    public double distance3d(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2) + pow((this.z - that.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
        Point c = new Point(0, 0, 0);
        Point d = new Point(1, 1, 1);
        double dist3d = c.distance3d(d);
        System.out.println(dist3d);
    }
}
