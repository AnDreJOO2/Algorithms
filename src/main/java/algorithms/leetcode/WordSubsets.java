package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/word-subsets/">https://leetcode.com/problems/word-subsets/</a>
 * @date 04.05.2023
 */
public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> subsets = new ArrayList<>();
        int[] maxFrequencies = new int[26];
        for (int i = 0; i < words2.length; i++) {
            int[] wordCharFrequencies = new int[26];
            for (char ch : words2[i].toCharArray()) {
                wordCharFrequencies[ch - 'a']++;
            }
            for (int j = 0; j < wordCharFrequencies.length; j++) {
                maxFrequencies[j] = Math.max(maxFrequencies[j], wordCharFrequencies[j]);
            }
        }

        for (int i = 0; i < words1.length; i++) {
            int[] wordCharFrequencies = new int[26];
            for (char ch : words1[i].toCharArray()) {
                wordCharFrequencies[ch - 'a']++;
            }
            boolean toAdd = true;
            for (int j = 0; j < maxFrequencies.length; j++) {
                if (maxFrequencies[j] > wordCharFrequencies[j]) {
                    toAdd = false;
                    break;
                }
            }
            if (toAdd) {
                subsets.add(words1[i]);
            }
        }
        return subsets;
    }
}
