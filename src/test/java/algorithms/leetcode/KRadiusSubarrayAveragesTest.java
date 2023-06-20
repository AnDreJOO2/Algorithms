package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class KRadiusSubarrayAveragesTest {

    private KRadiusSubarrayAverages kRadiusSubarrayAverages;

    @BeforeEach
    void setUp() {
        kRadiusSubarrayAverages = new KRadiusSubarrayAverages();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, k=`{1}`, expected=`{2}`")
    @MethodSource("shouldKRadiusSubarrayAveragesParams")
    void shouldKRadiusSubarrayAverages(int[] nums, int k, int[] expected) {
        //when
        int[] result = kRadiusSubarrayAverages.getAverages(nums, k);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldKRadiusSubarrayAveragesParams() {
        return Stream.of(
                arguments(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3, new int[]{-1, -1, -1, 5, 4, 4, -1, -1, -1}),
                arguments(new int[]{100000}, 0, new int[]{100000}),
                arguments(new int[]{8}, 100000, new int[]{-1})
        );
    }
}
