package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReverseWordsInAStringIIITest {

    private ReverseWordsInAStringIII reverseWordsInAStringIII;

    @BeforeEach
    void setUp() {
        reverseWordsInAStringIII = new ReverseWordsInAStringIII();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldReverseWordsInAStringParams")
    void shouldReverseWordsInAString(String input, String expected) {
        //when
        String result = reverseWordsInAStringIII.reverseWords(input);
        //then
        assertThat(result).isNotNull().hasSameSizeAs(expected).isEqualTo(expected);

    }

    static Stream<Arguments> shouldReverseWordsInAStringParams() {
        return Stream.of(arguments("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"), arguments("God Ding", "doG gniD"));
    }
}