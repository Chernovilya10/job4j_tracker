package ru.job4j.oop;

public class Animal {
    /**
     * public Animal() - конструктор класса Animal без параметров
     * Родительским классом является класс Object
     * от Класса Animal наследуются класс Predator, а от него класс Tiger
     * При создании объект типа Tiger с именем переменной tiger в первую очередь происходит вызов конструкторов
     * родительских классов, сначала конструктора Animal и Predator, а затем конструктора класса Tiger
     */
    public Animal() {
        super();
        System.out.println("Animal");
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
