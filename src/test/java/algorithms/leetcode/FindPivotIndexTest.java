package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindPivotIndexTest {

    private FindPivotIndex findPivotIndex;

    @BeforeEach
    void setUp() {
        findPivotIndex = new FindPivotIndex();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindPivotIndexParams")
    void shouldFindPivotIndex(int[] input, int expected) {
        //when
        int result = findPivotIndex.pivotIndex(input);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindPivotIndexParams() {
        return Stream.of(
                arguments(new int[]{1, 7, 3, 6, 5, 6}, 3),
                arguments(new int[]{1, 2, 3}, -1),
                arguments(new int[]{2, 1, -1}, 0)
        );
    }
}