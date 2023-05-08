package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MatrixDiagonalSumTest {

    private MatrixDiagonalSum matrixDiagonalSum;

    @BeforeEach
    void setUp() {
        matrixDiagonalSum = new MatrixDiagonalSum();
    }

    @ParameterizedTest(name = "Params: mat=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountMatrixDiagonalSumParams")
    void shouldCountMatrixDiagonalSum(int[][] mat, int expected) {
        //when
        int result = matrixDiagonalSum.diagonalSum(mat);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountMatrixDiagonalSumParams() {
        return Stream.of(
                arguments(new int[][]{
                        new int[]{1, 2, 3},
                        new int[]{4, 5, 6},
                        new int[]{7, 8, 9},
                }, 25),
                arguments(new int[][]{
                        new int[]{1, 1, 1, 1},
                        new int[]{1, 1, 1, 1},
                        new int[]{1, 1, 1, 1},
                        new int[]{1, 1, 1, 1},
                }, 8)
        );
    }
}