package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-words-in-a-string/">https://leetcode.com/problems/reverse-words-in-a-string/</a>
 * @date 04.05.2023
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i] != "") {
                sb.append(strings[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
