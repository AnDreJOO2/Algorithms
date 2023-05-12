package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountNumberOfDistinctIntegersAfterReverseOperationsTest {

    private CountNumberOfDistinctIntegersAfterReverseOperations countNumberOfDistinctIntegersAfterReverseOperations;

    @BeforeEach
    void setUp() {
        countNumberOfDistinctIntegersAfterReverseOperations = new CountNumberOfDistinctIntegersAfterReverseOperations();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountNumberOfDistinctIntegersAfterReverseOperationsParams")
    void shouldCountNumberOfDistinctIntegersAfterReverseOperations(int[] nums, int expected) {
        // when
        int result = countNumberOfDistinctIntegersAfterReverseOperations.countDistinctIntegers(nums);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountNumberOfDistinctIntegersAfterReverseOperationsParams() {
        return Stream.of(
                arguments(new int[]{1, 13, 10, 12, 31}, 6),
                arguments(new int[]{2, 2, 2}, 1)
        );
    }
}