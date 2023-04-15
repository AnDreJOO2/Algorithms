package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortAnArrayTest {

    private SortAnArray sortAnArray;

    @BeforeEach
    void setUp() {
        sortAnArray = new SortAnArray();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldSortAnArrayParams")
    void shouldSortAnArray(int[] nums, int[] expected) {
        //when
        int[] result = sortAnArray.sortArray(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isSorted()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldSortAnArrayParams() {
        return Stream.of(
                arguments(new int[]{5, 2, 3, 1}, new int[]{1, 2, 3, 5}),
                arguments(new int[]{5, 1, 1, 2, 0, 0}, new int[]{0, 0, 1, 1, 2, 5})
        );
    }
}