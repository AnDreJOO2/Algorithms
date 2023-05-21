package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AverageValueOfEvenNumbersThatAreDivisibleByThreeTest {

    private AverageValueOfEvenNumbersThatAreDivisibleByThree averageValueOfEvenNumbersThatAreDivisibleByThree;

    @BeforeEach
    void setUp() {
        averageValueOfEvenNumbersThatAreDivisibleByThree = new AverageValueOfEvenNumbersThatAreDivisibleByThree();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountAverageValueOfEvenNumbersThatAreDivisibleByThreeParams")
    void shouldCountAverageValueOfEvenNumbersThatAreDivisibleByThree(int[] nums, int expected) {
        //when
        int result = averageValueOfEvenNumbersThatAreDivisibleByThree.averageValue(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountAverageValueOfEvenNumbersThatAreDivisibleByThreeParams() {
        return Stream.of(
                arguments(new int[]{1,3,6,10,12,15},9),
                arguments(new int[]{1,2,4,7,10},0)
        );
    }

}