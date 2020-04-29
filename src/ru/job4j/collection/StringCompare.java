package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result;
        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            if (result != 0) {
                return result;
            } else if (index == size - 1) {
                return Integer.compare(left.length(), right.length());
            }
        }
        return 0;
    }
}
