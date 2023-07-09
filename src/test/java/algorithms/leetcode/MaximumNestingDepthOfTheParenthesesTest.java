package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumNestingDepthOfTheParenthesesTest {

    private MaximumNestingDepthOfTheParentheses maximumNestingDepthOfTheParentheses;

    @BeforeEach
    void setUp() {
        maximumNestingDepthOfTheParentheses = new MaximumNestingDepthOfTheParentheses();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumNestingDepthOfTheParenthesesParams")
    void shouldCalculateMaximumNestingDepthOfTheParentheses(String s, int expected) {
        //when
        int result = maximumNestingDepthOfTheParentheses.maxDepth(s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaximumNestingDepthOfTheParenthesesParams() {
        return Stream.of(
                arguments("(1+(2*3)+((8)/4))+1", 3),
                arguments("(1)+((2))+(((3)))", 3)
        );
    }
}
