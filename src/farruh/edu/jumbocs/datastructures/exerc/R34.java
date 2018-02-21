package farruh.edu.jumbocs.datastructures.exerc;

public class R34 {

    static int[][] board = new int[3][3];
    static int player = 1;

    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0 || i > 2) || (j < 0 || j > 2)) {
            throw new IllegalArgumentException("Invalid board position");
        }
        if (board[i][j] != 0) {
            throw new IllegalArgumentException("Board Position occupied");
        } else {
            if (!isGameOver()) {
                board[i][j] = player;
                player = -player;
            } else {
                throw new IllegalStateException("Game is over already.");
            }
        }
    }

    public static boolean isGameOver() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
