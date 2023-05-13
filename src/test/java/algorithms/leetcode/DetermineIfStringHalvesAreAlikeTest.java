package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DetermineIfStringHalvesAreAlikeTest {

    private DetermineIfStringHalvesAreAlike determineIfStringHalvesAreAlike;

    @BeforeEach
    void setUp() {
        determineIfStringHalvesAreAlike = new DetermineIfStringHalvesAreAlike();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldDetermineIfStringHalvesAreAlikeParams")
    void shouldDetermineIfStringHalvesAreAlike(String s, boolean expected) {
        // when
        boolean result = determineIfStringHalvesAreAlike.halvesAreAlike(s);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldDetermineIfStringHalvesAreAlikeParams() {
        return Stream.of(
                arguments("book", true),
                arguments("textbook", false)
        );
    }

}