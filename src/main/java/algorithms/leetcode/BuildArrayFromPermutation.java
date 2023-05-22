package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/build-array-from-permutation/">https://leetcode.com/problems/build-array-from-permutation/</a>
 * @date 22.05.2023
 */
public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
