package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MeanOfArrayAfterRemovingSomeElementsTest {

    private MeanOfArrayAfterRemovingSomeElements meanOfArrayAfterRemovingSomeElements;

    @BeforeEach
    void setUp() {
        meanOfArrayAfterRemovingSomeElements = new MeanOfArrayAfterRemovingSomeElements();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMeanOfArrayAfterRemovingSomeElementsParams")
    void shouldCalculateMeanOfArrayAfterRemovingSomeElements(int[] nums, double expected) {
        //when
        double result = meanOfArrayAfterRemovingSomeElements.trimMean(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMeanOfArrayAfterRemovingSomeElementsParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}, 2.00000),
                arguments(new int[]{6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0}, 4.00000),
                arguments(new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4}, 4.777777777777778)
        );
    }
}