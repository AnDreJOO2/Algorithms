package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/removing-stars-from-a-string/">https://leetcode.com/problems/removing-stars-from-a-string/</a>
 * @date 11.04.2023
 */
public class RemovingStarsFromAString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
