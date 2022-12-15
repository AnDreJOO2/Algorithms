package algorithms.leetcode;

import java.util.HashMap;

/**
 * @link <a href="https://leetcode.com/problems/contains-duplicate-ii/">https://leetcode.com/problems/contains-duplicate-ii/</a>
 * @date 15.12.2022
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
