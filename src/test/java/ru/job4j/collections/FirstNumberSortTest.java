package ru.job4j.collections;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FirstNumberSortTest {

    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "135. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "135. Task."
        };
        Arrays.sort(input, new FirstNumberSort());
        assertThat(input, is(out));
    }
}