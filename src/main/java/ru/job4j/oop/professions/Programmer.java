package ru.job4j.oop.professions;

public class Programmer extends Engineer {
    private String programmingLanguage;

    /**
     * Method codeDevelopment - позволяет программисту разрабатывать код
     * @return - возвращает отчет о выполнении
     */
    public String codeDevelopment() {
        return "Отчет о выполнении";
    }
}