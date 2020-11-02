package ru.job4j.collections;

import java.util.Comparator;

public class SortJobByName implements Comparator<Job> {
    /**
     *
     * @param first первый элемент коллекции
     * @param second второй элемент
     * @return число типа int меньше 0, 0 или больше 0
     */
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
