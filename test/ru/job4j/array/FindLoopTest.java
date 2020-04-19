package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasMinus5Then5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {17, 29, 3, 22, 21, -5, 0};
        int value = -5;
        int result = find.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas33ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {17, 29, 3, 22, 21, -5, 0, 5, 10, 3};
        int value = 33;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}