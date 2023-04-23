package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {

        validAnagram = new ValidAnagram();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("IfAnagramTestReturnsShouldReturnTrueParams")
    void shouldTestIfIsAnagramReturnsTrue(String s, String t, boolean expected) {
        //when
        boolean result = validAnagram.isAnagram(s, t);
        //then
        assertThat(result)
                .isNotNull()
                .isTrue()
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("IfAnagramTestReturnsShouldReturnTrueParams")
    void shouldTestIfIsAnagramTwoReturnsTrue(String s, String t, boolean expected) {
        //when
        boolean result = validAnagram.isAnagramTwo(s, t);
        //then
        assertThat(result)
                .isNotNull()
                .isTrue()
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("IfAnagramTestReturnsShouldReturnFalseParams")
    void shouldTestIfIsAnagramReturnsFalse(String s, String t, boolean expected) {
        //when
        boolean result = validAnagram.isAnagram(s, t);
        //then
        assertThat(result)
                .isNotNull()
                .isFalse()
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("IfAnagramTestReturnsShouldReturnFalseParams")
    void shouldTestIfIsAnagramTwoReturnsFalse(String s, String t, boolean expected) {
        //when
        boolean result = validAnagram.isAnagramTwo(s, t);
        //then
        assertThat(result)
                .isNotNull()
                .isFalse()
                .isEqualTo(expected);
    }

    static Stream<Arguments> IfAnagramTestReturnsShouldReturnTrueParams() {
        return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("ab", "ba", true),
                arguments("aab", "aba", true)
        );
    }

    static Stream<Arguments> IfAnagramTestReturnsShouldReturnFalseParams() {
        return Stream.of(
                arguments("aa", "bb", false),
                arguments("abba", "abb", false),
                arguments("rat", "cat", false)
        );
    }
}
