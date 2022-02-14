package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenPassportContained() {
        Citizen one = new Citizen("67882", "Sergey Vasiliev");
        Citizen two = new Citizen("67882", "Ivan Petrov");
        PassportOffice office = new PassportOffice();
        office.add(one);
        assertFalse(office.add(two));
    }
}
