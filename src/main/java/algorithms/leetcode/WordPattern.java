package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/word-pattern/">https://leetcode.com/problems/word-pattern/</a>
 * @date 04.08.2023
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(ch, words[i]);
            }
        }
        return true;
    }
}
