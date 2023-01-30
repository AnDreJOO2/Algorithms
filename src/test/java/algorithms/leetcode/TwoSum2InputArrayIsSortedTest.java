package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSum2InputArrayIsSortedTest {

    private TwoSum2InputArrayIsSorted twoSum2InputArrayIsSorted;

    @BeforeEach
    void setUp(){
        twoSum2InputArrayIsSorted = new TwoSum2InputArrayIsSorted();
    }

    @Test
    void twoSumShouldPassTheTest() {
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{2,7,11,15},9)).isEqualTo(new int[]{1, 2});
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{2,3,4},6)).isEqualTo(new int[]{1,3});
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{-1,0},-1)).isEqualTo(new int[]{1,2});
    }

    @Test
    void twoSumShouldNotPassTheTest() {
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{2,7,11,15},9)).isNotEqualTo(new int[]{0,1});
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{2,3,4},7)).isNotEqualTo(new int[]{1,2});
    }
}
