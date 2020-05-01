package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        Function<List<Attachment>, List<Attachment>> function = attachments -> {
            List<Attachment> rsl = new ArrayList<>();
            for (Attachment att : attachments) {
                if (att.getSize() > 100) {
                    rsl.add(att);
                }
            }
            return rsl;
        };
        return filter(list, function);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Function<List<Attachment>, List<Attachment>> function = attachments -> {
            List<Attachment> rsl = new ArrayList<>();
            for (Attachment att : attachments) {
                if (att.getName().contains("bug")) {
                    rsl.add(att);
                }
            }
            return rsl;
        };
        return filter(list, function);
    }

    private static List<Attachment> filter(List<Attachment> list, Function<List<Attachment>, List<Attachment>> function) {
        List<Attachment> rsl;
        rsl = function.apply(list);
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> list = new ArrayList<>();
        list.add(new Attachment("bug", 50));
        list.add(new Attachment("City", 101));
        list.add(new Attachment("buggi", 20));
        list.add(new Attachment("Chicago", 200));
        List<Attachment> sorted = filterSize(list);
        for (Attachment att : sorted) {
            System.out.println(att.toString());
        }
    }
}
