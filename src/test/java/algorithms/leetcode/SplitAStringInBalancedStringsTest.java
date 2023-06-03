package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SplitAStringInBalancedStringsTest {

    private SplitAStringInBalancedStrings splitAStringInBalancedStrings;

    @BeforeEach
    void setUp() {
        splitAStringInBalancedStrings = new SplitAStringInBalancedStrings();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldSplitAStringInBalancedStringsParams")
    void shouldCalculateFinalValueOfVariableAfterPerformingOperations(String s, int expected) {
        //when
        int result = splitAStringInBalancedStrings.balancedStringSplit(s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldSplitAStringInBalancedStringsParams() {
        return Stream.of(
                arguments("RLRRLLRLRL", 4),
                arguments("RLRRRLLRLL", 2),
                arguments("LLLLRRRR", 1)
        );
    }
}
