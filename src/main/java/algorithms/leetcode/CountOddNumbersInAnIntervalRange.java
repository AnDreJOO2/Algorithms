package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/">https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/</a>
 * @date 06.08.2023
 */
public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }
        return ((high - low) / 2) + 1;
    }
}
