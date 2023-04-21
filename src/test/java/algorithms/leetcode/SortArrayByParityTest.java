package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortArrayByParityTest {

    private SortArrayByParity sortArrayByParity;

    @BeforeEach
    void setUp() {
        sortArrayByParity = new SortArrayByParity();
    }

    @ParameterizedTest(name = "Params: jewels=`{0}`, expected=`{1}`")
    @MethodSource("shouldSortArrayByParityParams")
    void shouldSortArrayByParity(int[] nums, int[] expected) {
        //when
        int[] result = sortArrayByParity.sortArrayByParity(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactly(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldSortArrayByParityParams() {
        return Stream.of(
                arguments(new int[]{3, 1, 2, 4}, new int[]{2, 4, 3, 1}),
                arguments(new int[]{0}, new int[]{0})
        );
    }
}