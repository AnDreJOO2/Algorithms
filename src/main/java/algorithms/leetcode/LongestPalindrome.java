package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/longest-palindrome/">https://leetcode.com/problems/longest-palindrome/</a>
 * @date 10.04.2023
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {

        int[] char_count = new int[128];
        for (char ch : s.toCharArray()) {
            char_count[ch] += 1;
        }
        int result = 0;
        for (int i = 0; i < char_count.length; i++) {
            result += (char_count[i] / 2) * 2;
            if (result % 2 == 0 && char_count[i] % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }
}
