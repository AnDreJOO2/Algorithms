package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchA2DMatrixTest {

    private SearchA2DMatrix searchA2DMatrix;

    @BeforeEach
    void setUp() {
        searchA2DMatrix = new SearchA2DMatrix();
    }

    @Test
    void shouldFindTargetIn2DMatrix() {
        //when
        boolean result = searchA2DMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotFindTargetIn2DMatrix() {
        //when
        boolean result = searchA2DMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13);
        //then
        assertThat(result).isFalse();
    }
}