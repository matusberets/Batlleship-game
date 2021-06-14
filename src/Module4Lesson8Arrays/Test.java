package Module4Lesson8Arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

    }
    public static boolean stillRed(String[][] board) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (board[r][c] != null && board[r][c].equals("red")) {
                    return true;
                }
            }
        }
        return false;
    }
}
