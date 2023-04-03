package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/power-of-two/">https://leetcode.com/problems/power-of-two/</a>
 * @date 03.04.2023
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}
