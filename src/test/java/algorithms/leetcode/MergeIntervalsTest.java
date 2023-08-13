package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeIntervalsTest {

    private MergeIntervals underTest;

    @BeforeEach
    void setUp() {
        underTest = new MergeIntervals();
    }

    @ParameterizedTest(name = "Params: intervals=`{0}`, expected=`{1}`")
    @MethodSource("shouldMergeIntervalsParams")
    void shouldMergeIntervals(int[][] intervals, int[][] expected) {
        //when
        int[][] result = underTest.merge(intervals);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameDimensionsAs(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldMergeIntervalsParams() {
        return Stream.of(
                arguments(
                        new int[][]{
                                {1, 3},
                                {2, 6},
                                {8, 10},
                                {15, 18}
                        },
                        new int[][]{
                                {1, 6},
                                {8, 10},
                                {15, 18}
                        }),
                arguments(
                        new int[][]{
                                {1, 4},
                                {4, 5}
                        },
                        new int[][]{
                                {1, 5}
                        })
        );
    }
}
