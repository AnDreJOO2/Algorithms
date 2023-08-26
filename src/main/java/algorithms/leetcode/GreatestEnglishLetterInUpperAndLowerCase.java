package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/">https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/</a>
 * @date 26.08.2023
 */
public class GreatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {
        int[] freq = new int[52];
        for (char ch : s.toCharArray()) {
            if (ch > 90) {
                freq[ch - 'A' - 6]++;
            } else {
                freq[ch - 'A']++;
            }
        }
        for (int i = freq.length - 1; i >= 26; i--) {
            if (freq[i] > 0) {
                if (freq[i - 26] > 0) {
                    return String.valueOf((char) ('A' + i - 26));
                }
            }
        }
        return "";
    }

    public String greatestLetterTwo(String s) {
        for (int i = 'z'; i >= 'A'; i--) {
            if (s.indexOf((char) i) != -1 && s.indexOf((char) (i - 32)) != -1) {
                return String.valueOf((char) (i - 32));
            }
        }
        return "";
    }
}
