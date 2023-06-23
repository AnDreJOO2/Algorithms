package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountEqualAndDivisiblePairsInAnArrayTest {

    private CountEqualAndDivisiblePairsInAnArray countEqualAndDivisiblePairsInAnArray;

    @BeforeEach
    void setUp() {
        countEqualAndDivisiblePairsInAnArray = new CountEqualAndDivisiblePairsInAnArray();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, k=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountEqualAndDivisiblePairsInAnArrayParams")
    void shouldCountEqualAndDivisiblePairsInAnArray(int[] nums, int k, int expected) {
        //when
        int result = countEqualAndDivisiblePairsInAnArray.countPairs(nums, k);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountEqualAndDivisiblePairsInAnArrayParams() {
        return Stream.of(
                arguments(new int[]{3, 1, 2, 2, 2, 1, 3}, 2, 4),
                arguments(new int[]{1, 2, 3, 4}, 1, 0)
        );
    }
}
