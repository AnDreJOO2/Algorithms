package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/available-captures-for-rook/">https://leetcode.com/problems/available-captures-for-rook/</a>
 * @date 13.08.2023
 */
public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {

                    for (int k = i + 1; k < board.length; k++) {
                        if (board[k][j] == 'B') {
                            break;
                        }
                        if (board[k][j] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for (int k = i - 1; k >= 0; k--) {
                        if (board[k][j] == 'B') {
                            break;
                        }
                        if (board[k][j] == 'p') {
                            count++;
                            break;
                        }
                    }

                    for (int k = j + 1; k < board[i].length; k++) {
                        if (board[i][k] == 'B') {
                            break;
                        }
                        if (board[i][k] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for (int k = j - 1; k >= 0; k--) {
                        if (board[i][k] == 'B') {
                            break;
                        }
                        if (board[i][k] == 'p') {
                            count++;
                            break;
                        }
                    }
                    return count;
                }
            }
        }
        return -1;
    }

}
