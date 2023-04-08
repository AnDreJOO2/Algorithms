package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/power-of-three/">https://leetcode.com/problems/power-of-three/</a>
 * @date 08.04.2023
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}