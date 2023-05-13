package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoOutOfThreeTest {

    private TwoOutOfThree twoOutOfThree;

    @BeforeEach
    void setUp() {
        twoOutOfThree = new TwoOutOfThree();
    }

    @ParameterizedTest(name = "Params: nums1=`{0}`, nums2=`{1}`, nums3=`{2}`, expected=`{3}`")
    @MethodSource(value = "shouldFindTwoOutOfThreeParams")
    public void shouldFindTwoOutOfThree(int[] nums1, int[] nums2, int[] nums3, List<Integer> expected) {
        //when
        List<Integer> result = twoOutOfThree.twoOutOfThree(nums1, nums2, nums3);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyInAnyOrderElementsOf(expected);

    }

    static Stream<Arguments> shouldFindTwoOutOfThreeParams() {
        return Stream.of(
                arguments(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3}, List.of(3, 2)),
                arguments(new int[]{3, 1}, new int[]{2, 3}, new int[]{1, 2}, List.of(2, 3, 1)),
                arguments(new int[]{1, 2, 2}, new int[]{4, 3, 3}, new int[]{5}, List.of())
        );
    }
}