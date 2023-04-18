package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    private HowManyNumbersAreSmallerThanTheCurrentNumber howManyNumbersAreSmallerThanTheCurrentNumber;

    @BeforeEach
    void setUp() {
        howManyNumbersAreSmallerThanTheCurrentNumber = new HowManyNumbersAreSmallerThanTheCurrentNumber();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateHowManyNumbersAreSmallerThanTheCurrentNumberParams")
    void shouldCalculateHowManyNumbersAreSmallerThanTheCurrentNumber(int[] nums, int[] expected) {
        //when
        int[] result = howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums);
        //then
        assertThat(result)
                .isEqualTo(expected)
                .hasSameSizeAs(expected)
                .containsExactly(expected);
    }

    static Stream<Arguments> shouldCalculateHowManyNumbersAreSmallerThanTheCurrentNumberParams() {
        return Stream.of(
                arguments(new int[]{8, 1, 2, 2, 3}, new int[]{4, 0, 1, 1, 3}),
                arguments(new int[]{6, 5, 4, 8}, new int[]{2, 1, 0, 3}),
                arguments(new int[]{7, 7, 7, 7}, new int[]{0, 0, 0, 0})
        );
    }
}