package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontalOne() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontalTwo() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontalThree() {
        char[][] input = {
                {'X', 'X', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoHorizontalFour() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input);
        assertThat(result, is(false));
    }

}