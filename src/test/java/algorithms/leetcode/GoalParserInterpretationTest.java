package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GoalParserInterpretationTest {

    private GoalParserInterpretation goalParserInterpretation;

    @BeforeEach
    void setUp() {
        goalParserInterpretation = new GoalParserInterpretation();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldGoalParserInterpretationParams")
    void shouldGoalParserInterpretation(String command, String expected) {
        //when
        String result = goalParserInterpretation.interpret(command);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldGoalParserInterpretationParams() {
        return Stream.of(
                arguments("G()(al)", "Goal"),
                arguments("G()()()()(al)", "Gooooal"),
                arguments("(al)G(al)()()G", "alGalooG")
        );
    }
}
