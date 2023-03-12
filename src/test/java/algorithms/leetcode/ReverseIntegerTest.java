package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @BeforeEach
    void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("reverseIntegersArguments")
    void shouldReverseIntegers(int input, int expected) {
        //when
        int result = reverseInteger.reverse(input);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("criticalConditionsArguments")
    void shouldReverseIntegersWithCriticalConditions(int input, int expected) {
        //when
        int result = reverseInteger.reverse(input);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> reverseIntegersArguments() {
        return Stream.of(
                arguments(123, 321),
                arguments(-123, -321),
                arguments(120, 21)
        );
    }

    static Stream<Arguments> criticalConditionsArguments() {
        return Stream.of(
                arguments(Integer.MIN_VALUE, 0),
                arguments(Integer.MAX_VALUE, 0)
        );
    }


}