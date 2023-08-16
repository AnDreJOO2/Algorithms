package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeTwo2DArraysBySummingValuesTest {

    private MergeTwo2DArraysBySummingValues underTest;

    @BeforeEach
    void setUp() {
        underTest = new MergeTwo2DArraysBySummingValues();
    }

    @ParameterizedTest(name = "Params: nums1=`{0}`, nums2=`{1}`, expected=`{2}`")
    @MethodSource("shouldMergeTwo2DArraysBySummingValuesParams")
    void shouldMergeTwo2DArraysBySummingValues(int[][] nums1, int[][] nums2, int[][] expected) {
        //when
        int[][] result = underTest.mergeArrays(nums1, nums2);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameDimensionsAs(expected)
                .isDeepEqualTo(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldMergeTwo2DArraysBySummingValuesParams() {
        return Stream.of(
                arguments(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{1, 6}, {2, 3}, {3, 2}, {4, 6}}),
                arguments(new int[][]{{2, 4}, {3, 6}, {5, 5}}, new int[][]{{1, 3}, {4, 3}}, new int[][]{{1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}})
        );
    }
}
