package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {

    private MinimumSumOfFourDigitNumberAfterSplittingDigits minimumSumOfFourDigitNumberAfterSplittingDigits;

    @BeforeEach
    void setUp() {
        minimumSumOfFourDigitNumberAfterSplittingDigits = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMinimumSumOfFourDigitNumberAfterSplittingDigitsParams")
    void shouldCalculateMinimumSumOfFourDigitNumberAfterSplittingDigits(int num, int expected) {
        //when
        int result = minimumSumOfFourDigitNumberAfterSplittingDigits.minimumSum(num);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateMinimumSumOfFourDigitNumberAfterSplittingDigitsParams() {
        return Stream.of(
                arguments(2932, 52),
                arguments(4009, 13)
        );
    }

}