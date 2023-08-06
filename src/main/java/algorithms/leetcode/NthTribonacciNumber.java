package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/n-th-tribonacci-number/">https://leetcode.com/problems/n-th-tribonacci-number/</a>
 * @date 06.08.2023
 */
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        for (int i = 3; i < n; i++) {
            int temp = t1 + t0;
            t0 = t1;
            t1 = t2;
            t2 = t2 + temp;
        }
        return t0 + t1 + t2;
    }
}
