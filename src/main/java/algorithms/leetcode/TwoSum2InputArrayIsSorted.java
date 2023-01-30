package algorithms.leetcode;

import java.util.HashMap;

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
