package ru.job4j.collections;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 4));
        queue.put(new Task("urgent", 6));
        queue.put(new Task("middle", 2));
        Task result = queue.take();
        assertThat(result.getDesk(), is("middle"));
    }
}