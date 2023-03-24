package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class IsSubsequenceTest {

    private IsSubsequence isSubsequence;

    @BeforeEach
    void setUp() {
        isSubsequence = new IsSubsequence();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("expectedTrueParams")
    void isSubsequenceShouldBeTrue(String s, String t, boolean expected) {
        //when
        boolean result = isSubsequence.isSubsequence(s, t);
        //then
        assertThat(result)
                .isTrue()
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("expectedFalseParams")
    void isSubsequenceShouldBeFalse(String s, String t, boolean expected) {
        //when
        boolean result = isSubsequence.isSubsequence(s, t);
        //then
        assertThat(result)
                .isFalse()
                .isEqualTo(expected);
    }

    static Stream<Arguments> expectedTrueParams() {
        return Stream.of(
                arguments("abc", "ahbgdc", true),
                arguments("abc", "aaabaaacdd", true),
                arguments("agf", "dsasdgddfg", true)
        );
    }

    static Stream<Arguments> expectedFalseParams() {
        return Stream.of(
                arguments("axc", "ahbgdc", false),
                arguments("abc", "acb", false),
                arguments("axc", "aagrgjhtyjtyjcx", false)
        );
    }
}