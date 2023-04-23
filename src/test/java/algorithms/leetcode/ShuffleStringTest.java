package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ShuffleStringTest {

    private ShuffleString shuffleString;

    @BeforeEach
    void setUp() {
        shuffleString = new ShuffleString();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, indices=`{1}`, expected=`{2}`")
    @MethodSource("shouldShuffleStringParams")
    void shouldShuffleString(String s, int[] indices, String expected) {
        //when
        String result = shuffleString.restoreString(s, indices);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldShuffleStringParams() {
        return Stream.of(
                arguments("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}, "leetcode"),
                arguments("abc", new int[]{0, 1, 2}, "abc")
        );
    }
}