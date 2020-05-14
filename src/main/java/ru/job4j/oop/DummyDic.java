package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dd = new DummyDic();
        String e = dd.engToRus("Психоаналитика.");
        System.out.println(e);
    }
}
