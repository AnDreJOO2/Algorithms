package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AverageValueTest {

    private AverageValue averageValue;

    @BeforeEach
    void setUp(){
        averageValue = new AverageValue();
    }

    @Test
    void averageValue_should_pass_the_test() {
        assertThat(averageValue.averageValue(new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5})).isEqualTo(5);
        assertThat(averageValue.averageValue(new int[]{5,4,3,5,7,1,3,6,7})).isEqualTo(4.555555555555555);
        assertThat(averageValue.averageValue(new int[]{2,5,5,3,3,12})).isEqualTo(5);
        assertThat(averageValue.averageValue(new int[]{1007,542,379,993,3,12,322,6})).isEqualTo(408);
        assertThat(averageValue.averageValue(new int[]{1,6,9,7,2,2,1,5})).isEqualTo(4.125);
    }
}
