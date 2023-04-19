package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/keep-multiplying-found-values-by-two/">https://leetcode.com/problems/keep-multiplying-found-values-by-two/</a>
 * @date 19.04.2023
 */
public class KeepMultiplyingFoundValuesByTwo {
    public int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                i = -1;
                original *= 2;
            }
        }
        return original;
    }
}
