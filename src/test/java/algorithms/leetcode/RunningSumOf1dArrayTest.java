package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RunningSumOf1dArrayTest {

    private RunningSumOf1dArray runningSumOf1dArray;

    @BeforeEach
    void setUp() {
        runningSumOf1dArray = new RunningSumOf1dArray();
    }

    @Test
    void shouldCountSumCorrectly() {
        //given
        int[] input = {1, 2, 3, 4};
        // when
        int[] expected = {1, 3, 6, 10};
        int[] result = runningSumOf1dArray.runningSum(input);
        // then
        assertThat(result).isEqualTo(expected);
    }
}
