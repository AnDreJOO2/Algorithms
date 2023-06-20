package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-good-pairs/">https://leetcode.com/problems/number-of-good-pairs/</a>
 * @date 20.06.2023
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
