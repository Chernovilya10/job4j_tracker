package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ilya", "Chernov", "556433", "Saint-Petersburg")
        );
        ArrayList<Person> persons = phones.find("ya");
        assertThat(persons.get(0).getSurname(), is("Chernov"));
    }
    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Cate", "Jonsons", "444542", "Moscow")
        );
        ArrayList<Person> persons = phones.find("444");
        assertThat(persons.get(0).getSurname(), is("Jonsons"));
    }
}