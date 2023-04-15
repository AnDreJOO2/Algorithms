package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/array-partition/">https://leetcode.com/problems/array-partition/</a>
 * @date 15.04.2023
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
