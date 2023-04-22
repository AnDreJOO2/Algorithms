package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SpiralMatrixIITest {

    private SpiralMatrixII spiralMatrixII;

    @BeforeEach
    void setUp() {
        spiralMatrixII = new SpiralMatrixII();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldFillAnArrayWithNumbersFromOneToNInSpiralOrderParams")
    void shouldFillAnArrayWithNumbersFromOneToNInSpiralOrder(int n, int[][] expected) {
        //when
        int[][] result = spiralMatrixII.generateMatrix(n);
        //then
        assertThat(result)
                .isNotNull()
                .isDeepEqualTo(expected);
    }

    static Stream<Arguments> shouldFillAnArrayWithNumbersFromOneToNInSpiralOrderParams() {
        return Stream.of(
                arguments(3,
                        new int[][]{
                                new int[]{1, 2, 3},
                                new int[]{8, 9, 4},
                                new int[]{7, 6, 5}
                        }),
                arguments(1, new int[][]{
                        new int[]{1}
                })
        );
    }
}