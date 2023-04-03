package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PowerOfTwoTest {

    private PowerOfTwo powerOfTwo;

    @BeforeEach
    void setUp() {
        powerOfTwo = new PowerOfTwo();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldCheckIfPowerOfTwoReturnsTrueParams")
    void shouldCheckIfPowerOfTwoReturnsTrue(int number) {
        //when
        boolean result = powerOfTwo.isPowerOfTwo(number);
        //then
        assertThat(result)
                .isTrue();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldCheckIfPowerOfTwoReturnsFalseParams")
    void shouldCheckIfPowerOfTwoReturnsFalse(int number) {
        //when
        boolean result = powerOfTwo.isPowerOfTwo(number);
        //then
        assertThat(result)
                .isFalse();
    }

    static Stream<Arguments> shouldCheckIfPowerOfTwoReturnsTrueParams() {
        return Stream.of(
                arguments(1),
                arguments(2),
                arguments(4),
                arguments(8),
                arguments(16)
        );
    }

    static Stream<Arguments> shouldCheckIfPowerOfTwoReturnsFalseParams() {
        return Stream.of(
                arguments(-1),
                arguments(0),
                arguments(3),
                arguments(9),
                arguments(22)
        );
    }
}