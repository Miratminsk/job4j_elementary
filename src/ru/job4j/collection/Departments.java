package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        List<String> k = new ArrayList<>();
        List<String> sk = new ArrayList<>();
        List<String> ssk = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String value : deps) {
            tmp.addAll(Arrays.asList(value.split("/")));
        }
        for (String department : tmp) {
            if (department.length() == 2) {
                k.add(department);
            } else if (department.length() == 3) {
                sk.add(department);
            } else if (department.length() == 4) {
                ssk.add(department);
            }
        }
        for (String high : k) {
            result.add(high);
            for (String medium : sk) {
                result.add(high + "/" + medium);
                for (String low : ssk) {
                    result.add(high + "/" + medium + "/" + low);
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs);
        Collections.sort(orgs, new DepDescComp());
    }
}
