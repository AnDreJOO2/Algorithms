package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">https://leetcode.com/problems/reverse-words-in-a-string-iii/</a>
 * @date 05.04.2022
 */
public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            sb.append(new StringBuilder(strings[i]).reverse());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
