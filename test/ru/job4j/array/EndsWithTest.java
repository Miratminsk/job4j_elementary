package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenLongWordNotEndWithPrefixThenTrue() {
        char[] word = {'P', 'e', 't', 'r', 'o', 'p', 'a', 'v', 'l', 'o', 'v', 's', 'k', '-', 'K', 'a', 'm', 'c', 'h', 'a', 't', 's', 'k', 'i', 'y'};
        char[] post = {'k', 'i', 'y'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenLongWordNotEndWithPrefixThenFalse() {
        char[] word = {'P', 'e', 't', 'r', 'o', 'p', 'a', 'v', 'l', 'o', 'v', 's', 'k', '-', 'K', 'a', 'm', 'c', 'h', 'a', 't', 's', 'k', 'i', 'y'};
        char[] post = {'t', 'i', 'y'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

}