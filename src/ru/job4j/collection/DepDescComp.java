package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        String[] one = first.split("/");
        String[] two = second.split("/");
        int result = two[0].compareTo(one[0]);
        if (result != 0) {
            return result;
        } else if (one.length > 1 && two.length > 1) {
            result = one[1].compareTo(two[1]);
            if (result != 0) {
                return result;
            } else if (one.length > 2 && two.length > 2) {
                result = one[2].compareTo(two[2]);
            }
        }
        return result;
    }
}

