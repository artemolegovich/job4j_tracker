package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> nameSearch = k -> k.getName().contains(key);
        Predicate<Person> surnameSearch = k -> k.getSurname().contains(key);
        Predicate<Person> phoneSearch = k -> k.getPhone().contains(key);
        Predicate<Person> addressSearch = k -> k.getAddress().contains(key);
        Predicate<Person> combine
                = nameSearch.or(surnameSearch.or(phoneSearch.or(addressSearch)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
