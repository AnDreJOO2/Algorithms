package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/thousand-separator/">https://leetcode.com/problems/thousand-separator/</a>
 * @date 24.04.2023
 */
public class ThousandSeparator {
    public String thousandSeparator(int n) {

        if (n < 1000) {
            return String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (n > 9) {
            sb.append(n % 10);
            if (i == 3) {
                sb.append('.');
                i = 0;
            }
            n /= 10;
            i++;
        }
        sb.append(n);
        return sb.reverse().toString();
    }
}
