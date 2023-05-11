package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/">https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/</a>
 * @date 11.05.2023
 */
public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            max = Math.max(max, words.length);
        }
        return max;
    }
}
