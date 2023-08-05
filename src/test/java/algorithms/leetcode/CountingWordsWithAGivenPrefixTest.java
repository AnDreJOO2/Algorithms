package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountingWordsWithAGivenPrefixTest {

    private CountingWordsWithAGivenPrefix underTest;

    @BeforeEach
    void setUp() {
        underTest = new CountingWordsWithAGivenPrefix();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, pref=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountWordsWithAGivenPrefixParams")
    void shouldCountWordsWithAGivenPrefix(String[] words, String pref, int expected) {
        //when
        int result = underTest.prefixCount(words, pref);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountWordsWithAGivenPrefixParams() {
        return Stream.of(
                arguments(new String[]{"pay", "attention", "practice", "attend"}, "at", 2),
                arguments(new String[]{"leetcode", "win", "loops", "success"}, "code", 0)
        );
    }
}
