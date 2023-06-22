package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private BestTimeToBuyAndSellStockWithTransactionFee bestTimeToBuyAndSellStockWithTransactionFee;

    @BeforeEach
    void setUp() {
        bestTimeToBuyAndSellStockWithTransactionFee = new BestTimeToBuyAndSellStockWithTransactionFee();
    }

    @ParameterizedTest(name = "Params: prices=`{0}`, fee:`{1}`, expected=`{2}`")
    @MethodSource("shouldCalculateBestTimeToBuyAndSellStockWithTransactionFeeParams")
    void shouldCalculateBestTimeToBuyAndSellStockWithTransactionFee(int[] prices, int fee, int expected) {
        //when
        int result = bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(prices, fee);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateBestTimeToBuyAndSellStockWithTransactionFeeParams() {
        return Stream.of(
                arguments(new int[]{1, 3, 2, 8, 4, 9}, 2, 8),
                arguments(new int[]{1, 3, 7, 5, 10, 3}, 3, 6)
        );
    }
}
