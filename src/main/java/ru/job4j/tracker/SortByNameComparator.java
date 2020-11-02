package ru.job4j.tracker;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item firstName, Item secondName) {
        return firstName.getName().compareTo(secondName.getName());
    }
}