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
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenDeleteDuplicated() {
        List<Account> accounts = Arrays.asList(
                new Account("567", "Ivan Petrov", "y200de87"),
                new Account("187", "Sergey Komarov", "82ga4514"),
                new Account("567", "Ivan Petrov", "12003456"),
                new Account("187", "Sergey Komarov", "12005638")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("567", "Ivan Petrov", "y200de87"),
                        new Account("187", "Sergey Komarov", "82ga4514")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
