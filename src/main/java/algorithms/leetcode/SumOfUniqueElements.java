package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/sum-of-unique-elements/">https://leetcode.com/problems/sum-of-unique-elements/</a>
 * @date 09.04.2023
 */
public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
