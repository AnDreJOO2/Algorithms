package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountPrefixesOfAGivenStringTest {

    private CountPrefixesOfAGivenString countPrefixesOfAGivenString;

    @BeforeEach
    void setUp() {
        countPrefixesOfAGivenString = new CountPrefixesOfAGivenString();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, s=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountPrefixesOfAGivenStringParams")
    void shouldCountPrefixesOfAGivenString(String[] words, String s, int expected) {
        //when
        int result = countPrefixesOfAGivenString.countPrefixes(words, s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountPrefixesOfAGivenStringParams() {
        return Stream.of(
                arguments(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc", 3),
                arguments(new String[]{"a", "a"}, "aa", 2)
        );
    }
}