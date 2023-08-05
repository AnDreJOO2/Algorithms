package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/positions-of-large-groups/">https://leetcode.com/problems/positions-of-large-groups/</a>
 * @date 05.08.2023
 */
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> groups = new ArrayList<>();
        char[] chars = s.toCharArray();
        int startIndex = 0;
        int repeats = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                if (i - startIndex > 2) {
                    groups.add(List.of(startIndex, i - 1));
                }
                startIndex = i;
                repeats = 1;
            } else {
                repeats++;
            }
        }
        if (repeats > 2) {
            groups.add(List.of(startIndex, s.length() - 1));
        }
        return groups;
    }

}
