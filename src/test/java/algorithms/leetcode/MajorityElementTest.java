package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MajorityElementTest {

    private MajorityElement majorityElement;

    @BeforeEach
    void setUp() {
        majorityElement = new MajorityElement();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMajorityElementParams")
    void shouldFindMajorityElementBadSolution(int[] input, int expected) {
        //when
        int result = majorityElement.majorityElementBad(input);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMajorityElementParams")
    void shouldFindMajorityElementGoodSolution(int[] input, int expected) {
        //when
        int result = majorityElement.majorityElementGood(input);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMajorityElementParams() {
        return Stream.of(
                arguments(new int[]{3, 2, 3}, 3),
                arguments(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }
}