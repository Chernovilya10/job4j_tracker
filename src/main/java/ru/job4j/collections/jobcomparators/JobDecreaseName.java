package ru.job4j.collections.jobcomparators;

import ru.job4j.collections.Job;

import java.util.Comparator;

public class JobDecreaseName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
