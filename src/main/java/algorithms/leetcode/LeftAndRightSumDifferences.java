package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/left-and-right-sum-differences/">https://leetcode.com/problems/left-and-right-sum-differences/</a>
 * @date 03.06.2023
 */
public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {

        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;

        int[] rightSum = new int[nums.length];
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return nums;
    }

}
