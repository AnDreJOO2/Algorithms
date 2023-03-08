package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    private FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString;

    @BeforeEach
    void setUp() {
        findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();
    }

    @ParameterizedTest(name = "Params: `{0}`, `{1}`, `{2}`")
    @MethodSource("params")
    void shouldFindIndexOfFirstOccurrenceInAString(String haystack, String needle, int expected) {
        // when
        int result = findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle);
        // then
        assertThat(result).isEqualTo(expected);

    }

    static Stream<Arguments> params() {
        return Stream.of(
                arguments("sadbutsad", "sad", 0),
                arguments("leetcode", "leeto", -1)
        );
    }


}
