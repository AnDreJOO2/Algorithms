package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxInArrayTest {

    private MaxInArray maxInArray;

    @BeforeEach
    void setUp() {
        maxInArray = new MaxInArray();
    }

    @Test
    void maxInArray_should_pass_the_test() {
        assertThat(maxInArray.maxInArray(new int[]{1, 5, 6, 18, 51, 42, 81, 70, 27, 7, 5, 2})).isEqualTo(81);
        assertThat(maxInArray.maxInArray(new int[]{1, 5, 6, 18, 51, 42, 70, 27, 7, 5, 2})).isEqualTo(70);
        assertThat(maxInArray.maxInArray(new int[]{1, 5, 6, 18, 51, 42, 70, 227, 7, 5, 2})).isEqualTo(227);
        assertThat(maxInArray.maxInArray(new int[]{1, 5, 126, 18, 51, 42, 70, 7, 5, 2})).isEqualTo(126);
        assertThat(maxInArray.maxInArray(new int[]{1, 5, 126, 18, 51, 142, 70, 7, 5, 2})).isEqualTo(142);
        assertThat(maxInArray.maxInArray(new int[]{1, 51, 2, 7, 5, 2})).isEqualTo(51);
        assertThat(maxInArray.maxInArray(new int[]{1, 2})).isEqualTo(2);
    }
}
