package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/detect-capital/">https://leetcode.com/problems/detect-capital/</a>
 * @date 02.09.2023
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        char[] chars = word.toCharArray();
        boolean startsWithUpper = chars[0] - 'a' < 0;
        boolean isSecondLetterUpper = chars[1] - 'a' < 0;
        if (!startsWithUpper && isSecondLetterUpper) {
            return false;
        }
        for (int i = 2; i < chars.length; i++) {
            if (chars[i] - 'a' < 0) {
                if (!startsWithUpper || !isSecondLetterUpper) {
                    return false;
                }
            } else {
                if (startsWithUpper && isSecondLetterUpper) {
                    return false;
                }
            }
        }
        return true;
    }
}
