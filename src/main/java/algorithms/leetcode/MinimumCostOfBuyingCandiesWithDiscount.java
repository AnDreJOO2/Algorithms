package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/">https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/</a>
 * @date 03.05.2023
 */
public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int skip = 0;
        int result = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (skip != 2) {
                result += cost[i];
                skip++;
            } else {
                skip = 0;
            }
        }
        return result;
    }
}
