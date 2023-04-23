package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortArrayByParityIITest {

    private SortArrayByParityII sortArrayByParityII;

    @BeforeEach
    void setUp() {
        sortArrayByParityII = new SortArrayByParityII();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldSortArrayByParityIIParams")
    void shouldSortWithSortArrayByParityII(int[] nums, int[] expected) {
        //when
        int[] result = sortArrayByParityII.sortArrayByParityII(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldSortArrayByParityIIParams")
    void shouldSortWithSortArrayByParityIISecond(int[] nums, int[] expected) {
        //when
        int[] result = sortArrayByParityII.sortArrayByParityIISecond(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldSortArrayByParityIIParams() {
        return Stream.of(
                arguments(new int[]{4, 2, 5, 7}, new int[]{4, 5, 2, 7}),
                arguments(new int[]{2, 3}, new int[]{2, 3})
        );
    }
}