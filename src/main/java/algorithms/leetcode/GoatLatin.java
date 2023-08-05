package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/goat-latin/">https://leetcode.com/problems/goat-latin/</a>
 * @date 05.08.2023
 */
public class GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int repeats = i + 1;
            char start = words[i].charAt(0);
            sb.append(words[i]);
            if (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u' ||
                    start == 'A' || start == 'E' || start == 'I' || start == 'O' || start == 'U') {
                sb.append("ma");
            } else {
                sb.append(start);
                sb.append("ma");
                sb.deleteCharAt(0);
            }
            while (repeats > 0) {
                sb.append("a");
                repeats--;
            }
            words[i] = sb.toString();
            sb.setLength(0);
        }
        for (String word : words) {
            sb.append(word);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
