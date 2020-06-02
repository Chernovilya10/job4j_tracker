package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                        .add(" _________")
                        .add("|         |")
                        .add("|         |")
                        .add("|         |")
                        .add("|_________|")
                        .toString()
                )
        );
    }
}