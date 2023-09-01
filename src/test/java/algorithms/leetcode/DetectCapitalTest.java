package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DetectCapitalTest {

    private DetectCapital underTest;

    @BeforeEach
    void setUp() {
        underTest = new DetectCapital();
    }

    @ParameterizedTest(name = "Params: word=`{0}`, expected=`{1}`")
    @MethodSource("shouldDetectIfCapitalUseParams")
    void shouldDetectIfCapitalUse(String word, boolean expected) {
        //when
        boolean result = underTest.detectCapitalUse(word);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldDetectIfCapitalUseParams() {
        return Stream.of(
                arguments("USA", true),
                arguments("Leetcode", true),
                arguments("Ad", true),
                arguments("FlaG", false),
                arguments("fffA", false),
                arguments("dH", false)
        );
    }
}
