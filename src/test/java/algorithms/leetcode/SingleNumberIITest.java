package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SingleNumberIITest {

    private SingleNumberII singleNumberII;

    @BeforeEach
    void setUp() {
        singleNumberII = new SingleNumberII();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindSingleNumberIIParams")
    void shouldFindSingleNumberII(int[] nums, int expected) {
        //when
        int result = singleNumberII.singleNumber(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindSingleNumberIIParams() {
        return Stream.of(
                arguments(new int[]{2, 2, 3, 2}, 3),
                arguments(new int[]{0, 1, 0, 1, 0, 1, 99}, 99)
        );
    }
}
