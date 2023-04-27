package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/</a>
 * @date 27.04.2023
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
