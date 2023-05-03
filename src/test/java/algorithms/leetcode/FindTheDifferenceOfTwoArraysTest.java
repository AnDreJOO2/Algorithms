package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindTheDifferenceOfTwoArraysTest {

    private FindTheDifferenceOfTwoArrays findTheDifferenceOfTwoArrays;

    @BeforeEach
    void setUp() {
        findTheDifferenceOfTwoArrays = new FindTheDifferenceOfTwoArrays();
    }

    @ParameterizedTest(name = "Params: nums1=`{0}`, nums2=`{1}`, expected=`{2}`")
    @MethodSource("shouldFindTheDifferenceOfTwoArraysParams")
    void shouldFindTheDifferenceOfTwoArrays(int[] nums1, int[] nums2, List<List<Integer>> expected) {
        //when
        List<List<Integer>> result = findTheDifferenceOfTwoArrays.findDifference(nums1, nums2);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyInAnyOrderElementsOf(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindTheDifferenceOfTwoArraysParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, new int[]{2, 4, 6}, List.of(List.of(1, 3), List.of(4, 6))),
                arguments(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}, List.of(List.of(3), List.of()))
        );
    }
}