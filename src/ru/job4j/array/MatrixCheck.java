package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board) {
        boolean result = true;
        for (int indexLine = 0; indexLine < board.length; indexLine++) {
            for (int indexColumn = 0; indexColumn < board[indexLine].length; indexColumn++) {
                if (board[indexLine][indexColumn] != 'X') {
                    result = false;
                    break;
                } else if (indexColumn == board[indexLine].length - 1) {
                    return true;
                }
            }
        }
        return result;
    }
}
