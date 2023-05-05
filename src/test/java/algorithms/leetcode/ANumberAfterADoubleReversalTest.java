package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ANumberAfterADoubleReversalTest {

    private ANumberAfterADoubleReversal aNumberAfterADoubleReversal;

    @BeforeEach
    void setUp() {
        aNumberAfterADoubleReversal = new ANumberAfterADoubleReversal();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckIfNumberIsTheSameAfterADoubleReversalsParams")
    void shouldCheckIfNumberIsTheSameAfterADoubleReversals(int num, boolean expected) {
        //when
        boolean result = aNumberAfterADoubleReversal.isSameAfterReversals(num);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCheckIfNumberIsTheSameAfterADoubleReversalsParams() {
        return Stream.of(
                arguments(526, true),
                arguments(1800, false),
                arguments(0, true)
        );
    }
}