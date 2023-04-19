package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/truncate-sentence/">https://leetcode.com/problems/truncate-sentence/</a>
 * @date 19.04.2023
 */
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                k--;
            }
            if (k == 0) {
                break;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
