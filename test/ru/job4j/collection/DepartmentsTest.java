package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> expect = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK2/SSK1",
                "K1/SK2/SSK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2",
                "K2/SK2/SSK1",
                "K2/SK2/SSK2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortDescOne() {
        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> out = Arrays.asList(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2",
                "K2/SK2/SSK1",
                "K2/SK2/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK2/SSK1",
                "K1/SK2/SSK2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(out));
    }

    @Test
    public void whenSortDescTwo() {
        List<String> input = Arrays.asList(
                "K1/SK2/SSK2",
                "K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK2",
                "K1/SK1/SSK1",
                "K1/SK2/SSK1",
                "K1",
                "K2/SK2",
                "K2/SK2/SSK2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2",
                "K2/SK2/SSK1",
                "K2/SK1");
        List<String> out = Arrays.asList(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2",
                "K2/SK2/SSK1",
                "K2/SK2/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK2/SSK1",
                "K1/SK2/SSK2");
        Departments.sortDesc(input);
        assertThat(input, is(out));
    }

    @Test
    public void whenSortDescThree() {
        List<String> in = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK2/SSK1",
                "K1/SK2/SSK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2",
                "K2/SK2/SSK1",
                "K2/SK2/SSK2");
        List<String> out = Arrays.asList(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2",
                "K2/SK2/SSK1",
                "K2/SK2/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK2/SSK1",
                "K1/SK2/SSK2");
        Departments.sortDesc(in);
        assertThat(in, is(out));
    }
}