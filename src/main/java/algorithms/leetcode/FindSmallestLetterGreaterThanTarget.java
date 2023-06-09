package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target/">https://leetcode.com/problems/find-smallest-letter-greater-than-target/</a>
 * @date 09.06.2023
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (target - letter < 0) {
                return letter;
            }
        }
        return letters[0];
    }
}
