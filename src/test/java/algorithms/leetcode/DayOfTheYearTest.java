package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DayOfTheYearTest {

    private DayOfTheYear underTest;

    @BeforeEach
    void setUp() {
        underTest = new DayOfTheYear();
    }

    @ParameterizedTest(name = "Params: date=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateDayOfTheYearParams")
    void shouldCalculateDayOfTheYear(String date, int expected) {
        //when
        int result = underTest.dayOfYear(date);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateDayOfTheYearParams() {
        return Stream.of(
                arguments("2019-01-09", 9),
                arguments("2019-02-10", 41),
                arguments("2012-01-02", 2),
                arguments("2012-03-02", 62)
        );
    }
}
