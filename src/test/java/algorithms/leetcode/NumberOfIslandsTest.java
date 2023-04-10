package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;

    @BeforeEach
    void setUp() {
        numberOfIslands = new NumberOfIslands();
    }

    @ParameterizedTest(name = "Params: beforeMoving=`{0}`, afterMoving=`{1}`")
    @MethodSource("shouldCalculateNumberOfIslandsParams")
    void shouldCalculateNumberOfIslands(char[][] grid, int expected) {
        //when
        int result = numberOfIslands.numIslands(grid);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateNumberOfIslandsParams() {
        return Stream.of(
                arguments(new char[][]{
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                }, 1),
                arguments(new char[][]{
                        {'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'},
                }, 3)
        );
    }
}