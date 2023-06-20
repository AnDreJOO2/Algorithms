package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/k-radius-subarray-averages/">https://leetcode.com/problems/k-radius-subarray-averages/</a>
 * @date 20.06.2023
 */
public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {

        int[] copy = new int[nums.length];
        Arrays.fill(copy, -1);
        int size = k * 2 + 1;
        if (size > nums.length) {
            return copy;
        }

        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length - k - 1; i++) {
            copy[i] = (int) (sum / (size));
            sum -= nums[i - k];
            sum += nums[i + k + 1];
        }
        copy[nums.length - k - 1] = (int) (sum / (size));
        return copy;
    }
}
