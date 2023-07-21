package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class UniqueMorseCodeWordsTest {

    private UniqueMorseCodeWords uniqueMorseCodeWords;

    @BeforeEach
    void setUp() {
        uniqueMorseCodeWords = new UniqueMorseCodeWords();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, expected=`{1}`")
    @MethodSource("shouldUniqueMorseCodeWordsParams")
    void shouldUniqueMorseCodeWords(String[] words, int expected) {
        //when
        int result = uniqueMorseCodeWords.uniqueMorseRepresentations(words);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldUniqueMorseCodeWordsParams() {
        return Stream.of(
                arguments(new String[]{"gin", "zen", "gig", "msg"}, 2),
                arguments(new String[]{"a"}, 1)
        );
    }
}
