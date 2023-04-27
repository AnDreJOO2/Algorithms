package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII;

    @BeforeEach
    void setUp() {
        bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
    }

    @ParameterizedTest(name = "Params: prices=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumProfitBestTimeToBuyAndSellStockIIParms")
    void shouldCalculateMaximumProfitBestTimeToBuyAndSellStockII(int[] prices, int expected) {
        //when
        int result = bestTimeToBuyAndSellStockII.maxProfit(prices);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateMaximumProfitBestTimeToBuyAndSellStockIIParms() {
        return Stream.of(
                arguments(new int[]{7, 1, 5, 3, 6, 4}, 7),
                arguments(new int[]{1, 2, 3, 4, 5}, 4),
                arguments(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }
}