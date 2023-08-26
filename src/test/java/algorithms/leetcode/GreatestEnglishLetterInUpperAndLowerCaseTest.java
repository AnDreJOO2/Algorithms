package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GreatestEnglishLetterInUpperAndLowerCaseTest {

    private GreatestEnglishLetterInUpperAndLowerCase underTest;

    @BeforeEach
    void setUp() {
        underTest = new GreatestEnglishLetterInUpperAndLowerCase();
    }
    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindGreatestEnglishLetterInUpperAndLowerCaseParams")
    void shouldFindGreatestEnglishLetterInUpperAndLowerCaseOne(String s, String expected) {
        //when
        String result = underTest.greatestLetter(s);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindGreatestEnglishLetterInUpperAndLowerCaseParams")
    void shouldFindGreatestEnglishLetterInUpperAndLowerCaseTwo(String s, String expected) {
        //when
        String result = underTest.greatestLetterTwo(s);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindGreatestEnglishLetterInUpperAndLowerCaseParams() {
        return Stream.of(
                arguments("lEeTcOdE", "E"),
                arguments("arRAzFif", "R"),
                arguments("AbCdEfGhIjK", "")
        );
    }

}
