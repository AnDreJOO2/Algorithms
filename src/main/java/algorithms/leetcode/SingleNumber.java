package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/single-number/">https://leetcode.com/problems/single-number/</a>
 * @date 15.12.2022
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }

        }
        return set.stream().findFirst().get();
    }
}
