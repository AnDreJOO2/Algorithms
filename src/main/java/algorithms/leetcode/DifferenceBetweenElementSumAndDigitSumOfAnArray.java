package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/">https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/</a>
 * @date 22.04.2023
 */
public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (nums[i] > 9) {
                digitSum += nums[i] % 10;
                nums[i] /= 10;
            }
            digitSum += nums[i] % 10;
        }
        return sum - digitSum;
    }
}
