package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumProductOfThreeNumbersTest {

    private MaximumProductOfThreeNumbers maximumProductOfThreeNumbers;

    @BeforeEach
    void setUp() {
        maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumProductOfThreeNumbersParams")
    void shouldCalculateMaximumProductOfThreeNumbers(int[] nums, int expected) {
        //when
        int result = maximumProductOfThreeNumbers.maximumProduct(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaximumProductOfThreeNumbersParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, 6),
                arguments(new int[]{1, 2, 3, 4}, 24),
                arguments(new int[]{-1, -2, -3}, -6)
        );
    }

}