package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/word-search/">https://leetcode.com/problems/word-search/</a>
 * @date 28.04.2023
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (check(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean check(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = 'x';
        boolean test = check(board, i + 1, j, word, index + 1) || check(board, i - 1, j, word, index + 1) ||
                check(board, i, j + 1, word, index + 1) || check(board, i, j - 1, word, index + 1);
        board[i][j] = temp;
        return test;
    }

}
