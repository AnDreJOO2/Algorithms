package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LargestPositiveIntegerThatExistsWithItsNegativeTest {

    private LargestPositiveIntegerThatExistsWithItsNegative largestPositiveIntegerThatExistsWithItsNegative;

    @BeforeEach
    void setUp() {
        largestPositiveIntegerThatExistsWithItsNegative = new LargestPositiveIntegerThatExistsWithItsNegative();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindLargestPositiveIntegerThatExistsWithItsNegativeParams")
    void shouldFindLargestPositiveIntegerThatExistsWithItsNegative(int[] nums, int expected) {
        //when
        int result = largestPositiveIntegerThatExistsWithItsNegative.findMaxK(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindLargestPositiveIntegerThatExistsWithItsNegativeParams() {
        return Stream.of(
                arguments(new int[]{-1, 2, -3, 3}, 3),
                arguments(new int[]{-1, 10, 6, 7, -7, 1}, 7),
                arguments(new int[]{-10, 8, 6, 7, -2, -3}, -1)
        );
    }
}