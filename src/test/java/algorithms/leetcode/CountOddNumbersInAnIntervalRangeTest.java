package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountOddNumbersInAnIntervalRangeTest {

    private CountOddNumbersInAnIntervalRange underTest;

    @BeforeEach
    void setUp() {
        underTest = new CountOddNumbersInAnIntervalRange();
    }

    @ParameterizedTest(name = "Params: low=`{0}`, high=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountOddNumbersInAnIntervalRangeParams")
    void shouldCountOddNumbersInAnIntervalRange(int low, int high, int expected) {
        //when
        int result = underTest.countOdds(low, high);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountOddNumbersInAnIntervalRangeParams() {
        return Stream.of(
                arguments(3, 7, 3),
                arguments(8, 10, 1)
        );
    }
}
