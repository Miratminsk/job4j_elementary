package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(5.0, 10.0, 20.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenExistThanArea50() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 10);
        Point point3 = new Point(10, 10);
        TrgArea trgArea = new TrgArea(point1, point2, point3);
        double result = trgArea.area();
        double expected = 50.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenExistThanArea25() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(5, 10);
        Point point3 = new Point(1, 12);
        TrgArea trgArea = new TrgArea(point1, point2, point3);
        double result = trgArea.area();
        double expected = 25.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExistThanError() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        Point point3 = new Point(0, 0);
        TrgArea trgArea = new TrgArea(point1, point2, point3);
        double result = trgArea.area();
        double expected = -1;
        assertEquals(expected, result, 0.01);
    }

}