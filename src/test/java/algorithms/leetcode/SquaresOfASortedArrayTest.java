package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfASortedArrayTest {

    private SquaresOfASortedArray squaresOfASortedArray;

    @BeforeEach
    void setUp() {
        squaresOfASortedArray = new SquaresOfASortedArray();
    }

    @Test
    void shouldSquareGivenArrayAndReturnSorted() {
        //given
        int[] given = {-4, -1, 0, 3, 10};
        // when
        int[] result = squaresOfASortedArray.sortedSquares(given);
        int[] expected = {0, 1, 9, 16, 100};
        // then
        assertThat(result).isEqualTo(expected).isSorted();
    }
}
