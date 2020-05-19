package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    private String specializationOfSurgery;

    /**
     *Method operation - поволяет проводить хирургические операции
     *@param pacient - передаем пациента на опрецию
     *@return возвращает успешная опреация или нет
     */
    public boolean operation(Pacient pacient) {
        return true;
    }
}
