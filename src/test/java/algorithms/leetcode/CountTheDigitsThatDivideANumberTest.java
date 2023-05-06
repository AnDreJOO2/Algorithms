package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountTheDigitsThatDivideANumberTest {

    private CountTheDigitsThatDivideANumber countTheDigitsThatDivideANumber;

    @BeforeEach
    void setUp() {
        countTheDigitsThatDivideANumber = new CountTheDigitsThatDivideANumber();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountTheDigitsThatDivideANumberParams")
    void shouldCountTheDigitsThatDivideANumber(int nums, int expected) {
        //when
        int result = countTheDigitsThatDivideANumber.countDigits(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountTheDigitsThatDivideANumberParams() {
        return Stream.of(
                arguments(7, 1),
                arguments(121, 2),
                arguments(1248, 4)
        );
    }
}