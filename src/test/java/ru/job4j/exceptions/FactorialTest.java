package ru.job4j.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test (expected = IllegalArgumentException.class)       //для проверки того, что прг прерывается исключением необходимо в аннотацию добавить ожидаемое исключение
    public void whenArgumentBelowZero() {
        Factorial f = new Factorial();
        f.calc(-1);
    }
}