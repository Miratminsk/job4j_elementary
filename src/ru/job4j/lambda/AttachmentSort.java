package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator = (o1, o2) -> {
            System.out.println("compare - " + o1.getSize() + " : " + o2.getSize());
            return o1.getSize() - o2.getSize();
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        Comparator<Attachment> nameComparator =  (left, right) -> {
            System.out.println("compare - " + left.getName() + " : " + right.getName());
            return left.getName().compareTo(right.getName());
        };
        attachments.sort(nameComparator);
        System.out.println(attachments);
    }
}
