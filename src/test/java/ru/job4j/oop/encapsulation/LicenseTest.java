package ru.job4j.oop.encapsulation;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void whenObjectsEqualsThenTrue() {
        License one = new License();
        Date oneDate = new Date(110, Calendar.OCTOBER, 1);
        one.setOwner("Chernov");
        one.setModel("Toyota");
        one.setCode("v666or");
        one.setCreated(oneDate);
        License two = new License();
        Date twoDate = new Date(110, Calendar.OCTOBER, 1);
        two.setOwner("Chernov");
        two.setModel("Toyota");
        two.setCode("v666or");
        two.setCreated(twoDate);
        assertThat(one, is(two));
    }
}