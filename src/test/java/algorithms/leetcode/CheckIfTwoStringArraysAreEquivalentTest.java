package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfTwoStringArraysAreEquivalentTest {

    private CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent;

    @BeforeEach
    void setUp() {
        checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();
    }

    @ParameterizedTest(name = "Params: word1=`{0}`, word2=`{1}`, expected=`{2}`")
    @MethodSource("shouldCheckIfTwoStringsArraysAreEquivalentParams")
    void shouldCheckIfTwoStringsArraysAreEquivalent(String[] word1, String[] word2, boolean expected) {
        // when
        boolean result = checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCheckIfTwoStringsArraysAreEquivalentParams() {
        return Stream.of(
                arguments(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                arguments(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                arguments(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }
}