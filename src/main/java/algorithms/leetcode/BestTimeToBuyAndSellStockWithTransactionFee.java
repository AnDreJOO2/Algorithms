package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/</a>
 * @date 22.06.2023
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice - fee);
            minPrice = Math.min(minPrice, prices[i] - maxProfit);
        }
        return maxProfit;
    }
}
