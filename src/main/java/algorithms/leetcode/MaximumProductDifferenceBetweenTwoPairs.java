package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/">https://leetcode.com/problems/maximum-product-difference-between-two-pairs/</a>
 * @date 25.04.2023
 */
public class MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        int maxOne = Integer.MIN_VALUE;
        int maxTwo = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (minOne > nums[i]) {
                minTwo = minOne;
                minOne = nums[i];
            } else if (minTwo > nums[i]) {
                minTwo = nums[i];
            }
            if (maxOne < nums[i]) {
                maxTwo = maxOne;
                maxOne = nums[i];
            } else if (maxTwo < nums[i]) {
                maxTwo = nums[i];
            }
        }
        return maxOne * maxTwo - minOne * minTwo;
    }
}
