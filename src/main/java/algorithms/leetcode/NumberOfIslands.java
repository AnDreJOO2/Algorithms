package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-islands/">https://leetcode.com/problems/number-of-islands/</a>
 * @date 10.04.2023
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    checkBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void checkBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        checkBFS(grid, i - 1, j); // Check Up
        checkBFS(grid, i + 1, j); // Check Down
        checkBFS(grid, i, j - 1); // Check Left
        checkBFS(grid, i, j + 1); // Check Right
    }

}
