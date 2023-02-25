package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/running-sum-of-1d-array/">https://leetcode.com/problems/running-sum-of-1d-array/</a>
 * @date 25.02.2023
 */
public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
