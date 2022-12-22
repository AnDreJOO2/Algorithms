package algorithms;

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
    void binarySearchShouldPassTheTest() {

        assertThat(binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5)).isEqualTo(4);
        assertThat(binarySearch.binarySearch(new int[]{2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 7, 8, 9, 10}, 4)).isEqualTo(8);
        assertThat(binarySearch.binarySearch(new int[]{2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 7, 8, 9, 10, 11}, 5)).isEqualTo(11);
    }
}
