package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DecodeTheMessageTest {

    private DecodeTheMessage decodeTheMessage;

    @BeforeEach
    void setUp() {
        decodeTheMessage = new DecodeTheMessage();
    }

    @ParameterizedTest(name = "Params: key=`{0}`, message=`{1}`, expected=`{2}`")
    @MethodSource("shouldDecodeTheMessageParams")
    void shouldDecodeTheMessage(String key, String message, String expected) {
        //when
        String result = decodeTheMessage.decodeMessage(key, message);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldDecodeTheMessageParams() {
        return Stream.of(
                arguments("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv", "this is a secret"),
                arguments("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb", "the five boxing wizards jump quickly")
        );
    }
}
