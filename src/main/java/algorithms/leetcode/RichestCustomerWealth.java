package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/richest-customer-wealth/submissions/">https://leetcode.com/problems/richest-customer-wealth/submissions/</a>
 * @date 11.05.2023
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int currentMax = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentMax += accounts[i][j];
            }
            max = Math.max(max, currentMax);
        }
        return max;
    }
}
