package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/battleships-in-a-board/">https://leetcode.com/problems/battleships-in-a-board/</a>
 * @date 25.04.2023
 */
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                    checkCell(board, i, j);
                }
            }
        }
        return count;
    }

    private void checkCell(char[][] board, int i, int j) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[i].length - 1 || board[i][j] == '.') {
            return;
        }

        board[i][j] = '.';
        checkCell(board, i - 1, j);
        checkCell(board, i + 1, j);
        checkCell(board, i, j - 1);
        checkCell(board, i, j + 1);
    }

}
