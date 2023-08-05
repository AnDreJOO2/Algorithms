package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/">https://leetcode.com/problems/counting-words-with-a-given-prefix/</a>
 * @date 05.08.2023
 */
public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
