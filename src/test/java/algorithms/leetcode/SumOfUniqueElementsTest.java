package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumOfUniqueElementsTest {

    private SumOfUniqueElements sumOfUniqueElements;

    @BeforeEach
    void setUp() {
        sumOfUniqueElements = new SumOfUniqueElements();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldReturnSumOfUniqueElementsParams")
    void shouldReturnSumOfUniqueElements(int[] input, int expected) {
        //when
        int result = sumOfUniqueElements.sumOfUnique(input);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldReturnSumOfUniqueElementsParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 2}, 4),
                arguments(new int[]{1, 1, 1, 1, 1}, 0),
                arguments(new int[]{1, 2, 3, 4, 5}, 15)
        );
    }
}