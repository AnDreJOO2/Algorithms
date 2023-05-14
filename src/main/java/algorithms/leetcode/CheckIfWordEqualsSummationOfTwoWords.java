package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/">https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/</a>
 * @date 14.05.2023
 */
public class CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstWordValue = 0;
        int secondWordValue = 0;
        int targetWordValue = 0;

        char[] chars = firstWord.toCharArray();
        int i = 0;
        while (i < chars.length) {
            firstWordValue *= 10;
            firstWordValue += chars[i] - 'a';
            i++;
        }
        chars = secondWord.toCharArray();
        i = 0;
        while (i < chars.length) {
            secondWordValue *= 10;
            secondWordValue += chars[i] - 'a';
            i++;
        }
        chars = targetWord.toCharArray();
        i = 0;
        while (i < chars.length) {
            targetWordValue *= 10;
            targetWordValue += chars[i] - 'a';
            i++;
        }
        return targetWordValue == firstWordValue + secondWordValue;
    }
}
