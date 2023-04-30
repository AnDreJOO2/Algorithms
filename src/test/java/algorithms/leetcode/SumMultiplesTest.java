package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumMultiplesTest {

    private SumMultiples sumMultiples;

    @BeforeEach
    void setUp() {
        sumMultiples = new SumMultiples();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected={1}")
    @MethodSource("shouldSumMultiplesParams")
    void shouldSumMultiples(int n, int expected) {
        //when
        int result = sumMultiples.sumOfMultiples(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldSumMultiplesParams() {
        return Stream.of(
                arguments(7, 21),
                arguments(10, 40),
                arguments(9, 30)
        );
    }
}