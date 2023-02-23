package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SummaryRangesTest {

    private SummaryRanges summaryRanges;

    @BeforeEach
    void setUp() {
        summaryRanges = new SummaryRanges();
    }

    @Test
    void summaryRangesShouldPassTheTest() {
        assertThat(summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7})).isEqualTo(Arrays.asList("0->2", "4->5", "7"));
        assertThat(summaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})).isEqualTo(Arrays.asList("0", "2->4", "6", "8->9"));
    }

    @Test
    void summaryRangesTwoShouldPassTheTest() {
        assertThat(summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7})).isEqualTo(Arrays.asList("0->2", "4->5", "7"));
        assertThat(summaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})).isEqualTo(Arrays.asList("0", "2->4", "6", "8->9"));
    }

    @Test
    void summaryRangesShouldNotPassTheTest() {
        assertThat(summaryRanges.summaryRangesTwo(new int[]{0, 1, 2, 4, 7})).isNotEqualTo(Arrays.asList("0->2", "4->5", "7"));
        assertThat(summaryRanges.summaryRangesTwo(new int[]{0, 2, 3, 4, 6, 8})).isNotEqualTo(Arrays.asList("0", "2->4", "6", "8->9"));
    }

    @Test
    void summaryRangesTwoShouldNotPassTheTest() {
        assertThat(summaryRanges.summaryRangesTwo(new int[]{0, 1, 2, 4, 7})).isNotEqualTo(Arrays.asList("0->2", "4->5", "7"));
        assertThat(summaryRanges.summaryRangesTwo(new int[]{0, 2, 3, 4, 6, 8})).isNotEqualTo(Arrays.asList("0", "2->4", "6", "8->9"));
    }
}
