package ru.job4j.poly;

/**
 * Данный интерфейс определяет любой вид транспорта
 */
public interface Transport {
    void ride();

    /**
     *
     * @param amountOfPassengers - принимает количество пассажиров
     */
    void passengers(int amountOfPassengers);

    /**
     *
     * @param amountOfFuel - принимает количество топлива
     * @return - возвращат цену
     */
    int fuel(int amountOfFuel);
}
