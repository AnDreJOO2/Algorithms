package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-string/">https://leetcode.com/problems/reverse-string/</a>
 * @date 25.12.2022
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
