package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/transpose-matrix/">https://leetcode.com/problems/transpose-matrix/</a>
 * @date 15.04.2023
 */
public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {

        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

}
