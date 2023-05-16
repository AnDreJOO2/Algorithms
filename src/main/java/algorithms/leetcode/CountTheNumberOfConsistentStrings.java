package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-the-number-of-consistent-strings/">https://leetcode.com/problems/count-the-number-of-consistent-strings/</a>
 * @date 16.05.2023
 */
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] frequencies = new int[26];
        int count = 0;
        for (char ch : allowed.toCharArray()) {
            frequencies[ch - 'a']++;
        }
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            for (int j = 0; j < wordChars.length; j++) {
                if (frequencies[wordChars[j] - 'a'] < 1) {
                    break;
                }
                if (j == wordChars.length - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
