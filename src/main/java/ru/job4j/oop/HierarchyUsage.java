package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();        // создаем объекта класса Car.
        Transport tp = car;         // делаем приведение к типу родителя Transport.
        Object obj = car;           // делаем приведение к типу родителя Object.
        Object ocar = new Car();    // Приведение типа при создании объекта.
        Car carFromObject = (Car) ocar;     // Приведение типа за счет повышение по иерархии.

        // Ошибка в приведении типа.
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle;     // код завершится с ошибок приведения типов ClassCastException

        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
