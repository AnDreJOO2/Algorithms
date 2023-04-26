package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-prefix-of-word/">https://leetcode.com/problems/reverse-prefix-of-word/</a>
 * @date 26.04.2023
 */
public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word.length());
        int index = 0;
        while (index < word.length()) {

            if (ch != word.charAt(index)) {
                sb.append(word.charAt(index));
            } else if (ch == word.charAt(index)) {
                sb.append(word.charAt(index));
                sb.reverse();
                index++;
                break;
            }
            index++;
        }
        while (index < word.length()) {
            sb.append(word.charAt(index));
            index++;
        }
        return sb.toString();
    }
}
