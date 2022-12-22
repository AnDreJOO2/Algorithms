package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/fibonacci-number/">https://leetcode.com/problems/fibonacci-number/</a>
 * @date 22.12.2022
 */
public class FibonacciNumber {
    public int fib(int n) {

        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
