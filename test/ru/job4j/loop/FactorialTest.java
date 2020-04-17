package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int in = 5;
        int expected = 120;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int in = 0;
        int expected = 1;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialFor1Then1() {
        int in = 1;
        int expected = 1;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialFor2ThenOne() {
        int in = 2;
        int expected = 2;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }
}