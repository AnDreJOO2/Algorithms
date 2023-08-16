package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-number-of-words-you-can-type/">https://leetcode.com/problems/maximum-number-of-words-you-can-type/</a>
 * @date 16.08.2023
 */
public class MaximumNumberOfWordsYouCanType {

    public int canBeTypedWords(String text, String brokenLetters) {
        int sum = 0;
        int[] freq = new int[26];
        for (char ch : brokenLetters.toCharArray()) {
            freq[ch - 'a']++;
        }

        boolean canAdd = true;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                if (canAdd) {
                    sum++;
                } else {
                    canAdd = true;
                }
                continue;
            }
            if (freq[ch - 'a'] == 0) {
                continue;
            }
            if (freq[ch - 'a'] != 0) {
                canAdd = false;
            }
        }
        if (canAdd) {
            sum++;
        }
        return sum;
    }
}
