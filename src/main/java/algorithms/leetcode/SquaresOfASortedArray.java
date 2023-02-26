package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">https://leetcode.com/problems/squares-of-a-sorted-array/</a>
 * @date 26.02.2023
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
