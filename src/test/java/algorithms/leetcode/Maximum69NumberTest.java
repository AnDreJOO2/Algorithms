package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Maximum69NumberTest {

    private Maximum69Number maximum69Number;

    @BeforeEach
    void setUp() {
        maximum69Number = new Maximum69Number();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumNumberChangingSingle6To9Params")
    void shouldCalculateMaximumNumberChangingSingle6To9(int num, int expected) {
        //when
        int result = maximum69Number.maximum69Number(num);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCalculateMaximumNumberChangingSingle6To9Params() {
        return Stream.of(
                arguments(9669, 9969),
                arguments(9996, 9999),
                arguments(9999, 9999)
        );
    }
}