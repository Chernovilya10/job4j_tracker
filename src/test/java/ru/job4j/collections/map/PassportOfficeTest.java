package ru.job4j.collections.map;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addNo() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen1 = new Citizen("2f44a", "Ivan");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen1);
        boolean compareName = office.get(citizen1.getPassport()).getUsername().equals(citizen1.getUsername());
        assertThat(compareName, is(false));
    }
}