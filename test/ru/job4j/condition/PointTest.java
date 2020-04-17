package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenPoints17And29And88And86Distance11() {
        int x1 = 17;
        int y1 = 29;
        int x2 = 88;
        int y2 = 86;
        double expected = 91.04;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPoints0And0And0And0Distance0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointsMinus7AndMinus4And17And6Distance26() {
        int x1 = -7;
        int y1 = -4;
        int x2 = 17;
        int y2 = 6;
        double expected = 26.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}