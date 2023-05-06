package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/">https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/</a>
 * @date 06.05.2023
 */
public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        int max = -1;
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
            if (map.contains(-nums[i])) {
                max = Math.max(max, Math.abs(nums[i]));
            }
        }
        return max;
    }
}
