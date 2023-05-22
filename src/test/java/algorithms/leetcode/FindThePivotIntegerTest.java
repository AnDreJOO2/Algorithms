package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindThePivotIntegerTest {

    private FindThePivotInteger findThePivotInteger;

    @BeforeEach
    void setUp() {
        findThePivotInteger = new FindThePivotInteger();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindThePivotIntegerParams")
    void shouldFindThePivotInteger(int n, int expected) {
        //when
        int result = findThePivotInteger.pivotInteger(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindThePivotIntegerParams() {
        return Stream.of(
                arguments(8, 6),
                arguments(1, 1),
                arguments(4, -1)
        );
    }
}