package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {

    private RotateArray rotateArray;

    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @Test
    void shouldRotateArrayByKValue() {
        //given
        int[] testArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        // when
        rotateArray.rotate(testArray, k);
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        // then
        assertThat(testArray).isEqualTo(expected);
    }

}
