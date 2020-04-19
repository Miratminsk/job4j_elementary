package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int lastIndex = array.length - 1;
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[lastIndex - index];
            array[lastIndex - index] = temp;
        }
        return array;
    }
}
