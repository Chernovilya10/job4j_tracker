package ru.job4j.collections.jobcomparators;

import ru.job4j.collections.Job;

import java.util.Comparator;

public class JobIncreasePriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
