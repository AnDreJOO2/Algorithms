package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/spiral-matrix-ii/">https://leetcode.com/problems/spiral-matrix-ii/</a>
 * @date 22.04.2023
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0) {
            return matrix;
        }

        int startRow = 0;
        int endRow = n - 1;
        int startColumn = 0;
        int endColumn = n - 1;
        int number = 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                matrix[startRow][i] = number;
                number++;
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endColumn] = number;
                number++;
            }
            endColumn--;

            if (startRow <= endRow) {
                for (int i = endColumn; i >= startColumn; i--) {
                    matrix[endRow][i] = number;
                    number++;
                }
            }
            endRow--;

            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startColumn] = number;
                    number++;
                }
            }
            startColumn++;
        }
        return matrix;
    }
}
