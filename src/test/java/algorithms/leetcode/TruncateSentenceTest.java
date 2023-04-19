package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TruncateSentenceTest {

    private TruncateSentence truncateSentence;

    @BeforeEach
    void setUp() {
        truncateSentence = new TruncateSentence();
    }

    @ParameterizedTest(name = "Params: sentence=`{0}`, k=`{1}`, expected=`{2}`")
    @MethodSource("shouldTruncateSentenceParams")
    void shouldTruncateSentence(String sentence, int k, String expected) {
        //when
        String result = truncateSentence.truncateSentence(sentence, k);
        //then
        assertThat(result)
                .isEqualTo(expected)
                .hasSameSizeAs(expected)
                .containsSequence(expected);
    }

    static Stream<Arguments> shouldTruncateSentenceParams() {
        return Stream.of(
                arguments("Hello how are you Contestant", 4, "Hello how are you"),
                arguments("What is the solution to this problem", 4, "What is the solution"),
                arguments("chopper is not a tanuki", 5, "chopper is not a tanuki")
        );
    }
}