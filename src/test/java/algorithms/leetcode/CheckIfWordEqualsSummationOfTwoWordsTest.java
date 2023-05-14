package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfWordEqualsSummationOfTwoWordsTest {

    private CheckIfWordEqualsSummationOfTwoWords checkIfWordEqualsSummationOfTwoWords;

    @BeforeEach
    void setUp() {
        checkIfWordEqualsSummationOfTwoWords = new CheckIfWordEqualsSummationOfTwoWords();
    }

    @ParameterizedTest(name = "Params: firstWord=`{0}`, secondWord=`{1}`, targetWord=`{2}`, expected=`{3}`")
    @MethodSource("shouldCheckIfWordEqualsSummationOfTwoWordsParams")
    void shouldCheckIfWordEqualsSummationOfTwoWords(String firstWord, String secondWord, String targetWord, boolean expected) {
        //when
        boolean result = checkIfWordEqualsSummationOfTwoWords.isSumEqual(firstWord, secondWord, targetWord);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCheckIfWordEqualsSummationOfTwoWordsParams() {
        return Stream.of(
                arguments("acb", "cba", "cdb", true),
                arguments("aaa", "a", "aab", false),
                arguments("aaa", "a", "aaaa", true)
        );
    }
}