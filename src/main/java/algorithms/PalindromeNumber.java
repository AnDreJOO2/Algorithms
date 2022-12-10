package algorithms;

/**
 * @link <a href="https://leetcode.com/problems/palindrome-number/">https://leetcode.com/problems/palindrome-number/</a>
 * @date 10.12.2022
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 1; i <= chars.length / 2; i++) {
            if (chars[i - 1] != chars[chars.length - i]) {
                return false;
            }
        }
        return true;
    }
}
