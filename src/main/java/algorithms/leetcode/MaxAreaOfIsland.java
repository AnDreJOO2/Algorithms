package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/max-area-of-island/">https://leetcode.com/problems/max-area-of-island/</a>
 * @date 29.04.2023
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, check(grid, i, j));
            }
        }
        return max;
    }

    private int check(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += check(grid, i + 1, j);
        count += check(grid, i - 1, j);
        count += check(grid, i, j + 1);
        count += check(grid, i, j - 1);
        return count;
    }
}
