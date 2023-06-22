package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/">https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/</a>
 * @date 23.06.2023
 */
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] - nums[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
