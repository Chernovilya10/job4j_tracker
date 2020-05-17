package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void firstMethodMax() {
        int first = 1;
        int second = 2;
        int rst = Max.max(first, second);
        int expect = 2;
        assertThat(rst, is(expect));
    }

    @Test
    public void secondMethodMax() {
        Max m = new Max();
        int first = 4;
        int second = 2;
        int third = 1;
        int rst = m.max(first, second, third);
        int expect = 4;
        assertThat(rst, is(expect));
    }

    @Test
    public void thirdMethodMax1() {
        Max m = new Max();
        int first = 4;
        int second = 6;
        int third = 3;
        int forth = 7;
        int rst = m.max(first, second, third, forth);
        int expect = 7;
        assertThat(rst, is(expect));
    }
    @Test
    public void thirdMethodMax2() {
        Max m = new Max();
        int first = 1;
        int second = 1;
        int third = 1;
        int forth = 2;
        int rst = m.max(first, second, third, forth);
        int expect = 2;
        assertThat(rst, is(expect));
    }
}