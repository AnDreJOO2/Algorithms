package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/factorial-trailing-zeroes/description/">https://leetcode.com/problems/factorial-trailing-zeroes/description/</a>
 * @date 13.03.2023
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }
    // O(Log5(n)), SC: O(1)
}
