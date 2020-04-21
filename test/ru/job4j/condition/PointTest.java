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
    public void whenAllPoints0Distance0() {
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

    @Test
    public void whenPoints17And29And7And88And86And100Distance130And14() {
        Point point1 = new Point(17, 29, 7);
        Point point2 = new Point(88, 86, 100);
        double expected = 130.14;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAllPoints0ADistance0() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0, 0, 0);
        double expected = 0.00;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointsMinus7AndMinus4AndMinus15And17And6And30Distance51And97() {
        Point point1 = new Point(-7, -4, -15);
        Point point2 = new Point(17, 6, 30);
        double expected = 51.97;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}