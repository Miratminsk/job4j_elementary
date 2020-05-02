package ru.job4j.tourism;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public static List<String> collectCity(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress().getCity()).collect(Collectors.toList());
    }

    public static List<String> collectStreet(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress().getStreet()).collect(Collectors.toList());
    }

    public static List<Integer> collectApartmnet(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress().getApartment()).collect(Collectors.toList());
    }

    public static List<Integer> collectHome(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress().getHome()).collect(Collectors.toList());
    }
}
