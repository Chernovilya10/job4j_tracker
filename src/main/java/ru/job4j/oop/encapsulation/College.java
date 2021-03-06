package ru.job4j.oop.encapsulation;

import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Chenov Ilia Yurievich");
        student.setGroupNumber("IZ-10-1");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 110);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date startDate = cal.getTime();
        student.setStartDate(startDate);

        System.out.println("Name of the student : " + student.getFio()
                + System.lineSeparator() + "Number of the group : " + student.getGroupNumber()
                + System.lineSeparator() + "Start date : " + student.getStartDate());
    }
}
