package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountPrimesTest {

    private CountPrimes countPrimes;

    @BeforeEach
    void setUp() {
        countPrimes = new CountPrimes();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountPrimesParams")
    void shouldCountPrimes(int n, int expected) {
        //when
        int result = countPrimes.countPrimes(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountPrimesParams() {
        return Stream.of(
                arguments(10, 4),
                arguments(0, 0),
                arguments(1, 0)
        );
    }
}
