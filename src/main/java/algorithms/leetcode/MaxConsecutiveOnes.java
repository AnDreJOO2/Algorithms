package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/max-consecutive-ones/">https://leetcode.com/problems/max-consecutive-ones/</a>
 * @date 25.04.2023
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                current++;
            } else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        return Math.max(max, current);
    }
}
