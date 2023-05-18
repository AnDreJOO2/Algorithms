package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DivideArrayIntoEqualPairsTest {

    private DivideArrayIntoEqualPairs divideArrayIntoEqualPairs;

    @BeforeEach
    void setUp() {
        divideArrayIntoEqualPairs = new DivideArrayIntoEqualPairs();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldDivideArrayIntoEqualPairsParams")
    void shouldDivideArrayIntoEqualPairs(int[] nums, boolean expected) {
        //when
        boolean result = divideArrayIntoEqualPairs.divideArray(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldDivideArrayIntoEqualPairsParams() {
        return Stream.of(
                arguments(new int[]{3, 2, 3, 2, 2, 2}, true),
                arguments(new int[]{1, 2, 3, 4}, false)
        );
    }
}