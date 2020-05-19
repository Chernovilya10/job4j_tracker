package ru.job4j.oop.professions;


public class Doctor extends Profession {
    private int numberOfPolyclinic;
    private double experience;
    private String schedule;        //график работы

    /**
     * Method diagnostic - поволяет проводить осмотр пациента
     * @param pacient - передаем пациента на осмотр
     * @return возвращает строку с состоянием больного
     */
    public String diagnostic(Pacient pacient) {
        return "Болен или не болен";
    }
    /**
     * Method treat - поволяет вернуть значение вылечили пациента или нет
     * @return true - вылечил, false - не вылечил
     */
    public boolean treat() {
        return true;
    }
}