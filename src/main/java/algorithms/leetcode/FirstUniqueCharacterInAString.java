package algorithms.leetcode;

import java.util.HashMap;

/**
 * @link <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">https://leetcode.com/problems/first-unique-character-in-a-string/</a>
 * @date 07.04.2023
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()
        ) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
