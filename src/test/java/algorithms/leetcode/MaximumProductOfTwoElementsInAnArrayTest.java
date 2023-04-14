package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumProductOfTwoElementsInAnArrayTest {

    private MaximumProductOfTwoElementsInAnArray maximumProductOfTwoElementsInAnArray;

    @BeforeEach
    void setUp() {
        maximumProductOfTwoElementsInAnArray = new MaximumProductOfTwoElementsInAnArray();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMaximumProductOfTwoElementsInAnArrayParams")
    void shouldFindMaximumProductOfTwoElementsInAnArray(int[] input, int expected) {
        //when
        int result = maximumProductOfTwoElementsInAnArray.maxProduct(input);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMaximumProductOfTwoElementsInAnArrayParams() {
        return Stream.of(
                arguments(new int[]{3, 4, 5, 2}, 12),
                arguments(new int[]{1, 5, 4, 5}, 16),
                arguments(new int[]{3, 7}, 12)
        );
    }
}