package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void removeDuplicatesShouldPassTheTest() {

        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})).isEqualTo(5);
        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2})).isEqualTo(2);
    }

    @Test
    void removeDuplicatesShouldNotPassTheTest() {

        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})).isNotEqualTo(4);
    }
}
