package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SqrtXTest {
    private SqrtX sqrtX;

    @BeforeEach
    void setUp() {
        sqrtX = new SqrtX();
    }

    @Test
    void mySqrtShouldPassTheTest() {
        assertThat(sqrtX.mySqrt(4)).isEqualTo(2);
        assertThat(sqrtX.mySqrt(8)).isEqualTo(2);
        assertThat(sqrtX.mySqrt(1)).isEqualTo(1);
        assertThat(sqrtX.mySqrt(0)).isEqualTo(0);
        assertThat(sqrtX.mySqrt(12)).isEqualTo(3);
        assertThat(sqrtX.mySqrt(24)).isEqualTo(4);
    }
}
