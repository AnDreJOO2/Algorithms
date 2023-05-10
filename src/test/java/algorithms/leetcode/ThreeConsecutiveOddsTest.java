package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ThreeConsecutiveOddsTest {

    private ThreeConsecutiveOdds threeConsecutiveOdds;

    @BeforeEach
    void setUp() {
        threeConsecutiveOdds = new ThreeConsecutiveOdds();
    }

    @ParameterizedTest(name = "Params: arr=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckIfArrContainsThreeConsecutiveOddsParams")
    void shouldCheckIfArrContainsThreeConsecutiveOdds(int[] arr, boolean expected) {
        // when
        boolean result = threeConsecutiveOdds.threeConsecutiveOdds(arr);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCheckIfArrContainsThreeConsecutiveOddsParams() {
        return Stream.of(
                arguments(new int[]{2, 6, 4, 1}, false),
                arguments(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}, true)
        );
    }

}