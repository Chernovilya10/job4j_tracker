package ru.job4j.oop.professions;

public class Engineer extends Profession {
    private String placeOfJob;
    private int specialization;
    private double experience;
    private String schedule;        //график работы

    /**
     * Method gettingTask - позволяет проверить получил ли инженер задание
     * @param task - передаем задачу
     * @return воздавщаем получил или нет задачу
     */
    public boolean gettingTask(Task task) {
        return true;
    }

    /**
     * Method execution - позволяет проверить выполнил ли инженер задание
     * @param task - передаем задачу для выполнения
     * @return воздавщаем выполнена задача или нет
     */
    public boolean execution(Task task) {
        return true;
    }
}
