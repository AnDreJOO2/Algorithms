package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ClimbingStairsTest {

    private ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("climbingStarsParams")
    void shouldClimbStarsRecursively(int input, int expected) {
        //when
        int result = climbingStairs.climbStairsRecursion(input);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("climbingStarsParams")
    void shouldClimbStars(int input, int expected) {
        //when
        int result = climbingStairs.climbStairs(input);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }


    static Stream<Arguments> climbingStarsParams() {
        return Stream.of(
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 3),
                arguments(4, 5),
                arguments(5, 8)
        );
    }
}