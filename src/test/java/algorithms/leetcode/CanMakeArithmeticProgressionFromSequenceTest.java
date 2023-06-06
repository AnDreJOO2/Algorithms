package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CanMakeArithmeticProgressionFromSequenceTest {

    private CanMakeArithmeticProgressionFromSequence canMakeArithmeticProgressionFromSequence;

    @BeforeEach
    void setUp() {
        canMakeArithmeticProgressionFromSequence = new CanMakeArithmeticProgressionFromSequence();
    }

    @ParameterizedTest(name = "Params: arr=`{0}`, expected=`{1}`")
    @MethodSource("shouldCanMakeArithmeticProgressionFromSequenceParams")
    void shouldCanMakeArithmeticProgressionFromSequence(int[] arr, boolean expected) {
        //when
        boolean result = canMakeArithmeticProgressionFromSequence.canMakeArithmeticProgression(arr);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> shouldCanMakeArithmeticProgressionFromSequenceParams() {
        return Stream.of(
                arguments(new int[]{3, 5, 1}, true),
                arguments(new int[]{1, 2, 4}, false)
        );
    }
}
