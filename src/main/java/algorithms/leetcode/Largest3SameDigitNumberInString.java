package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/largest-3-same-digit-number-in-string/">https://leetcode.com/problems/largest-3-same-digit-number-in-string/</a>
 * @date 21.05.2023
 */
public class Largest3SameDigitNumberInString {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            sb.append(i);
            sb.append(i);
            sb.append(i);
            if (num.contains(sb.toString())) {
                return sb.toString();
            } else {
                sb.setLength(0);
            }
        }
        return "";
    }
}
