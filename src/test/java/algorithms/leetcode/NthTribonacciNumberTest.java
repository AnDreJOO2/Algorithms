package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NthTribonacciNumberTest {

    private NthTribonacciNumber underTest;

    @BeforeEach
    void setUp() {
        underTest = new NthTribonacciNumber();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindNthTribonacciNumberParams")
    void shouldFindNthTribonacciNumber(int n, int expected) {
        //when
        int result = underTest.tribonacci(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindNthTribonacciNumberParams() {
        return Stream.of(
                arguments(4, 4),
                arguments(25, 1389537)
        );
    }
}
