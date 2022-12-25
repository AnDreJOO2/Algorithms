package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    void isPalindromeShouldReturnTrue() {

        assertThat(validPalindrome.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
        assertThat(validPalindrome.isPalindrome(" ")).isTrue();
    }

    @Test
    void isPalindromeShouldReturnFalse() {

        assertThat(validPalindrome.isPalindrome("race a car")).isFalse();
    }
}
