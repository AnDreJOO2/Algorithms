package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/">https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/</a>
 * @date 23.06.2023
 */
public class CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
