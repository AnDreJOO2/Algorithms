package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PascalsTriangleTest {

    private PascalsTriangle pascalsTriangle;

    @BeforeEach
    void setUp() {
        pascalsTriangle = new PascalsTriangle();
    }

    @ParameterizedTest(name = "Params: numRows=`{0}`, expected=`{1}`")
    @MethodSource("params")
    void shouldGeneratePascalTriangle(int numRows, List<List<Integer>> expected) {
        //when
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .isEqualTo(expected)
                .containsExactlyElementsOf(expected);
    }

    static Stream<Arguments> params() {
        return Stream.of(
                arguments(5, List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1))),
                arguments(1, List.of(List.of(1)))
        );
    }
}