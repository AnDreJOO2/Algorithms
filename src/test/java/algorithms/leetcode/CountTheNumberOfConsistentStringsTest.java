package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountTheNumberOfConsistentStringsTest {

    private CountTheNumberOfConsistentStrings countTheNumberOfConsistentStrings;

    @BeforeEach
    void setUp() {
        countTheNumberOfConsistentStrings = new CountTheNumberOfConsistentStrings();
    }

    @ParameterizedTest(name = "Params: allowed=`{0}`, words=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountTheNumberOfConsistentStringsParams")
    void shouldCountTheNumberOfConsistentStrings(String allowed, String[] words, int expected) {
        //when
        int result = countTheNumberOfConsistentStrings.countConsistentStrings(allowed, words);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountTheNumberOfConsistentStringsParams() {
        return Stream.of(
                arguments("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}, 2),
                arguments("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}, 7),
                arguments("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}, 4)
        );
    }
}