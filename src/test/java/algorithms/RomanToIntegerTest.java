package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp(){
        romanToInteger = new RomanToInteger();
    }

    @Test
    void romanToInt_should_pass_the_test() {
        assertThat(romanToInteger.romanToInt("III")).isEqualTo(3);
        assertThat(romanToInteger.romanToInt("LVIII")).isEqualTo(58);
        assertThat(romanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
