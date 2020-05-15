package ru.job4j.oop;

public class Battery {
    private int loan;

    public Battery(int value) {
        this.loan = value;
    }

    public void exchange(Battery another) {
        this.loan = this.loan - 20;             //списываем у объекта, вызвавшего метод 20% заряда
        another.loan = another.loan + 20;       //прибавляем, объекту который передали в метод 20%
    }

    public static void main(String[] args) {
        Battery samsung = new Battery(80);
        Battery apple = new Battery(30);
        System.out.println("Status of the battery " + " samsung: " + samsung.loan + " apple: " + apple.loan);
        samsung.exchange(apple);
        System.out.println("Status of the battery " + " samsung: " + samsung.loan + " apple: " + apple.loan);
    }
}
