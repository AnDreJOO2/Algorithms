package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/find-maximum-number-of-string-pairs/">https://leetcode.com/problems/find-maximum-number-of-string-pairs/</a>
 * @date 22.07.2023
 */
public class FindMaximumNumberOfStringPairs {

    public int maximumNumberOfStringPairs(String[] words) {
        int max = 0;
        Set<String> uniqueWords = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (uniqueWords.contains(sb.reverse().toString())) {
                max++;
            } else {
                uniqueWords.add(word);
            }
            sb.setLength(0);
        }
        return max;
    }

}
