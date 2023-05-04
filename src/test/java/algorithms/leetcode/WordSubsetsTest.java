package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WordSubsetsTest {

    private WordSubsets wordSubsets;

    @BeforeEach
    void setUp() {
        wordSubsets = new WordSubsets();
    }

    @ParameterizedTest(name = "Params: words1=`{0}`, words2=`{1}`, expected=`{2}`")
    @MethodSource("shouldFindWordSubsetsParams")
    void shouldFindWordSubsets(String[] words1, String[] words2, List<String> expected) {
        //when
        List<String> result = wordSubsets.wordSubsets(words1, words2);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyElementsOf(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindWordSubsetsParams() {
        return Stream.of(
                arguments(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"e", "o"}, List.of("facebook", "google", "leetcode")),
                arguments(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"l", "e"}, List.of("apple", "google", "leetcode"))
        );
    }
}