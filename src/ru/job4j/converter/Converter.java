package ru.job4j.converter;

import org.junit.Assert;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int euro = Converter.rubleToEuro(in);
        int expected = 2;
        Assert.assertEquals(euro, expected);
        System.out.println("140 rubles are " + euro + " euro.");

        in = 120;
        int dollar = Converter.rubleToDollar(in);
        expected = 2;
        Assert.assertEquals(euro, expected);
        System.out.println("120 rubles are " + dollar + " dollars.");
    }
}
