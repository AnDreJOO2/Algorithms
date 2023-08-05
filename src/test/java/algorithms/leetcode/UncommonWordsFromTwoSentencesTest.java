package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class UncommonWordsFromTwoSentencesTest {

    private UncommonWordsFromTwoSentences underTest;

    @BeforeEach
    void setUp() {
        underTest = new UncommonWordsFromTwoSentences();
    }

    @ParameterizedTest(name = "Params: s1=`{0}`, s2=`{1}` expected=`{2}`")
    @MethodSource("shouldFindUncommonWordsFromTwoSentencesParams")
    void shouldFindUncommonWordsFromTwoSentences(String s1, String s2, String[] expected) {
        //when
        String[] result = underTest.uncommonFromSentences(s1, s2);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldFindUncommonWordsFromTwoSentencesParams() {
        return Stream.of(
                arguments("this apple is sweet", "this apple is sour", new String[]{"sweet", "sour"}),
                arguments("apple apple", "banana", new String[]{"banana"})

        );
    }
}
