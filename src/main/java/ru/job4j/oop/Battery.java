package ru.job4j.oop;

public class Battery {
    private int loan;

    public Battery(int value) {
        this.loan = value;
    }

    public void exchange(Battery another) {
        another.loan = another.loan + this.loan;       //прибавляем, объекту который передали
        this.loan = 0;                                 //списываем у объекта, вызвавшего метод
    }

    public static void main(String[] args) {
        Battery samsung = new Battery(30);
        Battery apple = new Battery(60);
        System.out.println("Status of the battery " + " samsung: " + samsung.loan + " apple: " + apple.loan);
        samsung.exchange(apple);
        System.out.println("Status of the battery " + " samsung: " + samsung.loan + " apple: " + apple.loan);
    }
}
