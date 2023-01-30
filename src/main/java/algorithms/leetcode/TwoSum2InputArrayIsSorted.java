package algorithms.leetcode;

import java.util.HashMap;

/**
 * @link <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/</a>
 * @date 30.01.2023
 */
public class TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int rest = target - numbers[i];
            if (map.containsKey(rest)) {
                return new int[]{map.get(rest) + 1, i + 1};
            } else {
                map.put(numbers[i], i);
            }
        }
        return new int[]{};
    }
}
