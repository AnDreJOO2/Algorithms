package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/remove-trailing-zeros-from-a-string/">https://leetcode.com/problems/remove-trailing-zeros-from-a-string/</a>
 * @date 23.06.2023
 */
public class RemoveTrailingZerosFromAString {
    public String removeTrailingZeros(String num) {
        int size = num.length();
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0') {
                size--;
            } else {
                break;
            }
        }
        return num.substring(0, size);
    }
}
