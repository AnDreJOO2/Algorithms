package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ArrayPartitionTest {

    private ArrayPartition arrayPartition;

    @BeforeEach
    void setUp() {
        arrayPartition = new ArrayPartition();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldPartitionArrayParams")
    void shouldPartitionArray(int[] nums, int expected) {
        //when
        int result = arrayPartition.arrayPairSum(nums);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldPartitionArrayParams() {
        return Stream.of(
                arguments(new int[]{1, 4, 3, 2}, 4),
                arguments(new int[]{6, 2, 6, 5, 1, 2}, 9)
        );
    }
}