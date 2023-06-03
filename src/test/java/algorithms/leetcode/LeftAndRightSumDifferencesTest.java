package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LeftAndRightSumDifferencesTest {

    private LeftAndRightSumDifferences leftAndRightSumDifferences;

    @BeforeEach
    void setUp() {
        leftAndRightSumDifferences = new LeftAndRightSumDifferences();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateLeftAndRightSumDifferencesParams")
    void shouldCalculateLeftAndRightSumDifferences(int[] nums, int[] expected) {
        //when
        int[] result = leftAndRightSumDifferences.leftRightDifference(nums);
        //then
        assertThat(result)
                .isNotNull()
                .containsExactly(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCalculateLeftAndRightSumDifferencesParams() {
        return Stream.of(
                arguments(new int[]{10, 4, 8, 3}, new int[]{15, 1, 11, 22}),
                arguments(new int[]{1}, new int[]{0})
        );
    }
}
