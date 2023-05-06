package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/a-number-after-a-double-reversal/">https://leetcode.com/problems/a-number-after-a-double-reversal/</a>
 * @date 05.05.2023
 */
public class ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        return (num %= 10) != 0;
    }
}
