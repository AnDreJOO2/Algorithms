package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SmallestEvenMultipleTest {

    private SmallestEvenMultiple smallestEvenMultiple;

    @BeforeEach
    void setUp() {
        smallestEvenMultiple = new SmallestEvenMultiple();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected={1}")
    @MethodSource("shouldFindSmallestEvenMultipleParams")
    void shouldFindSmallestEvenMultiple(int n, int expected) {
        //when
        int result = smallestEvenMultiple.smallestEvenMultiple(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindSmallestEvenMultipleParams() {
        return Stream.of(
                arguments(5, 10),
                arguments(6, 6)
        );
    }
}