package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock//</a>
 * @date 15.12.2022
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
