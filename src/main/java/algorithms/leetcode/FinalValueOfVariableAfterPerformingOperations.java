package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/">https://leetcode.com/problems/final-value-of-variable-after-performing-operations/</a>
 * @date 06.05.2023
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '-') {
                value--;
            } else {
                value++;
            }
        }
        return value;
    }
}
