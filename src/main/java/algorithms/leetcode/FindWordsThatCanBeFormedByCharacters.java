package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/">https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/</a>
 * @date 06.08.2023
 */
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = 0;
        for (String word : words) {
            if (isValid(word, freq)) {
                count += word.length();
            }
        }
        return count;
    }

    private boolean isValid(String word, int[] freq) {
        char[] wChars = word.toCharArray();
        int[] freqCopy = Arrays.copyOf(freq, freq.length);
        for (char ch : wChars) {
            if (freqCopy[ch - 'a'] > 0) {
                freqCopy[ch - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
