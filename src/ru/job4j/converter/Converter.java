package ru.job4j.converter;

import org.junit.Assert;

/**
 * Class for converting rubles to euro and dollars.
 * @author MiratRakhmanov
 * @since 17.04.2020
 * @version 1
 */

public class Converter {

    /**
     * @param rubles - number of rubles to convert
     * @return - number of euro which user can get for this amount of rubles
     */

    public static int rubleToEuro(int rubles) {
        if (rubles < 0) {
            return -1;
        }
        return rubles / 70;
    }

    /**
     * @param rubles - number of rubles to convert
     * @return - number of dollars which user can get for this amount of rubles
     */

    public static int rubleToDollar(int rubles) {
        if (rubles < 0) {
            return -1;
        }
        return rubles / 60;
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
