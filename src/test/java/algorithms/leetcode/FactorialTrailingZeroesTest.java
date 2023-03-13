package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTrailingZeroesTest {

    private FactorialTrailingZeroes factorialTrailingZeroes;

    @BeforeEach
    void setUp() {
        factorialTrailingZeroes = new FactorialTrailingZeroes();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @CsvSource({
            "3, 0",
            "5, 1",
            "0, 0",
            "30, 7"
    })
    void shouldPassTrailingZeroes(int input, int expected) {
        //when
        int result = factorialTrailingZeroes.trailingZeroes(input);
        //then
        assertThat(result).isEqualTo(expected);
    }
}