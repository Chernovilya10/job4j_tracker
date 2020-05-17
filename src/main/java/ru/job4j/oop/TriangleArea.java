package ru.job4j.oop;

/**
 * Class TriangleArea - класс для расчета площади треугольника с задаными координатами вершин треугольника
 * @author Chernov Ilia
 */
public class TriangleArea {

    private Point a;
    private Point b;
    private Point c;

    /**
     * Constructor TriangleArea - исп-ся для инициализации полей класса TriangleArea
     * @param a - координаты точки a
     * @param b - координаты точки b
     * @param c - координаты точки c
     */
    public TriangleArea(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод для расчета полупериметра треугольника
     * @param ab - сторона тр-ка
     * @param ac - сторона тр-ка
     * @param bc - сторона тр-ка
     * @return - полупериметр
     */
    public double poluPerimetr(double ab, double ac, double bc) {
        double poluP = (ab + ac + bc) / 2;
        return poluP;
    }

    /**
     * Method area - для расчета площади треугольника по ф-ле Герона
     *
     * double ab = a.distance(b); - здесь вычисляем длину стороны треугольника по заданным координатам через метод distance класса Point
     *
     * @return - возвращает площадь треугольника
     */
    public double area() {
        double rst = -1;
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double p = poluPerimetr(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rst = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rst;
    }

    /**
     * Method exist - позволяет проверить существует треугольник с заданными сторонами или нет
     * Исп-ся модификатор public для проверки метода в тестах, чтобы не использовать getter и setter
     *
     * @param ab - сторона тр-ка
     * @param ac - сторона тр-ка
     * @param bc - сторона тр-ка
     * @return возвращает булево значение: может ли существовать треугольник с такими сторонами или нет
     */
    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ac + bc) > ab && (bc + ab) > ac;
    }

    /**
     * Method main - позволяет вывести в консоль значение площади треугольника с задаными координатами вершин
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(0, 1);
        TriangleArea triangleArea = new TriangleArea(a, b, c);
        double trArea = triangleArea.area();
        System.out.println("Triangle area is " + trArea);
    }
}
