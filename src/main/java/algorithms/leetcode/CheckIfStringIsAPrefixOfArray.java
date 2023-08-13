package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/">https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/</a>
 * @date 13.08.2023
 */
public class CheckIfStringIsAPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (s.indexOf(sb.toString()) != 0) {
                return false;
            }
            if (sb.length() == s.length()) {
                return true;
            }
        }
        return s.indexOf(sb.toString()) == 0 && sb.length() == s.length();
    }
}
