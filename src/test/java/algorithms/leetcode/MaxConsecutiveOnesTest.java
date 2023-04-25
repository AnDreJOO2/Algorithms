package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes maxConsecutiveOnes;

    @BeforeEach
    void setUp() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @ParameterizedTest(name = "Params: nums =`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMaxConsecutiveOnesParams")
    void shouldFindMaxConsecutiveOnes(int[] nums, int expected) {
        //when
        int result = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        //then
        assertThat(result).isNotNull().isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMaxConsecutiveOnesParams() {
        return Stream.of(arguments(new int[]{1, 1, 0, 1, 1, 1}, 3), arguments(new int[]{1, 0, 1, 1, 0, 1}, 2));
    }
}