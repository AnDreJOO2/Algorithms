package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    void isValidShouldReturnTrue() {
        assertThat(validParentheses.isValid("()")).isTrue();
        assertThat(validParentheses.isValid("()[]{}")).isTrue();
        assertThat(validParentheses.isValid("()[]{()}")).isTrue();
        assertThat(validParentheses.isValid("()[]{(()[])}")).isTrue();
    }

    @Test
    void isValidShouldReturnFalse() {
        assertThat(validParentheses.isValid("(]")).isFalse();
        assertThat(validParentheses.isValid("{}()[()][)")).isFalse();
        assertThat(validParentheses.isValid("{}([()][)")).isFalse();
    }
}
