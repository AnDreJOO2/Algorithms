package algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">https://leetcode.com/problems/check-if-the-sentence-is-pangram/</a>
 * @date 19.04.2023
 */
public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
            if (set.size() == 26) {
                return true;
            }
        }
        return false;
    }
}
