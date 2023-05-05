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
        while (num > 9) {
            num %= 10;
        }
        return num != 0;
    }
}
