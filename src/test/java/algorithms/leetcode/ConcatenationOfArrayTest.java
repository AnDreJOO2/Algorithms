package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ConcatenationOfArrayTest {

    private ConcatenationOfArray concatenationOfArray;

    @BeforeEach
    void setUp() {
        concatenationOfArray = new ConcatenationOfArray();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldConcatenateOfArrayParams")
    void shouldConcatenateOfArray(int[] input, int[] expected) {
        //when
        int[] result = concatenationOfArray.getConcatenation(input);
        //then
        assertThat(result)
                .hasSameSizeAs(expected)
                .containsExactly(expected);
    }


    static Stream<Arguments> shouldConcatenateOfArrayParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                arguments(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1})
        );
    }
}