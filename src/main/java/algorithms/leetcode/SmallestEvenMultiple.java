package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/smallest-even-multiple/">https://leetcode.com/problems/smallest-even-multiple/</a>
 * @date 30.04.2023
 */
public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}
