package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeStringsAlternatelyTest {

    private MergeStringsAlternately mergeStringsAlternately;

    @BeforeEach
    void setUp() {
        mergeStringsAlternately = new MergeStringsAlternately();
    }

    @ParameterizedTest(name = "Params: word1=`{0}`, word2=`{1}`, expected=`{2}`")
    @MethodSource("shouldMergeStringsAlternatelyParams")
    void shouldMergeStringsAlternately(String word1, String word2, String expected) {
        //when
        String result = mergeStringsAlternately.mergeAlternately(word1, word2);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldMergeStringsAlternatelyParams() {
        return Stream.of(
                arguments("abc", "pqr", "apbqcr"),
                arguments("ab", "pqrs", "apbqrs"),
                arguments("abcd", "pq", "apbqcd")
        );
    }
}