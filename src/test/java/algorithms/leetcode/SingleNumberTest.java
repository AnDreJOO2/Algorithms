package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

    private SingleNumber singleNumber;

    @BeforeEach
    void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    void singleNumber() {

        assertThat(singleNumber.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
        assertThat(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
        assertThat(singleNumber.singleNumber(new int[]{1})).isEqualTo(1);
        assertThat(singleNumber.singleNumber(new int[]{1, 1, 22, 22, 23, 23, 5, 3, 7, 7, 5, 5, 3})).isEqualTo(5);
        assertThat(singleNumber.singleNumber(new int[]{8, 2, 8, 3, 2, 1, 7, 3, 7, 9, 11, 22, 3, 7, 8, 3, 7, 8, 1})).isEqualTo(22);
    }
}
