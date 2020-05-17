package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceIs3() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 0);
        double rst = a.distance(b);
        double expect = 3;
        assertThat(rst, is(expect));
    }

    @Test
    public void whenDistance3dIs5() {
        Point c = new Point(3, 0, 0);
        Point d = new Point(0, 4, 0);
        double rst = c.distance3d(d);
        double expect = 5;
        assertThat(rst, is(expect));
    }
}