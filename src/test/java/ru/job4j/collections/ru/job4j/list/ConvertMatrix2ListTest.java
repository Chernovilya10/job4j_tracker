package ru.job4j.collections.ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertMatrix2ListTest {

    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List arrayThenList = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        arrayThenList.toList(input);
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> rsl = arrayThenList.toList(input);
        assertThat(rsl, is(expect));
    }
}