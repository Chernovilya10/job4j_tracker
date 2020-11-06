package ru.job4j.collections;

import org.junit.Test;
import ru.job4j.collections.jobcomparators.JobDecreaseName;
import ru.job4j.collections.jobcomparators.JobDecreasePriority;
import ru.job4j.collections.jobcomparators.JobIncreaseName;
import ru.job4j.collections.jobcomparators.JobIncreasePriority;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenComparatorIncrByName() {
        Comparator<Job> cmpIncrByName = new JobIncreaseName();
        int rsl = cmpIncrByName.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDecrByName() {
        Comparator<Job> cmpDecrByName = new JobDecreaseName();
        int rsl = cmpDecrByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorIncrByPriority() {
        Comparator<Job> cmpIncrPriority = new JobIncreasePriority();
        int rsl = cmpIncrPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDecrByPriority() {
        Comparator<Job> cmpDecrPriority = new JobDecreasePriority();
        int rsl = cmpDecrPriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDecrByNameByPriority() {
        Comparator<Job> cmpDecrNamePriority = new JobDecreaseName().thenComparing(new JobDecreasePriority());
        int rsl = cmpDecrNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorIncrByPriorityByName() {
        Comparator<Job> cmpIncrByPriorityByName = new JobIncreasePriority().thenComparing(new JobIncreaseName());
        int rsl = cmpIncrByPriorityByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}