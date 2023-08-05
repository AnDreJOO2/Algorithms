package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MinimumOperationsToMakeTheArrayIncreasingTest {

    private MinimumOperationsToMakeTheArrayIncreasing minimumOperationsToMakeTheArrayIncreasing;

    @BeforeEach
    void setUp() {
        minimumOperationsToMakeTheArrayIncreasing = new MinimumOperationsToMakeTheArrayIncreasing();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMinimumOperationsToMakeTheArrayIncreasingParams")
    void shouldCalculateMinimumOperationsToMakeTheArrayIncreasing(int[] nums, int expected) {
        //when
        int result = minimumOperationsToMakeTheArrayIncreasing.minOperations(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateMinimumOperationsToMakeTheArrayIncreasingParams() {
        return Stream.of(
                arguments(new int[]{1, 1, 1}, 3),
                arguments(new int[]{1, 5, 2, 4, 1}, 14),
                arguments(new int[]{8}, 0)
        );
    }
}
