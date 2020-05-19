package ru.job4j.oop.professions;

public class Builder extends Engineer {
    private String specialization;      //проектирование или стройка

    /**
     * Method projection - позволяет вернуть наименование разработанного проекта
     * @return - возвращает какой раздел проекта выполняется
     */
    public String projection(Project project) {
        return "Раздел проекта";
    }
    /**
     * Method codeDevelopment - позволяет программисту разрабатывать код
     * @return - возвращает какое сооружение строится
     */
    public String building(Construction construction) {
        return "Какое сооружение строится";
    }

}
