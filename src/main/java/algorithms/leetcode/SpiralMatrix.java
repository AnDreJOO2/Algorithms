package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/spiral-matrix/">https://leetcode.com/problems/spiral-matrix/</a>
 * @date 21.04.2023
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[startColumn].length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endColumn]);
            }
            endColumn--;
            if (startRow <= endRow) {
                for (int i = endColumn; i >= startColumn; i--) {
                    result.add(matrix[endRow][i]);
                }
            }
            endRow--;

            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startColumn]);
                }
            }
            startColumn++;
        }
        return result;
    }
}
