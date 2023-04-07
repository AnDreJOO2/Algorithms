package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/missing-number/">https://leetcode.com/problems/missing-number/</a>
 * @date 07.04.2023
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int iteratorSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            iteratorSum += i;
        }
        return iteratorSum + nums.length - sum;
    }
}
