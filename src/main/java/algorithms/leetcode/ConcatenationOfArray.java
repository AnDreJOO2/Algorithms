package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/concatenation-of-array/">https://leetcode.com/problems/concatenation-of-array/</a>
 * @date 06.04.2023
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }
        return ans;
    }
}
