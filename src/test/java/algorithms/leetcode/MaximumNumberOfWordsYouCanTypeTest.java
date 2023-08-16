package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumNumberOfWordsYouCanTypeTest {

    private MaximumNumberOfWordsYouCanType underTest;

    @BeforeEach
    void setUp() {
        underTest = new MaximumNumberOfWordsYouCanType();
    }

    @ParameterizedTest(name = "Params: text=`{0}`, brokenLetters=`{1}`, expected=`{2}`")
    @MethodSource("shouldSumMaximumNumberOfWordsYouCanTypeParams")
    void shouldSumMaximumNumberOfWordsYouCanType(String text, String brokenLetters, int expected) {
        //when
        int result = underTest.canBeTypedWords(text, brokenLetters);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldSumMaximumNumberOfWordsYouCanTypeParams() {
        return Stream.of(
                arguments("hello world", "ad", 1),
                arguments("leet code", "lt", 1),
                arguments("leet code", "e", 0)
        );
    }
}
