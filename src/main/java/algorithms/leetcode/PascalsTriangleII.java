package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/pascals-triangle-ii/">https://leetcode.com/problems/pascals-triangle-ii/</a>
 * @date 08.04.2023
 */
public class PascalsTriangleII {
    public List<Integer> getRowFirst(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle.get(rowIndex);
    }

    public List<Integer> getRowSecond(int rowIndex) {

        int[] array = new int[rowIndex + 1];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                array[j] = array[j] + array[j - 1];
            }
        }
        List<Integer> row = new ArrayList<>();
        for (int a : array) {
            row.add(a);
        }
        return row;
    }

}
