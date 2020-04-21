package ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenEqualsNumberThen4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenEqualsNumberThen5() {
        int result = Max.max(5, 5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To4Then3() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenEqualsNumberThen6() {
        int result = Max.max(6, 6, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax4To1Then3() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }
}