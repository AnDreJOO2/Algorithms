package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfTheSentenceIsPangramTest {

    private CheckIfTheSentenceIsPangram checkIfTheSentenceIsPangram;

    @BeforeEach
    void setUp() {
        checkIfTheSentenceIsPangram = new CheckIfTheSentenceIsPangram();
    }

    @ParameterizedTest(name = "Params: sentence=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckIfTheSentenceIsPangramParams")
    void shouldCheckIfTheSentenceIsPangram(String sentence, boolean expected) {
        //when
        boolean result = checkIfTheSentenceIsPangram.checkIfPangram(sentence);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCheckIfTheSentenceIsPangramParams() {
        return Stream.of(
                arguments("thequickbrownfoxjumpsoverthelazydog", true),
                arguments("leetcode", false)
        );
    }
}