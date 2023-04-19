package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class KeepMultiplyingFoundValuesByTwoTest {

    private KeepMultiplyingFoundValuesByTwo keepMultiplyingFoundValuesByTwo;

    @BeforeEach
    void setUp() {
        keepMultiplyingFoundValuesByTwo = new KeepMultiplyingFoundValuesByTwo();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, original=`{1}`, expected=`{2}`")
    @MethodSource("shouldKeepMultiplyingFoundValuesByTwoParams")
    void shouldKeepMultiplyingFoundValuesByTwo(int[] nums, int original, int expected) {
        //when
        int result = keepMultiplyingFoundValuesByTwo.findFinalValue(nums, original);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldKeepMultiplyingFoundValuesByTwoParams() {
        return Stream.of(
                arguments(new int[]{5, 3, 6, 1, 12}, 3, 24),
                arguments(new int[]{2, 7, 9}, 4, 4)
        );
    }
}