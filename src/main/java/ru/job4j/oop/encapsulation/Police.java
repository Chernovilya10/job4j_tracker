package ru.job4j.oop.encapsulation;

import java.util.Calendar;
import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Ilia Chernov");
        license.setModel("Toyota");
        license.setCode("в587ао178");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 119);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        Date dataCreated = cal.getTime();
        license.setCreated(dataCreated);

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : "
                + license.getCode() + " ; " + " Date of creation : " + license.getCreated());
    }
}