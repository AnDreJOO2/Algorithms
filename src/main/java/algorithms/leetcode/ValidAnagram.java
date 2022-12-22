package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/valid-anagram/">https://leetcode.com/problems/valid-anagram/</a>
 * @date 22.12.2022
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for (int i = 0; i < s.length(); i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }

}
