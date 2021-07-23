package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sent1() {
        List<Account> accounts = List.of(
                new Account("1", "Qwe", "eDer3432f"),
                new Account("2", "Ewq", "000001"),
                new Account("2", "Qwe", "3453453")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("1", "Qwe", "eDer3432f"),
                        new Account("2", "Ewq", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sent2() {
        List<Account> accounts = List.of(
                new Account("555", "Petr Arsentev", "eDer3432f"),
                new Account("555", "Qwewe", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("555", "Petr Arsentev", "eDer3432f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}