package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/shuffle-string/">https://leetcode.com/problems/shuffle-string/</a>
 * @date 23.04.2023
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}
