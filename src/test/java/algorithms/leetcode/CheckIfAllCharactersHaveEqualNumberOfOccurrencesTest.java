package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {

    private CheckIfAllCharactersHaveEqualNumberOfOccurrences underTest;

    @BeforeEach
    void setUp() {
        underTest = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckIfAllCharactersHaveEqualNumberOfOccurrencesParams")
    void shouldCheckIfAllCharactersHaveEqualNumberOfOccurrences(String s, boolean expected) {
        //when
        boolean result = underTest.areOccurrencesEqual(s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCheckIfAllCharactersHaveEqualNumberOfOccurrencesParams() {
        return Stream.of(
                arguments("abacbc", true),
                arguments("aaabb", false)
        );
    }
}
