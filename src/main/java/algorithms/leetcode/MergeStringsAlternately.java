package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/merge-strings-alternately/">https://leetcode.com/problems/merge-strings-alternately/</a>
 * @date 18.04.2023
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int word1Pointer = 0;
        int word2Pointer = 0;
        StringBuilder sb = new StringBuilder();
        while (word1Pointer + word2Pointer < word1.length() + word2.length()) {
            if (word1Pointer < word1.length()) {
                sb.append(word1.charAt(word1Pointer));
                word1Pointer++;
            }
            if (word2Pointer < word2.length()) {
                sb.append(word2.charAt(word2Pointer));
                word2Pointer++;
            }
        }
        return sb.toString();
    }
}
