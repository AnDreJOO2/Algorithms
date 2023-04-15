package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TransposeMatrixTest {

    private TransposeMatrix transposeMatrix;

    @BeforeEach
    void setUp() {
        transposeMatrix = new TransposeMatrix();
    }

    @ParameterizedTest(name = "Params: matrix=`{0}`, expected=`{1}`")
    @MethodSource("shouldTransposeMatrixParams")
    void shouldTransposeMatrix(int[][] matrix, int[][] expected) {
        //when
        int[][] result = transposeMatrix.transpose(matrix);
        //then
        assertThat(result)
                .isNotNull()
                .isDeepEqualTo(expected);
    }


    static Stream<Arguments> shouldTransposeMatrixParams() {
        return Stream.of(
                arguments(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}),
                arguments(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{1, 4}, {2, 5}, {3, 6}})
        );
    }
}