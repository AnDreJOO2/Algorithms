package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SeparateTheDigitsInAnArrayTest {

    private SeparateTheDigitsInAnArray separateTheDigitsInAnArray;

    @BeforeEach
    void setUp() {
        separateTheDigitsInAnArray = new SeparateTheDigitsInAnArray();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldSeparateTheDigitsInAnArrayParams")
    void shouldSeparateTheDigitsInAnArray(int[] nums, int[] expected) {
        //when
        int[] result = separateTheDigitsInAnArray.separateDigits(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldSeparateTheDigitsInAnArrayParams() {
        return Stream.of(
                arguments(new int[]{13, 25, 83, 77}, new int[]{1, 3, 2, 5, 8, 3, 7, 7}),
                arguments(new int[]{7, 1, 3, 9}, new int[]{7, 1, 3, 9})
        );
    }
}