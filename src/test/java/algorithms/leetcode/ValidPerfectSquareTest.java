package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidPerfectSquareTest {

    private ValidPerfectSquare validPerfectSquare;

    @BeforeEach
    void setUp() {
        validPerfectSquare = new ValidPerfectSquare();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldValidPerfectSquareReturnsTrueParams")
    void shouldValidPerfectSquareReturnsTrue(int number) {
        //when
        boolean result = validPerfectSquare.isPerfectSquare(number);
        //then
        assertThat(result)
                .isTrue();
    }

    @ParameterizedTest(name = "Params: number=`{0}`")
    @MethodSource("shouldValidPerfectSquareReturnsFalseParams")
    void shouldValidPerfectSquareReturnsFalse(int number) {
        //when
        boolean result = validPerfectSquare.isPerfectSquare(number);
        //then
        assertThat(result)
                .isFalse();
    }


    static Stream<Arguments> shouldValidPerfectSquareReturnsTrueParams() {
        return Stream.of(
                arguments(1),
                arguments(9),
                arguments(16),
                arguments(25),
                arguments(81)
        );
    }

    static Stream<Arguments> shouldValidPerfectSquareReturnsFalseParams() {
        return Stream.of(
                arguments(3),
                arguments(5),
                arguments(12),
                arguments(14),
                arguments(32)
        );
    }


}