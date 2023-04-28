package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindNumbersWithEvenNumberOfDigitsTest {

    private FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits;

    @BeforeEach
    void setUp() {
        findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
    }

    @ParameterizedTest(name = "Params: nums =`{0}`, expected=`{1}`")
    @MethodSource("shouldFindNumbersWithEvenNumberOfDigitsParams")
    void shouldFindNumbersWithEvenNumberOfDigits(int[] nums, int expected) {
        //when
        int result = findNumbersWithEvenNumberOfDigits.findNumbers(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindNumbersWithEvenNumberOfDigitsParams() {
        return Stream.of(
                arguments(new int[]{12, 345, 2, 6, 7896}, 2),
                arguments(new int[]{555, 901, 482, 1771}, 1)
        );
    }
}