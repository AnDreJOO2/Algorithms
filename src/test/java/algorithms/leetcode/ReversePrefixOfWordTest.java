package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReversePrefixOfWordTest {

    private ReversePrefixOfWord reversePrefixOfWord;

    @BeforeEach
    void setUp() {
        reversePrefixOfWord = new ReversePrefixOfWord();
    }

    @ParameterizedTest(name = "Params: word =`{0}`, ch =`{1}`, expected=`{2}`")
    @MethodSource("shouldReversePrefixOfWordParams")
    void shouldReversePrefixOfWord(String word, char ch, String expected) {
        //when
        String result = reversePrefixOfWord.reversePrefix(word, ch);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldReversePrefixOfWordParams() {
        return Stream.of(
                arguments("abcdefd", 'd', "dcbaefd"),
                arguments("xyxzxe", 'z', "zxyxxe"),
                arguments("abcd", 'z', "abcd")
        );
    }
}