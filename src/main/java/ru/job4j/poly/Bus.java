package ru.job4j.poly;

public class Bus implements Transport {
    private int priceOfAI92 = 45;

    @Override
    public void ride() {
        System.out.println("Bus can ride with maximum speed = 80 km/h");
    }

    @Override
    public void passengers(int amountOfPassengers) {
        int over50 = 30;
        int over3under50 = amountOfPassengers - over50;
    }

    @Override
    public int fuel(int amountOfFuel) {
        return amountOfFuel * priceOfAI92;
    }
}
