package algorithms.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/most-common-word/">https://leetcode.com/problems/most-common-word/</a>
 * @date 28.04.2023
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");
        Set<String> bannedWords = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : banned) {
            bannedWords.add(word);
        }
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        String result = "";
        int max = 0;
        for (String word : map.keySet()) {
            if (!bannedWords.contains(word)) {
                if (map.get(word) > max) {
                    max = map.get(word);
                    result = word;
                }
            }
        }
        return result;
    }
}
