package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Mirat", "Rakhmanov", "12345", "Chicago"));
        phones.add(new Person("Alex", "Zenkevich", "54321", "Minsk"));
        phones.add(new Person("Gleb", "Morozov", "15243", "Moscow"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Mirat", "Rakhmanov", "12345", "Chicago"));
        phones.add(new Person("Alex", "Zenkevich", "54321", "Minsk"));
        phones.add(new Person("Gleb", "Morozov", "15243", "Moscow"));
        ArrayList<Person> persons = phones.find("Rakhmanov");
        assertThat(persons.get(0).getName(), is("Mirat"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Mirat", "Rakhmanov", "12345", "Chicago"));
        phones.add(new Person("Alex", "Zenkevich", "54321", "Minsk"));
        phones.add(new Person("Gleb", "Morozov", "15243", "Moscow"));
        ArrayList<Person> persons = phones.find("54321");
        assertThat(persons.get(0).getAddress(), is("Minsk"));
    }

    @Test
    public void whenFindByAdress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Mirat", "Rakhmanov", "12345", "Chicago"));
        phones.add(new Person("Alex", "Zenkevich", "54321", "Minsk"));
        phones.add(new Person("Gleb", "Morozov", "15243", "Moscow"));
        ArrayList<Person> persons = phones.find("Moscow");
        assertThat(persons.get(0).getPhone(), is("15243"));
    }
}