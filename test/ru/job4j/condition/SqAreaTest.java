package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenPerimeter4Length1TimesBiggerThanHeightThenSquare1() {
        int perimeter = 4;
        int lengthDifference = 1;
        double expected = 1.0;
        double out = SqArea.square(perimeter, lengthDifference);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPerimeter6Length2TimesBiggerThanHeightThenSquare1() {
        int perimeter = 6;
        int lengthDifference = 2;
        double expected = 2.0;
        double out = SqArea.square(perimeter, lengthDifference);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPerimeter8Length3TimesBiggerThanHeightThenSquare1() {
        int perimeter = 8;
        int lengthDifference = 3;
        double expected = 3.0;
        double out = SqArea.square(perimeter, lengthDifference);
        Assert.assertEquals(expected, out, 0.01);
    }
}