package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray;

    @BeforeEach
    void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    void mergeShouldSortArrays() {

        // test 1
        // given
        int[] test1_nums1 = {1, 2, 3, 0, 0, 0};
        int test1_m = 3;
        int[] test1_nums2 = {2, 5, 6};
        int test1_n = 3;

        //when
        mergeSortedArray.merge(test1_nums1, test1_m, test1_nums2, test1_n);

        //then
        assertThat(test1_nums1).isSorted();
        assertThat(test1_nums1[test1_nums1.length - 1]).isEqualTo(6);

        // test 2
        // given
        int[] test2_nums1 = {1};
        int test2_m = 1;
        int[] test2_nums2 = {};
        int test2_n = 0;

        //when
        mergeSortedArray.merge(test2_nums1, test2_m, test2_nums2, test2_n);

        //then
        assertThat(test2_nums1).isSorted();
        assertThat(test2_nums1[test2_nums1.length - 1]).isEqualTo(1);
    }
}
