package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenPoints17And29And88And86Distance11() {
        Point point1 = new Point(17, 29);
        Point point2 = new Point(88, 86);
        double expected = 91.04;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPoints0And0And0And0Distance0() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        double expected = 0.00;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointsMinus7AndMinus4And17And6Distance26() {
        Point point1 = new Point(-7, -4);
        Point point2 = new Point(17, 6);
        double expected = 26.00;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}