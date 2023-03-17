package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/search-a-2d-matrix/">https://leetcode.com/problems/search-a-2d-matrix/</a>
 * @date 17.03.2023
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int selectedArray = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] == target) {
                return true;
            } else if (matrix[i][matrix[i].length - 1] > target) {
                selectedArray = i;
                break;
            }
        }

        if (selectedArray == -1) {
            return false;
        }

        int startIndex = 0;
        int endIndex = matrix[selectedArray].length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (matrix[selectedArray][middleIndex] == target) {
                return true;
            } else if (matrix[selectedArray][middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else if (matrix[selectedArray][middleIndex] > target) {
                endIndex = middleIndex - 1;
            }
        }
        return false;
    }
}
