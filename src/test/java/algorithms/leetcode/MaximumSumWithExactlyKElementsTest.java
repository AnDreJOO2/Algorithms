package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumSumWithExactlyKElementsTest {

    private MaximumSumWithExactlyKElements maximumSumWithExactlyKElements;

    @BeforeEach
    void setUp() {
        maximumSumWithExactlyKElements = new MaximumSumWithExactlyKElements();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, k=`{1}`, expected=`{2}`")
    @MethodSource("shouldCalculateMaximumSumWithExactlyKElementsParams")
    void shouldFindFirstPalindromicStringInTheArray(int[] nums, int k, int expected) {
        //when
        int result = maximumSumWithExactlyKElements.maximizeSum(nums, k);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaximumSumWithExactlyKElementsParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, 3, 18),
                arguments(new int[]{5, 5, 5}, 2, 11)
        );
    }
}
