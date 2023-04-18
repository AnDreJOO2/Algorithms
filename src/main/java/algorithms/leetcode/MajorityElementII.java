package algorithms.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/majority-element-ii/">https://leetcode.com/problems/majority-element-ii/</a>
 * @date 18.04.2023
 */
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], +1);
            }
        }
        List<Integer> majorityElements = new ArrayList<>();
        int size = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > size) {
                majorityElements.add(nums[i]);
                map.put(nums[i], 0);
            }
        }
        return majorityElements;
    }
}
