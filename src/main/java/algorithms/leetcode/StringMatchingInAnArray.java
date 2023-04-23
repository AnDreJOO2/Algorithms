package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/string-matching-in-an-array/">https://leetcode.com/problems/string-matching-in-an-array/</a>
 * @date 23.04.2023
 */
public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> matches = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (words[j].contains(words[i])) {
                    matches.add(words[i]);
                    break;
                }
            }
        }
        return matches;
    }
}
