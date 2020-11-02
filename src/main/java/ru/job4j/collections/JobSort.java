package ru.job4j.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSort {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs); //Сортировка по возростанию по полю priority
        System.out.println(jobs);
        Collections.sort(jobs, new SortJobByName());    //Сортировка по имени с использованием интерфейса Comparator + compareTo, чтобы сделать сортироваку по убыванию необходимо вторым элементом метода sort использовать Collections.reverseOrder(Comparator)
        System.out.println(jobs);
    }
}
