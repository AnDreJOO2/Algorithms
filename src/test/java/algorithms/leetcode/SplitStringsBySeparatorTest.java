package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SplitStringsBySeparatorTest {

    private SplitStringsBySeparator underTest;

    @BeforeEach
    void setUp() {
        underTest = new SplitStringsBySeparator();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, separator=`{1}`, expected=`{2}`")
    @MethodSource("shouldSplitStringsBySeparatorParams")
    void shouldSplitStringsBySeparator(List<String> words, char separator, List<String> expected) {
        //when
        List<String> result = underTest.splitWordsBySeparator(words, separator);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyElementsOf(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldSplitStringsBySeparatorParams() {
        return Stream.of(
                arguments(List.of("one.two.three", "four.five", "six"), ".", List.of("one", "two", "three", "four", "five", "six")),
                arguments(List.of("$easy$", "$problem$"), "$", List.of("easy", "problem")),
                arguments(List.of("|||"), "|", List.of())
        );
    }
}
