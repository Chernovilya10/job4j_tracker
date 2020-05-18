package ru.job4j.oop;

public class Animal {
    public String name;     //Исп-ся мод-р public чтобы можно было вывести имя тигра без исп-я сеттеров и геттеров
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

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();               //Исп-ем конструктор без параметров
//        Tiger tiger = new Tiger("Big Cat"); //Дали имя тигру через конструктор с параметром типа String
//        System.out.println("Name of the tiger is " + tiger.name);
        Tiger tiger2 = new Tiger("Big Cat");            //Исп-ем конструктор с параметром типа String
    }
}
