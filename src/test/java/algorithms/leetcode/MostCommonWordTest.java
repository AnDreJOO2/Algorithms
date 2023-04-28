package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MostCommonWordTest {

    private MostCommonWord mostCommonWord;

    @BeforeEach
    void setUp() {
        mostCommonWord = new MostCommonWord();
    }

    @ParameterizedTest(name = "Params: paragraph=`{0}`, banned=`{1}`, expected=`{2}`")
    @MethodSource("shouldFindMostCommonWordParams")
    void shouldFindMostCommonWord(String paragraph, String[] banned, String expected) {
        //when
        String result = mostCommonWord.mostCommonWord(paragraph, banned);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMostCommonWordParams() {
        return Stream.of(
                arguments("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}, "ball"),
                arguments("a.", new String[]{}, "a")
        );
    }
}