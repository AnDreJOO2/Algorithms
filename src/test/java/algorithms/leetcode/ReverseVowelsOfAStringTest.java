package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReverseVowelsOfAStringTest {

    private ReverseVowelsOfAString reverseVowelsOfAString;

    @BeforeEach
    void setUp() {
        reverseVowelsOfAString = new ReverseVowelsOfAString();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldReverseVowelsOfAStringParams")
    void shouldReverseVowelsOfAString(String input, String expected) {
        //when
        String result = reverseVowelsOfAString.reverseVowels(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldReverseVowelsOfAStringParams() {
        return Stream.of(
                arguments("hello", "holle"),
                arguments("leetcode", "leotcede")
        );
    }
}