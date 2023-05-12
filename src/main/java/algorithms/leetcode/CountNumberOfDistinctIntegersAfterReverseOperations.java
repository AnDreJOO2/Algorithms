package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/">https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/</a>
 * @date 12.05.2023
 */
public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            uniqueValues.add(nums[i]);
            int reversed = 0;
            while (nums[i] != 0) {
                reversed *= 10;
                reversed += nums[i] % 10;
                nums[i] /= 10;
            }
            uniqueValues.add(reversed);
        }
        return uniqueValues.size();
    }
}
