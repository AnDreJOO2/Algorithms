package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MissingNumberTest {

    private MissingNumber missingNumber;

    @BeforeEach
    void setUp() {
        missingNumber = new MissingNumber();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindMissingNumberParams")
    void shouldFindMissingNumber(int[] nums, int expected) {
        //when
        int result = missingNumber.missingNumber(nums);
        //then
        assertThat(result)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindMissingNumberParams() {
        return Stream.of(
                arguments(new int[]{3, 0, 1}, 2),
                arguments(new int[]{0, 1}, 2),
                arguments(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }
}