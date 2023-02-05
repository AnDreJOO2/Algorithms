package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {
    private PlusOne plusOne;

    @BeforeEach
    void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    void plusOneShouldPassTheTest() {
        assertThat(plusOne.plusOne(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
        assertThat(plusOne.plusOne(new int[]{9,9,9})).isEqualTo(new int[]{1,0,0,0});
        assertThat(plusOne.plusOne(new int[]{1,2})).isEqualTo(new int[]{1,3});
        assertThat(plusOne.plusOne(new int[]{1,2,9})).isEqualTo(new int[]{1,3,0});
    }

    @Test
    void plusOneShouldNotPassTheTest() {
        assertThat(plusOne.plusOne(new int[]{1, 2, 4})).isNotEqualTo(new int[]{1, 2, 4});
        assertThat(plusOne.plusOne(new int[]{9,9,9})).isNotEqualTo(new int[]{9,9,0});
        assertThat(plusOne.plusOne(new int[]{1,2})).isNotEqualTo(new int[]{1,4});
        assertThat(plusOne.plusOne(new int[]{1,2,9})).isNotEqualTo(new int[]{1,2,10});
    }
}
