package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PercentageOfLetterInStringTest {

    private PercentageOfLetterInString percentageOfLetterInString;

    @BeforeEach
    void setUp() {
        percentageOfLetterInString = new PercentageOfLetterInString();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, letter=`{1}`, expected={2}")
    @MethodSource("shouldCalculatePercentageOfLetterInStringParams")
    void shouldCalculatePercentageOfLetterInString(String s, char letter, int expected) {
        //when
        int result = percentageOfLetterInString.percentageLetter(s, letter);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculatePercentageOfLetterInStringParams() {
        return Stream.of(
                arguments("foobar", 'o', 33),
                arguments("jjjj", 'k', 0)
        );
    }
}