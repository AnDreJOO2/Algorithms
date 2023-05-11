package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class KeyboardRowTest {

    private KeyboardRow keyboardRow;

    @BeforeEach
    void setUp() {
        keyboardRow = new KeyboardRow();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindWordsThatCanBeTypedInSingleKeyboardRowParams")
    void shouldFindWordsThatCanBeTypedInSingleKeyboardRow(String[] words, String[] expected) {
        // when
        String[] result = keyboardRow.findWords(words);
        // then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindWordsThatCanBeTypedInSingleKeyboardRowParams() {
        return Stream.of(
                arguments(new String[]{"Hello", "Alaska", "Dad", "Peace"}, new String[]{"Alaska", "Dad"}),
                arguments(new String[]{"omk"}, new String[]{}),
                arguments(new String[]{"adsdf", "sfd"}, new String[]{"adsdf", "sfd"})
        );
    }
}