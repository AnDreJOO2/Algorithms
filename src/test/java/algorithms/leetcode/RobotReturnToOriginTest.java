package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RobotReturnToOriginTest {

    private RobotReturnToOrigin robotReturnToOrigin;

    @BeforeEach
    void setUp() {
        robotReturnToOrigin = new RobotReturnToOrigin();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldRobotReturnToOriginReturnTrueParams")
    void shouldRobotReturnToOriginReturnTrue(String input, boolean expected) {
        //when
        boolean result = robotReturnToOrigin.judgeCircle(input);
        //then
        assertThat(result)
                .isTrue()
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldRobotReturnToOriginReturnFalseParams")
    void shouldRobotReturnToOriginReturnFalse(String input, boolean expected) {
        //when
        boolean result = robotReturnToOrigin.judgeCircle(input);
        //then
        assertThat(result)
                .isFalse()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldRobotReturnToOriginReturnTrueParams() {
        return Stream.of(
                arguments("UD", true),
                arguments("UDLRLR", true)
        );
    }

    static Stream<Arguments> shouldRobotReturnToOriginReturnFalseParams() {
        return Stream.of(
                arguments("LL", false),
                arguments("LLRRUDD", false)
        );
    }
}