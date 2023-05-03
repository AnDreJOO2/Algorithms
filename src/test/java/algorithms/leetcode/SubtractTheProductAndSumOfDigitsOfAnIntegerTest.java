package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    private SubtractTheProductAndSumOfDigitsOfAnInteger subtractTheProductAndSumOfDigitsOfAnInteger;

    @BeforeEach
    void setUp() {
        subtractTheProductAndSumOfDigitsOfAnInteger = new SubtractTheProductAndSumOfDigitsOfAnInteger();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldSubtractTheProductAndSumOfDigitsOfAnIntegerParams")
    void shouldSubtractTheProductAndSumOfDigitsOfAnInteger(int n, int expected) {
        //when
        int result = subtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldSubtractTheProductAndSumOfDigitsOfAnIntegerParams() {
        return Stream.of(
                arguments(234, 15),
                arguments(4421, 21)
        );
    }
}