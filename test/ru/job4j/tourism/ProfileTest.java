package ru.job4j.tourism;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ProfileTest {

    @Test
    public void whenCollectCity() {
        List<Profile> profileList = new ArrayList<>(List.of(
                new Profile(new Address("Minsk", "Main", 17, 52)),
                new Profile(new Address("Chicago", "First", 44, 23)),
                new Profile(new Address("Krasnodar", "Lenina", 78, 89))));
        List<String> expected = new ArrayList<>(List.of("Minsk", "Chicago", "Krasnodar"));
        List<String> actual = Profile.collectCity(profileList);
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    public void whenCollectStreet() {
        List<Profile> profileList = new ArrayList<>(List.of(
                new Profile(new Address("Minsk", "Main", 17, 52)),
                new Profile(new Address("Chicago", "First", 44, 23)),
                new Profile(new Address("Krasnodar", "Lenina", 78, 89))));
        List<String> expected = new ArrayList<>(List.of("Main", "First", "Lenina"));
        List<String> actual = Profile.collectStreet(profileList);
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    public void whenCollectApartmnet() {
        List<Profile> profileList = new ArrayList<>(List.of(
                new Profile(new Address("Minsk", "Main", 17, 52)),
                new Profile(new Address("Chicago", "First", 44, 23)),
                new Profile(new Address("Krasnodar", "Lenina", 78, 89))));
        List<Integer> expected = new ArrayList<>(List.of(52, 23, 89));
        List<Integer> actual = Profile.collectApartmnet(profileList);
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    public void whenCollectHome() {
        List<Profile> profileList = new ArrayList<>(List.of(
                new Profile(new Address("Minsk", "Main", 17, 52)),
                new Profile(new Address("Chicago", "First", 44, 23)),
                new Profile(new Address("Krasnodar", "Lenina", 78, 89))));
        List<Integer> expected = new ArrayList<>(List.of(17, 44, 78));
        List<Integer> actual = Profile.collectHome(profileList);
        assertEquals(actual.toString(), expected.toString());
    }
}