package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/">https://leetcode.com/problems/convert-1d-array-into-2d-array/</a>
 * @date 15.08.2023
 */
public class Convert1DArrayInto2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][]{};
        }
        int[][] ints = new int[m][n];
        int col = 0;
        int row = 0;
        for (int i = 0; i < original.length; i++) {
            ints[row][col++] = original[i];
            if (col == n) {
                col = 0;
                row++;
            }
        }
        return ints;
    }
}
