package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumNumberOfWordsFoundInSentencesTest {

    private MaximumNumberOfWordsFoundInSentences maximumNumberOfWordsFoundInSentences;

    @BeforeEach
    void setUp() {
        maximumNumberOfWordsFoundInSentences = new MaximumNumberOfWordsFoundInSentences();
    }

    @ParameterizedTest(name = "Params: sentences=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumNumberOfWordsFoundInSentencesParams")
    void shouldCalculateMaximumNumberOfWordsFoundInSentences(String[] sentences, int expected) {
        // when
        int result = maximumNumberOfWordsFoundInSentences.mostWordsFound(sentences);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCalculateMaximumNumberOfWordsFoundInSentencesParams() {
        return Stream.of(
                arguments(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}, 6),
                arguments(new String[]{"please wait", "continue to fight", "continue to win"}, 3)
        );
    }
}