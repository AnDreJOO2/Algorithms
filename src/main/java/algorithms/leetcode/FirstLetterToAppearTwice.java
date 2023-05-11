package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/first-letter-to-appear-twice/">https://leetcode.com/problems/first-letter-to-appear-twice/</a>
 * @date 11.05.2023
 */
public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        int[] chars = new int[26];
        for (char ch : s.toCharArray()) {
            if (chars[ch - 'a'] == 1) {
                return ch;
            }
            chars[ch - 'a']++;
        }
        return ' ';
    }

}
