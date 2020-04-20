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

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        int count = 0;
            for (int indexColumn = 0; indexColumn < board[row].length; indexColumn++) {
                if (board[row][indexColumn] != 'X') {
                    result = false;
                    break;
                } else if (board[row][indexColumn] == 'X') {
                    count++;
                    if (count == board[row].length) {
                        return true;
                    }
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board) {
        boolean result = true;
        for (int indexColumn = 0; indexColumn < board.length; indexColumn++) {
            int count = 0;
            for (int indexLine = 0; indexLine < board.length; indexLine++) {
                if (board[indexLine][indexColumn] != 'X') {
                    result = false;
                    break;
                } else if (board[indexLine][indexColumn] == 'X') {
                    count++;
                    if (count == board.length) {
                        return true;
                    }
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
            int count = 0;
            for (int indexLine = 0; indexLine < board.length; indexLine++) {
                if (board[indexLine][column] != 'X') {
                    result = false;
                    break;
                } else if (board[indexLine][column] == 'X') {
                    count++;
                    if (count == board.length) {
                        return true;
                    }
                }
            }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
