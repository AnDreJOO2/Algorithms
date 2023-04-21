package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SpiralMatrixTest {

    private SpiralMatrix spiralMatrix;

    @BeforeEach
    void setUp() {
        spiralMatrix = new SpiralMatrix();
    }

    @ParameterizedTest(name = "Params: matrix=`{0}`, expected=`{1}`")
    @MethodSource("spiralMatrixParams")
    void shouldGetListOfElementsInSpiralOrder(int[][] matrix, List<Integer> expected) {
        //when
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyElementsOf(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> spiralMatrixParams() {
        return Stream.of(
                arguments(new int[][]{
                        new int[]{1, 2, 3},
                        new int[]{4, 5, 6},
                        new int[]{7, 8, 9}
                }, List.of(1, 2, 3, 6, 9, 8, 7, 4, 5)),
                arguments(new int[][]{
                        new int[]{1, 2, 3, 4},
                        new int[]{5, 6, 7, 8},
                        new int[]{9, 10, 11, 12}
                }, List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7))
        );
    }
}