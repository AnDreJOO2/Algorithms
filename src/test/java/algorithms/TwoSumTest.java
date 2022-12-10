package algorithms;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }


    @Test
    void twoSum_should_pass_the_test() {

        // test1
        int[] array1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = new int[]{0, 1};

        // test2
        int[] array2 = new int[]{3, 2, 4};
        int target2 = 6;
        int[] expected2 = new int[]{1, 2};

        // test3
        int[] array3 = new int[]{3, 3};
        int target3 = 6;
        int[] expected3 = new int[]{0, 1};

        assertThat(twoSum.twoSum(array1, target1)).isEqualTo(expected1);
        assertThat(twoSum.twoSum(array2, target2)).isEqualTo(expected2);
        assertThat(twoSum.twoSum(array3, target3)).isEqualTo(expected3);

    }
}
