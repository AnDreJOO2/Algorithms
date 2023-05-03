package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-valid-words-in-a-sentence/">https://leetcode.com/problems/number-of-valid-words-in-a-sentence/</a>
 * @date 03.05.2023
 */
public class NumberOfValidWordsInASentence {
    public int countValidWords(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            int dash = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (Character.isDigit(ch)) {
                    break;
                } else if (ch == '-') {
                    if (dash > 0 || j - 1 < 0 || j + 1 > words[i].length() - 1 || !Character.isLetter(words[i].charAt(j - 1)) || !Character.isLetter(words[i].charAt(j + 1))) {
                        break;
                    } else {
                        dash++;
                    }
                } else if (ch == '.' || ch == '!' || ch == '?') {
                    if (j != words[i].length() - 1) {
                        break;
                    }
                } else if (ch == ',' && j != words[i].length() - 1) {
                    break;
                }
                if (j == words[i].length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }

}
