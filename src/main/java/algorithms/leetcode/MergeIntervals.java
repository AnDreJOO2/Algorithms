package algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/merge-intervals/">https://leetcode.com/problems/merge-intervals/</a>
 * @date 13.08.2023
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> saved = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (isOverlapping(current, intervals[i])) {
                if (current[0] > intervals[i][0]) {
                    current[0] = intervals[i][0];
                }
                if (current[1] < intervals[i][1]) {
                    current[1] = intervals[i][1];
                }
            } else {
                saved.add(current);
                current = intervals[i];
            }
        }
        saved.add(current);

        int[][] result = new int[saved.size()][];
        for (int i = 0; i < result.length; i++) {
            result[i] = saved.get(i);
        }
        return result;
    }

    private boolean isOverlapping(int[] arr1, int[] arr2) {
        return (arr1[0] <= arr2[0] && arr2[0] <= arr1[1]) || (arr2[0] <= arr1[0] && arr1[0] <= arr2[1]);
    }
}

