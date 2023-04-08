package algorithms.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/unique-number-of-occurrences/">https://leetcode.com/problems/unique-number-of-occurrences/</a>
 * @date 08.04.2023
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Integer> mapValues = new HashSet<>(map.values());
        if (map.keySet().size() == mapValues.size()) {
            return true;
        }
        return false;
    }
}
