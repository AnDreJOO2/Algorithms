package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ThirdMaximumNumberTest {

    private ThirdMaximumNumber thirdMaximumNumber;

    @BeforeEach
    void setUp() {
        thirdMaximumNumber = new ThirdMaximumNumber();
    }

    @ParameterizedTest(name = "Params: beforeMoving=`{0}`, afterMoving=`{1}`")
    @MethodSource("shouldReturnThirdMaximumNumberParams")
    void shouldReturnThirdMaximumNumber(int[] nums, int expected) {
        //when
        int result = thirdMaximumNumber.thirdMax(nums);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> shouldReturnThirdMaximumNumberParams() {
        return Stream.of(
                arguments(new int[]{3, 2, 1}, 1),
                arguments(new int[]{1, 2}, 2),
                arguments(new int[]{2, 2, 3, 1}, 1)
        );
    }
}