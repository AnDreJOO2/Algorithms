package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeEach
    void setUp() {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    void maxProfitShouldPassTheTest() {

        assertThat(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
        assertThat(bestTimeToBuyAndSellStock.maxProfit(new int[]{3, 1, 6, 3, 6, 8})).isEqualTo(7);
    }
}
