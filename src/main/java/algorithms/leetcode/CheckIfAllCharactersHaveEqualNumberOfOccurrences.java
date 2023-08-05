package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/">https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/</a>
 * @date 05.08.2023
 */
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (count == 0 && freq[i] != 0) {
                count = freq[i];
                continue;
            }
            if (freq[i] != count && freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
