package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindMaximumNumberOfStringPairsTest {

    private FindMaximumNumberOfStringPairs findMaximumNumberOfStringPair;

    @BeforeEach
    void setUp() {
        findMaximumNumberOfStringPair = new FindMaximumNumberOfStringPairs();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMaximumNumberOfStringPairParams")
    void shouldFindMaximumNumberOfStringPair(String[] words, int expected) {
        //when
        int result = findMaximumNumberOfStringPair.maximumNumberOfStringPairs(words);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMaximumNumberOfStringPairParams() {
        return Stream.of(
                arguments(new String[]{"cd", "ac", "dc", "ca", "zz"}, 2),
                arguments(new String[]{"ab", "ba", "cc"}, 1),
                arguments(new String[]{"aa", "ab"}, 0)
        );
    }
}
