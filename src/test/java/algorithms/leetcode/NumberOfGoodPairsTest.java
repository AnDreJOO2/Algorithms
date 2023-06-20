package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfGoodPairsTest {

    private NumberOfGoodPairs numberOfGoodPairs;

    @BeforeEach
    void setUp() {
        numberOfGoodPairs = new NumberOfGoodPairs();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountNumberOfGoodPairsParams")
    void shouldCountNumberOfGoodPairs(int[] nums, int expected) {
        //when
        int result = numberOfGoodPairs.numIdenticalPairs(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountNumberOfGoodPairsParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 1, 1, 3}, 4),
                arguments(new int[]{1, 1, 1, 1}, 6),
                arguments(new int[]{1, 2, 3}, 0)
        );
    }
}
