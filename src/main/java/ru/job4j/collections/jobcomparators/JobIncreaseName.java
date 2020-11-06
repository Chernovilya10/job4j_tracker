package ru.job4j.collections.jobcomparators;

import ru.job4j.collections.Job;

import java.util.Comparator;

public class JobIncreaseName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
