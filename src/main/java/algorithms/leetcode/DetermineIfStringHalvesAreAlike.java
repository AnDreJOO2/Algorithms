package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">https://leetcode.com/problems/determine-if-string-halves-are-alike/</a>
 * @date 13.05.2023
 */
public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int firstHalfVowelCount = 0;
        int secondHalfVowelCount = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (isVowel(chars[i])) {
                firstHalfVowelCount++;
            }
            if (isVowel(chars[(chars.length / 2) + i])) {
                secondHalfVowelCount++;
            }
        }
        return firstHalfVowelCount == secondHalfVowelCount;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
