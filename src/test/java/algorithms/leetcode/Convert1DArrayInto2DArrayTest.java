package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Convert1DArrayInto2DArrayTest {

    private Convert1DArrayInto2DArray underTest;

    @BeforeEach
    void setUp() {
        underTest = new Convert1DArrayInto2DArray();
    }

    @ParameterizedTest(name = "Params: original=`{0}`, m=`{1}`, n=`{2}`, expected=`{3}`")
    @MethodSource("shouldConvert1DArrayInto2DArrayParams")
    void shouldConvert1DArrayInto2DArray(int[] original, int m, int n, int[][] expected) {
        //when
        int[][] result = underTest.construct2DArray(original, m, n);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameDimensionsAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldConvert1DArrayInto2DArrayParams() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4}, 2, 2,
                        new int[][]{
                                {1, 2},
                                {3, 4}
                        }),
                Arguments.arguments(new int[]{1, 2, 3}, 1, 3,
                        new int[][]{
                                {1, 2, 3}
                        }),
                Arguments.arguments(new int[]{1, 2}, 1, 1,
                        new int[][]{

                        })
        );
    }
}
