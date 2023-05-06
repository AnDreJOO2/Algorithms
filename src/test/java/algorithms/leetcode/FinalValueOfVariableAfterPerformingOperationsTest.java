package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FinalValueOfVariableAfterPerformingOperationsTest {

    private FinalValueOfVariableAfterPerformingOperations finalValueOfVariableAfterPerformingOperations;

    @BeforeEach
    void setUp() {
        finalValueOfVariableAfterPerformingOperations = new FinalValueOfVariableAfterPerformingOperations();
    }

    @ParameterizedTest(name = "Params: operations=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateFinalValueOfVariableAfterPerformingOperationsParams")
    void shouldCalculateFinalValueOfVariableAfterPerformingOperations(String[] operations, int expected) {
        //when
        int result = finalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCalculateFinalValueOfVariableAfterPerformingOperationsParams() {
        return Stream.of(
                arguments(new String[]{"--X", "X++", "X++"}, 1),
                arguments(new String[]{"++X", "++X", "X++"}, 3),
                arguments(new String[]{"X++", "++X", "--X", "X--"}, 0)
        );
    }
}