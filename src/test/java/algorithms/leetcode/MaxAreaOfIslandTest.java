package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaxAreaOfIslandTest {

    private MaxAreaOfIsland maxAreaOfIsland;

    @BeforeEach
    void setUp() {
        maxAreaOfIsland = new MaxAreaOfIsland();
    }

    @ParameterizedTest(name = "Params: grid=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaxAreaOfIslandParams")
    void shouldCalculateMaxAreaOfIsland(int[][] grid, int expected) {
        //when
        int result = maxAreaOfIsland.maxAreaOfIsland(grid);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaxAreaOfIslandParams() {
        return Stream.of(
                arguments(new int[][]{
                        {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                }, 6),
                arguments(new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}}, 0)
        );
    }
}