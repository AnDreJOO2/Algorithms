package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SmallestIndexWithEqualValueTest {

    private SmallestIndexWithEqualValue underTest;

    @BeforeEach
    void setUp() {
        underTest = new SmallestIndexWithEqualValue();
    }

    @ParameterizedTest(name = "Params: nums =`{0}`, expected=`{1}`")
    @MethodSource("shouldFindSmallestIndexWithEqualValueParams")
    void shouldFindSmallestIndexWithEqualValue(int[] nums, int expected) {
        //when
        int result = underTest.smallestEqual(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindSmallestIndexWithEqualValueParams() {
        return Stream.of(
                arguments(new int[]{0, 1, 2}, 0),
                arguments(new int[]{4, 3, 2, 1}, 2),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -1)
        );
    }
}
