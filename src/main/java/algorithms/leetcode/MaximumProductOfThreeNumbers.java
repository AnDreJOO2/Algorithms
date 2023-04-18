package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-product-of-three-numbers/">https://leetcode.com/problems/maximum-product-of-three-numbers/</a>
 * @date 18.04.2023
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];
            }
            if (nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];

            }
        }
        return Math.max((first * second) * third, (firstMin * secondMin) * first);
    }
}
