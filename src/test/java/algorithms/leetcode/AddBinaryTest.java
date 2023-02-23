package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddBinaryTest {

    private AddBinary addBinary;

    @BeforeEach
    void setUp() {
        addBinary = new AddBinary();
    }

    @Test
    void addBinaryShouldPassTheTest() {

        assertThat(addBinary.addBinary("11", "1")).isEqualTo("100");
        assertThat(addBinary.addBinary("111", "1")).isEqualTo("1000");
        assertThat(addBinary.addBinary("1010", "1011")).isEqualTo("10101");
    }

    @Test
    void addBinaryShouldNotPassTheTest() {

        assertThat(addBinary.addBinary("11", "1")).isNotEqualTo("111");
        assertThat(addBinary.addBinary("111", "1")).isNotEqualTo("1001");
        assertThat(addBinary.addBinary("1010", "1011")).isNotEqualTo("1010");
    }
}
