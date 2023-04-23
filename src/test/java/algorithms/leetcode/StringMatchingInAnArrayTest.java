package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StringMatchingInAnArrayTest {

    private StringMatchingInAnArray stringMatchingInAnArray;

    @BeforeEach
    void setUp() {
        stringMatchingInAnArray = new StringMatchingInAnArray();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMatchingStringsInAnArrayParams")
    void shouldFindMatchingStringsInAnArray(String[] words, List<String> expected) {
        //when
        List<String> result = stringMatchingInAnArray.stringMatching(words);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyElementsOf(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMatchingStringsInAnArrayParams() {
        return Stream.of(
                arguments(new String[]{"mass", "as", "hero", "superhero"}, List.of("as", "hero")),
                arguments(new String[]{"leetcode", "et", "code"}, List.of("et", "code")),
                arguments(new String[]{"blue", "green", "bu"}, List.of())
        );
    }
}