package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/">https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/</a>
 * @date 22.04.2023
 */
public class CountTheNumberOfVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
