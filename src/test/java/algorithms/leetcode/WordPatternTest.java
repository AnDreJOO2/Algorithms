package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WordPatternTest {

    private WordPattern wordPattern;

    @BeforeEach
    void setUp() {
        wordPattern = new WordPattern();
    }

    @ParameterizedTest(name = "Params: pattern=`{0}`, s=`{1}`, expected=`{2}`")
    @MethodSource("shouldCheckWordPatternParams")
    void shouldCheckWordPattern(String pattern, String s, boolean expected) {
        //when
        boolean result = wordPattern.wordPattern(pattern, s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCheckWordPatternParams() {
        return Stream.of(
                arguments("abba", "dog cat cat dog", true),
                arguments("abba", "dog cat cat fish", false),
                arguments("aaaa", "dog cat cat dog", false)
        );
    }
}
