package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void binarySearchShouldFindTheTarget() {

        //given
        int[] givenArray = {-1, 0, 3, 5, 9, 12};
        int givenTarget = 9;
        // when
        int result = binarySearch.search(givenArray, givenTarget);
        int expected = 4;
        // then
        assertThat(result).isEqualTo(expected);
    }
}
