package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int indexLine = 0; indexLine < table.length; indexLine++) {
            for (int indexColumn = 0; indexColumn < table[indexLine].length; indexColumn++) {
                table[indexLine][indexColumn] = (indexColumn + 1) * (indexLine + 1);
            }
        }
        return table;
    }
}
