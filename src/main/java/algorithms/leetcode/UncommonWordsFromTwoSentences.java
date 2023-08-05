package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/">https://leetcode.com/problems/uncommon-words-from-two-sentences/</a>
 * @date 05.08.2023
 */
public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Words = s1.split(" ");
        String[] s2Words = s2.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : s1Words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String word : s2Words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() == 1) {
                sb.append(entry.getKey());
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return new String[]{};
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString().split(" ");
    }
}
