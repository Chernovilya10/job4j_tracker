package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (p.getName().contains(key)
                    || p.getSurname().contains(key)
                    || p.getPhone().contains(key)
                    || p.getAddress().contains(key)) {
                result.add(p);
            }
        }
        return result;
    }
}