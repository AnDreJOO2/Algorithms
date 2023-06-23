package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/">https://leetcode.com/problems/find-first-palindromic-string-in-the-array/</a>
 * @date 23.06.2023
 */
public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0 && isPalindromic(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    private boolean isPalindromic(String word) {
        for (int i = 0; i <= word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
