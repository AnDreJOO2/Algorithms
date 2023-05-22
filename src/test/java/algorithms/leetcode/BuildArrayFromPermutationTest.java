package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BuildArrayFromPermutationTest {

    private BuildArrayFromPermutation buildArrayFromPermutation;

    @BeforeEach
    void setUp() {
        buildArrayFromPermutation = new BuildArrayFromPermutation();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldBuildArrayFromPermutationParams")
    void shouldBuildArrayFromPermutation(int[] nums, int[] expected) {
        //when
        int[] result = buildArrayFromPermutation.buildArray(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldBuildArrayFromPermutationParams() {
        return Stream.of(
                arguments(new int[]{0, 2, 1, 5, 3, 4}, new int[]{0, 1, 2, 4, 5, 3}),
                arguments(new int[]{5, 0, 1, 2, 3, 4}, new int[]{4, 5, 0, 1, 2, 3})
        );
    }
}