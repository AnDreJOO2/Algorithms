package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReformatDateTest {

    private ReformatDate underTest;

    @BeforeEach
    void setUp() {
        underTest = new ReformatDate();
    }

    @ParameterizedTest(name = "Params: date=`{0}`, expected={1}")
    @MethodSource("shouldReformatDateParams")
    void shouldReformatDate(String date, String expected) {
        //when
        String result = underTest.reformatDate(date);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldReformatDateParams() {
        return Stream.of(
                arguments("20th Oct 2052", "2052-10-20"),
                arguments("6th Jun 1933", "1933-06-06"),
                arguments("26th May 1960", "1960-05-26")
        );
    }
}
