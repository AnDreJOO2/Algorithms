package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    private MaximumNumberOfVowelsInASubstringOfGivenLength maximumNumberOfVowelsInASubstringOfGivenLength;

    @BeforeEach
    void setUp() {
        maximumNumberOfVowelsInASubstringOfGivenLength = new MaximumNumberOfVowelsInASubstringOfGivenLength();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, k=`{1},` expected=`{2}`")
    @MethodSource("shouldCalculateMaximumNumberOfVowelsInASubstringOfGivenLengthParams")
    void shouldCalculateMaximumNumberOfVowelsInASubstringOfGivenLength(String s, int k, int expected) {
        //when
        int result = maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaximumNumberOfVowelsInASubstringOfGivenLengthParams() {
        return Stream.of(
                arguments("abciiidef", 3, 3),
                arguments("aeiou", 2, 2),
                arguments("leetcode", 3, 2)
        );
    }
}