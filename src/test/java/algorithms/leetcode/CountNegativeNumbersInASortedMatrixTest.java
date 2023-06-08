package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountNegativeNumbersInASortedMatrixTest {

    private CountNegativeNumbersInASortedMatrix countNegativeNumbersInASortedMatrix;

    @BeforeEach
    void setUp() {
        countNegativeNumbersInASortedMatrix = new CountNegativeNumbersInASortedMatrix();
    }

    @ParameterizedTest(name = "Params: grid=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountNegativeNumbersInASortedMatrixParams")
    void shouldCountNegativeNumbersInASortedMatrix(int[][] grid, int expected) {
        //when
        int result = countNegativeNumbersInASortedMatrix.countNegatives(grid);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountNegativeNumbersInASortedMatrixParams() {
        return Stream.of(
                arguments(new int[][]{
                        new int[]{4, 3, 2, -1},
                        new int[]{3, 2, 1, -1},
                        new int[]{1, 1, -1, -2},
                        new int[]{-1, -1, -2, -3},
                }, 8),
                arguments(new int[][]{
                        new int[]{3, 2},
                        new int[]{1, 0}
                }, 0)
        );
    }
}
