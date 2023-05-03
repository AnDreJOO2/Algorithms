package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MinimumCostOfBuyingCandiesWithDiscountTest {

    private MinimumCostOfBuyingCandiesWithDiscount minimumCostOfBuyingCandiesWithDiscount;

    @BeforeEach
    void setUp() {
        minimumCostOfBuyingCandiesWithDiscount = new MinimumCostOfBuyingCandiesWithDiscount();
    }

    @ParameterizedTest(name = "Params: cost=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMinimumCostOfBuyingCandiesWithDiscountParams")
    void shouldCalculateMinimumCostOfBuyingCandiesWithDiscount(int[] cost, int expected) {
        //when
        int result = minimumCostOfBuyingCandiesWithDiscount.minimumCost(cost);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMinimumCostOfBuyingCandiesWithDiscountParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, 5),
                arguments(new int[]{6, 5, 7, 9, 2, 2}, 23)
        );
    }
}