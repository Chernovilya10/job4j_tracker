package ru.job4j.collections.set;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc"),
                new Task("1", "First desc"),
                new Task("3", "Third desc")
                );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}