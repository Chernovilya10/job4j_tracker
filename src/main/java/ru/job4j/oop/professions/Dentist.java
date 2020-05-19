package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    private String specializationOfDentist;

    /**
     *Method dentistry - поволяет проводить лечение зубов
     *@param pacient - передаем пациента на лечение зубов
     *@return возвращает успешное лечение или нет
     */
    public boolean dentistry(Pacient pacient) {
        return true;
    }
}
