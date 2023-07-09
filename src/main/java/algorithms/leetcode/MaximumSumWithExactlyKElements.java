package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/">https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/</a>
 * @date 09.07.2023
 */
public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {

        int maxSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int i = 0;
        while (i < k) {
            maxSum += max;
            max++;
            i++;
        }
        return maxSum;
    }
}
