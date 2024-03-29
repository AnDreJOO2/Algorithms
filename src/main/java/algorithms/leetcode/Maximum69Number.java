package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-69-number/">https://leetcode.com/problems/maximum-69-number/</a>
 * @date 24.04.2023
 */
public class Maximum69Number {
    public int maximum69Number(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.valueOf(String.valueOf(chars));
    }
}
