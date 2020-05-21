package ru.job4j.oop.encapsulation;

public class ProductContains {
    public static void main(String[] args) {
        Product milk1 = new Product("Milk", 19);
        Product milk2 = new Product("Milk", 19);

        boolean eq = milk1.equals(milk2);
        System.out.println(eq);
    }
}
