package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountNumberOfPairsWithAbsoluteDifferenceKTest {

    private CountNumberOfPairsWithAbsoluteDifferenceK countNumberOfPairsWithAbsoluteDifferenceK;

    @BeforeEach
    void setUp() {
        countNumberOfPairsWithAbsoluteDifferenceK = new CountNumberOfPairsWithAbsoluteDifferenceK();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, k=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountNumberOfPairsWithAbsoluteDifferenceKParams")
    void shouldCountNumberOfPairsWithAbsoluteDifferenceK(int[] nums, int k, int expected) {
        //when
        int result = countNumberOfPairsWithAbsoluteDifferenceK.countKDifference(nums, k);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountNumberOfPairsWithAbsoluteDifferenceKParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 2, 1}, 1, 4),
                arguments(new int[]{1, 3}, 3, 0),
                arguments(new int[]{3, 2, 1, 5, 4}, 2, 3)
        );
    }
}
