package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (zeroLine(board, true, i)) {
                return true;
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            if (zeroLine(board, false, j)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zeroLine(int[][]board, boolean rowLine, int number)
    {
        for (int i = 0; i < board.length; i++) {
            int row = rowLine ? number : i;
            int cell = !rowLine ? number : i;
            if (board[row][cell] != 1) {
                return  false;
            }
        }
        return  true;

    }


}
