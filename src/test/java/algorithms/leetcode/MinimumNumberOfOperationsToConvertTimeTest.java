package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MinimumNumberOfOperationsToConvertTimeTest {

    private MinimumNumberOfOperationsToConvertTime underTest;

    @BeforeEach
    void setUp() {
        underTest = new MinimumNumberOfOperationsToConvertTime();
    }

    @ParameterizedTest(name = "Params: current=`{0}`, correct=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountMinimumNumberOfOperationsToConvertTimeParams")
    void shouldCountMinimumNumberOfOperationsToConvertTime(String current, String correct, int expected) {
        //when
        int result = underTest.convertTime(current, correct);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountMinimumNumberOfOperationsToConvertTimeParams() {
        return Stream.of(
                arguments("02:30", "04:35", 3),
                arguments("11:00", "11:01", 1)
        );
    }
}
