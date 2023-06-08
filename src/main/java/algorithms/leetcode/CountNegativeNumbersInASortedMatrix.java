package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/</a>
 * @date 08.06.2023
 */
public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][grid[i].length - 1] < 0) {
                for (int j = grid[i].length - 1; j >= 0; j--) {
                    if (grid[i][j] < 0) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
