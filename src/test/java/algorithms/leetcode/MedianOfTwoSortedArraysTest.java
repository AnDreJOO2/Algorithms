package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @BeforeEach
    void setUp() {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    }

    @Test
    void findMedianSortedArraysShouldPassTheTest() {
        assertThat(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2);
        assertThat(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(2.5);
    }

    @Test
    void findMedianSortedArraysShouldNotPassTheTest() {
        assertThat(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isNotEqualTo(1);
        assertThat(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isNotEqualTo(2);
    }
}
