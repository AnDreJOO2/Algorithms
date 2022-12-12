package algorithms.leetcode;

import java.util.HashMap;

/**
 * @link <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>
 * @date 10.12.2022
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];

            if (hashMap.containsKey(rest)) {
                return new int[]{hashMap.get(rest), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
