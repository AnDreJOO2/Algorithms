package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PascalsTriangleIITest {

    private PascalsTriangleII pascalsTriangleII;

    @BeforeEach
    void setUp() {
        pascalsTriangleII = new PascalsTriangleII();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldGeneratePascalTriangleIIParams")
    void shouldGeneratePascalTriangleIIFirstSolution(int input, List<Integer> expected) {
        //when
        List<Integer> result = pascalsTriangleII.getRowFirst(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .isEqualTo(expected)
                .containsExactlyElementsOf(expected);
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldGeneratePascalTriangleIIParams")
    void shouldGeneratePascalTriangleIISecondSolution(int input, List<Integer> expected) {
        //when
        List<Integer> result = pascalsTriangleII.getRowSecond(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .isEqualTo(expected)
                .containsExactlyElementsOf(expected);
    }

    static Stream<Arguments> shouldGeneratePascalTriangleIIParams() {
        return Stream.of(
                arguments(3, Arrays.asList(1, 3, 3, 1)),
                arguments(0, Arrays.asList(1)),
                arguments(1, Arrays.asList(1, 1))
        );
    }
}