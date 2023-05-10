package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WaterBottlesTest {

    private WaterBottles waterBottles;

    @BeforeEach
    void setUp() {
        waterBottles = new WaterBottles();
    }

    @ParameterizedTest(name = "Params: numBottles=`{0}`, numExchange=`{1}`, expected=`{2}`")
    @MethodSource("shouldCalculateMaximumWaterBottlesParams")
    void shouldCalculateMaximumWaterBottles(int numBottles, int numExchange, int expected) {
        //when
        int result = waterBottles.numWaterBottles(numBottles, numExchange);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaximumWaterBottlesParams() {
        return Stream.of(
                arguments(9, 3, 13),
                arguments(15, 4, 19),
                arguments(15, 7, 17)
        );
    }

}