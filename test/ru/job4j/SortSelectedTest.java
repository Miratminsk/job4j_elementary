package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort1() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {99, 89, 17, 25, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {5, 17, 25, 89, 99};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort4() {
        int[] input = new int[] {7, 91, -5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-5, 7, 91};
        assertThat(result, is(expect));
    }

}