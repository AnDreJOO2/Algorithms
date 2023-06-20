package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/shuffle-the-array/">https://leetcode.com/problems/shuffle-the-array/</a>
 * @date 20.06.2023
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        int iterator = 0;
        for (int i = 0; i < n; i++) {
            array[iterator++] = nums[i];
            array[iterator++] = nums[n + i];
        }
        return array;
    }
}
