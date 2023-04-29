package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/percentage-of-letter-in-string/">https://leetcode.com/problems/percentage-of-letter-in-string/</a>
 * @date 29.04.2023
 */
public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        int occurrences = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letter == s.charAt(i)) {
                occurrences++;
            }
        }
        return (occurrences * 100) / s.length();
    }
}
