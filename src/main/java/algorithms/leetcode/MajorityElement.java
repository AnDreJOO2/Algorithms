package algorithms.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/majority-element/">https://leetcode.com/problems/majority-element/</a>
 * @date 06.04.2023
 */
public class MajorityElement {

    public int majorityElementBad(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    // bad solution

    public int majorityElementGood(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    //optimal
}
