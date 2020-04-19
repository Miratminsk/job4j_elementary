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

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFound() {
        int[] input = new int[] {99, 2, 10, 2, 4, 17, 29, 3, 22, 21, -5, 0, 5, 3, 99};
        int value = 99;
        int start = 1;
        int finish = 14;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}