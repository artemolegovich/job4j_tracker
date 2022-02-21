package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 33", 120),
                new Attachment("image 222", 23)
        };
        Comparator<Attachment> comparator = (left, right)
                -> Integer.compare(left.getSize(), right.getSize());
        Comparator<Attachment> compAscByName = (left, right)
                -> left.getName().compareTo(right.getName());
        Comparator<Attachment> descByNameLength = (left, right)
                -> Integer.compare(right.getName().length(), left.getName().length());
        Arrays.sort(atts, descByNameLength);
        for (Attachment att : atts) {
            System.out.println(att);
        }
    }

}
