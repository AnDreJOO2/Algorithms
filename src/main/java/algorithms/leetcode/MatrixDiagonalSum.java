package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/matrix-diagonal-sum/">https://leetcode.com/problems/matrix-diagonal-sum/</a>
 * @date 08.05.2023
 */
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i != mat[i].length - 1 - i) {
                sum += mat[i][i];
            }
            sum += mat[i][mat[i].length - 1 - i];
        }
        return sum;
    }
}
