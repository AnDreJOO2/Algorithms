package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-prefixes-of-a-given-string/">https://leetcode.com/problems/count-prefixes-of-a-given-string/</a>
 * @date 07.05.2023
 */
public class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }
}
