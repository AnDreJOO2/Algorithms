package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfStepsToReduceANumberToZeroTest {

    private NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero;

    @BeforeEach
    void setUp() {
        numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountNumberOfStepsToReduceANumberToZeroParams")
    void shouldCountNumberOfStepsToReduceANumberToZero(int num, int expected) {
        //when
        int result = numberOfStepsToReduceANumberToZero.numberOfSteps(num);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountNumberOfStepsToReduceANumberToZeroParams() {
        return Stream.of(
                arguments(14, 6),
                arguments(8, 4)
        );
    }
}
