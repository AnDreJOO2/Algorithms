package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PowerOfThreeTest {

    private PowerOfThree powerOfThree;

    @BeforeEach
    void setUp() {
        powerOfThree = new PowerOfThree();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldCheckIfPowerOfThreeReturnsTrueParams")
    void shouldCheckIfPowerOfThreeReturnsTrue(int number) {
        //when
        boolean result = powerOfThree.isPowerOfThree(number);
        //then
        assertThat(result)
                .isTrue();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldCheckIfPowerOfThreeReturnsFalseParams")
    void shouldCheckIfPowerOfThreeReturnsFalse(int number) {
        //when
        boolean result = powerOfThree.isPowerOfThree(number);
        //then
        assertThat(result)
                .isFalse();
    }


    static Stream<Arguments> shouldCheckIfPowerOfThreeReturnsTrueParams() {
        return Stream.of(
                arguments(1),
                arguments(3),
                arguments(9),
                arguments(27),
                arguments(81)
        );
    }

    static Stream<Arguments> shouldCheckIfPowerOfThreeReturnsFalseParams() {
        return Stream.of(
                arguments(-1),
                arguments(-3),
                arguments(0),
                arguments(2),
                arguments(6),
                arguments(18),
                arguments(25)
        );
    }

}