package ru.job4j.collections.set;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void whenAllUniqueAcc() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        Set<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenOneUniqueAcc() {
        List<Account> accounts = Arrays.asList(
                new Account("142", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001"),
                new Account("142", "Svetoslav Eshenko", "000013"),
                new Account("142", "Svetoslav Eshenko", "323rggt")

        );
        Set<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("142", "Petr Arsentev", "eDer3432f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}