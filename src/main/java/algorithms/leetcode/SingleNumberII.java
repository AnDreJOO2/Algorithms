package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/single-number-ii/">https://leetcode.com/problems/single-number-ii/</a>
 * @date 06.07.2023
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
