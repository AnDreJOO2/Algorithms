package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class HeightCheckerTest {

    private HeightChecker heightChecker;

    @BeforeEach
    void setUp() {
        heightChecker = new HeightChecker();
    }

    @ParameterizedTest(name = "Params: heights=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountWrongHeightsPositionsParams")
    void shouldCountWrongHeightsPositions(int[] heights, int expected) {
        //when
        int result = heightChecker.heightChecker(heights);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountWrongHeightsPositionsParams() {
        return Stream.of(
                arguments(new int[]{1, 1, 4, 2, 1, 3}, 3),
                arguments(new int[]{5, 1, 2, 3, 4}, 5),
                arguments(new int[]{1, 2, 3, 4, 5}, 0)
        );
    }
}