package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveAllOccurrencesOfASubstringTest {

    private RemoveAllOccurrencesOfASubstring removeAllOccurrencesOfASubstring;

    @BeforeEach
    void setUp() {
        removeAllOccurrencesOfASubstring = new RemoveAllOccurrencesOfASubstring();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, part=`{1}`, expected={2}")
    @MethodSource("shouldRemoveAllOccurrencesOfASubstringParams")
    void shouldRemoveAllOccurrencesOfASubstring(String s, String part, String expected) {
        //when
        String result = removeAllOccurrencesOfASubstring.removeOccurrences(s, part);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldRemoveAllOccurrencesOfASubstringParams() {
        return Stream.of(
                arguments("daabcbaabcbc", "abc", "dab"),
                arguments("axxxxyyyyb", "xy", "ab")
        );
    }

}