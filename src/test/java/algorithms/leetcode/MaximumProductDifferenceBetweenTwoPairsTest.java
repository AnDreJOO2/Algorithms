package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumProductDifferenceBetweenTwoPairsTest {

    private MaximumProductDifferenceBetweenTwoPairs maximumProductDifferenceBetweenTwoPairs;

    @BeforeEach
    void setUp() {
        maximumProductDifferenceBetweenTwoPairs = new MaximumProductDifferenceBetweenTwoPairs();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumProductDifferenceBetweenTwoPairsParams")
    void shouldCalculateMaximumProductDifferenceBetweenTwoPairs(int[] nums, int expected) {
        //when
        int result = maximumProductDifferenceBetweenTwoPairs.maxProductDifference(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCalculateMaximumProductDifferenceBetweenTwoPairsParams() {
        return Stream.of(
                arguments(new int[]{5, 6, 2, 7, 4}, 34),
                arguments(new int[]{4, 2, 5, 9, 7, 4, 8}, 64)
        );
    }
}