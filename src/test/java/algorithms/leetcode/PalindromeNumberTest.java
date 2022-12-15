package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void isPalindromeShouldReturnTrue() {

        int test1 = 121;
        boolean expected1 = true;

        assertThat(palindromeNumber.isPalindrome(test1)).isEqualTo(expected1);
    }

    @Test
    void isPalindromeShouldReturnFalse() {

        int test2 = -121;
        boolean expected2 = false;

        int test3 = 10;
        boolean expected3 = false;

        assertThat(palindromeNumber.isPalindrome(test2)).isEqualTo(expected2);
        assertThat(palindromeNumber.isPalindrome(test3)).isEqualTo(expected3);
    }
}
