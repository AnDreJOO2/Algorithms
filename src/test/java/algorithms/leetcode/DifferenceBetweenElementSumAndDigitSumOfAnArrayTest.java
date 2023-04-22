package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DifferenceBetweenElementSumAndDigitSumOfAnArrayTest {

    private DifferenceBetweenElementSumAndDigitSumOfAnArray differenceBetweenElementSumAndDigitSumOfAnArray;

    @BeforeEach
    void setUp() {
        differenceBetweenElementSumAndDigitSumOfAnArray = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateDifferenceBetweenElementSumAndDigitSumOfAnArrayParams")
    void shouldCalculateDifferenceBetweenElementSumAndDigitSumOfAnArray(int[] nums, int expected) {
        //when
        int result = differenceBetweenElementSumAndDigitSumOfAnArray.differenceOfSum(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateDifferenceBetweenElementSumAndDigitSumOfAnArrayParams() {
        return Stream.of(
                arguments(new int[]{1, 15, 6, 3}, 9),
                arguments(new int[]{1, 2, 3, 4}, 0)
        );
    }
}