package algorithms.leetcode;

import java.util.HashMap;

/**
 * @link <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>
 * @date 22.03.2023
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int leftPointer = 0;
        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char ch = s.charAt(rightPointer);
            if (!map.containsKey(ch)) {
                map.put(ch, rightPointer);
            } else {
                leftPointer = Math.max(leftPointer, map.get(ch) + 1);
                map.put(ch, rightPointer);
            }
            result = Math.max(result, rightPointer - leftPointer + 1);
        }
        return result;
    }
}

// TC: O(n), SC: O(n);