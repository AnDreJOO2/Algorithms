package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome;

    @BeforeEach
    void setUp() {
        longestPalindrome = new LongestPalindrome();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateLongestPalindromeParams")
    void shouldCalculateLongestPalindrome(String input, int expected) {
        //when
        int result = longestPalindrome.longestPalindrome(input);
        //then
        assertThat(result).isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateLongestPalindromeParams() {
        return Stream.of(
                arguments("abccccdd", 7),
                arguments("a", 1)
        );
    }
}