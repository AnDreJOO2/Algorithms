package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/valid-palindrome/">https://leetcode.com/problems/valid-palindrome/</a>
 * @date 25.12.2022
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        char[] chars = s
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase()
                .toCharArray();

        for (int i = 1; i <= chars.length / 2; i++) {
            if (chars[i - 1] != chars[chars.length - i]) {
                return false;
            }
        }
        return true;
    }
}
