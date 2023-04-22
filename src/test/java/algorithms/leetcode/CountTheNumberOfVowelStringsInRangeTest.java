package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountTheNumberOfVowelStringsInRangeTest {

    private CountTheNumberOfVowelStringsInRange countTheNumberOfVowelStringsInRange;

    @BeforeEach
    void setUp() {
        countTheNumberOfVowelStringsInRange = new CountTheNumberOfVowelStringsInRange();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, left=`{1}`, right=`{2}`, expected=`{3}`")
    @MethodSource("shouldCountTheNumberOfVowelStringsInRangeParams")
    void shouldCountTheNumberOfVowelStringsInRange(String[] words, int left, int right, int expected) {
        //when
        int result = countTheNumberOfVowelStringsInRange.vowelStrings(words, left, right);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountTheNumberOfVowelStringsInRangeParams() {
        return Stream.of(
                arguments(new String[]{"are", "amy", "u"}, 0, 2, 2),
                arguments(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4, 3)
        );
    }
}