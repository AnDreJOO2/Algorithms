package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/array-partition/description/">https://leetcode.com/problems/array-partition/description/</a>
 * @date 15.12.2022
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
