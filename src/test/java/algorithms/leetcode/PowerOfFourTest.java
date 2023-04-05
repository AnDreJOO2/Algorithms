package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PowerOfFourTest {

    private PowerOfFour powerOfFour;

    @BeforeEach
    void setUp() {
        powerOfFour = new PowerOfFour();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldCheckIfPowerOfFourReturnsTrueParams")
    void shouldCheckIfPowerOfFourReturnsTrue(int number) {
        //when
        boolean result = powerOfFour.isPowerOfFour(number);
        //then
        assertThat(result)
                .isTrue();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldCheckIfPowerOfFourReturnsFalseParams")
    void shouldCheckIfPowerOfFourReturnsFalse(int number) {
        //when
        boolean result = powerOfFour.isPowerOfFour(number);
        //then
        assertThat(result)
                .isFalse();
    }

    static Stream<Arguments> shouldCheckIfPowerOfFourReturnsTrueParams() {
        return Stream.of(
                arguments(1),
                arguments(4),
                arguments(16),
                arguments(64),
                arguments(256)
        );
    }

    static Stream<Arguments> shouldCheckIfPowerOfFourReturnsFalseParams() {
        return Stream.of(
                arguments(-1),
                arguments(0),
                arguments(5),
                arguments(12),
                arguments(36)
        );
    }
}