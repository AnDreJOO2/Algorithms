package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/remove-all-occurrences-of-a-substring/">https://leetcode.com/problems/remove-all-occurrences-of-a-substring/</a>
 * @date 20.05.2023
 */
public class RemoveAllOccurrencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
            index = s.indexOf(part);
        }
        return s;
    }

}
