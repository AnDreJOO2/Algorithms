package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/smallest-index-with-equal-value/">https://leetcode.com/problems/smallest-index-with-equal-value/</a>
 * @date 13.08.2023
 */
public class SmallestIndexWithEqualValue {

    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
