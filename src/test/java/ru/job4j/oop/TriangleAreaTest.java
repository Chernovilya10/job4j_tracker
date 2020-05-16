package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class TriangleAreaTest {

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(0, 1);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        TriangleArea triangleArea = new TriangleArea(a, b, c);
        boolean rst = triangleArea.exist(ab, ac, bc);
        assertThat(rst, is(true));
    }
    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(2, 0);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        TriangleArea triangleArea = new TriangleArea(a, b, c);
        boolean rst = triangleArea.exist(ab, ac, bc);
        assertThat(rst, is(false));
    }
    @Test
    public void whenTrArea049() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(0, 1);
        TriangleArea triangleArea = new TriangleArea(a, b, c);
        double rst = (float) triangleArea.area();       //приводим в float для получения менее точного числа
        double expect = 0.5;
        assertThat(rst, is(expect));
    }
}