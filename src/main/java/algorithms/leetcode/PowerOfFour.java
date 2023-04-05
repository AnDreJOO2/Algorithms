package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/power-of-four">https://leetcode.com/problems/power-of-four</a>
 * @date 05.04.2023
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return true;
    }
}
