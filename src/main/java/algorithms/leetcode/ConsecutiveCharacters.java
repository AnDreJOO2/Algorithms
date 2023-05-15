package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/consecutive-characters/">https://leetcode.com/problems/consecutive-characters/</a>
 * @date 15.05.2023
 */
public class ConsecutiveCharacters {
    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        int max = 1;
        int current = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                current++;
            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        return Math.max(max, current);
    }
}
